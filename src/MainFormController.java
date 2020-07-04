import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.Scene;

import static java.lang.Integer.parseInt;

public class MainFormController {

    public JFXTextField txt;
    public JFXButton btnAc;
    public JFXButton btnMultiple;
    public JFXButton btnDivide;
    public JFXButton btnPercantage;
    public JFXButton btn1;
    public JFXButton btn2;
    public JFXButton btn3;
    public JFXButton btn4;
    public JFXButton btn5;
    public JFXButton btn6;
    public JFXButton btn7;
    public JFXButton btn8;
    public JFXButton btn9;
    public JFXButton btn0;
    public JFXButton btnAdd;
    public JFXButton btnEqual;

    private double num1 = 0.0;
    private double num2 = 0.0;
    private String symbol = null;

    private void setText(String value) {
        txt.setText(txt.getText() + value);
    }

    private void clearText() {
        txt.setText("");
    }

    private void setNum1() {
        num1 = Double.parseDouble(txt.getText());
    }

    public void btnAcOnActon(ActionEvent actionEvent) {
        txt.setText("");
        num1 = 0.0;
        num2 = 0.0;
        symbol = null;
    }

    public void btnMultipleOnAction(ActionEvent actionEvent) {
        setNum1();
        clearText();
        symbol = "*";
    }

    public void btnDevideOnAction(ActionEvent actionEvent) {
        setNum1();
        clearText();
        symbol = "/";
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        setNum1();
        clearText();
        symbol = "+";
    }

    public void btnSubOnAction(ActionEvent actionEvent) {
        setNum1();
        clearText();
        symbol = "-";
    }

    public void btnEqualOnAction(ActionEvent actionEvent) {
        num2 = Double.parseDouble(txt.getText());

        switch (symbol) {
            case "+":
                txt.setText(Double.toString(num1 + num2));
                break;
            case "-":
                txt.setText(Double.toString(num1 - num2));
                break;
            case "*":
                txt.setText(Double.toString(num1 * num2));
                break;
            case "/":
                txt.setText(Double.toString(num1 / num2));
                break;
            default:
                symbol = null;
        }
    }

    public void btnPercantageOnAction(ActionEvent actionEvent) {
        setNum1();
        txt.setText(Double.toString(num1 / 100));
    }

    public void btn1OnAction(ActionEvent actionEvent) {
        setText("1");
    }

    public void btn2OnAction(ActionEvent actionEvent) {
        setText("2");
    }

    public void btn3OnAction(ActionEvent actionEvent) {
        setText("3");
    }

    public void btn4OnAction(ActionEvent actionEvent) {
        setText("4");
    }

    public void btn5OnAction(ActionEvent actionEvent) {
        setText("5");
    }

    public void btn6OnAction(ActionEvent actionEvent) {
        setText("6");
    }

    public void btn7OnAction(ActionEvent actionEvent) {
        setText("7");
    }

    public void btn8OnAction(ActionEvent actionEvent) {
        setText("8");
    }

    public void btn9OnAction(ActionEvent actionEvent) {
        setText("9");
    }

    public void btn0OnAction(ActionEvent actionEvent) {
        setText("0");
    }


}

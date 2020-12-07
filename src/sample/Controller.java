package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    //TODO switchcase til operators, split string jeg får fra TextFieldTekst.gettext();
    String operator = "";
    @FXML
     private TextArea TextFieldTekst;

    public void Knap0(){
        TextFieldTekst.appendText("0");
    }
    public void Knap1(){
        TextFieldTekst.appendText("1");
    }
    public void Knap2(){
        TextFieldTekst.appendText("2");
    }
    public void Knap3(){
        TextFieldTekst.appendText("3");
    }
    public void Knap4(){
        TextFieldTekst.appendText("4");
    }
    public void Knap5(){
        TextFieldTekst.appendText("5");
    }
    public void Knap6(){
        TextFieldTekst.appendText("6");
    }
    public void Knap7(){
        TextFieldTekst.appendText("7");
    }
    public void Knap8(){
        TextFieldTekst.appendText("8");
    }
    public void Knap9(){
        TextFieldTekst.appendText("9");
    }
    public void knapPlus(){
        operator = "+";
        operatorchocer();
    }
    public void knapMinus(){
        operator = "-";
        operatorchocer();
    }
    public void knapDividere(){
        operator = "/";
        operatorchocer();
    }
    public void knapGange(){
        operator = "*";
        operatorchocer();
    }
    public void clear(){
        TextFieldTekst.clear();
    }
    public void calc(){
        System.out.println(operator);

    }
    public void operatorchocer(){

        switch (operator){
            case "-":
                TextFieldTekst.appendText("-");
                break;
            case "+":
                TextFieldTekst.appendText("+");
                break;
            case "*":
                TextFieldTekst.appendText("*");
                break;
            case "/":
                TextFieldTekst.appendText("/");
                break;

        }

    }
}

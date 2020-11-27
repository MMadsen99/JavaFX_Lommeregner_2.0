package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import java.awt.*;

public class Controller {

    @FXML
    TextArea Tekst;

    public void Knap0(){
        Tekst.appendText("0");

    }
    public void Knap1(){
        Tekst.appendText("1");
    }
    public void Knap2(){
        Tekst.appendText("2");
    }
    public void Knap3(){
        Tekst.appendText("3");
    }
    public void Knap4(){
        Tekst.appendText("4");
    }
    public void Knap5(){
        Tekst.appendText("5");
    }
    public void Knap6(){
        Tekst.appendText("6");
    }
    public void Knap7(){
        Tekst.appendText("7");
    }
    public void Knap8(){
        Tekst.appendText("8");
    }
    public void Knap9(){
        Tekst.appendText("9");
    }
    public void knapPLus(){
        Tekst.appendText(" + ");
    }
    public void knapminus(){
        Tekst.appendText(" - ");
    }
    public void knapDividere(){
        Tekst.appendText(" / ");
    }
    public void knapGange(){
        Tekst.appendText(" * ");
    }

    public void clear(){
        Tekst.clear();
    }
    public void calc(){
        Tekst.getText();


       // String s = String.valueOf(i);


       // Tekst.setText(s);

    }
}

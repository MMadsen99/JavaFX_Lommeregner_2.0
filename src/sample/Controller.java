package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.w3c.dom.ls.LSOutput;

public class Controller {
    @FXML
    private TextArea textAreaTekst;

    public void Knap0(){
        textAreaTekst.appendText("0");
    }
    public void Knap1(){
        textAreaTekst.appendText("1");
    }
    public void Knap2(){
        textAreaTekst.appendText("2");
    }
    public void Knap3(){
        textAreaTekst.appendText("3");
    }
    public void Knap4(){
        textAreaTekst.appendText("4");
    }
    public void Knap5(){
        textAreaTekst.appendText("5");
    }
    public void Knap6(){
        textAreaTekst.appendText("6");
    }
    public void Knap7(){
        textAreaTekst.appendText("7");
    }
    public void Knap8(){
        textAreaTekst.appendText("8");
    }
    public void Knap9(){
        textAreaTekst.appendText("9");
    }
    public void knapPLus(){
        textAreaTekst.appendText(" + ");
    }
    public void knapMinus(){
        textAreaTekst.appendText(" - ");
    }
    public void knapDividere(){
        textAreaTekst.appendText(" / ");
    }
    public void knapGange(){
        textAreaTekst.appendText(" * ");
    }

}

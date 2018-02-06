package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    int a = 0;
    boolean end = false;
    ArrayList<Field> fields;


    public Controller() {
        fields = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fields.add(new Field(" ", i, j));
            }
        }
    }



    @FXML
    Button button00, button01, button02, button10, button11, button12, button20, button21, button22,buttonagain;


    private void ustawnaX(Button button) {
        button.setText(String.valueOf('X'));

    }

    private void ustawnaO(Button button) {
        button.setText(String.valueOf('O'));
    }

    public void onbutton00Click() {

        ustawBatonik(button00);
        if(a%2==0){
            fields.get(0).setSign("O");
        }
        else
            fields.get(0).setSign("X");

        System.out.println(fields.get(0));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }

    }

    public void onbutton01Click() {
        ustawBatonik(button01);
        if(a%2==0){
            fields.get(1).setSign("O");
        }
        else
            fields.get(1).setSign("X");

        System.out.println(fields.get(1));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }

    }

    public void onbutton02Click() {

        ustawBatonik(button02);
        if(a%2==0){
            fields.get(2).setSign("O");
        }
        else
            fields.get(2).setSign("X");

        System.out.println(fields.get(2));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }

    }

    public void onbutton10Click() {

        ustawBatonik(button10);
        if(a%2==0){
            fields.get(3).setSign("O");
        }
        else
            fields.get(3).setSign("X");

        System.out.println(fields.get(3));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
    }

    public void onbutton11Click() {

        ustawBatonik(button11);
        if(a%2==0){
            fields.get(4).setSign("O");
        }
        else
            fields.get(4).setSign("X");

        System.out.println(fields.get(4));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
    }

    public void onbutton12Click() {

        ustawBatonik(button12);
        if(a%2==0){
            fields.get(5).setSign("O");
        }
        else
            fields.get(5).setSign("X");

        System.out.println(fields.get(5));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
    }

    public void onbutton20Click() {

        ustawBatonik(button20);
if(a%2==0){
    fields.get(6).setSign("O");
}
else
    fields.get(6).setSign("X");

        System.out.println(fields.get(6));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
    }

    public void onbutton21Click() {
        ustawBatonik(button21);
        if(a%2==0){
            fields.get(7).setSign("O");
        }
        else
            fields.get(7).setSign("X");

        System.out.println(fields.get(7));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
    }



    public void onbutton22Click() {

        ustawBatonik(button22);
        if(a%2==0){
            fields.get(8).setSign("O");
        }
        else
            fields.get(8).setSign("X");

        System.out.println(fields.get(8));
        sprawdzanie();
        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
    }


    public void ustawBatonik(Button button) {

        if (a % 2 == 0) {
            ustawnaX(button);
        } else
            ustawnaO(button);

        button.setDisable(true);
        a++;

    }



    public boolean sprawdzanie() {

        if (fields.get(0).getSign().equals("O") && fields.get(3).getSign().equals("O") && fields.get(6).getSign().equals("O"))
            end = true;
        if (fields.get(0).getSign().equals("X") && fields.get(3).getSign().equals("X") && fields.get(6).getSign().equals("X"))
            end = true;
        if (fields.get(1).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(7).getSign().equals("O"))
            end = true;
        if (fields.get(1).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(7).getSign().equals("X"))
            end = true;
        if (fields.get(2).getSign().equals("O") && fields.get(5).getSign().equals("O") && fields.get(8).getSign().equals("O"))
            end = true;
        if (fields.get(2).getSign().equals("X") && fields.get(5).getSign().equals("X") && fields.get(8).getSign().equals("X"))
            end = true;
        if (fields.get(0).getSign().equals("O") && fields.get(1).getSign().equals("O") && fields.get(2).getSign().equals("O"))
            end = true;
        if (fields.get(0).getSign().equals("X") && fields.get(1).getSign().equals("X") && fields.get(2).getSign().equals("X"))
            end = true;
        if (fields.get(3).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(5).getSign().equals("O"))
            end = true;
        if (fields.get(3).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(5).getSign().equals("X"))
            end = true;
        if (fields.get(6).getSign().equals("O") && fields.get(7).getSign().equals("O") && fields.get(8).getSign().equals("O"))
            end = true;
        if (fields.get(6).getSign().equals("X") && fields.get(7).getSign().equals("X") && fields.get(8).getSign().equals("X"))
            end = true;
        if (fields.get(0).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(8).getSign().equals("O"))
            end = true;
        if (fields.get(0).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(8).getSign().equals("X"))
            end = true;
        if (fields.get(2).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(6).getSign().equals("O"))
            end = true;
        if (fields.get(2).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(6).getSign().equals("X"))
            end = true;
        return end;

    }
    private void blockall(){
        button00.setDisable(true);
        button01.setDisable(true);
        button02.setDisable(true);
        button10.setDisable(true);
        button11.setDisable(true);
        button12.setDisable(true);
        button20.setDisable(true);
        button21.setDisable(true);
        button22.setDisable(true);
    }
    public void onbuttonagain(){


        }
    }




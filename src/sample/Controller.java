package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    int a = 0;
    boolean end = false;
    int zwyziestwa0=0;
    int zwyciestwaX=0;
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

    @FXML
    Label winX,win0,whonow;

    private void dlaX(){
winX.setText(String.valueOf(zwyciestwaX));
    }
    private void dla0(){
        win0.setText(String.valueOf(zwyziestwa0));
    }

    private void ustawnaX(Button button) {
        button.setText(String.valueOf('X'));

    }
    private void whoNow(){
        if(a%2==0)
            whonow.setText(String.valueOf("O"));
        else
            whonow.setText(String.valueOf("X"));
    }

    private void ustawnaO(Button button) {
        button.setText(String.valueOf('O'));
    }
    private void again(Button button){
        button00.setDisable(false);
        button01.setDisable(false);
        button02.setDisable(false);
        button10.setDisable(false);
        button11.setDisable(false);
        button12.setDisable(false);
        button20.setDisable(false);
        button21.setDisable(false);
        button22.setDisable(false);
        button00.setText(String.valueOf(" "));
        button01.setText(String.valueOf(" "));
        button02.setText(String.valueOf(" "));
        button10.setText(String.valueOf(" "));
        button11.setText(String.valueOf(" "));
        button12.setText(String.valueOf(" "));
        button20.setText(String.valueOf(" "));
        button21.setText(String.valueOf(" "));
        button22.setText(String.valueOf(" "));


for(int i=0;i<fields.size();i++){
    fields.get(i).setSign(" ");
}
    }

    public void onbutton00Click() {

        ustawBatonik(button00);
        if(a%2==0){
            fields.get(0).setSign("O");
        }
        else
            fields.get(0).setSign("X");

        System.out.println(fields.get(0));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }

    public void onbutton01Click() {
        ustawBatonik(button01);
        if(a%2==0){
            fields.get(1).setSign("O");
        }
        else
            fields.get(1).setSign("X");

        System.out.println(fields.get(1));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();

    }

    public void onbutton02Click() {

        ustawBatonik(button02);
        if(a%2==0){
            fields.get(2).setSign("O");
        }
        else
            fields.get(2).setSign("X");

        System.out.println(fields.get(2));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }

    public void onbutton10Click() {

        ustawBatonik(button10);
        if(a%2==0){
            fields.get(3).setSign("O");
        }
        else
            fields.get(3).setSign("X");

        System.out.println(fields.get(3));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }

    public void onbutton11Click() {

        ustawBatonik(button11);
        if(a%2==0){
            fields.get(4).setSign("O");
        }
        else
            fields.get(4).setSign("X");

        System.out.println(fields.get(4));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }

    public void onbutton12Click() {

        ustawBatonik(button12);
        if(a%2==0){
            fields.get(5).setSign("O");
        }
        else
            fields.get(5).setSign("X");

        System.out.println(fields.get(5));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }

    public void onbutton20Click() {

        ustawBatonik(button20);
if(a%2==0){
    fields.get(6).setSign("O");
}
else
    fields.get(6).setSign("X");

        System.out.println(fields.get(6));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }

    public void onbutton21Click() {
        ustawBatonik(button21);
        if(a%2==0){
            fields.get(7).setSign("O");
        }
        else
            fields.get(7).setSign("X");

        System.out.println(fields.get(7));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }



    public void onbutton22Click() {

        ustawBatonik(button22);
        if(a%2==0){
            fields.get(8).setSign("O");
        }
        else
            fields.get(8).setSign("X");

        System.out.println(fields.get(8));

        end=sprawdzanie();
        if(end==true){
            System.out.println("koniec");

            blockall();
        }
        dla0();
        dlaX();
    }


    public void ustawBatonik(Button button) {

        whoNow();
        if (a % 2 == 0) {
            ustawnaX(button);
        } else
            ustawnaO(button);

        button.setDisable(true);
        a++;

    }



    public boolean sprawdzanie() {

        if (fields.get(0).getSign().equals("O") && fields.get(3).getSign().equals("O") && fields.get(6).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(0).getSign().equals("X") && fields.get(3).getSign().equals("X") && fields.get(6).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(1).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(7).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(1).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(7).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(2).getSign().equals("O") && fields.get(5).getSign().equals("O") && fields.get(8).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(2).getSign().equals("X") && fields.get(5).getSign().equals("X") && fields.get(8).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(0).getSign().equals("O") && fields.get(1).getSign().equals("O") && fields.get(2).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(0).getSign().equals("X") && fields.get(1).getSign().equals("X") && fields.get(2).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(3).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(5).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(3).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(5).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(6).getSign().equals("O") && fields.get(7).getSign().equals("O") && fields.get(8).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(6).getSign().equals("X") && fields.get(7).getSign().equals("X") && fields.get(8).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(0).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(8).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(0).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(8).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
        if (fields.get(2).getSign().equals("O") && fields.get(4).getSign().equals("O") && fields.get(6).getSign().equals("O")){
            zwyziestwa0++;
            end = true;}
        if (fields.get(2).getSign().equals("X") && fields.get(4).getSign().equals("X") && fields.get(6).getSign().equals("X")){
            zwyciestwaX++;
            end = true;}
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

        again(buttonagain);
        end=false;
        }
    }




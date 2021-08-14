import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    // choice 1 = hex, choice 2 = decimal, choice 3 = binary,choice 4 = base 1
    Boolean inchoice1 = false;
    Boolean inchoice2 = false;
    Boolean inchoice3 = false;
    Boolean inchoice4 = false;

    Boolean outchoice1 = false;
    Boolean outchoice2 = false;
    Boolean outchoice3 = false;
    Boolean outchoice4 = false;
    int     m, k;
    String g, out;
    static RadioButton button1;
    static RadioButton button2;
    static RadioButton button3;
    static RadioButton button4;
    static RadioButton button5;
    static RadioButton button6;
    static RadioButton button7;
    static RadioButton button8;
    Boolean combo1;// hex to hex
    Boolean combo2;// hex to decimal
    Boolean combo3;//hex to binary
    Boolean combo4;//hex to base 1
    Boolean combo5;// decimal to hex
    Boolean combo6;// decimal to decimal
    Boolean combo7;// decimal to binary
    Boolean combo8;// decimal to base1
    Boolean combo9;//binary to hex
    Boolean combo10;//binary to decimal
    Boolean combo11;// binary to binary
    Boolean combo12;// binary to base1
    Boolean combo13;// base 1 to hex
    Boolean combo14;// base1 to decimal
    Boolean combo15;// base1 to binary
    Boolean combo16;// base1 to base1

    Boolean choice1 = false;
    Boolean choice2 = false;
    Boolean choice3 = false;
    Boolean choice4 = false;
    Boolean choice5 = false;
    Boolean choice6 = false;
    Boolean choice7 = false;
    Boolean choice8 = false;

    @Override
    public void start(Stage primaryStage) {

        HBox input_hor = new HBox();
        TextField input1 = new TextField();
        Text Input = new Text("INPUT  ");
        input_hor.getChildren().addAll(Input, input1);
        ToggleGroup from = new ToggleGroup();
        button1 = new RadioButton("Hexadecimal / Base 16");
        button2 = new RadioButton("Decimal / Base 10");
        button3 = new RadioButton("Binary / Base 2");
        button4 = new RadioButton("Octal/Base 8");
        button1.setToggleGroup(from);
        button2.setToggleGroup(from);
        button3.setToggleGroup(from);
        button4.setToggleGroup(from);
        Text lfrom = new Text("FROM \t");
        HBox from1 = new HBox();
        from1.getChildren().addAll(lfrom, button1, button2, button3, button4);

        ToggleGroup to = new ToggleGroup();
        button5 = new RadioButton("Hexadecimal / Base 16");
        button6 = new RadioButton("Decimal / Base 10");
        button7 = new RadioButton("Binary / Base 2");
        button8 = new RadioButton("Octal/Base 8");
        button5.setToggleGroup(to);
        button6.setToggleGroup(to);
        button7.setToggleGroup(to);
        button8.setToggleGroup(to);
        Text l2from = new Text("TO \t");
        HBox to1 = new HBox();
        to1.getChildren().addAll(l2from, button5, button6, button7, button8);

        VBox inout = new VBox();
        inout.getChildren().addAll(from1, to1);

        Button convert = new Button("Convert ");

        TextField output = new TextField();
        HBox Output_hor = new HBox();
        Text Output = new Text("OUTPUT  ");
        Output_hor.getChildren().addAll(Output, output);
        VBox ui = new VBox();

        ui.getChildren().addAll(input_hor, inout, convert, Output_hor);

        Group root = new Group(ui);
        from.selectedToggleProperty().addListener((ov, old_toggle, new_toggle) -> {
            if (from.getSelectedToggle() == button1) {
                inchoice1 = true;

            } else if (from.getSelectedToggle() == button2) {
                inchoice2 = true;

            } else if (from.getSelectedToggle() == button3) {
                inchoice3 = true;

            } else if (from.getSelectedToggle() == button4) {
                inchoice4 = true;
            }
        });
        to.selectedToggleProperty().addListener((ov, old_toggle, new_toggle) -> {
            if (to.getSelectedToggle() == button5) {
                outchoice1 = true;

            } else if (to.getSelectedToggle() == button6) {
                outchoice2 = true;

            } else if (to.getSelectedToggle() == button7) {
                outchoice3 = true;

            } else if (to.getSelectedToggle() == button8) {
                outchoice4 = true;

            }
        });
        convert.setOnAction(e ->
        {
            output.setText("");
            String n = input1.getText();
            g= n;
            try{
            m = Integer.parseInt(n);}
            catch (Exception e1){
                g = n;

            }
            // thread to remove radiobuton selection.
            t thread = new t();

            Thread hr = new Thread(thread);
            hr.start();

            //Add functionality to radio buttons and use them to choose the output value here.

            // if else "from"
            if (inchoice1 && !inchoice2 && !inchoice3 && !inchoice4) {
                System.out.println("1");
                inchoice1 = false;
                choice1 = true;

            } else if (inchoice2) {
                choice2 = true;
                System.out.println("2");
                inchoice2 = false;
            } else if (inchoice3) {
                System.out.println("3");
                inchoice3 = false;

            } else if (inchoice4) {
                choice4 = true;
                inchoice4 = false;
                System.out.println("4");
            } else {
                System.out.println("needs tuning");
            }
            // if else  "to"
            if (outchoice1 && !outchoice2 && !outchoice3 && !outchoice4) {
                System.out.println("5");
                choice5 = true;
                outchoice1 = false;

            } else if (outchoice2) {
                choice6 = true;
                System.out.println("6");
                outchoice2 = false;
            } else if (outchoice3) {
                choice7 = true;
                System.out.println("7");
                outchoice3 = false;

            } else if (outchoice4) {
                choice8 = true;
                outchoice4 = false;
                System.out.println("8");
            } else {
                System.out.println("needs tuning");
            }

            if(choice1 && choice5){
                System.out.println("Combo1: Hex to hex");
                combo1=true;
                choice1 = false;
                choice5 = false;
                hextohex();
            }else if(choice1 && choice6){
                System.out.println("Combo1: Hex to Decimal");
                hextodec();
                combo2 = true;
                choice1 = false;
                choice6 = false;
            }else if(choice1 && choice7){
                System.out.println("Combo1: Hex to Binary");
                combo3 = true;
                choice1 = false;
                choice7 = false;
                hextobin();
            }else if(choice1 && choice8){
                System.out.println("Combo1: Hex to Octal");
                combo4=true;
                choice1 = false;
                choice8 = false;
                hextooct();
            }
            else if(choice2 && choice5){
                System.out.println("Combo1: Decimal to Hex");
                dectohex();
                combo5=true;
                choice2 = false;
                choice5 = false;
                dectohex();
            }else if(choice2 && choice6){
                System.out.println("Combo1: Decimal  to decimal");
                combo6=true;
                choice2 = false;
                choice6 = false;
                dectodec();
            }
            else if(choice2 && choice7){
                System.out.println("Combo1: Decimal to binary");
                dectobin();
                combo7=true;
                choice2 = false;
                choice7 = false;
            }else if(choice2 && choice8){
                System.out.println("Combo1: Decimal to base 1");
                combo8=true;
                choice2 = false;
                choice8 = false;
                dectooct();
            }
            else if(choice3 && choice5){
                System.out.println("Combo1: Binary to Hex");
                bintohex();
                combo9=true;
                choice3 = false;
                choice5 = false;
                bintohex();
            }
            else if(choice3 && choice6){
                System.out.println("Combo1: Binary to decimal");
                bintodec();
                combo10=true;
                choice3 = false;
                choice6 = false;
            }
            else if(choice3 && choice7){
                System.out.println("Combo1: Binary to binary");
                bintob2();
                combo11=true;
                choice3 = false;
                choice7 = false;
            }
            else if(choice3 && choice8){
                System.out.println("Combo1: Binary to base 1");
                bintooct();
                combo12=true;
                choice3 = false;
                choice8 = false;
            }else if(choice4 && choice5){
                System.out.println("Combo1: Base1 to hex");
                combo13=true;
                choice4 = false;
                choice5 = false;
                octtohex();
            }else if(choice4 && choice6){
                System.out.println("Combo14: Base1 to decimal");
                combo14=true;
                choice4 = false;
                choice6 = false;
                octtodec();
            }
            else if(choice4 && choice7){
                System.out.println("Combo1: Base1 to binary");
                combo15=true;
                choice4 = false;
                choice7 = false;
                octtobin();
            }
            else if(choice4 && choice8){
                System.out.println("Combo1: base1 to base1");
                combo16=true;
                choice4 = false;
                choice8 = false;
                octtooct();
            }


            String l = String.valueOf(k);
            String ouy= out;
            output.setText(ouy);

        });
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Base Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void bintodec() {
    //Converts from binary to decimal
        combo10 = false;
        out = String.valueOf(Integer.parseInt(g, 2));
    }

    public void dectobin() {
        combo7 = false;
        // Converts from decimal to binary
        out = (Integer.toBinaryString(m));
    }

    public void hextodec() {
        combo2 = false;
        // Converts from hex to decimal
        k = Integer.parseInt(g, 16);
        out = String.valueOf(k);
    }

    public void dectohex() {
        combo5 = false;
        // Converts from decimal to hex
        out = Integer.toHexString(m);
    }

    public void bintob2() {
        //Converts from binary to binary
        combo11 = false;
        out = String.valueOf(m);

    }

    public void bintooct() {
        //Converts from binary to octal
        combo12 = false;
        out = String.valueOf(m);
    }

    public void bintohex() {
        //Converts from binary to hexadecimal
        combo9 = false;
        out = String.valueOf(m);
    }
    public void hextohex(){
        //converts from to hex to hex
        combo1 =false;
        out = String.valueOf(m);
    }
    public void hextobin(){
        //converts from hex to binary
        combo3 = false;
        out = String.valueOf(m);
    }
    public void dectodec(){
        //converts from decimal to decimal
        combo6 = false;
        out = String.valueOf(m);
    }
    public void dectooct(){
        //converts from decimal to octal
        combo8 = false;
        out = String.valueOf(m);
    }
    public void octtohex(){
        //converts from octal to hexadecimal
        combo13 = false;
        out = String.valueOf(m);
    }
    public void octtodec(){
        // converts from octal to decimal
        combo14 = false;
        out = String.valueOf(m);
    }
    public void octtobin(){
        //converts from octal to binary
        combo15 = false;
        out = String.valueOf(m);
    }
    public void octtooct(){
        //converts from octal to octal
        combo16 = false;
        out = String.valueOf(m);
    }
    public void hextooct(){
        //converts from hex to octal
        String digits = "0123456789ABCDEF";
        g = g.toUpperCase();
        int val = 0;
        for (int i = 0; i < g.length(); i++)
        {
            char c = g.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }

        combo4 = false;
        out = String.valueOf(val);
    }
}

class t implements Runnable {

    public t() {
    }

    public void run() {
        Main.button1.setSelected(false);
        Main.button2.setSelected(false);
        Main.button3.setSelected(false);
        Main.button4.setSelected(false);
        Main.button5.setSelected(false);
        Main.button6.setSelected(false);
        Main.button7.setSelected(false);
        Main.button8.setSelected(false);
    }
}
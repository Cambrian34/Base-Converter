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
        button4 = new RadioButton("Base 1");
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
        button8 = new RadioButton("Base 1");
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
            String n = input1.getText();
            g = n;
            //m = Integer.parseInt(n);
            // thread to remove radiobuton selection.
            t thread = new t(10);

            Thread hr = new Thread(thread);
            hr.start();

            //Add functionality to radio buttons and use them to choose the output value here.

            // if else "from"
            if (inchoice1 == true && inchoice2 == false && inchoice3 == false && inchoice4 == false) {
                System.out.println("1");
                inchoice1 = false;

            } else if (inchoice2 == true) {

                System.out.println("2");
                inchoice2 = false;
            } else if (inchoice3 == true) {
                System.out.println("3");
                inchoice3 = false;

            } else if (inchoice4 == true) {

                inchoice4 = false;
                System.out.println("4");
            } else {
                System.out.println("needs tuning");
            }
            // if else  "to"
            if (outchoice1 == true && outchoice2 == false && outchoice3 == false && outchoice4 == false) {
                System.out.println("1");
                outchoice1 = false;

            } else if (outchoice2 == true) {

                System.out.println("2");
                outchoice2 = false;
            } else if (outchoice3 == true) {
                System.out.println("3");
                outchoice3 = false;

            } else if (outchoice4 == true) {

                outchoice4 = false;
                System.out.println("4");
            } else {
                System.out.println("needs tuning");
            }


            String l = String.valueOf(k);
            output.setText(l);

        });
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }

    public void clearselection() {

        button1.setSelected(false);
        button2.setSelected(false);
        button3.setSelected(false);
        button4.setSelected(false);
        button5.setSelected(false);
        button6.setSelected(false);
        button7.setSelected(false);
        button8.setSelected(false);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void bintodec() {
//Converts from binary to decimal
        k = Integer.parseInt(g, 2);
    }

    public void dectobin() {
        // Converts from decimal to binary
        out = (Integer.toBinaryString(m));
    }

    public void hextodec() {
        // Converts from hex to decimal
        k = Integer.parseInt(g, 16);
    }

    public void dectohex() {
        // Converts from decimal to hex
        out = Integer.toHexString(m);
    }

    public void bintob2() {
        //Converts from binary to binary
    }

    public void bintob1() {
        //Converts from binary to base 1
    }

    public void bintohex() {
        //Converts from binary to hexadecimal
    }
}

class t implements Runnable {

    public t(int var) {
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
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
    @Override
    public void start(Stage primaryStage) {

        HBox input_hor = new HBox();
        TextField input1 = new TextField();
        Text Input = new Text("INPUT  ");
        input_hor.getChildren().addAll(Input,input1);
        ToggleGroup from = new ToggleGroup();
        RadioButton button1 = new RadioButton("Hexadecimal / Base 16");
        RadioButton button2 = new RadioButton("Decimal / Base 10");
        RadioButton button3 = new RadioButton("Binary / Base 2");
        RadioButton button4 = new RadioButton("Base 1");
        button1.setToggleGroup(from);
        button2.setToggleGroup(from);
        button3.setToggleGroup(from);
        button4.setToggleGroup(from);
        Text lfrom = new Text("FROM \t");
        HBox from1 = new HBox();
        from1.getChildren().addAll(lfrom,button1,button2,button3,button4);

        ToggleGroup to = new ToggleGroup();
        RadioButton button5 = new RadioButton("Hexadecimal / Base 16");
        RadioButton button6 = new RadioButton("Decimal / Base 10");
        RadioButton button7 = new RadioButton("Binary / Base 2");
        RadioButton button8 = new RadioButton("Base 1");
        button5.setToggleGroup(to);
        button6.setToggleGroup(to);
        button7.setToggleGroup(to);
        button8.setToggleGroup(to);
        Text l2from = new Text("TO \t");
        HBox to1 = new HBox();
        to1.getChildren().addAll(l2from,button5,button6,button7,button8);

        VBox inout = new VBox();
        inout.getChildren().addAll(from1,to1);

        Button convert = new Button("Convert ");

        TextField output = new TextField();
        HBox Output_hor = new HBox();
        Text Output = new Text("OUTPUT  ");
        Output_hor.getChildren().addAll(Output,output);
        VBox ui = new VBox();

        ui.getChildren().addAll(input_hor,inout, convert, Output_hor);

        Group root = new Group(ui);
        convert.setOnAction(e ->
        {
            String n = input1.getText();
            int m = Integer.parseInt(n);
            //Add functionality to radio buttons and use them to choose the output value here.
            String l = String.valueOf(m);
            Output.setText(l);

        });
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
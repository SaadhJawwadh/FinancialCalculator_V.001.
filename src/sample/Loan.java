package sample;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Loan {

    public static Pane root() {
        Stage window = new Stage();
        window.setTitle("Loan Calculator");



        Label lbl1 = new Label("Loan amount:");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);
        Label lbl2 = new Label("Loan Term:");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);
        Label lbl3 = new Label("Interest rate %:");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);


        Label lblA1 = new Label("Payment Every Month:");
        lblA1.setLayoutY(400);
        lblA1.setLayoutX(50);
        lblA1.setStyle(" -fx-font-weight: bold;");
        Label lblA2 = new Label("Total of Payments:");
        lblA2.setLayoutY(420);
        lblA2.setLayoutX(50);
        lblA2.setStyle(" -fx-font-weight: bold;");
        Label lblA3 = new Label("Total Interest: ");
        lblA3.setLayoutY(440);
        lblA3.setLayoutX(50);
        lblA3.setStyle(" -fx-font-weight: bold");

        Label lbA1 = new Label("-Result-");
        lbA1.setLayoutY(400);
        lbA1.setLayoutX(200);
        lbA1.setStyle(" -fx-font-weight: bold");
        Label lbA2 = new Label("-Result-");
        lbA2.setLayoutY(420);
        lbA2.setLayoutX(200);
        lbA2.setStyle(" -fx-font-weight: bold;");
        Label lbA3 = new Label("-Result-");
        lbA3.setLayoutY(440);
        lbA3.setLayoutX(200);
        lbA3.setStyle(" -fx-font-weight: bold;");


        TextField txt1 = new TextField();
        txt1.setLayoutX(150);
        txt1.setLayoutY(100);
        TextField txt2 = new TextField();
        txt2.setLayoutX(150);
        txt2.setLayoutY(150);
        TextField txt3 = new TextField();
        txt3.setLayoutX(150);
        txt3.setLayoutY(200);


        //Buttons

        //Calc
        Button btn1 = new Button("Calculate");
        btn1.setLayoutX(150);
        btn1.setLayoutY(230);
        btn1.setStyle("-fx-font-weight: bold;");

        //Loan Formula
        btn1.setOnAction(e -> {
            try{
            Integer n=12;
            double l = Double.parseDouble(txt1.getText());
            double t = (Double.parseDouble(txt2.getText()));
            double r = Double.parseDouble(txt3.getText());

            double ans5;
            ans5 = ((r/12)/100* l)/(1 - Math.pow((1 +(r/12)/100 ), -n*t));
            lbA1.setText(String.format("%.2f",ans5));

            double ans6;
            ans6=(ans5*t*12);
            lbA2.setText(String.format("%.2f",ans6));

            double ans7;

            ans7=ans6-l;
            lbA3.setText(String.format("%.2f",ans7));

            } catch (Exception prompt){
                lbA1.setText("!!! ");
                lbA2.setText("Invalid input!, Please enter a Number...");
                lbA3.setText("!!!");

            }
        });


        //Help
        Button helpB = new Button("Tips");
        helpB.setMinSize(50, 30);

        Image img2 = new Image("file:Asserts/HelpI.png");
        ImageView view2 = new ImageView(img2);
        view2.setFitHeight(20);
        view2.setPreserveRatio(true);
        helpB.setGraphic(view2);

        helpB.setStyle("-fx-base: rgba(0,0,0,0.71); -fx-font-style:italic;-fx-font-weight: bold;");

        helpB.setOnAction(e -> Help.LHelp());

        //Home
        Button btn3 = new Button("Home Page");
        btn3.setMinSize(120, 30);
        btn3.setLayoutX(150);
        btn3.setLayoutY(50);
        Image img1 = new Image("file:Asserts/Back.png");
        ImageView view = new ImageView(img1);
        view.setFitHeight(20);
        view.setPreserveRatio(true);
        btn3.setGraphic(view);

        btn3.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");

        // Clear button
        Button btnCl1 = new Button("Clear");
        btnCl1.setMinSize(90,20);
        btnCl1.setLayoutX(400);
        btnCl1.setLayoutY(330);
        btnCl1.setStyle("-fx-base: #c8f6ae;-fx-font-style: italic; -fx-font-weight: bold;");

        btnCl1.setOnAction(event -> {

            txt1.clear();
            txt2.clear();
            txt3.clear();
            lbA1.setText("");
            lbA2.setText("");
            lbA3.setText("");

        });



        //Keyboard Buttons
        Button btnKP1 = new Button("1");
        btnKP1.setLayoutX(400);
        btnKP1.setLayoutY(100);
        btnKP1.setMinSize(30,50);
        btnKP1.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");

        Button btnKP2 = new Button("2");
        btnKP2.setLayoutX(430);
        btnKP2.setLayoutY(100);
        btnKP2.setMinSize(30,50);
        btnKP2.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP3 = new Button("3");
        btnKP3.setLayoutX(460);
        btnKP3.setLayoutY(100);
        btnKP3.setMinSize(30,50);
        btnKP3.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");




        Button btnKP4 = new Button("4");
        btnKP4.setLayoutX(400);
        btnKP4.setLayoutY(150);
        btnKP4.setMinSize(30,50);
        btnKP4.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP5 = new Button("5");
        btnKP5.setLayoutX(430);
        btnKP5.setLayoutY(150);
        btnKP5.setMinSize(30,50);
        btnKP5.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP6 = new Button("6");
        btnKP6.setLayoutX(460);
        btnKP6.setLayoutY(150);
        btnKP6.setMinSize(30,50);
        btnKP6.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP7 = new Button("7");
        btnKP7.setLayoutX(400);
        btnKP7.setLayoutY(200);
        btnKP7.setMinSize(30,50);
        btnKP7.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP8 = new Button("8");
        btnKP8.setLayoutX(430);
        btnKP8.setLayoutY(200);
        btnKP8.setMinSize(30,50);
        btnKP8.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP9 = new Button("9");
        btnKP9.setLayoutX(460);
        btnKP9.setLayoutY(200);
        btnKP9.setMinSize(30,50);
        btnKP9.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");




        Button btnKPdot = new Button(".");
        btnKPdot.setLayoutX(400);
        btnKPdot.setLayoutY(250);
        btnKPdot.setMinSize(30,50);
        btnKPdot.setStyle("-fx-base: #96ecec;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKP0 = new Button("0");
        btnKP0.setLayoutX(430);
        btnKP0.setLayoutY(250);
        btnKP0.setMinSize(30,50);
        btnKP0.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");



        Button btnKPneq = new Button("-");
        btnKPneq.setLayoutX(460);
        btnKPneq.setLayoutY(250);
        btnKPneq.setMinSize(30,50);
        btnKPneq.setStyle("-fx-base: #96ecec;-fx-font-style: italic; -fx-font-weight: bold;");

        Button btnBS = new Button("<-");
        btnBS.setLayoutX(400);
        btnBS.setLayoutY(300);
        btnBS.setMinSize(90,30);
        btnBS.setStyle("-fx-base: #3a7b8e;-fx-font-style: italic; -fx-font-weight: bold;");


        //Keyboard set on action for txt field 01
        txt1.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt1.setText(txt1.getText()+"1"));
            btnKP2.setOnAction(e -> txt1.setText(txt1.getText()+"2"));
            btnKP3.setOnAction(e -> txt1.setText(txt1.getText()+"3"));
            btnKP4.setOnAction(e -> txt1.setText(txt1.getText()+"4"));
            btnKP5.setOnAction(e -> txt1.setText(txt1.getText()+"5"));
            btnKP6.setOnAction(e -> txt1.setText(txt1.getText()+"6"));
            btnKP7.setOnAction(e -> txt1.setText(txt1.getText()+"6"));
            btnKP8.setOnAction(e -> txt1.setText(txt1.getText()+"7"));
            btnKP9.setOnAction(e -> txt1.setText(txt1.getText()+"9"));
            btnKPdot.setOnAction(e -> txt1.setText(txt1.getText()+"."));
            btnKP0.setOnAction(e -> txt1.setText(txt1.getText()+"0"));
            btnKPneq.setOnAction(e -> txt1.setText(txt1.getText()+"-"));
            btnBS.setOnAction(e -> txt1.setText(txt1.getText().substring(0, txt1.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 02
        txt2.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt2.setText(txt2.getText()+"1"));
            btnKP2.setOnAction(e -> txt2.setText(txt2.getText()+"2"));
            btnKP3.setOnAction(e -> txt2.setText(txt2.getText()+"3"));
            btnKP4.setOnAction(e -> txt2.setText(txt2.getText()+"4"));
            btnKP5.setOnAction(e -> txt2.setText(txt2.getText()+"5"));
            btnKP6.setOnAction(e -> txt2.setText(txt2.getText()+"6"));
            btnKP7.setOnAction(e -> txt2.setText(txt2.getText()+"6"));
            btnKP8.setOnAction(e -> txt2.setText(txt2.getText()+"7"));
            btnKP9.setOnAction(e -> txt2.setText(txt2.getText()+"9"));
            btnKPdot.setOnAction(e -> txt2.setText(txt2.getText()+"."));
            btnKP0.setOnAction(e -> txt2.setText(txt2.getText()+"0"));
            btnKPneq.setOnAction(e -> txt2.setText(txt2.getText()+"-"));
            btnBS.setOnAction(e -> txt2.setText(txt2.getText().substring(0, txt2.getText().length() - 1)));

        });
        //Keyboard set on action for txt field 03
        txt3.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt3.setText(txt3.getText()+"1"));
            btnKP2.setOnAction(e -> txt3.setText(txt3.getText()+"2"));
            btnKP3.setOnAction(e -> txt3.setText(txt3.getText()+"3"));
            btnKP4.setOnAction(e -> txt3.setText(txt3.getText()+"4"));
            btnKP5.setOnAction(e -> txt3.setText(txt3.getText()+"5"));
            btnKP6.setOnAction(e -> txt3.setText(txt3.getText()+"6"));
            btnKP7.setOnAction(e -> txt3.setText(txt3.getText()+"6"));
            btnKP8.setOnAction(e -> txt3.setText(txt3.getText()+"7"));
            btnKP9.setOnAction(e -> txt3.setText(txt3.getText()+"9"));
            btnKPdot.setOnAction(e -> txt3.setText(txt3.getText()+"."));
            btnKP0.setOnAction(e -> txt3.setText(txt3.getText()+"0"));
            btnKPneq.setOnAction(e -> txt3.setText(txt3.getText()+"-"));
            btnBS.setOnAction(e -> txt3.setText(txt3.getText().substring(0, txt3.getText().length() - 1)));

        });


        Image image = new Image("file:Asserts/BG2.jpg");
        ImageView img = new ImageView(image);



        btn3.setOnAction(e -> {
            window.close();
            Main.show();

        });



        Pane root = new Pane();
        root.getChildren().addAll(img, lbl1, lbl2, lbl3, lblA1,lblA2,lblA3,lbA1, lbA2,lbA3, txt1, txt2, txt3,btn1,helpB,btn3,btnCl1,btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);

        window.setScene(new Scene(root, 500, 500));
        window.show();

        return root;
    }

}
package sample;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import static java.lang.Math.pow;


public class Savings {


    public static Pane root() {
        Stage window = new Stage();
        window.setTitle("Saving Calculator");


        //Adding background image
        Image image = new Image("file:Asserts/BG2.jpg");
        ImageView img = new ImageView(image);


        //FV (Future Value)

        //labels
        Label lbl1 = new Label("N (Number of Periods):");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);


        Label lbl2 = new Label("I/Y (Compound Rate):");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);


        Label lbl3 = new Label("Stat Principal:");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);

        Label lbl4 = new Label("PMT (Annuity Payment):");
        lbl4.setLayoutY(250);
        lbl4.setLayoutX(50);

        //Text Field
        TextField txt1 = new TextField();
        txt1.setLayoutX(200);
        txt1.setLayoutY(100);

        TextField txt2 = new TextField();
        txt2.setLayoutX(200);
        txt2.setLayoutY(150);

        TextField txt3 = new TextField();
        txt3.setLayoutX(200);
        txt3.setLayoutY(200);

        TextField txt4 = new TextField();
        txt4.setLayoutX(200);
        txt4.setLayoutY(250);


        //Calculate buttons
        Button btncal1 = new Button("Calculate");
        btncal1.setLayoutX(200);
        btncal1.setLayoutY(300);
        btncal1.setStyle("-fx-font-weight: bold;");

        Label lbFV1 = new Label("FV (Future Value): " );
        lbFV1.setLayoutY(430);
        lbFV1.setLayoutX(50);
        lbFV1.setStyle(" -fx-font-weight: bold;");

        Label lbFV2 = new Label("Result" );
        lbFV2.setLayoutY(430);
        lbFV2.setLayoutX(200);

        ///FV (Future Value) FORMULA
        btncal1.setOnAction(e -> {
            try{
            Integer n=12;
            double t = Double.parseDouble(txt1.getText()); //N (Number of Periods)
            double r = Double.parseDouble(txt2.getText())/100; //I/Y (Compound Rate)
            double P = Double.parseDouble(txt3.getText()); //Stat Principal
            double PMT = Double.parseDouble(txt4.getText()); //PMT (Annuity Payment)

            double res;
            res=( PMT * ((pow((1+(r/n)),(n*t))-1)/(r/n))) + ( P * ( pow(( 1 + ( r / n ) ), ( n * t )) ) );
            lbFV2.setText(String.format("%.2f",res)+"$");

            } catch (Exception prompt){
                lbFV2.setText("Invalid input!, Please enter a Number...");

            }
        });

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
            txt4.clear();
            lbFV2.setText("");
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
        //Keyboard set on action for txt field 04
        txt4.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt4.setText(txt4.getText()+"1"));
            btnKP2.setOnAction(e -> txt4.setText(txt4.getText()+"2"));
            btnKP3.setOnAction(e -> txt4.setText(txt4.getText()+"3"));
            btnKP4.setOnAction(e -> txt4.setText(txt4.getText()+"4"));
            btnKP5.setOnAction(e -> txt4.setText(txt4.getText()+"5"));
            btnKP6.setOnAction(e -> txt4.setText(txt4.getText()+"6"));
            btnKP7.setOnAction(e -> txt4.setText(txt4.getText()+"6"));
            btnKP8.setOnAction(e -> txt4.setText(txt4.getText()+"7"));
            btnKP9.setOnAction(e -> txt4.setText(txt4.getText()+"9"));
            btnKPdot.setOnAction(e -> txt4.setText(txt4.getText()+"."));
            btnKP0.setOnAction(e -> txt4.setText(txt4.getText()+"0"));
            btnKPneq.setOnAction(e -> txt4.setText(txt4.getText()+"-"));
            btnBS.setOnAction(e -> txt4.setText(txt4.getText().substring(0, txt4.getText().length() - 1)));

        });


        //PMT (Annuity Payment) Tabs

        //labels

        Label lbl5 = new Label("N (Number of Periods):");
        lbl5.setLayoutY(100);
        lbl5.setLayoutX(50);

        Label lbl6 = new Label("FV (Future Value):");
        lbl6.setLayoutY(150);
        lbl6.setLayoutX(50);

        Label lbl7 = new Label("Start Principal:");
        lbl7.setLayoutY(200);
        lbl7.setLayoutX(50);

        Label lbl8 = new Label("I/Y (Compound Rate):");
        lbl8.setLayoutY(250);
        lbl8.setLayoutX(50);


        //--Textfield

        TextField txt5 = new TextField();
        txt5.setLayoutX(200);
        txt5.setLayoutY(100);

        TextField txt6 = new TextField();
        txt6.setLayoutX(200);
        txt6.setLayoutY(150);

        TextField txt7 = new TextField();
        txt7.setLayoutX(200);
        txt7.setLayoutY(200);

        TextField txt8 = new TextField();
        txt8.setLayoutX(200);
        txt8.setLayoutY(250);

        //button
        //Calculate button
        Button btncal2 = new Button("Calculate");
        btncal2.setLayoutX(200);
        btncal2.setLayoutY(300);
        btncal2.setStyle("-fx-font-weight: bold;");


        Label lbPMT1 = new Label("PMT (Annuity Payment): " );
        lbPMT1.setLayoutY(430);
        lbPMT1.setLayoutX(50);

        Label lbPMT2 = new Label("Result" );
        lbPMT2.setLayoutY(430);
        lbPMT2.setLayoutX(200);

        lbPMT1.setStyle(" -fx-font-weight: bold;");

        //PMT (Annuity Payment) Tabs

        btncal2.setOnAction(e -> {
            try{
            Integer n=12;
            double t = Double.parseDouble(txt5.getText()); //N (Number of Periods)
            double A = Double.parseDouble(txt6.getText()); //FV (Future Value)
            double P = Double.parseDouble(txt7.getText());//Start Principal
            double r = Double.parseDouble(txt8.getText())/100; //I/Y (Compound Rate)

            double res1;
            res1= (A-(P*pow((1+(r/n)),(n*t))))/((pow((1+(r/n)),(n*t))-1)/(r/n));;
            lbPMT2.setText(String.format("%.2f",res1)+"$");
            } catch (Exception prompt){
                lbPMT2.setText("Invalid input!, Please enter a Number...");

            }
        });

        // Clear button
        Button btnCl2 = new Button("Clear");
        btnCl2.setMinSize(90,20);
        btnCl2.setLayoutX(400);
        btnCl2.setLayoutY(330);
        btnCl2.setStyle("-fx-base: #c8f6ae;-fx-font-style: italic; -fx-font-weight: bold;");

        btnCl2.setOnAction(event -> {

            txt5.clear();
            txt6.clear();
            txt7.clear();
            txt8.clear();
            lbPMT2.setText("");
        });

        //I/Y (Compound Rate) Tab

        //Labels

        Label lbl9 = new Label("N (Number of Periods):");
        lbl9.setLayoutY(100);
        lbl9.setLayoutX(50);

        Label lbl10 = new Label("FV (Future Value):");
        lbl10.setLayoutY(150);
        lbl10.setLayoutX(50);

        Label lbl11 = new Label("Start Principal:");
        lbl11.setLayoutY(200);
        lbl11.setLayoutX(50);

        Label lbl12 = new Label("PMT (Annuity Payment):");
        lbl12.setLayoutY(250);
        lbl12.setLayoutX(50);

        //Textfield

        TextField txt9 = new TextField();
        txt9.setLayoutX(200);
        txt9.setLayoutY(100);

        TextField txt10 = new TextField();
        txt10.setLayoutX(200);
        txt10.setLayoutY(150);

        TextField txt11 = new TextField();
        txt11.setLayoutX(200);
        txt11.setLayoutY(200);

        TextField txt12 = new TextField();
        txt12.setLayoutX(200);
        txt12.setLayoutY(250);

        //Calculate button
        Button btncal3 = new Button("Calculate");
        btncal3.setLayoutX(200);
        btncal3.setLayoutY(300);
        btncal3.setStyle("-fx-font-weight: bold;");


        Label lbI1 = new Label("I/Y (Compound Rate): " );
        lbI1.setLayoutY(430);
        lbI1.setLayoutX(50);

        Label lbI2 = new Label("Result" );
        lbI2.setLayoutY(430);
        lbI2.setLayoutX(200);

        lbI1.setStyle(" -fx-font-weight: bold;");

        //I/Y (Compound Rate) Tab Formula
        btncal3.setOnAction(e -> {
            try{
            Integer n=12;
            double num9 = Double.parseDouble(txt9.getText()); //N (Number of Periods)
            double num10 = Double.parseDouble(txt10.getText());//FV (Future Value)
            double num11 = Double.parseDouble(txt11.getText()); //Start Principal
            double num12 = Double.parseDouble(txt12.getText()); //PMT (Annuity Payment)

            double res2;
            res2 =n*(pow((num10/num11),(1/(n*num9)))-1);
            lbI2.setText(String.format("%.2f",res2)+"%");
        } catch (Exception prompt){
            lbI2.setText("Invalid input!, Please enter a Number...");

        }
        });

        // Clear button
        Button btnCl3 = new Button("Clear");
        btnCl3.setMinSize(90,20);
        btnCl3.setLayoutX(400);
        btnCl3.setLayoutY(330);
        btnCl3.setStyle("-fx-base: #c8f6ae;-fx-font-style: italic; -fx-font-weight: bold;");

        btnCl3.setOnAction(event -> {

            txt9.clear();
            txt10.clear();
            txt11.clear();
            txt12.clear();
            lbI2.setText("");
        });

        //Keyboard set on action for txt field 05
        txt5.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt5.setText(txt5.getText()+"1"));
            btnKP2.setOnAction(e -> txt5.setText(txt5.getText()+"2"));
            btnKP3.setOnAction(e -> txt5.setText(txt5.getText()+"3"));
            btnKP4.setOnAction(e -> txt5.setText(txt5.getText()+"4"));
            btnKP5.setOnAction(e -> txt5.setText(txt5.getText()+"5"));
            btnKP6.setOnAction(e -> txt5.setText(txt5.getText()+"6"));
            btnKP7.setOnAction(e -> txt5.setText(txt5.getText()+"6"));
            btnKP8.setOnAction(e -> txt5.setText(txt5.getText()+"7"));
            btnKP9.setOnAction(e -> txt5.setText(txt5.getText()+"9"));
            btnKPdot.setOnAction(e -> txt5.setText(txt5.getText()+"."));
            btnKP0.setOnAction(e -> txt5.setText(txt5.getText()+"0"));
            btnKPneq.setOnAction(e -> txt5.setText(txt5.getText()+"-"));
            btnBS.setOnAction(e -> txt5.setText(txt5.getText().substring(0, txt5.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 06
        txt6.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt6.setText(txt6.getText()+"1"));
            btnKP2.setOnAction(e -> txt6.setText(txt6.getText()+"2"));
            btnKP3.setOnAction(e -> txt6.setText(txt6.getText()+"3"));
            btnKP4.setOnAction(e -> txt6.setText(txt6.getText()+"4"));
            btnKP5.setOnAction(e -> txt6.setText(txt6.getText()+"5"));
            btnKP6.setOnAction(e -> txt6.setText(txt6.getText()+"6"));
            btnKP7.setOnAction(e -> txt6.setText(txt6.getText()+"6"));
            btnKP8.setOnAction(e -> txt6.setText(txt6.getText()+"7"));
            btnKP9.setOnAction(e -> txt6.setText(txt6.getText()+"9"));
            btnKPdot.setOnAction(e -> txt6.setText(txt6.getText()+"."));
            btnKP0.setOnAction(e -> txt6.setText(txt6.getText()+"0"));
            btnKPneq.setOnAction(e -> txt6.setText(txt6.getText()+"-"));
            btnBS.setOnAction(e -> txt6.setText(txt6.getText().substring(0, txt6.getText().length() - 1)));

        });
        //Keyboard set on action for txt field 07
        txt7.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt7.setText(txt7.getText()+"1"));
            btnKP2.setOnAction(e -> txt7.setText(txt7.getText()+"2"));
            btnKP3.setOnAction(e -> txt7.setText(txt7.getText()+"3"));
            btnKP4.setOnAction(e -> txt7.setText(txt7.getText()+"4"));
            btnKP5.setOnAction(e -> txt7.setText(txt7.getText()+"5"));
            btnKP6.setOnAction(e -> txt7.setText(txt7.getText()+"6"));
            btnKP7.setOnAction(e -> txt7.setText(txt7.getText()+"6"));
            btnKP8.setOnAction(e -> txt7.setText(txt7.getText()+"7"));
            btnKP9.setOnAction(e -> txt7.setText(txt7.getText()+"9"));
            btnKPdot.setOnAction(e -> txt7.setText(txt7.getText()+"."));
            btnKP0.setOnAction(e -> txt7.setText(txt7.getText()+"0"));
            btnKPneq.setOnAction(e -> txt7.setText(txt7.getText()+"-"));
            btnBS.setOnAction(e -> txt7.setText(txt7.getText().substring(0, txt7.getText().length() - 1)));

        });
        //Keyboard set on action for txt field 08
        txt8.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt8.setText(txt8.getText()+"1"));
            btnKP2.setOnAction(e -> txt8.setText(txt8.getText()+"2"));
            btnKP3.setOnAction(e -> txt8.setText(txt8.getText()+"3"));
            btnKP4.setOnAction(e -> txt8.setText(txt8.getText()+"4"));
            btnKP5.setOnAction(e -> txt8.setText(txt8.getText()+"5"));
            btnKP6.setOnAction(e -> txt8.setText(txt8.getText()+"6"));
            btnKP7.setOnAction(e -> txt8.setText(txt8.getText()+"6"));
            btnKP8.setOnAction(e -> txt8.setText(txt8.getText()+"7"));
            btnKP9.setOnAction(e -> txt8.setText(txt8.getText()+"9"));
            btnKPdot.setOnAction(e -> txt8.setText(txt8.getText()+"."));
            btnKP0.setOnAction(e -> txt8.setText(txt8.getText()+"0"));
            btnKPneq.setOnAction(e -> txt8.setText(txt8.getText()+"-"));
            btnBS.setOnAction(e -> txt8.setText(txt8.getText().substring(0, txt8.getText().length() - 1)));

        });





        //N (Number of Periods) Tab

        //Label

        Label lbl13 = new Label("I/Y (Compound Rate):");
        lbl13.setLayoutY(100);
        lbl13.setLayoutX(50);

        Label lbl14 = new Label("FV (Future Value):");
        lbl14.setLayoutY(150);
        lbl14.setLayoutX(50);

        Label lbl15 = new Label("Start Principal:");
        lbl15.setLayoutY(200);
        lbl15.setLayoutX(50);


        Label lbl16 = new Label("PMT (Annuity Payment):");
        lbl16.setLayoutY(250);
        lbl16.setLayoutX(50);


        //Textfield

        TextField txt13 = new TextField();
        txt13.setLayoutX(200);
        txt13.setLayoutY(100);

        TextField txt14 = new TextField();
        txt14.setLayoutX(200);
        txt14.setLayoutY(150);

        TextField txt15 = new TextField();
        txt15.setLayoutX(200);
        txt15.setLayoutY(200);

        TextField txt16 = new TextField();
        txt16.setLayoutX(200);
        txt16.setLayoutY(250);

        //Calculate button
        Button btncal4 = new Button("Calculate");
        btncal4.setLayoutX(200);
        btncal4.setLayoutY(300);
        btncal4.setStyle("-fx-font-weight: bold;");

        Label lbN1 = new Label("N (Number of Periods):" );
        lbN1.setLayoutY(430);
        lbN1.setLayoutX(50);

        Label lbN2 = new Label("Result" );
        lbN2.setLayoutY(430);
        lbN2.setLayoutX(200);

        lbN1.setStyle(" -fx-font-weight: bold;");


        ///NUMBERS PERIODS FORMULA

        btncal4.setOnAction(e -> {
            try{
            Integer n=12;
            double r = Double.parseDouble(txt13.getText())/100; //I/Y (Compound Rate)
            double A = Double.parseDouble(txt14.getText()); //FV (Future Value)
            double P = Double.parseDouble(txt15.getText());//Start Principal
            double PMT = Double.parseDouble(txt16.getText());//PMT (Annuity Payment)

            double res3;
            res3=Math.log((A+(PMT*12/r))/(P+(PMT*12/r)))/(Math.log(1+(r/12))*12);
            lbN2.setText(String.format("%.0f",res3)); }
            catch (Exception prompt){
            lbN2.setText("Invalid input!, Please enter a Number...");

        }
        });

        // Clear button
        Button btnCl4 = new Button("Clear");
        btnCl4.setMinSize(90,20);
        btnCl4.setLayoutX(400);
        btnCl4.setLayoutY(330);
        btnCl4.setStyle("-fx-base: #c8f6ae;-fx-font-style: italic; -fx-font-weight: bold;");

        btnCl4.setOnAction(event -> {

            txt13.clear();
            txt14.clear();
            txt15.clear();
            txt16.clear();
            lbN2.setText("");
        });
        //Keyboard set on action for txt field 09
        txt9.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt9.setText(txt9.getText()+"1"));
            btnKP2.setOnAction(e -> txt9.setText(txt9.getText()+"2"));
            btnKP3.setOnAction(e -> txt9.setText(txt9.getText()+"3"));
            btnKP4.setOnAction(e -> txt9.setText(txt9.getText()+"4"));
            btnKP5.setOnAction(e -> txt9.setText(txt9.getText()+"5"));
            btnKP6.setOnAction(e -> txt9.setText(txt9.getText()+"6"));
            btnKP7.setOnAction(e -> txt9.setText(txt9.getText()+"6"));
            btnKP8.setOnAction(e -> txt9.setText(txt9.getText()+"7"));
            btnKP9.setOnAction(e -> txt9.setText(txt9.getText()+"9"));
            btnKPdot.setOnAction(e -> txt9.setText(txt9.getText()+"."));
            btnKP0.setOnAction(e -> txt9.setText(txt9.getText()+"0"));
            btnKPneq.setOnAction(e -> txt9.setText(txt9.getText()+"-"));
            btnBS.setOnAction(e -> txt9.setText(txt9.getText().substring(0, txt9.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 10
        txt10.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt10.setText(txt10.getText()+"1"));
            btnKP2.setOnAction(e -> txt10.setText(txt10.getText()+"2"));
            btnKP3.setOnAction(e -> txt10.setText(txt10.getText()+"3"));
            btnKP4.setOnAction(e -> txt10.setText(txt10.getText()+"4"));
            btnKP5.setOnAction(e -> txt10.setText(txt10.getText()+"5"));
            btnKP6.setOnAction(e -> txt10.setText(txt10.getText()+"6"));
            btnKP7.setOnAction(e -> txt10.setText(txt10.getText()+"6"));
            btnKP8.setOnAction(e -> txt10.setText(txt10.getText()+"7"));
            btnKP9.setOnAction(e -> txt10.setText(txt10.getText()+"9"));
            btnKPdot.setOnAction(e -> txt10.setText(txt10.getText()+"."));
            btnKP0.setOnAction(e -> txt10.setText(txt10.getText()+"0"));
            btnKPneq.setOnAction(e -> txt10.setText(txt10.getText()+"-"));
            btnBS.setOnAction(e -> txt10.setText(txt10.getText().substring(0, txt10.getText().length() - 1)));
        });
        //Keyboard set on action for txt field 11
        txt11.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt11.setText(txt11.getText()+"1"));
            btnKP2.setOnAction(e -> txt11.setText(txt11.getText()+"2"));
            btnKP3.setOnAction(e -> txt11.setText(txt11.getText()+"3"));
            btnKP4.setOnAction(e -> txt11.setText(txt11.getText()+"4"));
            btnKP5.setOnAction(e -> txt11.setText(txt11.getText()+"5"));
            btnKP6.setOnAction(e -> txt11.setText(txt11.getText()+"6"));
            btnKP7.setOnAction(e -> txt11.setText(txt11.getText()+"6"));
            btnKP8.setOnAction(e -> txt11.setText(txt11.getText()+"7"));
            btnKP9.setOnAction(e -> txt11.setText(txt11.getText()+"9"));
            btnKPdot.setOnAction(e -> txt11.setText(txt11.getText()+"."));
            btnKP0.setOnAction(e -> txt11.setText(txt11.getText()+"0"));
            btnKPneq.setOnAction(e -> txt11.setText(txt11.getText()+"-"));
            btnBS.setOnAction(e -> txt11.setText(txt11.getText().substring(0, txt11.getText().length() - 1)));

        });
        //Keyboard set on action for txt field 12
        txt12.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt12.setText(txt12.getText()+"1"));
            btnKP2.setOnAction(e -> txt12.setText(txt12.getText()+"2"));
            btnKP3.setOnAction(e -> txt12.setText(txt12.getText()+"3"));
            btnKP4.setOnAction(e -> txt12.setText(txt12.getText()+"4"));
            btnKP5.setOnAction(e -> txt12.setText(txt12.getText()+"5"));
            btnKP6.setOnAction(e -> txt12.setText(txt12.getText()+"6"));
            btnKP7.setOnAction(e -> txt12.setText(txt12.getText()+"6"));
            btnKP8.setOnAction(e -> txt12.setText(txt12.getText()+"7"));
            btnKP9.setOnAction(e -> txt12.setText(txt12.getText()+"9"));
            btnKPdot.setOnAction(e -> txt12.setText(txt12.getText()+"."));
            btnKP0.setOnAction(e -> txt12.setText(txt12.getText()+"0"));
            btnKPneq.setOnAction(e -> txt12.setText(txt12.getText()+"-"));
            btnBS.setOnAction(e -> txt12.setText(txt12.getText().substring(0, txt12.getText().length() - 1)));

        });



        //Start Principal Tab

        //Label

        Label lbl17 = new Label("I/Y (Compound Rate):");
        lbl17.setLayoutY(100);
        lbl17.setLayoutX(50);

        Label lbl18 = new Label("FV (Future Value):");
        lbl18.setLayoutY(150);
        lbl18.setLayoutX(50);

        Label lbl19 = new Label("N (Number of Periods):");
        lbl19.setLayoutY(200);
        lbl19.setLayoutX(50);

        Label lbl20 = new Label("PMT (Annuity Payment):");
        lbl20.setLayoutY(250);
        lbl20.setLayoutX(50);


        //Textfield

        TextField txt17 = new TextField();
        txt17.setLayoutX(200);
        txt17.setLayoutY(100);

        TextField txt18 = new TextField();
        txt18.setLayoutX(200);
        txt18.setLayoutY(150);

        TextField txt19 = new TextField();
        txt19.setLayoutX(200);
        txt19.setLayoutY(200);

        TextField txt20 = new TextField();
        txt20.setLayoutX(200);
        txt20.setLayoutY(250);


        //Calculate button
        Button btncal5 = new Button("Calculate");
        btncal5.setLayoutX(200);
        btncal5.setLayoutY(300);
        btncal5.setStyle("-fx-font-weight: bold;");


        //Output of SP

        Label lbSP1 = new Label("Start Principal: " );
        lbSP1.setLayoutY(430);
        lbSP1.setLayoutX(50);
        lbSP1.setStyle(" -fx-font-weight: bold;");

        Label lbSP2 = new Label("-Result-" );
        lbSP2.setLayoutY(430);
        lbSP2.setLayoutX(200);

        ///Start Principal formula

        btncal5.setOnAction(e -> {
            try{
            Integer n=12;
            double r = Double.parseDouble(txt17.getText())/100; //I/Y (Compound Rate)
            double A = Double.parseDouble(txt18.getText()); //FV (Future Value)
            double t = Double.parseDouble(txt19.getText()); //N (Number of Periods)
            double PMT = Double.parseDouble(txt20.getText()); //PMT (Annuity Payment)

            double res4;
            res4 =(A-(PMT*((pow((1+(r/n)),(n*t))-1)/(r/n))))/(pow((1+(r/n)),(n*t)));
            lbSP2.setText(String.format("%.2f",res4)+"$");
            } catch (Exception prompt){
                lbSP2.setText("Invalid input!, Please enter a Number...");

            }
        });

        // Clear button
        Button btnCl5 = new Button("Clear");
        btnCl5.setMinSize(90,20);
        btnCl5.setLayoutX(400);
        btnCl5.setLayoutY(330);
        btnCl5.setStyle("-fx-base: #c8f6ae;-fx-font-style: italic; -fx-font-weight: bold;");

        btnCl5.setOnAction(event -> {

            txt17.clear();
            txt18.clear();
            txt19.clear();
            txt20.clear();
            lbSP2.setText("");
        });

        //Keyboard set on action for txt field 13
        txt13.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt13.setText(txt13.getText()+"1"));
            btnKP2.setOnAction(e -> txt13.setText(txt13.getText()+"2"));
            btnKP3.setOnAction(e -> txt13.setText(txt13.getText()+"3"));
            btnKP4.setOnAction(e -> txt13.setText(txt13.getText()+"4"));
            btnKP5.setOnAction(e -> txt13.setText(txt13.getText()+"5"));
            btnKP6.setOnAction(e -> txt13.setText(txt13.getText()+"6"));
            btnKP7.setOnAction(e -> txt13.setText(txt13.getText()+"6"));
            btnKP8.setOnAction(e -> txt13.setText(txt13.getText()+"7"));
            btnKP9.setOnAction(e -> txt13.setText(txt13.getText()+"9"));
            btnKPdot.setOnAction(e -> txt13.setText(txt13.getText()+"."));
            btnKP0.setOnAction(e -> txt13.setText(txt13.getText()+"0"));
            btnKPneq.setOnAction(e -> txt13.setText(txt13.getText()+"-"));
            btnBS.setOnAction(e -> txt13.setText(txt13.getText().substring(0, txt13.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 14
        txt14.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt14.setText(txt14.getText()+"1"));
            btnKP2.setOnAction(e -> txt14.setText(txt14.getText()+"2"));
            btnKP3.setOnAction(e -> txt14.setText(txt14.getText()+"3"));
            btnKP4.setOnAction(e -> txt14.setText(txt14.getText()+"4"));
            btnKP5.setOnAction(e -> txt14.setText(txt14.getText()+"5"));
            btnKP6.setOnAction(e -> txt14.setText(txt14.getText()+"6"));
            btnKP7.setOnAction(e -> txt14.setText(txt14.getText()+"6"));
            btnKP8.setOnAction(e -> txt14.setText(txt14.getText()+"7"));
            btnKP9.setOnAction(e -> txt14.setText(txt14.getText()+"9"));
            btnKPdot.setOnAction(e -> txt14.setText(txt14.getText()+"."));
            btnKP0.setOnAction(e -> txt14.setText(txt14.getText()+"0"));
            btnKPneq.setOnAction(e -> txt14.setText(txt14.getText()+"-"));
            btnBS.setOnAction(e -> txt14.setText(txt14.getText().substring(0, txt14.getText().length() - 1)));

        });
        //Keyboard set on action for txt field 15
        txt15.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt15.setText(txt15.getText()+"1"));
            btnKP2.setOnAction(e -> txt15.setText(txt15.getText()+"2"));
            btnKP3.setOnAction(e -> txt15.setText(txt15.getText()+"3"));
            btnKP4.setOnAction(e -> txt15.setText(txt15.getText()+"4"));
            btnKP5.setOnAction(e -> txt15.setText(txt15.getText()+"5"));
            btnKP6.setOnAction(e -> txt15.setText(txt15.getText()+"6"));
            btnKP7.setOnAction(e -> txt15.setText(txt15.getText()+"6"));
            btnKP8.setOnAction(e -> txt15.setText(txt15.getText()+"7"));
            btnKP9.setOnAction(e -> txt15.setText(txt15.getText()+"9"));
            btnKPdot.setOnAction(e -> txt15.setText(txt15.getText()+"."));
            btnKP0.setOnAction(e -> txt15.setText(txt15.getText()+"0"));
            btnKPneq.setOnAction(e -> txt15.setText(txt15.getText()+"-"));
            btnBS.setOnAction(e -> txt15.setText(txt15.getText().substring(0, txt15.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 16
        txt16.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt16.setText(txt16.getText()+"1"));
            btnKP2.setOnAction(e -> txt16.setText(txt16.getText()+"2"));
            btnKP3.setOnAction(e -> txt16.setText(txt16.getText()+"3"));
            btnKP4.setOnAction(e -> txt16.setText(txt16.getText()+"4"));
            btnKP5.setOnAction(e -> txt16.setText(txt16.getText()+"5"));
            btnKP6.setOnAction(e -> txt16.setText(txt16.getText()+"6"));
            btnKP7.setOnAction(e -> txt16.setText(txt16.getText()+"6"));
            btnKP8.setOnAction(e -> txt16.setText(txt16.getText()+"7"));
            btnKP9.setOnAction(e -> txt16.setText(txt16.getText()+"9"));
            btnKPdot.setOnAction(e -> txt16.setText(txt16.getText()+"."));
            btnKP0.setOnAction(e -> txt16.setText(txt16.getText()+"0"));
            btnKPneq.setOnAction(e -> txt16.setText(txt16.getText()+"-"));
            btnBS.setOnAction(e -> txt16.setText(txt16.getText().substring(0, txt16.getText().length() - 1)));
        });

        //Keyboard set on action for txt field 17
        txt17.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt17.setText(txt17.getText()+"1"));
            btnKP2.setOnAction(e -> txt17.setText(txt17.getText()+"2"));
            btnKP3.setOnAction(e -> txt17.setText(txt17.getText()+"3"));
            btnKP4.setOnAction(e -> txt17.setText(txt17.getText()+"4"));
            btnKP5.setOnAction(e -> txt17.setText(txt17.getText()+"5"));
            btnKP6.setOnAction(e -> txt17.setText(txt17.getText()+"6"));
            btnKP7.setOnAction(e -> txt17.setText(txt17.getText()+"6"));
            btnKP8.setOnAction(e -> txt17.setText(txt17.getText()+"7"));
            btnKP9.setOnAction(e -> txt17.setText(txt17.getText()+"9"));
            btnKPdot.setOnAction(e -> txt17.setText(txt17.getText()+"."));
            btnKP0.setOnAction(e -> txt17.setText(txt17.getText()+"0"));
            btnKPneq.setOnAction(e -> txt17.setText(txt17.getText()+"-"));
            btnBS.setOnAction(e -> txt17.setText(txt17.getText().substring(0, txt17.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 18
        txt18.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt18.setText(txt18.getText()+"1"));
            btnKP2.setOnAction(e -> txt18.setText(txt18.getText()+"2"));
            btnKP3.setOnAction(e -> txt18.setText(txt18.getText()+"3"));
            btnKP4.setOnAction(e -> txt18.setText(txt18.getText()+"4"));
            btnKP5.setOnAction(e -> txt18.setText(txt18.getText()+"5"));
            btnKP6.setOnAction(e -> txt18.setText(txt18.getText()+"6"));
            btnKP7.setOnAction(e -> txt18.setText(txt18.getText()+"6"));
            btnKP8.setOnAction(e -> txt18.setText(txt18.getText()+"7"));
            btnKP9.setOnAction(e -> txt18.setText(txt18.getText()+"9"));
            btnKPdot.setOnAction(e -> txt18.setText(txt18.getText()+"."));
            btnKP0.setOnAction(e -> txt18.setText(txt18.getText()+"0"));
            btnKPneq.setOnAction(e -> txt18.setText(txt18.getText()+"-"));
            btnBS.setOnAction(e -> txt18.setText(txt18.getText().substring(0, txt18.getText().length() - 1)));

        });

        //Keyboard set on action for txt field 19
        txt19.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt19.setText(txt19.getText()+"1"));
            btnKP2.setOnAction(e -> txt19.setText(txt19.getText()+"2"));
            btnKP3.setOnAction(e -> txt19.setText(txt19.getText()+"3"));
            btnKP4.setOnAction(e -> txt19.setText(txt19.getText()+"4"));
            btnKP5.setOnAction(e -> txt19.setText(txt19.getText()+"5"));
            btnKP6.setOnAction(e -> txt19.setText(txt19.getText()+"6"));
            btnKP7.setOnAction(e -> txt19.setText(txt19.getText()+"6"));
            btnKP8.setOnAction(e -> txt19.setText(txt19.getText()+"7"));
            btnKP9.setOnAction(e -> txt19.setText(txt19.getText()+"9"));
            btnKPdot.setOnAction(e -> txt19.setText(txt19.getText()+"."));
            btnKP0.setOnAction(e -> txt19.setText(txt19.getText()+"0"));
            btnKPneq.setOnAction(e -> txt19.setText(txt19.getText()+"-"));
            btnBS.setOnAction(e -> txt19.setText(txt19.getText().substring(0, txt19.getText().length() - 1)));

        });
        //Keyboard set on action for txt field 20
        txt20.setOnMouseClicked(event -> {
            btnKP1.setOnAction(e -> txt20.setText(txt20.getText()+"1"));
            btnKP2.setOnAction(e -> txt20.setText(txt20.getText()+"2"));
            btnKP3.setOnAction(e -> txt20.setText(txt20.getText()+"3"));
            btnKP4.setOnAction(e -> txt20.setText(txt20.getText()+"4"));
            btnKP5.setOnAction(e -> txt20.setText(txt20.getText()+"5"));
            btnKP6.setOnAction(e -> txt20.setText(txt20.getText()+"6"));
            btnKP7.setOnAction(e -> txt20.setText(txt20.getText()+"6"));
            btnKP8.setOnAction(e -> txt20.setText(txt20.getText()+"7"));
            btnKP9.setOnAction(e -> txt20.setText(txt20.getText()+"9"));
            btnKPdot.setOnAction(e -> txt20.setText(txt20.getText()+"."));
            btnKP0.setOnAction(e -> txt20.setText(txt20.getText()+"0"));
            btnKPneq.setOnAction(e -> txt20.setText(txt20.getText()+"-"));
            btnBS.setOnAction(e -> txt20.setText(txt20.getText().substring(0, txt20.getText().length() - 1)));

        });



        //Home
        Button btn3 = new Button("Home Page");
        btn3.setMinSize(120, 30);
        btn3.setLayoutX(200);
        btn3.setLayoutY(100);
        Image img1 = new Image("file:Asserts/Back.png");
        ImageView view = new ImageView(img1);
        view.setFitHeight(20);
        view.setPreserveRatio(true);
        btn3.setGraphic(view);

        btn3.setStyle("-fx-base: #1e3636;-fx-font-style: italic; -fx-font-weight: bold;");

        //Help
        Button helpB = new Button("Tips");
        helpB.setMinSize(50, 30);
        helpB.setLayoutY(35);

        Image img2 = new Image("file:Asserts/HelpI.png");
        ImageView view2 = new ImageView(img2);
        view2.setFitHeight(20);
        view2.setPreserveRatio(true);
        helpB.setGraphic(view2);

        helpB.setStyle("-fx-base: rgba(0,0,0,0.71); -fx-font-style:italic;-fx-font-weight: bold;");

        helpB.setOnAction(e -> Help.SHelp());




        //TabPane and tabs
        TabPane tp = new TabPane();

        Tab tb1 = new Tab("FV (Future Value)");
        Tab tb2 = new Tab("PMT (Annuity Payment)");
        Tab tb3 = new Tab("I/Y (Compound Rate)");
        Tab tb4 = new Tab("N (Number of Periods)");
        Tab tb5 = new Tab("Start Principal");


        tp.getTabs().add(tb1);
        tp.getTabs().add(tb2);
        tp.getTabs().add(tb3);
        tp.getTabs().add(tb4);
        tp.getTabs().add(tb5);

        tp.setTabMinWidth(60);
        tp.setTabMinHeight(25);




        //FV (Future Value)
        Pane tab1 = new Pane();
        tab1.getChildren().addAll(lbl1, lbl2, lbl3,lbFV1,lbFV2,txt4, txt1, txt2, txt3, lbl4,btncal1,btnCl1, btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);
        tb1.setContent(tab1);
        tb1.setClosable(false);

        //PMT (Periodic Payment)
        Pane tab2 = new Pane();
        tab2.getChildren().addAll(lbl5, lbl6, lbl7, lbl8,txt5,txt6,txt7,txt8,btnCl2,btncal2,lbPMT1,lbPMT2,btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);
        tb2.setContent(tab2);
        tb2.setClosable(false);

        //I/Y (Interest Rate)
        Pane tab3 = new Pane();
        tab3.getChildren().addAll(lbl9, lbl10, lbl11, lbl12,txt9, txt10, txt11, txt12,btnCl3,btncal3,lbI2,lbI1,btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);
        tb3.setContent(tab3);
        tb3.setClosable(false);

        //N (Number of Periods)
        Pane tab4 = new Pane();
        tab4.getChildren().addAll( lbl13, lbl14, lbl15, lbl16,txt13, txt14, txt15, txt16, btnCl4,lbN1,lbN2,btncal4,btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);
        tb4.setContent(tab4);
        tb4.setClosable(false);


        //Start principle
        Pane tab5 = new Pane();
        tab5.getChildren().addAll(lbl17, lbl18, lbl19, lbl20,txt17, txt18, txt19, txt20,lbSP1,lbSP2,btnCl5, btncal5,btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);
        tb5.setContent(tab5);
        tb5.setClosable(false);




        btn3.setOnAction(e -> {
            window.close();
            Main.show();

        });




        Pane root = new Pane();
        root.getChildren().addAll(img,tp,helpB,btn3,btnKP1,btnKP2,btnKP3,btnKP4,btnKP5,btnKP6,btnKP7,btnKP8,btnKP9,btnKP0,btnKPneq,btnKPdot,btnBS);

        window.setScene(new Scene(root, 590, 500));
        window.show();


        return root;
    }


}

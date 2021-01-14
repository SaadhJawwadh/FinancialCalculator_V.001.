package sample;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static void show() {


            Stage Main = new Stage();
            Main.setTitle("Home Page");

            //Label
            Label lbl = new Label("Financial Calculator");
            lbl.setLayoutX(100);
            lbl.setWrapText(true);
            lbl.setStyle("-fx-font-size: 9mm; -fx-text-fill: rgba(103,2,134,0.96); -fx-font-weight: bold;");

            //buttons
            Button btn1 = new Button("Loan Calculator");
            btn1.setPrefSize(200, 100);
            btn1.setLayoutX(150);
            btn1.setLayoutY(250);

            //Adding CSS Styles
            btn1.setStyle("-fx-font-size: 4mm;-fx-base: rgba(0,0,0,0.71); -fx-font-weight: bold;");

            //buttons
            Button btn2 = new Button("Mortgage Calculator");
            btn2.setPrefSize(200, 100);
            btn2.setLayoutX(150);
            btn2.setLayoutY(350);

            //Adding CSS Styles
            btn2.setStyle("-fx-font-size: 4mm;-fx-base: rgba(0,0,0,0.71); -fx-font-weight: bold;");

            //buttons
            Button btn3 = new Button("Saving Calculator");
            btn3.setPrefSize(200, 100);
            btn3.setLayoutY(150);
            btn3.setLayoutX(150);

            //Adding CSS Styles
            btn3.setStyle("-fx-font-size: 4mm;-fx-base: rgba(0,0,0,0.71); -fx-font-weight: bold;");


            //buttons
            Button btn4 = new Button("Compound Interest Calculator");
            btn4.setPrefSize(200, 100);
            btn4.setLayoutX(150);
            btn4.setLayoutY(450);

            //Adding CSS Styles
            btn4.setStyle("-fx-font-size: 4mm;-fx-base: rgba(0,0,0,0.71); -fx-font-weight: bold;");


            //buttons

            Button helpB = new Button("Tips");
            helpB.setMinSize(50, 30);
            //helpB.setLayoutX(200);
            //helpB.setLayoutY(80);

            Image img1 = new Image("file:Asserts/HelpI.png");
            ImageView view1 = new ImageView(img1);
            view1.setFitHeight(20);
            view1.setPreserveRatio(true);
            helpB.setGraphic(view1);

            //Adding CSS Styles
            helpB.setStyle("-fx-font-size: 3mm;-fx-base: rgba(0,0,0,0.71); -fx-font-weight: bold;");




        //Help
        helpB.setOnAction(e -> {
            Help.MainHelp();

        });

            Image image = new Image("file:Asserts/BG2x.jpg");
            ImageView img = new ImageView(image);


            btn1.setOnAction(e -> {
                Loan.root();
                Main.close();

            });

            btn2.setOnAction(e -> {
                Mortgage.root();
                Main.close();

            });

            btn3.setOnAction(e -> {
                Savings.root();
                Main.close();

            });

            btn4.setOnAction(e -> {
                Compound.root();
                Main.close();

            });

            Pane root = new Pane();
            root.getChildren().addAll(img, btn1, btn2, btn3, btn4, helpB, lbl);

            Main.setScene(new Scene(root, 500, 600));
            Main.show();

        }

        

    @Override
    
    public void start(Stage primaryStage) throws Exception {
        Pane root2 = new Pane();
        Main.setScene(new Scene(root2, 500, 600));
        Main.show();


    }

    private static void setScene(Scene scene) {
    }
}
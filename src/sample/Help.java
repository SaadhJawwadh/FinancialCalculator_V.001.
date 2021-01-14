package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Help {
    public static Pane MainHelp() {
        Stage window1 = new Stage();
        window1.setTitle("Main Help");


        Image image = new Image("file:Help01.jpg");
        ImageView img = new ImageView(image);

        Pane MainHelp =new Pane();
        MainHelp.getChildren().addAll(img);

        Scene scene1 = new Scene(MainHelp, 600, 397);
        window1.setScene(scene1);
        window1.show();

        return MainHelp;
    }



    public static Pane LHelp() {
        Stage window3 = new Stage();
        window3.setTitle("Loan Help");

        Image image = new Image("file:HelpLo.jpg");
        ImageView img = new ImageView(image);

        Pane LHelp =new Pane();
        LHelp.getChildren().addAll(img);

        Scene scene3 = new Scene(LHelp, 775, 556);
        window3.setScene(scene3);
        window3.show();

        return LHelp;
    }


    public static Pane MHelp() {
        Stage window4 = new Stage();
        window4.setTitle("Mortgage Help");


        Image image = new Image("file:HelpM.jpg");
        ImageView img = new ImageView(image);


        Pane MHelp =new Pane();
        MHelp.getChildren().addAll(img);

        Scene scene4 = new Scene(MHelp, 766, 561);
        window4.setScene(scene4);
        window4.show();

        return MHelp;
    }

    public static Pane CoHelp() {

        Stage window5 = new Stage();
        window5.setTitle("Compound Interest Help");



        Image image = new Image("file:HelpCo.jpg");
        ImageView img = new ImageView(image);


        Pane CoHelp =new Pane();
        CoHelp.getChildren().addAll(img);
        Scene scene5 = new Scene(CoHelp, 802, 577);
        window5.setScene(scene5);
        window5.setScene(scene5);
        window5.show();

        return CoHelp;

    }

    public static Pane SHelp() {

        Stage window6 = new Stage();
        window6.setTitle("Saving Help");

        Image image = new Image("file:HelpS.jpg");
        ImageView img = new ImageView(image);


        Pane SHelp =new Pane();
        SHelp.getChildren().addAll(img);

        Scene scene6 = new Scene(SHelp, 817, 612);
        window6.setScene(scene6);
        window6.setScene(scene6);
        window6.show();


        return SHelp;
    }
}
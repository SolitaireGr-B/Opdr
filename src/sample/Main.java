package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Boter Kaas en Eieren");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();


    }
public static void openform(){
    bke BKE = new bke();
        BKE.setVisible(true);
    }


}

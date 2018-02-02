package sample;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        final SwingNode swingNode = new SwingNode();
        createAndSetSwingContent(swingNode);
        Pane pane = new Pane();
        pane.getChildren().add(swingNode);



       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Boter Kaas en Eieren");
        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();


    }

    private void createAndSetSwingContent(final SwingNode swingNode) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JPanel panel = new JPanel();
                JTextArea ta = new JTextArea(100, 100);
        panel.add(new JTextArea(""));
        panel.add(new JTextArea(""));
        panel.add(new JTextArea(""));
        panel.add(new JTextArea(""));
        panel.add(new JButton("<"));
        panel.add(new JButton("OK"));
        panel.add(new JButton(">"));
                swingNode.setContent(panel);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);



        ArrayList<String> vakje = new ArrayList<>();

        String team1 = "x";
        String team2 = "o";

        vakje.add(1,"");
        vakje.add(2,"");
        vakje.add(3,"");
        vakje.add(4,"");
        vakje.add(5,"");
        vakje.add(6,"");
        vakje.add(7,"");
        vakje.add(8,"");
        vakje.add(9,"");

        int selectedV = 1;
        int turn = 1;
        int nextT = 0;

        for(turn == 1; nextT == 1) {


                vakje.add(selectedV, team1);
                turn++;
                nextT = 0;


        }

        for(turn == 2; nextT == 1) {


                vakje.add(selectedV, team2);
                turn--;
                nextT = 0;
        }
    }


}

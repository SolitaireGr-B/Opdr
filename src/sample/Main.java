package sample;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

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
        panel.add(new JButton("Gutentag, press me!", ));
                swingNode.setContent(panel);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);


    }


}

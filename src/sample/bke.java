package sample;

import javax.swing.*;

public class bke {
    private JTextArea textArea1;
    public void VA1(String Vis1) {
        if(Vis1.equals("v")){
            textArea1.setVisible(true);
            textArea2.setVisible(true);
            textArea3.setVisible(true);
            textArea4.setVisible(true);
            textArea5.setVisible(true);
            textArea6.setVisible(true);
            textArea7.setVisible(true);
            textArea8.setVisible(true);
            textArea9.setVisible(true);
            System.out.print("stuff");
        }else{
            textArea1.setVisible(false);
            textArea2.setVisible(false);
            textArea3.setVisible(false);
            textArea4.setVisible(false);
            textArea5.setVisible(false);
            textArea6.setVisible(false);
            textArea7.setVisible(false);
            textArea8.setVisible(false);
            textArea9.setVisible(false);
            System.out.print("things");
        }
    }

    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JTextArea textArea7;
    private JTextArea textArea8;
    private JTextArea textArea9;

}

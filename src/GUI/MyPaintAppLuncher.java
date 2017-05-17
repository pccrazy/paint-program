package GUI;

import java.awt.*;

import javax.swing.JFrame;


/**
 *  a class to run the application
 * */
public class MyPaintAppLuncher {

    public static void main(String[] args) {

        MainGUI MyPaintForm = new MainGUI();

        MyPaintForm.setTitle("Easy PaintPro");

        MyPaintForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPaintForm.setPreferredSize(new Dimension(1320, 850));

        MyPaintForm.getContentPane().setBackground( Color.LIGHT_GRAY);

        MyPaintForm.pack();

        MyPaintForm.setLocationRelativeTo(null);

        MyPaintForm.setVisible(true);
    }

}
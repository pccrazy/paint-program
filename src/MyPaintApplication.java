/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

import javafx.stage.Screen;


/**
 *
 * @author H121709
 */
public class MyPaintApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        MyJFrame MyPaintForm = new MyJFrame();

        MyPaintForm.setTitle("Easy PaintPro");

        MyPaintForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPaintForm.setPreferredSize(new Dimension(1320, 850));

        MyPaintForm.getContentPane().setBackground( Color.LIGHT_GRAY);

        MyPaintForm.pack();

        MyPaintForm.setLocationRelativeTo(null);

        MyPaintForm.setVisible(true);
    }

}
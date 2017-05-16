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
        // TODO code application logic here
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        MyJFrame testPaintForm = new MyJFrame();
        
       testPaintForm.setTitle("");
           
       testPaintForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
       testPaintForm.setPreferredSize(new Dimension((int)screenSize.getWidth(), (int)screenSize.getHeight()));
       
       testPaintForm.getContentPane().setBackground( Color.LIGHT_GRAY);
     
       testPaintForm.pack();
            
       testPaintForm.setLocationRelativeTo(null);
          
       testPaintForm.setVisible(true);
    }
    
}
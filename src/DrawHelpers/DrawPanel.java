package DrawHelpers;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;

import java.util.ArrayList;

import Shapes.MyLine;
import Shapes.MyOval;
import Shapes.MyRectangle;
import Shapes.MyShape;


/* The drawpanel allows the drawing of shapes using the mouse by performing actions on the mouse click events*/

public class DrawPanel extends JPanel
{
    private ShapesLinkedList<MyShape> myShapes; //dynamic stack of shapes
    private ShapesLinkedList<MyShape> clearedShapes; //clear drawn shapes

    //current Shape variables
    private int currentShapeType;       // trace the current shape
    private MyShape currentShapeObject; //keep record of the shape
    private Color currentShapeColor;    //record current color
    private boolean currentShapeFilled; //trace shape filled status
    JLabel statusLabel; //coordinates mouse status


    //Initialise shapes variable and status
    public DrawPanel(JLabel statusLabel){

        myShapes = new ShapesLinkedList<MyShape>();       //create new instance for shapes
        clearedShapes = new ShapesLinkedList<MyShape>(); //create new instance for clear shapes

        //Initialize the drawn shape variables
        currentShapeType=0;
        currentShapeObject=null;
        currentShapeColor=Color.BLACK;
        currentShapeFilled=false;

        this.statusLabel = statusLabel; //Initialize statusLabel

        //setLayout(new BorderLayout());
        //setBackground( Color.WHITE );
        //add( statusLabel, BorderLayout.SOUTH );

        // handles mouse motion, events
        MouseHandler handler = new MouseHandler();
        addMouseListener( handler );
        addMouseMotionListener( handler );
    }

    //draw current shape
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );

        // draw the shapes
        ArrayList<MyShape> shapeArray=myShapes.getArray();
        for ( int counter=shapeArray.size()-1; counter>=0; counter-- )
            shapeArray.get(counter).draw(g);

        //draws the current Shape Object if it is not null
        if (currentShapeObject!=null)
            currentShapeObject.draw(g);
    }

    //set the enum type id for passed shapes
    public void setCurrentShapeType(int type)
    {
        currentShapeType=type;
    }

    //set shape color
    public void setCurrentShapeColor(Color color)
    {
        currentShapeColor=color;
    }

    //determine filled status of shape
    public void setCurrentShapeFilled(boolean filled)
    {
        currentShapeFilled=filled;
    }
    //return filled status
    boolean getCurrentShapeFilled(){
        return currentShapeFilled;
    }

    //Cleared drawn shapes
    public void clearLastShape()
    {
        if (! myShapes.isEmpty())
        {
            clearedShapes.addFront(myShapes.removeFront());
            repaint();
        }
    }

    //Redrawn the last cleared shape
    public void redoLastShape()
    {
        if (! clearedShapes.isEmpty())
        {
            myShapes.addFront(clearedShapes.removeFront());
            repaint();
        }
    }

    //clear draw panel
    public void clearDrawing()
    {
        myShapes.makeEmpty();
        clearedShapes.makeEmpty();
        repaint();
    }


    //This method handles mouse events
    private class MouseHandler extends MouseAdapter
    {
        //draw shape on panel when mouse is pressed
        public void mousePressed( MouseEvent event )
        {
            switch (currentShapeType) //0 for line, 1 for rect, 2 for oval
            {
                case 0:

                    currentShapeObject= new MyLine( event.getX(), event.getY(),
                            event.getX(), event.getY(), currentShapeColor, currentShapeFilled);

                    break;
                case 1:

                    currentShapeObject= new MyRectangle( event.getX(), event.getY(),
                            event.getX(), event.getY(), currentShapeColor, currentShapeFilled);
                    break;
                case 2:

                    currentShapeObject= new MyOval( event.getX(), event.getY(),
                            event.getX(), event.getY(), currentShapeColor, currentShapeFilled);
                    break;

            }// end switch
        } // end method


        //Perform action when the mouse is released
        public void mouseReleased( MouseEvent event )
        {
            //sets currentShapeObject x2 & Y2
            currentShapeObject.setX2(event.getX());
            currentShapeObject.setY2(event.getY());

            myShapes.addFront(currentShapeObject);

            currentShapeObject=null;
            clearedShapes.makeEmpty();
            repaint();

        }

        //Trace the position of mouse movements
        public void mouseMoved( MouseEvent event )
        {
            statusLabel.setText(String.format("Mouse Coordinates X: %d Y: %d",event.getX(),event.getY()));
        }

        //Trace the mouse position and set status
        public void mouseDragged( MouseEvent event )
        {
            //sets coordinates
            currentShapeObject.setX2(event.getX());
            currentShapeObject.setY2(event.getY());

            //set current mouse position
            statusLabel.setText(String.format("Mouse Coordinates X: %d Y: %d",event.getX(),event.getY()));

            repaint();

        } // end mouseDragged

    }// end MouseHandler



} // end class
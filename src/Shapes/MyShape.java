package Shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class contains int coordinates and a Color color. It has accessor and mutator methods for them.
 */
public abstract class MyShape
{
    private int x1,y1,x2,y2; //coordinates of shape
    private Color color; // color of shape
    private boolean fill; //boolean variable that determines whether the shape is filled or not

    /**
    * public constructor which takes no variables and
    * sets coordinates to zero and color to black
    */
    public MyShape()
    {
        x1=0;
        y1=0;
        x2=0;
        y2=0;
        color=Color.BLACK;
    }
    
    /**
    * overloaded constructor which takes variables for coordinates and 
    * color assigning them to the instance variables in the class
    */
    public MyShape(int x1, int y1, int x2, int y2, Color color,boolean fill)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.color=color;
        this.fill = fill;
    }
    
    /**
     * Mutator method for x2
     */
    public void setX2(int x2)
    {
        this.x2=x2;
    }   
    
    /**
     * Mutator method for y2
     */
    public void setY2(int y2)
    {
        this.y2=y2;
    }   

    //Accessor methods
    
    /**
     * Accessor method for x1
     */
    public int getX1()
    {
        return x1;
    }
    
    /**
     * Accessor method for y1
     */
    public int getY1()
    {
        return y1;
    }
    
    /**
     * Accessor method for x2
     */
    public int getX2()
    {
        return x2;
    }
    
    /**
     * Accessor method for y2
     */
    public int getY2()
    {
        return y2;
    }
    
    /**
     * Accessor method for color
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * Abstract method for drawing the shape that must be overriden
     */
    abstract public void draw( Graphics g );

    public int getUpperLeftX()
    {
        return Math.min(getX1(),getX2());
    }

    /**
     * gets the upper left y
     */
    public int getUpperLeftY()
    {
        return Math.min(getY1(),getY2());
    }

    /**
     * gets width
     */
    public int getWidth()
    {
        return Math.abs(getX1()-getX2());
    }

    //Accessor methods

    /**
     * gets height
     */
    public int getHeight()
    {
        return Math.abs(getY1()-getY2());
    }

    /**
     * return fill
     */
    public boolean getFill()
    {
        return fill;
    }

}
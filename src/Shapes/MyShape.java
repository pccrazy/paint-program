package Shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * an abstract class which contains color, fill and shape coordinates
 */
public abstract class MyShape
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    private boolean fill;

    /**
    * constructor sets coordinates to zero and color to black as mentioned in our material chapter 10
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
    * an constructor to override coordinates and color and fill
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
     *  setters and getters for coordinates
     */
    public void setX2(int x2)
    {
        this.x2=x2;
    }   

    public void setY2(int y2)
    {
        this.y2=y2;
    }

    public int getX1()
    {
        return x1;
    }

    public int getY1()
    {
        return y1;
    }

    public int getX2()
    {
        return x2;
    }

    public int getY2()
    {
        return y2;
    }

    public int getUpperLeftX()
    {
        return Math.min(getX1(),getX2());
    }


    public int getUpperLeftY()
    {
        return Math.min(getY1(),getY2());
    }


    public int getWidth()
    {
        return Math.abs(getX1()-getX2());
    }


    public int getHeight()
    {
        return Math.abs(getY1()-getY2());
    }


    // returns the current color

    public Color getColor()
    {
        return color;
    }

    // returns fill shape color fill status
    public boolean getFill()
    {
        return fill;
    }


    /** an abstract method the must be overriden*/
    abstract public void draw( Graphics g );

}
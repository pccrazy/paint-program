package Shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class inherits from MyShape and which draws a line
 */
public class MyLine extends MyShape
{
    // passing coordinates, color and fill
    public MyLine( int x1, int y1, int x2, int y2, Color color,boolean fill)
    {
        super(x1, y1, x2, y2, color,fill);
    }

    /**
     * Overriding draw method based on fill status
     */
    @Override
    public void draw( Graphics g )
    {
        g.setColor( getColor() );
        g.drawLine( getX1(), getY1(), getX2(), getY2() );
    } 
}
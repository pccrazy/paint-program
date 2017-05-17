package Shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class inherits from MyShape and which draws a rectangle
 */
public class MyRectangle extends MyShape
{ 

    // passing coordinates, color and fill
    public MyRectangle( int x1, int y1, int x2, int y2, Color color, boolean fill )
    {
        super(x1, y1, x2, y2, color,fill);
    } 
    
    /**
     * Overriding draw method based on fill status
     */
    @Override
    public void draw( Graphics g )
    {
        g.setColor( getColor() ); //sets the color
        if (getFill()) //determines whether fill is true or false
            g.fillRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() ); //draws a filled rectangle
        else
            g.drawRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() ); //draws a regular rectangle
        
    }


    
}
package shapeMatching.v;

import java.awt.Color;
import java.awt.Graphics;


public class SquareShapeTile extends ShapeTile {
    
    private int width;
    private int height;
    
    public SquareShapeTile(Color colour, int width) {
        super(colour, 4);
        this.width = width;
        this.height = width;
    }
   
    
    @Override
    public double getPerimeter() {
        return getSides()*width;
    }
    
    @Override
    public String getDescription() {
        String description = super.getDescription();
        description += "\n I am also a square with sides measuring: "+width+", "+height+", "+width+", "+height;
        return description;
    }
    /*
    public void paintComponent(Graphics g){
  		super.paintComponent(g);
  		g.setColor(getColour());
  		g.fillRect(34,34,width, width);
    }
    */
}

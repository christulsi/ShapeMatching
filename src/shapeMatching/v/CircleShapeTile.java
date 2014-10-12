package shapeMatching.v;

import java.awt.Color;
import java.awt.Graphics;

public class CircleShapeTile extends ShapeTile{
	    
	    private int radius;
	    
	    public CircleShapeTile(Color colour, int radius) {
	        super(colour, 1);
	        this.radius = radius;
	    }

	    public int getRadius() {
	        return radius;
	    }
	    
	    @Override
	    public double getPerimeter() {
	        return 3.14*(radius*2);
	    }
	    
	    @Override
	    public String getDescription() {
	        String description = super.getDescription();
	        description += "\n I am also a circle with radius measuring: "+radius;
	        return description;
	    }
	    
	    /*public void paintComponent(Graphics g){
	  		super.paintComponent(g);
	  		g.setColor(getColour());
	  		g.fillOval(40,40, radius*2, radius*2);
	  	}
	  	*/
}


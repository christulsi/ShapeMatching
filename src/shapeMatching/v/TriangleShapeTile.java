package shapeMatching.v;

import java.awt.Color;
import java.awt.Graphics;


public class TriangleShapeTile extends ShapeTile {
    
    private int sideA;
    private int sideB;
    private int sideC;
    
    public TriangleShapeTile(Color colour, int sideA, int sideB, int sideC) {
        //the "super" call here passes values direclty to the parent class's constructor
        //it is similar to calling new ShapeTile(colour, 3)..
        super(colour, 3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }
    
    @Override
    public String getDescription() {
        String description = super.getDescription();
        description += "\n I am also a triangle with sides measuring: "+sideA+", "+sideB+", "+sideC;
        return description;
    }
    /*
    public void paintComponent(Graphics g){
  		super.paintComponent(g);
  		g.setColor(getColour());
  	}
  	*/
}

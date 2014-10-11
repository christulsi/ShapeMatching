package shapeMatching.m;

public class CircleShapeTile extends ShapeTile{
	    
	    private int radius;
	    
	    public CircleShapeTile(String colour, int radius) {
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
}

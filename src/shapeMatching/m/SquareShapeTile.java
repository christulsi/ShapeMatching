package shapeMatching.m;


public class SquareShapeTile extends ShapeTile {
    
    private int width;
    private int height;
    
    public SquareShapeTile(String colour, int width) {
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
}

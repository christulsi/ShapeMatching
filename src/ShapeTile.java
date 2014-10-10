
import javax.swing.JButton;

//An abstract class is a class that is declared abstract—it may or may not 
//include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
//This class is meant to be generic and not meant to be instantiated..
public abstract class ShapeTile extends JButton {
    
    private String colour;
    private int sides;
    
    public ShapeTile(String colour, int sides) {
        this.colour = colour;
        this.sides = sides;
    }
    
    //this is an abstract method.
    //An abstract method is a method that is declared without 
    //an implementation (without braces, and followed by a semicolon), like this:
    public abstract double getPerimeter();

    public String getColour() {
        return colour;
    }

    public int getSides() {
        return sides;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
    
    public String getDescription() {
        String description = "I have "+getSides()+" side(s), my colour is "+getColour()+" and my perimeter is "+getPerimeter();
        return description;
    }
    
}

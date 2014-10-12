package shapeMatching.c;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.ImageIcon;

import shapeMatching.m.Player;
import shapeMatching.v.CircleShapeTile;
import shapeMatching.v.ShapeMatchUI;
import shapeMatching.v.ShapeTile;
import shapeMatching.v.SquareShapeTile;
import shapeMatching.v.TriangleShapeTile;

public class GameEngine {
	
	public static final int EASY = 0;
	public static final int MEDIUM = 1;
	public static final int HARD = 2;
	
	private ArrayList<ShapeTile> shapeTiles;
	private Player player;
	private ShapeMatchUI shapeMatchUI;
	private int difficulty = 0;
	private ShapeTile temp;
	
	public GameEngine(){
		
		
		shapeMatchUI = new ShapeMatchUI();
		player = new Player("a");
		
		shapeTiles = new ArrayList<>();
        shapeTiles.add(new CircleShapeTile(Color.BLUE, 25));
        shapeTiles.add(new CircleShapeTile(Color.RED, 15));
        shapeTiles.add(new SquareShapeTile(Color.ORANGE, 25));
        shapeTiles.add(new TriangleShapeTile(Color.BLUE, 205, 300, 205));
        shapeTiles.add(new CircleShapeTile(Color.GREEN, 5));
        shapeTiles.add(new SquareShapeTile(Color.MAGENTA, 35));
        shapeTiles.add(new CircleShapeTile(Color.BLUE, 25));
        shapeTiles.add(new CircleShapeTile(Color.RED, 15));
        shapeTiles.add(new SquareShapeTile(Color.ORANGE, 25));
        shapeTiles.add(new TriangleShapeTile(Color.BLUE, 205, 300, 205));
        shapeTiles.add(new CircleShapeTile(Color.GREEN, 5));
        shapeTiles.add(new SquareShapeTile(Color.MAGENTA, 35));
        
        //created list iterator to loop through list
        ListIterator <ShapeTile> listIterator = shapeTiles.listIterator();
        
        //here we use a loop and go through the instances of all types of ShapeTile
        //the parent class ShapeTile make it possible to treat any of its child classes
        //e.g. SquareShapeTile, CircleShapeTile, etc. as ShapeTile itself..
        //it is Polymorphism and promotes compatibility, reuse and more compact coding such as this loop.
        //if we had to interpret each type SquareShapeTile, CircleShapeTile, etc. on each iteration it would be tedious...
        while (listIterator.hasNext()) {
			ShapeTile shapeTile = (ShapeTile) listIterator.next();
			
			shapeTile.addActionListener(new ActionListener() {
	               @Override
	               public void actionPerformed(ActionEvent e) {
	                
	            	  match((ShapeTile)e.getSource());            	   
	               }
	            });
			//add images to tile
			shapeTile.setIcon(creatIcon("/images/a.png"));
	           
			//sequentially add each ShapeTile child class instance to the frame
	        shapeMatchUI.add(shapeTile);
		}
        
        
	}	
	
	private void match(ShapeTile tile){
		
		try {
			
			if (tile != temp) {
				if (tile.getColour().equals(temp.getColour())
						&& tile.getPerimeter() == temp.getPerimeter()) {

					System.out.println(tile.getDescription());
					tile.setVisible(false);
					temp.setVisible(false);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		temp = tile;//stores the previous tile 
	}
	
	private ImageIcon creatIcon(String path){
	    	
	    URL url = getClass().getResource(path);
	    	
	    if(url == null){
	    		System.err.println("Unable to load image: "+path);
	    }
	    	
	    ImageIcon icon= new ImageIcon(url);
	    	
	    return icon;
	 }
}

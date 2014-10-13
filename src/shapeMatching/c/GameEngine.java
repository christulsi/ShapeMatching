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
import shapeMatching.v.OptionPane;
import shapeMatching.v.ShapeMatchUI;
import shapeMatching.v.ShapeTile;
import shapeMatching.v.SquareShapeTile;
import shapeMatching.v.TriangleShapeTile;

public class GameEngine {
	
	private ArrayList<ShapeTile> shapeTiles;
	private Player player;
	private ShapeMatchUI shapeMatchUI;
	private int flag;
	private ShapeTile temp;
	
	public GameEngine(){
		
		shapeTiles = new ArrayList<>();
		
		shapeMatchUI = new ShapeMatchUI();
		OptionPane optionPane = new OptionPane(shapeTiles);
		//player = new Player(a.getName());
		setDifficulty(optionPane.getResult());
        
        //created list iterator to loop through list
        ListIterator <ShapeTile> listIterator = shapeTiles.listIterator();
        
        while (listIterator.hasNext()) {
			ShapeTile shapeTile = (ShapeTile) listIterator.next();
			//add event listener to each tile
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

					tile.setVisible(false);
					temp.setVisible(false);
					flag--;
					checkWin(flag);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		temp = tile;//stores the previous tile 
	}
	
	private void checkWin(int flag){
		if(flag == 0){
        	System.out.println("You won");
        }
	}
	
	private ImageIcon creatIcon(String path){
	    	
	    URL url = getClass().getResource(path);
	    	
	    if(url == null){
	    		System.err.println("Unable to load image: "+path);
	    }
	    	
	    ImageIcon icon= new ImageIcon(url);
	    	
	    return icon;
	 }
	
	public void setDifficulty(int result){
		
		switch(result){
		
		case 0 :easy(shapeTiles);
				flag = 6;
		break;
		
		case 1 :medium(shapeTiles);
				flag = 9;
		break;
		
		case 2 :hard(shapeTiles);
				flag = 12;
		break;
		
		default:
		break;
		}
		
		
	}
	
	//Generate 12 tiles for easy mode
	public ArrayList<ShapeTile> easy(ArrayList<ShapeTile> shapeTiles){
		
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
		return shapeTiles;
	}
	
	//Generate 18 tiles for medium mode
	public ArrayList<ShapeTile> medium(ArrayList<ShapeTile> shapeTiles){
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
        shapeTiles.add(new CircleShapeTile(Color.BLUE, 25));
        shapeTiles.add(new CircleShapeTile(Color.RED, 15));
        shapeTiles.add(new SquareShapeTile(Color.ORANGE, 25));
        shapeTiles.add(new TriangleShapeTile(Color.BLUE, 205, 300, 205));
        shapeTiles.add(new SquareShapeTile(Color.ORANGE, 25));
        shapeTiles.add(new TriangleShapeTile(Color.BLUE, 205, 300, 205));
 
		return shapeTiles;
	}
	//Generate 24 tiles for  mode
	public ArrayList<ShapeTile> hard(ArrayList<ShapeTile> shapeTiles){
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
		return shapeTiles;
	}
}



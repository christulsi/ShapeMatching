package shapeMatching.v;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class ShapeMatchUI extends JFrame{
    
    private ArrayList<ShapeTile> shapeTiles;
    
    public ShapeMatchUI() {
    	       
    	super("Shape Match");
        
    	//we are using a new layout policy that allows components to be laid out in
        //a grid fashion..hence the name
        setLayout(new GridLayout(0,3));
        
        setJMenuBar(new MenuBar());  //Created and added Menu Bar to JFrame
        
        
        //set JFrame properties       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 720);
        setVisible(true);
        
                
    }    	
    
}

package shapeMatching.v;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import shapeMatching.m.CircleShapeTile;
import shapeMatching.m.ShapeTile;
import shapeMatching.m.SquareShapeTile;
import shapeMatching.m.TriangleShapeTile;

public class ShapeMatchUI extends JFrame{
    
    private ArrayList<ShapeTile> shapeTiles;
    
    public ShapeMatchUI() {
        super("Shape Match");
        //we are using a new layout policy that allows components to be laid out in
        //a grid fashion..hence the name
        setLayout(new GridLayout(0,3));
        setJMenuBar(new MenuBar());  //Created and added Menu Bar to JFrame
        
        shapeTiles = new ArrayList<>();
        shapeTiles.add(new CircleShapeTile("blue", 25));
        shapeTiles.add(new CircleShapeTile("red", 15));
        shapeTiles.add(new SquareShapeTile("orange", 25));
        shapeTiles.add(new TriangleShapeTile("blue", 205, 300, 205));
        shapeTiles.add(new CircleShapeTile("green", 5));
        shapeTiles.add(new SquareShapeTile("aqua", 35));
        shapeTiles.add(new TriangleShapeTile("blue", 235, 30, 25));
        shapeTiles.add(new CircleShapeTile("blue", 115));
        shapeTiles.add(new SquareShapeTile("orange", 125));
        shapeTiles.add(new TriangleShapeTile("blue", 25, 30, 45));
        shapeTiles.add(new TriangleShapeTile("blue", 205, 300, 205));
        shapeTiles.add(new CircleShapeTile("red", 5));
        
        //here we use a loop and go through the instances of all types of ShapeTile
        //the parent class ShapeTile make it possible to treat any of its child classes
        //e.g. SquareShapeTile, CircleShapeTile, etc. as ShapeTile itself..
        //it is Polymorphism and promotes compatibility, reuse and more compact coding such as this loop.
        //if we had to interpret each type SquareShapeTile, CircleShapeTile, etc. on each iteration it would be tedious...
        for(final ShapeTile tile: shapeTiles) {
            tile.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   //here, we grab the description of the given ShapeTile and display it using a 
                   //JOptionPane
                   String message = tile.getDescription();
                   JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.OK_OPTION);
               }
            });
            //sequentially add each ShapeTile child class instance to the frame
            add(tile);
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setVisible(true);
                
    }
    
}

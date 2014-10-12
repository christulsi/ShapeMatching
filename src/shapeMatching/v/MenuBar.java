package shapeMatching.v;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar{
	
	public MenuBar(){
	        
		super();
	    //Created File Menu
	    JMenu fileMenu = new JMenu("File");
	    	
	    //Created Menu Items
	    JMenuItem startgame = new JMenuItem("NewGame");
	    JMenuItem stats = new JMenuItem("Statistics");
	    JMenuItem exit = new JMenuItem("Exit");
	    	
	    //added menu items to File menu
	    fileMenu.add(startgame);
	    fileMenu.add(stats);
	    fileMenu.addSeparator();
	    fileMenu.add(exit);
	    	
	    //add the file menu to the menuBar
	    add(fileMenu);
	    	
	    startgame.addActionListener(new ActionListener(){
	
			@Override
			public void actionPerformed(ActionEvent e) {
					
			}
	    });
	    	
	    stats.addActionListener(new ActionListener(){
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
	    });
	    	
	    exit.addActionListener(new ActionListener(){
	
			@Override
			public void actionPerformed(ActionEvent e) {
					
				System.exit(0);
			}
	    		
	    });
	    	
	}

}

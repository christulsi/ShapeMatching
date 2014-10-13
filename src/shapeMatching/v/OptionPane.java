package shapeMatching.v;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionPane extends JOptionPane{
	
	public int result;

	public OptionPane(ArrayList<ShapeTile> shapeTiles){
		
		//set up a special dialog with custom options and a textfield
        Object[] options = {"Easy", "Medium", "Hard"};
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter player name:"));
        JTextField textField = new JTextField(10);
        panel.add(textField);
        
        setResult(JOptionPane.showOptionDialog(null, panel, "Add Players",
                 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                 null, options, null));
        
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}

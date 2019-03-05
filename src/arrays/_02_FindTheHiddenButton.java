/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame frame;
	JPanel panel;
	Random rand = new Random();
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	int numButtons;
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		frame = new JFrame("Find the Button");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		numButtons = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive number"));
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons = new JButton[numButtons];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		frame.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		frame.setVisible(true);
		//12. Give the user the instructions for the game.
		//JOptionPane.showMessageDialog(null, "Hello! Welcome to Find The Hidden Button! I think the name is pretty self explanatory!");
		//JOptionPane.showMessageDialog(null, "The goal is to find the hidden button! It will flash for a moment, and then go blank!");
		//JOptionPane.showMessageDialog(null, "Now you need to find it after it dissapears among the others!");
		JOptionPane.showMessageDialog(null, "Ready? Go!");
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		hiddenButton = rand.nextInt(numButtons - 1);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		buttons[hiddenButton].setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		//    Surround it with a try/catch
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked == buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You Win!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong Button lol");
		}
		//18. else tell them to try again
	}
}

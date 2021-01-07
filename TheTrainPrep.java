package CaptainJackSparrow;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class TheTrainPrep {

	public static void main(String[] args) {
		

		JFrame frame = new JFrame("The Train Phase 1");
		frame.setSize(500,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel main = new JPanel();
		frame.add(main);
		main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
		
		JPanel leftButtons = new JPanel();
		main.add(leftButtons);
		leftButtons.setLayout(null);
		
		
		
		JPanel rightButtons = new JPanel();
		main.add(rightButtons);
		rightButtons.setLayout(null);
		
		
		JPanel cards = new JPanel();
		main.add(cards);
		cards.setLayout(null);
		
		JPanel action = new JPanel();
		main.add(action);
		action.setLayout(null);
		
		//left buttons and so on
		
		JButton red = new JButton("Red");
		leftButtons.add(red);
		red.setBounds(5,5,100,20);
		
		JButton higher = new JButton("Higher");
		leftButtons.add(higher);
		higher.setBounds(5,35,100,20);
		
		JButton inbetween = new JButton("Inbetween");
		leftButtons.add(inbetween);
		inbetween.setBounds(5,65,100,20);
		
		JTextField cardNumber = new JTextField();
		leftButtons.add(cardNumber);
		cardNumber.setBounds(77,95,30,30);
		
		JButton nextPlayer = new JButton("Next player");
		leftButtons.add(nextPlayer);
		nextPlayer.setBounds(5,135,100,60);
		
		JButton nextFrame = new JButton("All aboard!");
		leftButtons.add(nextFrame);
		nextFrame.setBounds(5,205,100,60);
		
		
		//right buttons and so on
		
		
		JButton black = new JButton("Black");
		rightButtons.add(black);
		black.setBounds(0,5,100,20);
		
		JButton lower = new JButton("Lower");
		rightButtons.add(lower);
		lower.setBounds(0,35,100,20);
		
		JButton outside = new JButton("Outside");
		rightButtons.add(outside);
		outside.setBounds(0,65,100,20);
		
		JTextField cardColour = new JTextField();
		rightButtons.add(cardColour);
		cardColour.setBounds(0,95,30,30);
		
		JLabel shotCounterText = new JLabel("Number of shots:");
		rightButtons.add(shotCounterText);
		shotCounterText.setBounds(0,160,130,20);
		
		JLabel shotCounter = new JLabel("5");
		rightButtons.add(shotCounter);
		shotCounter.setBounds(100,156,30,30);
		
		//Cards
		
		
		JLabel cardBnW = new JLabel("a");
		cards.add(cardBnW);
		cardBnW.setBounds(0,5,30,20);
		
		
		JLabel cardHnL = new JLabel("a");
		cards.add(cardHnL);
		cardHnL.setBounds(0,35,30,20);
		
		JLabel cardInOrOut = new JLabel("a");
		cards.add(cardInOrOut);
		cardInOrOut.setBounds(0,65,30,20);
		
		JLabel cardGuess = new JLabel("a");
		cards.add(cardGuess);
		cardGuess.setBounds(0,95,30,20);
		
		//action
		
		
		JLabel actionBnW = new JLabel("a");
		action.add(actionBnW);
		actionBnW.setBounds(0,5,30,20);
		
		JLabel actionHnL = new JLabel("a");
		action.add(actionHnL);
		actionHnL.setBounds(0,35,30,20);
		
		JLabel actionInOrOut = new JLabel("a");
		action.add(actionInOrOut);
		actionInOrOut.setBounds(0,65,30,20);
		
		JLabel actionGuess = new JLabel("a");
		action.add(actionGuess);
		actionGuess.setBounds(0,95,30,20);
		
		
		
		frame.setVisible(true);
		
	}

}

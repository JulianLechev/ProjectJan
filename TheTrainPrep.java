package CaptainJackSparrow;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class TheTrainPrep extends JFrame  {

	JPanel main;
	JPanel leftButtons;
	JPanel rightButtons;
	JPanel cards;
	JPanel action;
	JButton red;
	JButton higher;
	JButton inbetween;
	JTextField cardNumber;
	JButton nextPlayer;
	JButton nextFrame;
	JButton black;
	JButton lower;
	JButton outside;
	JTextField cardColour;
	JLabel shotCounterText;
	JLabel shotCounter;
	JLabel cardBnW;
	JLabel cardHnL;
	JLabel cardInOrOut;
	JLabel cardGuess;
	JLabel actionBnW;
	JLabel actionHnL;
	JLabel actionInOrOut;
	JLabel actionGuess;
	JLabel playerNameTxt;
	JLabel playerName;
	JButton go;
	JLabel forNowOnTrainTxt;
	JLabel forNowOnTrain;
	
	int row1 = (int)(Math.random() * 4);
	int col1 = (int)(Math.random() * 13);
	int row2 = (int)(Math.random() * 4);
	int col2 = (int)(Math.random() * 13);
	int row3 = (int)(Math.random() * 4);
	int col3 = (int)(Math.random() * 13);
	int row4 = (int)(Math.random() * 4);
	int col4 = (int)(Math.random() * 13);
	int numOfCard = 0;
	int colorOfCard = 0;
	int numOfShots= 0;
	
	public int playerCounter = 0; 
	String player;
	String plWithMostShots;
	int mostShots = 0;
	String[] players;
	String[][] deck = {
								{"2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣"},
								{"2♢", "3♢", "4♢", "5♢", "6♢", "7♢", "8♢", "9♢", "10♢", "J♢", "Q♢", "K♢", "A♢"},
								{"2♡", "3♡", "4♡", "5♡", "6♡", "7♡", "8♡", "9♡", "10♡", "J♡", "Q♡", "K♡", "A♡"},
								{"3♠", "4♠", "5♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"}
	};
	

	
	
	public TheTrainPrep(String[] aplayers) {
		
		
		
		super("The Train Phase 1");
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		players = aplayers;
		
		
		main = new JPanel();
		main.setBounds(350, 100, 780, 395);
		main.setLayout(null);
		add(main);
		main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
		
		leftButtons = new JPanel();
		main.add(leftButtons);
		leftButtons.setLayout(null);
		
		
		
		rightButtons = new JPanel();
		main.add(rightButtons);
		rightButtons.setLayout(null);
		
		
		cards = new JPanel();
		main.add(cards);
		cards.setLayout(null);
		
		action = new JPanel();
		main.add(action);
		action.setLayout(null);
		
		//left buttons and so on
		
		red = new JButton("Red");
		leftButtons.add(red);
		red.setBounds(5,5,100,20);
		red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardBnW.setText((deck[row1][col1]));
				if(cardBnW.getText().contains("♢") || cardBnW.getText().contains("♡")) {
					actionBnW.setText("Dont drink");
				}
				else {
					actionBnW.setText("Drink");
					numOfShots++;
				}
				
				shotCounter.setText(String.valueOf(numOfShots));
			}});
		
		
		
		higher = new JButton("Higher");
		leftButtons.add(higher);
		higher.setBounds(5,35,100,20);
		higher.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardHnL.setText((deck[row2][col2]));
				if(col1 >= col2 ) {
					actionHnL.setText("Drink");
					numOfShots++;
				}
				else {
					actionHnL.setText("Dont drink");
				}
				shotCounter.setText(String.valueOf(numOfShots));
			}});
		
		
		inbetween = new JButton("Inbetween");
		leftButtons.add(inbetween);
		inbetween.setBounds(5,65,100,20);
		inbetween.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardInOrOut.setText((deck[row3][col3]));
				if(col1>col3 && col2<col3 || col1<col3 && col2>col3 ) {
					actionInOrOut.setText("Dont drink");
				}
				else {
					actionInOrOut.setText("Drink");
					numOfShots++;
				}
				shotCounter.setText(String.valueOf(numOfShots));
			}});
		
		
		cardNumber = new JTextField();
		leftButtons.add(cardNumber);
		cardNumber.setBounds(77,95,30,30);
		
		nextPlayer = new JButton("Next player/\nThe Train");
		leftButtons.add(nextPlayer);
		nextPlayer.setBounds(5,135,100,60);
		nextPlayer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				if(numOfShots > mostShots) {
					mostShots = numOfShots;
					plWithMostShots = playerName.getText();
				}
				
				player = aplayers[playerCounter + 1];
				cardBnW.setText("-");
				cardHnL.setText("-");
				cardInOrOut.setText("-");
				cardGuess.setText("-");
				cardNumber.setText("-");
				cardColour.setText("-");
				actionBnW.setText("-");
				actionHnL.setText("-");
				actionInOrOut.setText("-");
				actionGuess.setText("-");
				shotCounter.setText("-");
				numOfShots = 0;
				row1 = (int)(Math.random() * 4);
				col1 = (int)(Math.random() * 13);
				row2 = (int)(Math.random() * 4);
				col2 = (int)(Math.random() * 13);
				row3 = (int)(Math.random() * 4);
				col3 = (int)(Math.random() * 13);
				row4 = (int)(Math.random() * 4);
				col4 = (int)(Math.random() * 13);
				playerCounter++;
				playerName.setText(player);
				forNowOnTrain.setText(plWithMostShots);
				
				
			}});
		
		
		nextFrame = new JButton("All aboard!");
		leftButtons.add(nextFrame);
		nextFrame.setBounds(5,205,100,60);
		nextFrame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				TheTrain pha = new TheTrain();
				

			}
			
		});
		
		
		
		
		
		forNowOnTrainTxt = new JLabel("For now on the train:");
		leftButtons.add(forNowOnTrainTxt);
		forNowOnTrainTxt.setBounds(5, 275, 180, 40);
		

		
		//right buttons and so on
		
		
		black = new JButton("Black");
		rightButtons.add(black);
		black.setBounds(0,5,100,20);
		black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardBnW.setText((deck[row1][col1]));
				if(cardBnW.getText().contains("♢") || cardBnW.getText().contains("♡")) {
					actionBnW.setText("Drink");
					numOfShots++;
				}
				else {
					actionBnW.setText("Dont drink");
				}
				shotCounter.setText(String.valueOf(numOfShots));
			}});
		
		
		lower = new JButton("Lower");
		rightButtons.add(lower);
		lower.setBounds(0,35,100,20);
		lower.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardHnL.setText((deck[row2][col2]));
				if(col1 >= col2 ) {
					actionHnL.setText("Dont drink");
				}
				else {
					actionHnL.setText("Drink");
					numOfShots++;
				}
				shotCounter.setText(String.valueOf(numOfShots));
			}});
		
		outside = new JButton("Outside");
		rightButtons.add(outside);
		outside.setBounds(0,65,100,20);
		outside.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardInOrOut.setText((deck[row3][col3]));
				if(col1>col3 && col2<col3 || col1<col3 && col2>col3 ) {
					actionInOrOut.setText("Drink");
					numOfShots++;
				}
				else {
					actionInOrOut.setText("Dont drink");
				}
				shotCounter.setText(String.valueOf(numOfShots));
			}});
		
		
		cardColour = new JTextField();
		rightButtons.add(cardColour);
		cardColour.setBounds(0,95,30,30);
		
		go = new JButton("Go");
		rightButtons.add(go);
		go.setBounds(40, 95, 60, 30);
		go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardGuess.setText(deck[row4][col4]);
				
				if(cardNumber.getText().equals("A")) {
					numOfCard = 14;
				}				
				else if(cardNumber.getText().equals("K")) {
					numOfCard = 13;
				}				
				else if(cardNumber.getText().equals("Q")) {
					numOfCard = 12;
				}				
				else if(cardNumber.getText().equals("J")) {
					numOfCard = 11;
				}
				else if(Integer.parseInt(cardNumber.getText()) >= 2 && Integer.parseInt(cardNumber.getText())<=10 ) {
					numOfCard = Integer.parseInt(cardNumber.getText());
				}
				
				
				
				if(cardColour.getText().equals("спатия")) {
					colorOfCard = 1;
				}
				else if(cardColour.getText().equals("каро")) {
					colorOfCard = 2;
				}
				else if(cardColour.getText().equals("купа")) {
					colorOfCard = 3;
				}
				else if(cardColour.getText().equals("пика")) {
					colorOfCard = 4;
				}
				
				if(deck[colorOfCard - 1][numOfCard-2].equals(deck[row4][col4])) {
					actionGuess.setText("Dont drink");
					}
				else {
					actionGuess.setText("Drink");
					numOfShots++;
				}
				shotCounter.setText(String.valueOf(numOfShots));
				
			}});
		
		
		shotCounterText = new JLabel("Number of shots:");
		rightButtons.add(shotCounterText);
		shotCounterText.setBounds(0,160,130,20);
		
		shotCounter = new JLabel();
		rightButtons.add(shotCounter);
		shotCounter.setBounds(100,156,30,30);
		
		forNowOnTrain = new JLabel("yeaa");
		rightButtons.add(forNowOnTrain);
		forNowOnTrain.setBounds(7, 275, 100, 40);
		
	
		
		
		//Cards
		
		
		cardBnW = new JLabel("-");
		cards.add(cardBnW);
		cardBnW.setBounds(0,5,30,20);
		
		
		cardHnL = new JLabel("-");
		cards.add(cardHnL);
		cardHnL.setBounds(0,35,30,20);
		
		cardInOrOut = new JLabel("-");
		cards.add(cardInOrOut);
		cardInOrOut.setBounds(0,65,30,20);
		
		cardGuess = new JLabel("-");
		cards.add(cardGuess);
		cardGuess.setBounds(0,95,30,20);
		
		playerNameTxt = new JLabel("Now playing:");
		cards.add(playerNameTxt);
		playerNameTxt.setBounds(30,150,100,30);
		
		
		
		//action
		
		
		actionBnW = new JLabel("-");
		action.add(actionBnW);
		actionBnW.setBounds(0,5,70,20);
		
		actionHnL = new JLabel("-");
		action.add(actionHnL);
		actionHnL.setBounds(0,35,70,20);
		
		actionInOrOut = new JLabel("-");
		action.add(actionInOrOut);
		actionInOrOut.setBounds(0,65,70,20);
		
		actionGuess = new JLabel("-");
		action.add(actionGuess);
		actionGuess.setBounds(0,95,70,20);
		
		playerName = new JLabel(aplayers[0]);
		action.add(playerName);
		playerName.setBounds(0,150, 100, 30);
		
		
		
		
		
		setVisible(true);
	}
	
	
	
	
	
	
	

	
	
	}
	
		
		
		



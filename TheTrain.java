package CaptainJackSparrow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class TheTrain extends JFrame implements ActionListener {

	JPanel main;
	JPanel HoL;
	JPanel card;
	JPanel newCard;
	JPanel rest;
	JLabel title;
	JButton higher1;
	JButton higher2;
	JButton higher3;
	JButton higher4;
	JButton higher5;
	JButton lower1;
	JButton lower2;
	JButton lower3;
	JButton lower4;
	JButton lower5;
	JLabel card1;
	JLabel card2;
	JLabel card3;
	JLabel card4;
	JLabel card5;
	JLabel ncard1;
	JLabel ncard2;
	JLabel ncard3;
	JLabel ncard4;
	JLabel ncard5;
	JLabel theEnd;
	JButton again;
	JButton endGame;
	int row1 = (int)(Math.random() * 4);
	int col1 = (int)(Math.random() * 13);
	int row2 = (int)(Math.random() * 4);
	int col2 = (int)(Math.random() * 13);
	int row3 = (int)(Math.random() * 4);
	int col3 = (int)(Math.random() * 13);
	int row4 = (int)(Math.random() * 4);
	int col4 = (int)(Math.random() * 13);
	int row5 = (int)(Math.random() * 4);
	int col5 = (int)(Math.random() * 13);
	int row11 = (int)(Math.random() * 4);
	int col11 = (int)(Math.random() * 13);
	int row22 = (int)(Math.random() * 4);
	int col22 = (int)(Math.random() * 13);
	int row33 = (int)(Math.random() * 4);
	int col33 = (int)(Math.random() * 13);
	int row44 = (int)(Math.random() * 4);
	int col44 = (int)(Math.random() * 13);
	int row55 = (int)(Math.random() * 4);
	int col55 = (int)(Math.random() * 13);
	boolean lost = false;
	
	
	String[][] deck = {
			{"2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣"},
			{"2♢", "3♢", "4♢", "5♢", "6♢", "7♢", "8♢", "9♢", "10♢", "J♢", "Q♢", "K♢", "A♢"},
			{"2♡", "3♡", "4♡", "5♡", "6♡", "7♡", "8♡", "9♡", "10♡", "J♡", "Q♡", "K♡", "A♡"},
			{"3♠", "4♠", "5♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"}
};
	
	
	
	public TheTrain() {
		super("The Train Phase 2");
		setSize(700,410);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		main = new JPanel();
		add(main);
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
	
		HoL = new JPanel();
		main.add(HoL);
		HoL.setLayout(null);
		
		card = new JPanel();
		main.add(card);
		card.setLayout(null);
		
		 newCard = new JPanel();
		main.add(newCard);
		newCard.setLayout(null);
		
		 rest = new JPanel();
		main.add(rest);
		rest.setLayout(null);
		
		
		//higher or lower
		
		
		 title = new JLabel("GET READY",SwingConstants.CENTER);
		HoL.add(title);
		title.setBounds(5,5,530,30);
		
		 higher1 = new JButton("↑");
		HoL.add(higher1);
		higher1.setBounds(5,40,40,20);
		higher1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ncard1.setText(deck[row11][col11]);
				if(col11 <= col1) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		
		
		 lower1 = new JButton("↓");
		HoL.add(lower1);
		lower1.setBounds(50,40,40,20);
		lower1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ncard1.setText(deck[row11][col11]);
				if(col11 >= col1) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		
		 higher2 = new JButton("↑");
		HoL.add(higher2);
		higher2.setBounds(130,40,40,20);
		higher2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ncard2.setText(deck[row22][col22]);
				if(lost == true) {
					
				}
				else if(col22 <= col2) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		
		 lower2 = new JButton("↓");
		HoL.add(lower2);
		lower2.setBounds(175,40,40,20);
		lower2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ncard2.setText(deck[row22][col22]);
				if(lost == true) {
					
				}
				else if(col22 >= col2) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		
		 higher3 = new JButton("↑");
		HoL.add(higher3);
		higher3.setBounds(255,40,40,20);
		higher3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card3.setText(deck[row3][row3]);
				ncard3.setText(deck[row33][col33]);
				if(lost == true) {
					
				}
				else if(col33 <= col3) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		
		
		
		 lower3 = new JButton("↓");
		HoL.add(lower3);
		lower3.setBounds(295,40,40,20);
		lower3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card3.setText(deck[row3][row3]);
				ncard3.setText(deck[row33][col33]);
				if(lost == true) {
					
				}
				else if(col33 >= col3) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		 higher4 = new JButton("↑");
		HoL.add(higher4);
		higher4.setBounds(375,40,40,20);
		higher4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ncard4.setText(deck[row44][col44]);
				if(lost == true) {
					
				}
				else if(col44 <= col4) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		 lower4 = new JButton("↓");
		HoL.add(lower4);
		lower4.setBounds(415,40,40,20);
		lower4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ncard4.setText(deck[row44][col44]);
				if(lost == true) {
					
				}
				else if(col44 >= col4) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				
			}});
		
		 higher5 = new JButton("↑");
		HoL.add(higher5);
		higher5.setBounds(495,40,40,20);
		higher5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card5.setText(deck[row5][row5]);
				ncard5.setText(deck[row55][col55]);
				if(lost == true) {
					
				}
				else if(col55 <= col5) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				else if(col55 > col5) {
					endGame.setVisible(true);
				}
			}});
		
		 lower5 = new JButton("↓");
		HoL.add(lower5);
		lower5.setBounds(535,40,40,20);
		lower5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card5.setText(deck[row5][row55]);
				ncard5.setText(deck[row55][col55]);
				if(lost == true) {
					
				}
				else if(col55 >= col5) {
					theEnd.setText("You lose");
					again.setVisible(true);
					lost = true;
				}
				else if(col55 < col5) {
					endGame.setVisible(true);
				}
				
			}});
		
		
		
		
		//the cards already on the table
		
		
		 card1 = new JLabel(deck[row1][col1], SwingConstants.CENTER);
		card.add(card1);
		card1.setBounds(5,0,80,40);
		
		 card2 = new JLabel(deck[row2][col2], SwingConstants.CENTER);
		card.add(card2);
		card2.setBounds(130,0,80,40);
		
		 card3 = new JLabel("Тайна майна", SwingConstants.CENTER);
		card.add(card3);
		card3.setBounds(255,0,80,40);
		
		 card4 = new JLabel(deck[row3][col3], SwingConstants.CENTER);
		card.add(card4);
		card4.setBounds(375,0,80,40);
		
		 card5 = new JLabel("Тайна майна", SwingConstants.CENTER);
		card.add(card5);
		card5.setBounds(495,0,80,40);
		
		
		//the cards the player gets
		
		
		 ncard1 = new JLabel("-", SwingConstants.CENTER);
		newCard.add(ncard1);
		ncard1.setBounds(5,0,80,40);
		
		 ncard2 = new JLabel("-", SwingConstants.CENTER);
		newCard.add(ncard2);
		ncard2.setBounds(130,0,80,40);
		
		 ncard3 = new JLabel("-", SwingConstants.CENTER);
		newCard.add(ncard3);
		ncard3.setBounds(255,0,80,40);
		
		 ncard4 = new JLabel("-", SwingConstants.CENTER);
		newCard.add(ncard4);
		ncard4.setBounds(375,0,80,40);
		
		 ncard5 = new JLabel("-", SwingConstants.CENTER);
		newCard.add(ncard5);
		ncard5.setBounds(495,0,80,40);
		
		
		//the rest
		
		
		 theEnd = new JLabel("",SwingConstants.CENTER);
		rest.add(theEnd);
		theEnd.setBounds(5,0,150,80);
		
		 again = new JButton("AGAIN!");
		rest.add(again);
		again.setBounds(170,0,150,80);
		again.setVisible(false);
		again.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				 row1 = (int)(Math.random() * 4);
				 col1 = (int)(Math.random() * 13);
				 row2 = (int)(Math.random() * 4);
				 col2 = (int)(Math.random() * 13);
				 row3 = (int)(Math.random() * 4);
				 col3 = (int)(Math.random() * 13);
				 row4 = (int)(Math.random() * 4);
				 col4 = (int)(Math.random() * 13);
				 row5 = (int)(Math.random() * 4);
				 col5 = (int)(Math.random() * 13);
				 row11 = (int)(Math.random() * 4);
				 col11 = (int)(Math.random() * 13);
				 row22 = (int)(Math.random() * 4);
				 col22 = (int)(Math.random() * 13);
				 row33 = (int)(Math.random() * 4);
				 col33 = (int)(Math.random() * 13);
				 row44 = (int)(Math.random() * 4);
				 col44 = (int)(Math.random() * 13);
				 row55 = (int)(Math.random() * 4);
				 col55 = (int)(Math.random() * 13);
				 card1.setText(deck[row1][col1]);
				 card2.setText(deck[row2][col2]);
				 card3.setText("Тайна майна");
				 card4.setText(deck[row4][col4]);
				 card5.setText("Тайна майна");
				 ncard1.setText("-");
				 ncard2.setText("-");
				 ncard3.setText("-");
				 ncard4.setText("-");
				 ncard5.setText("-");
				 again.setVisible(false);
				 theEnd.setText("");
				 lost = false;
			}});
		
		
		 endGame = new JButton("End game");
		rest.add(endGame);
		endGame.setBounds(170,0,150,80);
		endGame.setVisible(false);
		endGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
				
			}});
		
		
		
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		GUI();
		
	}

	
static void GUI() {
		
		TheTrain hop = new TheTrain();

		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}

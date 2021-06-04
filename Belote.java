package encaraMessi;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Belote extends JFrame {

	JPanel main;
	JButton test;
	JButton begin;
	JLabel southCall;
	JLabel eastCall;
	JLabel northCall;
	JLabel westCall;
	
	String[] playerNames;
	Player[] players = new Player[4];
int score1 = 0; int score2 = 0;
	 String[] deck = 
		 {"7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣",
	 "7♢", "8♢", "9♢", "10♢", "J♢", "Q♢", "K♢", "A♢",
	 "7♡", "8♡", "9♡", "10♡", "J♡", "Q♡", "K♡", "A♡",
	 "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"};
	 



	int row1 = (int) (Math.random() * 4);
	int col1 = (int) (Math.random() * 13);
	int row2 = (int) (Math.random() * 4);
	int col2 = (int) (Math.random() * 13);
	int row3 = (int) (Math.random() * 4);
	int col3 = (int) (Math.random() * 13);
	int row4 = (int) (Math.random() * 4);
	int col4 = (int) (Math.random() * 13);
	
//	String[] player1Hand = new String[8];
//	String[] player2Hand = new String[8];
//	String[] player3Hand = new String[8];
//	String[] player4Hand = new String[8];

	public static final Color LIGHT_Green = new Color(0, 255, 91);
	public static final Color LIGHT_Blue = new Color(81, 153, 255);
	public static final Color LIGHT_Red = new Color(255, 102, 102);

	public Belote() {

		super("Belote");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Stack<String> teste = new Stack<String>();
		 for(int i = 0; i < 32; i++){
		 teste.add(deck[i]);
	 }
		
		for (int i = 0; i < 4; i++) {
			players[i] = new Player(String.valueOf(i));
		}
	

		main = new JPanel();
		add(main);
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		main.setBackground(LIGHT_Green);
		
		southCall = new JLabel(" ");
		southCall.setBounds(350,550,100,50);
		southCall.setBackground(Color.BLUE);
		main.add(southCall);

//		200, 625, 400, 100

		begin = new JButton();
		main.add(begin);
		begin.setBounds(499, 30, 300, 50);
		begin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}});
		
		
		
//		while(score1 < 151 && score2< 151){
//			
//			while(!players[1].isReady && !players[2].isReady && !players[3].isReady && !players[0].isReady ){
//				Collections.shuffle(teste);
				for(int i = 0; i <20; i++){
					players[i/5].giveCard(teste.pop());
//					if(i < 5){
//						 players[] = teste.pop();
//						// players[0].setHand(player1Hand);
//						 continue;
//						 }
//					else if(i > 4 && i<10){
//						 player2Hand[i] = teste.pop();
//						 players[1].setHand(player2Hand);
//						 continue;
//					}
//					else if(i > 9 && i<15){
//						 player3Hand[i] = teste.pop();
//						 players[2].setHand(player3Hand);
//						 continue;
//					}
//					else if(i > 14 && i<20){
//						 player4Hand[i] = teste.pop();
//						 players[3].setHand(player4Hand);
//						 continue;
//					}
				}
				
				
				for(int i = 0; i < 4; i++){
					
					System.out.println(players[i].getHand());
					
				}
				
//				
//				
//				
//			}
			
			
			
			
			
			for(int i = 0; i < 4; i++){
				if(i != 3){
				players[i].setPlace(i+=1);}
				else{players[i].setPlace(0);}
			}
			
//		}
		
		
		
		
		
		
		setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);

		// draw higher
		// draw rectangle outline
		g.drawRect(200, 75, 400, 100);
		// set color to white
		g.setColor(Color.white);
		// fill rectangle with white
		g.fillRect(200, 75, 400, 100);
		int rec1X = 250;
		int rec1Y = 75;
		for (int i = 0; i < 8; i++) {
			g.setColor(Color.black);
			g.drawLine(rec1X, rec1Y, rec1X, rec1Y + 100);
			rec1X += 50;

		}

		// draw rect 2

		g.setColor(Color.white);
		g.drawRect(75, 200, 100, 400);
		g.fillRect(75, 200, 100, 400);
		int rec2X = 75;
		int rec2Y = 250;
		for (int i = 0; i < 8; i++) {
			g.setColor(Color.black);
			g.drawLine(rec2X, rec2Y, rec2X + 100, rec2Y);
			rec2Y += 50;

		}

		// draw rect 3
		g.setColor(Color.white);
		g.drawRect(625, 200, 100, 400);
		g.fillRect(625, 200, 100, 400);
		int rec3X = 625;
		int rec3Y = 250;
		for (int i = 0; i < 8; i++) {
			g.setColor(Color.black);
			g.drawLine(rec3X, rec3Y, rec3X + 100, rec3Y);
			rec3Y += 50;

		}
		// draw rect 4
		g.setColor(Color.white);
		g.drawRect(200, 625, 400, 100);
		g.fillRect(200, 625, 400, 100);
		int rec4X = 250;
		int rec4Y = 625;
		for (int i = 0; i < 8; i++) {
			g.setColor(Color.black);
			g.drawLine(rec4X, rec4Y, rec4X, rec4Y + 100);
			rec4X += 50;

		}

	}

	public static void main(String[] args) {

	}

}

package CaptainJackSparrow;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class TheTrain {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("The Train Phase 2");
		frame.setSize(700,410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel main = new JPanel();
		frame.add(main);
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
	
		JPanel HoL = new JPanel();
		main.add(HoL);
		HoL.setLayout(null);
		
		JPanel card = new JPanel();
		main.add(card);
		card.setLayout(null);
		
		JPanel newCard = new JPanel();
		main.add(newCard);
		newCard.setLayout(null);
		
		JPanel rest = new JPanel();
		main.add(rest);
		rest.setLayout(null);
		
		
		//higher or lower
		
		
		JLabel title = new JLabel("GET READY",SwingConstants.CENTER);
		HoL.add(title);
		title.setBounds(5,5,530,30);
		
		JButton higher1 = new JButton("↑");
		HoL.add(higher1);
		higher1.setBounds(5,40,40,20);
		
		JButton lower1 = new JButton("↓");
		HoL.add(lower1);
		lower1.setBounds(50,40,40,20);
		
		JButton higher2 = new JButton("↑");
		HoL.add(higher2);
		higher2.setBounds(130,40,40,20);
		
		JButton lower2 = new JButton("↓");
		HoL.add(lower2);
		lower2.setBounds(175,40,40,20);
		
		JButton higher3 = new JButton("↑");
		HoL.add(higher3);
		higher3.setBounds(255,40,40,20);
		
		JButton lower3 = new JButton("↓");
		HoL.add(lower3);
		lower3.setBounds(295,40,40,20);
		
		JButton higher4 = new JButton("↑");
		HoL.add(higher4);
		higher4.setBounds(375,40,40,20);
		
		JButton lower4 = new JButton("↓");
		HoL.add(lower4);
		lower4.setBounds(415,40,40,20);
		
		JButton higher5 = new JButton("↑");
		HoL.add(higher5);
		higher5.setBounds(495,40,40,20);
		
		JButton lower5 = new JButton("↓");
		HoL.add(lower5);
		lower5.setBounds(535,40,40,20);
		
		
		
		//the cards already on the table
		
		
		JLabel card1 = new JLabel("a", SwingConstants.CENTER);
		card.add(card1);
		card1.setBounds(5,0,80,40);
		
		JLabel card2 = new JLabel("a", SwingConstants.CENTER);
		card.add(card2);
		card2.setBounds(130,0,80,40);
		
		JLabel card3 = new JLabel("a", SwingConstants.CENTER);
		card.add(card3);
		card3.setBounds(255,0,80,40);
		
		JLabel card4 = new JLabel("a", SwingConstants.CENTER);
		card.add(card4);
		card4.setBounds(375,0,80,40);
		
		JLabel card5 = new JLabel("a", SwingConstants.CENTER);
		card.add(card5);
		card5.setBounds(495,0,80,40);
		
		
		//the cards the player gets
		
		
		JLabel ncard1 = new JLabel("a", SwingConstants.CENTER);
		newCard.add(ncard1);
		ncard1.setBounds(5,0,80,40);
		
		JLabel ncard2 = new JLabel("a", SwingConstants.CENTER);
		newCard.add(ncard2);
		ncard2.setBounds(130,0,80,40);
		
		JLabel ncard3 = new JLabel("a", SwingConstants.CENTER);
		newCard.add(ncard3);
		ncard3.setBounds(255,0,80,40);
		
		JLabel ncard4 = new JLabel("a", SwingConstants.CENTER);
		newCard.add(ncard4);
		ncard4.setBounds(375,0,80,40);
		
		JLabel ncard5 = new JLabel("a", SwingConstants.CENTER);
		newCard.add(ncard5);
		ncard5.setBounds(495,0,80,40);
		
		
		//the rest
		
		
		JLabel theEnd = new JLabel("YOU WINNNN",SwingConstants.CENTER);
		rest.add(theEnd);
		theEnd.setBounds(5,0,150,80);
		
		JButton again = new JButton("AGAIN!");
		rest.add(again);
		again.setBounds(170,0,150,80);
		again.setVisible(false);
		
		JButton endGame = new JButton("End game");
		rest.add(endGame);
		endGame.setBounds(170,0,150,80);
		endGame.setVisible(false);
		
		
		
		frame.setVisible(true);
	}

}

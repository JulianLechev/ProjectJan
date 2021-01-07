package CaptainJackSparrow;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class MainPage {
	public static void main(String[] args) {
	JFrame frame = new JFrame("The Drinking Game App");
	frame.setSize(350,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel main = new JPanel();
	frame.add(main);	
	main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
//	main.setLayout(null);
	
	
	JPanel leftSide = new JPanel();
	main.add(leftSide);
	leftSide.setLayout(new BoxLayout(leftSide,BoxLayout.Y_AXIS));
	
	
	JPanel rightSide = new JPanel();
	main.add(rightSide);
	rightSide.setLayout(null);
	
	
	//leftSIde
	JLabel title = new JLabel("The Drinking Games App");
	JButton theTrain = new JButton("The Train");
	JButton cardGame = new JButton("Card Game");
	JButton roulette = new JButton("Roulette");
	JButton commingSoon = new JButton ("Comming soon");
	
	leftSide.add(title);
	leftSide.add(theTrain);
	leftSide.add(cardGame);
	leftSide.add(roulette);
	leftSide.add(commingSoon);
	
	
	//rightSide
	
	JButton addPlayer = new JButton("Add player");
	rightSide.add(addPlayer);
	addPlayer.setBounds(30,90,100, 30);
	
	JTextField name = new JTextField();
	rightSide.add(name);
	name.setBounds(30,50,150,30);
	
	
	
	
	frame.setVisible(true);
	
}
}
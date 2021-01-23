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
public class MainPage extends JFrame implements ActionListener {
	
	
	
	String addPlayerActionCommand = "addPlayer";
	String trainActionCommand = "Chakataka";
	JPanel main;
	JPanel leftSide;
	JPanel rightSide;
	JButton theTrain;
	JLabel numOfPlayers;
	JTextField numOfPlText;
	JTextField name;
	JButton addPlayer;
	
	int i = 0;
//	int howManyPlayers = Integer.parseInt(numOfPlText.getText());
	String[] players = new String[5];
	
	
	
	private static void GUI() {
		
		MainPage app = new MainPage();

		
	}
	
	
	
	public MainPage() {
		 super("The Drinking Game App");
		setSize(450,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		for(int l = 0; l<5; l++) {
			
			players[l] = new String();
		}
		
		main = new JPanel();
		super.add(main);	
		main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));

		
		
		leftSide = new JPanel();
		main.add(leftSide);
		leftSide.setLayout(new BoxLayout(leftSide,BoxLayout.Y_AXIS));
		
		
		rightSide = new JPanel();
		main.add(rightSide);
		rightSide.setLayout(null);
		
		
		//leftSIde
		
		theTrain = new JButton("The Train");
		leftSide.add(theTrain);
		theTrain.addActionListener(this); 
		theTrain.setActionCommand(trainActionCommand);
		
		
		JButton cardGame = new JButton("Card Game");
		cardGame.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int k = 0; k<5	; k++) {
					System.out.println(players[k]);
				}
				
			}
			
		}); 
		
		
		JButton roulette = new JButton("Roulette");
		JButton commingSoon = new JButton ("Comming soon");
		
		
		
		leftSide.add(cardGame);
		leftSide.add(roulette);
		leftSide.add(commingSoon);
		

		
		
		//rightSide
		
		
		numOfPlayers = new JLabel("Set the number of players");
		rightSide.add(numOfPlayers);
		numOfPlayers.setBounds(0, 20, 150, 30);
		
		
		numOfPlText = new JTextField();
		rightSide.add(numOfPlText);
		numOfPlText.setBounds(160,20,30,30);
		
		
		
		
		name = new JTextField();
		rightSide.add(name);
		name.setBounds(30,90,150,30);
		
		
		addPlayer = new JButton("Add player");
		rightSide.add(addPlayer);
		addPlayer.setBounds(30,130,100, 30);
		addPlayer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String playerName = name.getText();
				players[i] = playerName;
				i++;
				
				name.setText(null);
				
			}});
		addPlayer.setActionCommand(addPlayerActionCommand);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
	
	GUI();

	
	
	}



	@Override
	
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		setVisible(false);
			TheTrainPrep ak = new TheTrainPrep(players);
	
			
		}
		
	
	
	public String getPlayer(int k) {
		return players[k];
		
	}
	

	

}
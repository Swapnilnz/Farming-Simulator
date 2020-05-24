package gamePackage.GUI;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

import gamePackage.AnimalMarket;
import gamePackage.GameEnvironment;

/**
 * Animal Market dialog class
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class ViewAnimalMarket extends JDialog {
	
	/**
	 * Default serial version ID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Amount to buy
	 */
	private int amount;
	/**
	 * Text in the textfield
	 */
	private JTextField textAmount;

	/**
	 * Validifies amount input (makes sure its greater than 0)
	 * @param text text to be validified
	 * @return boolean if/if not validified
	 */
	boolean validifier(String text) {
		try {
			int tempNum = Integer.parseInt(text);
			if (tempNum >= 0) {
				amount = tempNum;
				return true;

			} else {
				return false;
			}
		} catch (Exception ex) {
				return false;
		}
	
	}
	
	/**
	 * Create the animal market
	 * @param game main game
	 * @param window main window
	 * @param animalMarket animal market instance
	 */
	public ViewAnimalMarket(GameEnvironment game, JFrame window, AnimalMarket animalMarket) {
		super(window, "Andy's Animal Market", true);
		setResizable(false);
		setBounds(100, 100, 501, 310);
		getContentPane().setLayout(null);
		{
			JTextPane txtpnWelcomeToAndys = new JTextPane();
			txtpnWelcomeToAndys.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			txtpnWelcomeToAndys.setBackground(new Color(233, 150, 122));
			txtpnWelcomeToAndys.setEditable(false);
			txtpnWelcomeToAndys.setText("Welcome to Andy's Animal Market!");
			txtpnWelcomeToAndys.setFont(new Font("Tahoma", Font.BOLD, 20));
			txtpnWelcomeToAndys.setBounds(10, 11, 366, 31);
			getContentPane().add(txtpnWelcomeToAndys);
		}
		
		JLabel moneyLabel = new JLabel("You currently have $" + game.farm.getFarmMoney());
		moneyLabel.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		moneyLabel.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		moneyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		moneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		moneyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		moneyLabel.setBounds(10, 184, 187, 23);
		getContentPane().add(moneyLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		textPane.setBackground(new Color(233, 150, 122));
		textPane.setText("What would you like to buy?");
		textPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPane.setEditable(false);
		textPane.setBounds(10, 53, 204, 23);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		textPane_1.setBackground(new Color(233, 150, 122));
		textPane_1.setText("Enter amount before buying");
		textPane_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textPane_1.setEditable(false);
		textPane_1.setBounds(20, 89, 187, 21);
		getContentPane().add(textPane_1);

		
		JLabel youHave = new JLabel("Owned");
		youHave.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		youHave.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		youHave.setHorizontalTextPosition(SwingConstants.CENTER);
		youHave.setHorizontalAlignment(SwingConstants.CENTER);
		youHave.setBounds(389, 100, 69, 14);
		getContentPane().add(youHave);
		
		JLabel cowCount = new JLabel(Integer.toString(game.farm.getCowCount()));
		cowCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		cowCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		cowCount.setHorizontalTextPosition(SwingConstants.CENTER);
		cowCount.setHorizontalAlignment(SwingConstants.CENTER);
		cowCount.setBounds(389, 123, 69, 23);
		getContentPane().add(cowCount);
		
		JLabel pigCount = new JLabel(Integer.toString(game.farm.getPigCount()));
		pigCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		pigCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		pigCount.setHorizontalTextPosition(SwingConstants.CENTER);
		pigCount.setHorizontalAlignment(SwingConstants.CENTER);
		pigCount.setBounds(389, 154, 69, 23);
		getContentPane().add(pigCount);
		
		JLabel chickenCount = new JLabel(Integer.toString(game.farm.getChickenCount()));
		chickenCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		chickenCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		chickenCount.setHorizontalTextPosition(SwingConstants.CENTER);
		chickenCount.setHorizontalAlignment(SwingConstants.CENTER);
		chickenCount.setBounds(389, 184, 69, 23);
		getContentPane().add(chickenCount);
		
		JLabel sheepCount = new JLabel(Integer.toString(game.farm.getSheepCount()));
		sheepCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		sheepCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		sheepCount.setHorizontalTextPosition(SwingConstants.CENTER);
		sheepCount.setHorizontalAlignment(SwingConstants.CENTER);
		sheepCount.setBounds(389, 215, 69, 23);
		getContentPane().add(sheepCount);
		
		// Text field where user enters amount
		textAmount = new JTextField();
		textAmount.setColumns(10);
		textAmount.setBounds(73, 121, 64, 20);
		getContentPane().add(textAmount);
		
		// Button/error label to enter and check amount
		JLabel error = new JLabel("");
		error.setFont(new Font("Tahoma", Font.BOLD, 11));
		error.setForeground(new Color(255, 0, 0));
		error.setHorizontalTextPosition(SwingConstants.CENTER);
		error.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		error.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setBounds(20, 152, 163, 20);
		getContentPane().add(error);
					
		// Exit button
		JButton exitButton = new JButton("Exit");
		exitButton.setBackground(new Color(210, 180, 140));
		exitButton.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setBounds(386, 11, 89, 23);
		getContentPane().add(exitButton);
		
		// Buy Cow
		JButton buyCow = new JButton("Buy Cow ($" + animalMarket.getCowPrice() + ")");
		buyCow.setBackground(new Color(210, 180, 140));
		buyCow.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		buyCow.setHorizontalTextPosition(SwingConstants.CENTER);
		buyCow.setBounds(234, 123, 128, 23);
		getContentPane().add(buyCow);
		buyCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = validifier(textAmount.getText());
				if (valid) {
					animalMarket.buyCow(game, amount, window);
					cowCount.setText(Integer.toString(game.farm.getCowCount()));
					moneyLabel.setText("You currently have $" + game.farm.getFarmMoney());
				} else { 
					error.setText("Pleaser enter a valid number!");
				}
			}
		});
		
		// Buy Pig
		JButton buyPig = new JButton("Buy Pig ($" + animalMarket.getCowPrice() + ")");
		buyPig.setBackground(new Color(210, 180, 140));
		buyPig.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		buyPig.setHorizontalTextPosition(SwingConstants.CENTER);
		buyPig.setBounds(234, 154, 128, 23);
		getContentPane().add(buyPig);
		buyPig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = validifier(textAmount.getText());

				if (valid) {
					animalMarket.buyPig(game, amount, window);
					pigCount.setText(Integer.toString(game.farm.getPigCount()));
					moneyLabel.setText("You currently have $" + game.farm.getFarmMoney());

				} else {
					error.setText("Pleaser enter a valid number!");

				}
			}
		});
		
		// Buy Chicken
		JButton buyChicken = new JButton("Buy Chicken ($" + animalMarket.getCowPrice() + ")");
		buyChicken.setBackground(new Color(210, 180, 140));
		buyChicken.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		buyChicken.setHorizontalTextPosition(SwingConstants.CENTER);
		buyChicken.setBounds(234, 184, 128, 23);
		getContentPane().add(buyChicken);
		buyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = validifier(textAmount.getText());

				if (valid) {
					animalMarket.buyChicken(game, amount, window);
					chickenCount.setText(Integer.toString(game.farm.getChickenCount()));
					moneyLabel.setText("You currently have $" + game.farm.getFarmMoney());

				} else {
					error.setText("Pleaser enter a valid number!");

				}
			}
		});
		
		// Buy Sheep
		JButton buySheep = new JButton("Buy Sheep ($" + animalMarket.getCowPrice() + ")");
		buySheep.setBackground(new Color(210, 180, 140));
		buySheep.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		buySheep.setHorizontalTextPosition(SwingConstants.CENTER);
		buySheep.setBounds(234, 215, 128, 23);
		getContentPane().add(buySheep);
		buySheep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = validifier(textAmount.getText());
				if (valid) {
					animalMarket.buySheep(game, amount, window);
					sheepCount.setText(Integer.toString(game.farm.getSheepCount()));
					moneyLabel.setText("You currently have $" + game.farm.getFarmMoney());

				} else {
					error.setText("Pleaser enter a valid number!");

				}
			}
		});

		// Background
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/animalMarketBackground.png")));
		background.setBounds(0, 0, 495, 281);
		getContentPane().add(background);



		



	}
}

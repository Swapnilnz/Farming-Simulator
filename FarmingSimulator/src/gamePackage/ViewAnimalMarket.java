package gamePackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ViewAnimalMarket extends JDialog {
	private JTextField textField;
	private boolean valid;
	private int amount;
	private JTextField textAmount;
	private JLabel money;



	/**
	 * Create the dialog.
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
			txtpnWelcomeToAndys.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtpnWelcomeToAndys.setBounds(10, 11, 317, 31);
			getContentPane().add(txtpnWelcomeToAndys);
		}
		
		JLabel label = new JLabel("You currently have $");
		label.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		label.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(42, 215, 128, 23);
		getContentPane().add(label);
		
		money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(164, 215, 29, 23);
		getContentPane().add(money);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		textPane.setBackground(new Color(233, 150, 122));
		textPane.setText("What would you like to buy?");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane.setEditable(false);
		textPane.setBounds(10, 53, 183, 23);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		textPane_1.setBackground(new Color(233, 150, 122));
		textPane_1.setText("Enter amount before buying");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane_1.setEditable(false);
		textPane_1.setBounds(20, 89, 163, 21);
		getContentPane().add(textPane_1);
		
		textAmount = new JTextField();
		textAmount.setColumns(10);
		textAmount.setBounds(72, 121, 64, 20);
		getContentPane().add(textAmount);
		
		JLabel youHave = new JLabel("You have: ");
		youHave.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		youHave.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		youHave.setHorizontalTextPosition(SwingConstants.CENTER);
		youHave.setHorizontalAlignment(SwingConstants.CENTER);
		youHave.setBounds(393, 77, 64, 14);
		getContentPane().add(youHave);
		
		JLabel cowCount = new JLabel(Integer.toString(game.farm.getCowCount()));
		cowCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		cowCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		cowCount.setHorizontalTextPosition(SwingConstants.CENTER);
		cowCount.setHorizontalAlignment(SwingConstants.CENTER);
		cowCount.setBounds(388, 100, 69, 23);
		getContentPane().add(cowCount);
		
		JLabel pigCount = new JLabel(Integer.toString(game.farm.getPigCount()));
		pigCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		pigCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		pigCount.setHorizontalTextPosition(SwingConstants.CENTER);
		pigCount.setHorizontalAlignment(SwingConstants.CENTER);
		pigCount.setBounds(388, 131, 69, 23);
		getContentPane().add(pigCount);
		
		JLabel chickenCount = new JLabel(Integer.toString(game.farm.getChickenCount()));
		chickenCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		chickenCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		chickenCount.setHorizontalTextPosition(SwingConstants.CENTER);
		chickenCount.setHorizontalAlignment(SwingConstants.CENTER);
		chickenCount.setBounds(388, 161, 69, 23);
		getContentPane().add(chickenCount);
		
		JLabel sheepCount = new JLabel(Integer.toString(game.farm.getSheepCount()));
		sheepCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		sheepCount.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		sheepCount.setHorizontalTextPosition(SwingConstants.CENTER);
		sheepCount.setHorizontalAlignment(SwingConstants.CENTER);
		sheepCount.setBounds(388, 192, 69, 23);
		getContentPane().add(sheepCount);
		
		// Button/error label to enter and check amount
		JLabel error = new JLabel("");
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setBounds(20, 186, 163, 20);
		getContentPane().add(error);
					
		JButton enter = new JButton("Enter");
		enter.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		enter.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		enter.setHorizontalTextPosition(SwingConstants.CENTER);
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int tempNum = Integer.parseInt(textAmount.getText());
					if (tempNum >= 0) {
						amount = tempNum;
						valid = true;
						error.setText("Valid!");

					} else {
						error.setText("Please enter a valid number!");
					}
				} catch (Exception ex) {
								error.setText("Please enter a valid number!");
				}
			}
		});
		enter.setBounds(55, 152, 97, 23);
		getContentPane().add(enter);
				

		
		JButton exitButton = new JButton("Exit");
		exitButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		exitButton.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setBounds(386, 11, 89, 23);
		getContentPane().add(exitButton);
		
		// Buy Cow
		JButton buyCow = new JButton("Buy Cow");
		buyCow.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		buyCow.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		buyCow.setHorizontalTextPosition(SwingConstants.CENTER);
		buyCow.setBounds(233, 100, 128, 23);
		getContentPane().add(buyCow);
		buyCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buyCow(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					cowCount.setText(Integer.toString(game.farm.getCowCount()));
				}
			}
		});
		
		// Buy Pig
		JButton buyPig = new JButton("Buy Pig");
		buyPig.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		buyPig.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		buyPig.setHorizontalTextPosition(SwingConstants.CENTER);
		buyPig.setBounds(233, 131, 128, 23);
		getContentPane().add(buyPig);
		buyPig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buyPig(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					pigCount.setText(Integer.toString(game.farm.getPigCount()));
				}
			}
		});
		
		// Buy Chicken
		JButton buyChicken = new JButton("Buy Chicken");
		buyChicken.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		buyChicken.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		buyChicken.setHorizontalTextPosition(SwingConstants.CENTER);
		buyChicken.setBounds(233, 161, 128, 23);
		getContentPane().add(buyChicken);
		buyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buyChicken(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					chickenCount.setText(Integer.toString(game.farm.getChickenCount()));
				}
			}
		});
		
		// Buy Sheep
		JButton buySheep = new JButton("Buy Sheep");
		buySheep.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		buySheep.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/button.jpg")));
		buySheep.setHorizontalTextPosition(SwingConstants.CENTER);
		buySheep.setBounds(233, 192, 128, 23);
		getContentPane().add(buySheep);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ViewAnimalMarket.class.getResource("/images/animalMarketBackground.png")));
		background.setBounds(0, 0, 495, 281);
		getContentPane().add(background);
		buySheep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buySheep(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					sheepCount.setText(Integer.toString(game.farm.getSheepCount()));
				}
			}
		});



		



	}
}

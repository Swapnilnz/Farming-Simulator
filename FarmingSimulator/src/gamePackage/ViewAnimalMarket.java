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
		setBounds(100, 100, 501, 333);
		getContentPane().setLayout(null);
		{
			JTextPane txtpnWelcomeToAndys = new JTextPane();
			txtpnWelcomeToAndys.setEditable(false);
			txtpnWelcomeToAndys.setText("Welcome to Andy's Animal Market!");
			txtpnWelcomeToAndys.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtpnWelcomeToAndys.setBounds(10, 11, 317, 31);
			getContentPane().add(txtpnWelcomeToAndys);
		}
		
		JLabel label = new JLabel("You currently have $");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(43, 215, 128, 23);
		getContentPane().add(label);
		
		money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(164, 215, 29, 23);
		getContentPane().add(money);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("What would you like to buy?");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane.setEditable(false);
		textPane.setBounds(10, 53, 183, 23);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
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
		youHave.setBounds(393, 77, 64, 14);
		getContentPane().add(youHave);
		
		JLabel cowCount = new JLabel(Integer.toString(game.farm.getCowCount()));
		cowCount.setBounds(388, 100, 69, 23);
		getContentPane().add(cowCount);
		
		JLabel pigCount = new JLabel(Integer.toString(game.farm.getPigCount()));
		pigCount.setBounds(388, 131, 69, 23);
		getContentPane().add(pigCount);
		
		JLabel chickenCount = new JLabel(Integer.toString(game.farm.getChickenCount()));
		chickenCount.setBounds(388, 161, 69, 23);
		getContentPane().add(chickenCount);
		
		JLabel sheepCount = new JLabel(Integer.toString(game.farm.getSheepCount()));
		sheepCount.setBounds(388, 192, 69, 23);
		getContentPane().add(sheepCount);
		
		// Button/error label to enter and check amount
		JLabel error = new JLabel("");
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setBounds(20, 186, 163, 20);
		getContentPane().add(error);
					
		JButton enter = new JButton("Enter");
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
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setBounds(350, 260, 89, 23);
		getContentPane().add(exitButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(250, 99, 128, 128);
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		// Buy Cow
		JButton buyCow = new JButton("Buy Cow");
		buyCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buyCow(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					cowCount.setText(Integer.toString(game.farm.getCowCount()));
				}
			}
		});
		GridBagConstraints gbc_buyCow = new GridBagConstraints();
		gbc_buyCow.insets = new Insets(0, 0, 5, 0);
		gbc_buyCow.fill = GridBagConstraints.HORIZONTAL;
		gbc_buyCow.gridx = 0;
		gbc_buyCow.gridy = 0;
		panel.add(buyCow, gbc_buyCow);
		
		// Buy Pig
		JButton buyPig = new JButton("Buy Pig");
		buyPig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buyPig(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					pigCount.setText(Integer.toString(game.farm.getPigCount()));
				}
			}
		});
		GridBagConstraints gbc_buyPig = new GridBagConstraints();
		gbc_buyPig.fill = GridBagConstraints.HORIZONTAL;
		gbc_buyPig.insets = new Insets(0, 0, 5, 0);
		gbc_buyPig.gridx = 0;
		gbc_buyPig.gridy = 1;
		panel.add(buyPig, gbc_buyPig);
		
		// Buy Chicken
		JButton buyChicken = new JButton("Buy Chicken");
		buyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buyChicken(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					chickenCount.setText(Integer.toString(game.farm.getChickenCount()));
				}
			}
		});
		GridBagConstraints gbc_buyChicken = new GridBagConstraints();
		gbc_buyChicken.fill = GridBagConstraints.HORIZONTAL;
		gbc_buyChicken.insets = new Insets(0, 0, 5, 0);
		gbc_buyChicken.gridx = 0;
		gbc_buyChicken.gridy = 2;
		panel.add(buyChicken, gbc_buyChicken);
		
		// Buy Sheep
		JButton buySheep = new JButton("Buy Sheep");
		buySheep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valid) {
					animalMarket.buySheep(game, amount, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					sheepCount.setText(Integer.toString(game.farm.getSheepCount()));
				}
			}
		});
		GridBagConstraints gbc_buySheep = new GridBagConstraints();
		gbc_buySheep.fill = GridBagConstraints.HORIZONTAL;
		gbc_buySheep.gridx = 0;
		gbc_buySheep.gridy = 3;
		panel.add(buySheep, gbc_buySheep);
		



	}

}

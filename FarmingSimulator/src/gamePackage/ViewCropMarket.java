package gamePackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewCropMarket extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textAmount;
	private int amount;
	private boolean valid;



	/**
	 * Create the dialog.
	 */
	public ViewCropMarket(GameEnvironment game, JFrame window, CropMarket cropMarket) {
		super(window, "Cassie's Crop Market", true);
		setResizable(false);
		setBounds(100, 100, 450, 344);
		getContentPane().setLayout(null);
		{
			JTextPane txtpnWelcomeToToms = new JTextPane();
			txtpnWelcomeToToms.setEditable(false);
			txtpnWelcomeToToms.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtpnWelcomeToToms.setText("Welcome to Cassie's Crop Market!");
			txtpnWelcomeToToms.setBounds(66, 11, 315, 31);
			getContentPane().add(txtpnWelcomeToToms);
		}
		{
			JTextPane txtpnWhatWouldYou = new JTextPane();
			txtpnWhatWouldYou.setEditable(false);
			txtpnWhatWouldYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtpnWhatWouldYou.setText("What would you like to buy?");
			txtpnWhatWouldYou.setBounds(10, 44, 183, 23);
			getContentPane().add(txtpnWhatWouldYou);
		}
		
		// Show Money
		JLabel lblNewLabel = new JLabel("You currently have $");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(256, 44, 128, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(376, 44, 29, 23);
		getContentPane().add(money);
		{
			JPanel panel = new JPanel();
			panel.setBounds(232, 69, 173, 225);
			getContentPane().add(panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{291, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			
			textAmount = new JTextField();
			textAmount.setBounds(59, 110, 64, 20);
			getContentPane().add(textAmount);
			textAmount.setColumns(10);
			
			{
				// Buy avocado
				JButton buyAvocado = new JButton("Buy Avocado");
				buyAvocado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyAvocado(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyAvocado = new GridBagConstraints();
				gbc_buyAvocado.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyAvocado.insets = new Insets(0, 0, 5, 0);
				gbc_buyAvocado.gridx = 0;
				gbc_buyAvocado.gridy = 0;
				panel.add(buyAvocado, gbc_buyAvocado);
			}
			{
				// Buy corn
				JButton buyCorn = new JButton("Buy Corn");
				buyCorn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyCorn(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyCorn = new GridBagConstraints();
				gbc_buyCorn.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyCorn.insets = new Insets(0, 0, 5, 0);
				gbc_buyCorn.gridx = 0;
				gbc_buyCorn.gridy = 1;
				panel.add(buyCorn, gbc_buyCorn);
			}
			{
				// Buy wheat
				JButton buyWheat = new JButton("Buy Wheat");
				buyWheat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyWheat(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyWheat = new GridBagConstraints();
				gbc_buyWheat.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyWheat.insets = new Insets(0, 0, 5, 0);
				gbc_buyWheat.gridx = 0;
				gbc_buyWheat.gridy = 2;
				panel.add(buyWheat, gbc_buyWheat);
			}
			{
				// Buy potato
				JButton buyPotato = new JButton("Buy Potato");
				buyPotato.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyPotato(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyPotato = new GridBagConstraints();
				gbc_buyPotato.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyPotato.insets = new Insets(0, 0, 5, 0);
				gbc_buyPotato.gridx = 0;
				gbc_buyPotato.gridy = 3;
				panel.add(buyPotato, gbc_buyPotato);
			}
			{
				// Buy carrot
				JButton buyCarrot = new JButton("Buy Carrot");
				buyCarrot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyCarrot(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyCarrot = new GridBagConstraints();
				gbc_buyCarrot.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyCarrot.insets = new Insets(0, 0, 5, 0);
				gbc_buyCarrot.gridx = 0;
				gbc_buyCarrot.gridy = 4;
				panel.add(buyCarrot, gbc_buyCarrot);
			}
			{
				// Buy apple
				JButton buyApple = new JButton("Buy Apple");
				buyApple.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyApple(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyApple = new GridBagConstraints();
				gbc_buyApple.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyApple.insets = new Insets(0, 0, 5, 0);
				gbc_buyApple.gridx = 0;
				gbc_buyApple.gridy = 5;
				panel.add(buyApple, gbc_buyApple);
			}
			{
				// Buy animal feed
				JButton buyAnimalFeed = new JButton("Buy Animal Feed");
				buyAnimalFeed.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyAnimalFeed(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));

						}
					}
				});
				GridBagConstraints gbc_buyAnimalFeed = new GridBagConstraints();
				gbc_buyAnimalFeed.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyAnimalFeed.insets = new Insets(0, 0, 5, 0);
				gbc_buyAnimalFeed.gridx = 0;
				gbc_buyAnimalFeed.gridy = 6;
				panel.add(buyAnimalFeed, gbc_buyAnimalFeed);
			}
		}
		{
			JTextPane txtpnEnterAmountBefore = new JTextPane();
			txtpnEnterAmountBefore.setEditable(false);
			txtpnEnterAmountBefore.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnEnterAmountBefore.setText("Enter amount before buying");
			txtpnEnterAmountBefore.setBounds(10, 78, 163, 21);
			getContentPane().add(txtpnEnterAmountBefore);
		}
		
		// Button/error label to enter and check amount
		{
			JLabel error = new JLabel("");
			error.setHorizontalAlignment(SwingConstants.CENTER);
			error.setBounds(10, 168, 163, 20);
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
			enter.setBounds(43, 134, 97, 23);
			getContentPane().add(enter);
		}
		
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(43, 213, 97, 23);
		getContentPane().add(exitButton);
		
				
		
				exitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
	}
}

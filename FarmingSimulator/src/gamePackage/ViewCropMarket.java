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
import java.awt.Dimension;

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
		setBounds(100, 100, 540, 344);
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
		lblNewLabel.setBounds(24, 257, 128, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(144, 257, 29, 23);
		getContentPane().add(money);
		{
			JPanel buyPanel = new JPanel();
			buyPanel.setBounds(232, 80, 173, 225);
			getContentPane().add(buyPanel);
			GridBagLayout gbl_buyPanel = new GridBagLayout();
			gbl_buyPanel.columnWidths = new int[]{291, 0};
			gbl_buyPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_buyPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_buyPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			buyPanel.setLayout(gbl_buyPanel);
			
			textAmount = new JTextField();
			textAmount.setBounds(59, 110, 64, 20);
			getContentPane().add(textAmount);
			textAmount.setColumns(10);
			
			
			JPanel countPanel = new JPanel();
			countPanel.setBounds(417, 80, 97, 225);
			getContentPane().add(countPanel);
			GridBagLayout gbl_countPanel = new GridBagLayout();
			gbl_countPanel.columnWidths = new int[]{291, 0};
			gbl_countPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_countPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_countPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			countPanel.setLayout(gbl_countPanel);
				
			JLabel avocadoCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Avocado")));
			avocadoCount.setMinimumSize(new Dimension(46, 23));
			avocadoCount.setMaximumSize(new Dimension(46, 23));
			GridBagConstraints gbc_avocadoCount = new GridBagConstraints();
			gbc_avocadoCount.insets = new Insets(0, 0, 5, 0);
			gbc_avocadoCount.gridx = 0;
			gbc_avocadoCount.gridy = 0;
			countPanel.add(avocadoCount, gbc_avocadoCount);
		
		
			JLabel cornCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Corn")));
			cornCount.setMinimumSize(new Dimension(46, 23));
			cornCount.setMaximumSize(new Dimension(46, 23));
			cornCount.setPreferredSize(new Dimension(46, 23));
			GridBagConstraints gbc_cornCount = new GridBagConstraints();
			gbc_cornCount.insets = new Insets(0, 0, 5, 0);
			gbc_cornCount.gridx = 0;
			gbc_cornCount.gridy = 1;
			countPanel.add(cornCount, gbc_cornCount);
		
		
			JLabel wheatCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Wheat")));
			wheatCount.setMinimumSize(new Dimension(46, 23));
			wheatCount.setMaximumSize(new Dimension(46, 23));
			wheatCount.setPreferredSize(new Dimension(46, 23));
			GridBagConstraints gbc_wheatCount = new GridBagConstraints();
			gbc_wheatCount.insets = new Insets(0, 0, 5, 0);
			gbc_wheatCount.gridx = 0;
			gbc_wheatCount.gridy = 2;
			countPanel.add(wheatCount, gbc_wheatCount);
		
		
			JLabel potatoCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Potato")));
			potatoCount.setMinimumSize(new Dimension(46, 23));
			potatoCount.setMaximumSize(new Dimension(46, 23));
			potatoCount.setPreferredSize(new Dimension(46, 23));
			GridBagConstraints gbc_potatoCount = new GridBagConstraints();
			gbc_potatoCount.insets = new Insets(0, 0, 5, 0);
			gbc_potatoCount.gridx = 0;
			gbc_potatoCount.gridy = 3;
			countPanel.add(potatoCount, gbc_potatoCount);
		
		
			JLabel carrotCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Carrot")));
			carrotCount.setMinimumSize(new Dimension(46, 23));
			carrotCount.setMaximumSize(new Dimension(46, 23));
			carrotCount.setPreferredSize(new Dimension(46, 23));
			GridBagConstraints gbc_carrotCount = new GridBagConstraints();
			gbc_carrotCount.insets = new Insets(0, 0, 5, 0);
			gbc_carrotCount.gridx = 0;
			gbc_carrotCount.gridy = 4;
			countPanel.add(carrotCount, gbc_carrotCount);
		
		
			JLabel appleCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Apple")));
			appleCount.setMinimumSize(new Dimension(46, 23));
			appleCount.setMaximumSize(new Dimension(46, 23));
			appleCount.setPreferredSize(new Dimension(46, 23));
			GridBagConstraints gbc_appleCount = new GridBagConstraints();
			gbc_appleCount.insets = new Insets(0, 0, 5, 0);
			gbc_appleCount.gridx = 0;
			gbc_appleCount.gridy = 5;
			countPanel.add(appleCount, gbc_appleCount);
		
		
			JLabel animalFeedCount = new JLabel(Integer.toString(game.farm.getAnimalFeed()));
			animalFeedCount.setMinimumSize(new Dimension(46, 23));
			animalFeedCount.setMaximumSize(new Dimension(46, 23));
			animalFeedCount.setPreferredSize(new Dimension(46, 23));
			GridBagConstraints gbc_animalFeedCount = new GridBagConstraints();
			gbc_animalFeedCount.insets = new Insets(0, 0, 5, 0);
			gbc_animalFeedCount.gridx = 0;
			gbc_animalFeedCount.gridy = 6;
			countPanel.add(animalFeedCount, gbc_animalFeedCount);
		
			
			{
				JLabel youHave = new JLabel("You have:");
				youHave.setHorizontalAlignment(SwingConstants.CENTER);
				youHave.setBounds(417, 58, 97, 23);
				getContentPane().add(youHave);
			}
			
			{
				// Buy avocado
				JButton buyAvocado = new JButton("Buy Avocado");
				buyAvocado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyAvocado(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							avocadoCount.setText(Integer.toString(game.farm.cropInventory.get("Avocado")));
						}
					}
				});
				GridBagConstraints gbc_buyAvocado = new GridBagConstraints();
				gbc_buyAvocado.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyAvocado.insets = new Insets(0, 0, 5, 0);
				gbc_buyAvocado.gridx = 0;
				gbc_buyAvocado.gridy = 0;
				buyPanel.add(buyAvocado, gbc_buyAvocado);
			}
			{
				// Buy corn
				JButton buyCorn = new JButton("Buy Corn");
				buyCorn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyCorn(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							cornCount.setText(Integer.toString(game.farm.cropInventory.get("Corn")));

						}
					}
				});
				GridBagConstraints gbc_buyCorn = new GridBagConstraints();
				gbc_buyCorn.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyCorn.insets = new Insets(0, 0, 5, 0);
				gbc_buyCorn.gridx = 0;
				gbc_buyCorn.gridy = 1;
				buyPanel.add(buyCorn, gbc_buyCorn);
			}
			{
				// Buy wheat
				JButton buyWheat = new JButton("Buy Wheat");
				buyWheat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyWheat(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							wheatCount.setText(Integer.toString(game.farm.cropInventory.get("Wheat")));

						}
					}
				});
				GridBagConstraints gbc_buyWheat = new GridBagConstraints();
				gbc_buyWheat.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyWheat.insets = new Insets(0, 0, 5, 0);
				gbc_buyWheat.gridx = 0;
				gbc_buyWheat.gridy = 2;
				buyPanel.add(buyWheat, gbc_buyWheat);
			}
			{
				// Buy potato
				JButton buyPotato = new JButton("Buy Potato");
				buyPotato.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyPotato(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							potatoCount.setText(Integer.toString(game.farm.cropInventory.get("Potato")));


						}
					}
				});
				GridBagConstraints gbc_buyPotato = new GridBagConstraints();
				gbc_buyPotato.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyPotato.insets = new Insets(0, 0, 5, 0);
				gbc_buyPotato.gridx = 0;
				gbc_buyPotato.gridy = 3;
				buyPanel.add(buyPotato, gbc_buyPotato);
			}
			{
				// Buy carrot
				JButton buyCarrot = new JButton("Buy Carrot");
				buyCarrot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyCarrot(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							carrotCount.setText(Integer.toString(game.farm.cropInventory.get("Carrot")));


						}
					}
				});
				GridBagConstraints gbc_buyCarrot = new GridBagConstraints();
				gbc_buyCarrot.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyCarrot.insets = new Insets(0, 0, 5, 0);
				gbc_buyCarrot.gridx = 0;
				gbc_buyCarrot.gridy = 4;
				buyPanel.add(buyCarrot, gbc_buyCarrot);
			}
			{
				// Buy apple
				JButton buyApple = new JButton("Buy Apple");
				buyApple.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyApple(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							appleCount.setText(Integer.toString(game.farm.cropInventory.get("Apple")));

						}
					}
				});
				GridBagConstraints gbc_buyApple = new GridBagConstraints();
				gbc_buyApple.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyApple.insets = new Insets(0, 0, 5, 0);
				gbc_buyApple.gridx = 0;
				gbc_buyApple.gridy = 5;
				buyPanel.add(buyApple, gbc_buyApple);
			}
			{
				// Buy animal feed
				JButton buyAnimalFeed = new JButton("Buy Animal Feed");
				buyAnimalFeed.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyAnimalFeed(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							animalFeedCount.setText(Integer.toString(game.farm.getAnimalFeed()));


						}
					}
				});
				GridBagConstraints gbc_buyAnimalFeed = new GridBagConstraints();
				gbc_buyAnimalFeed.fill = GridBagConstraints.HORIZONTAL;
				gbc_buyAnimalFeed.insets = new Insets(0, 0, 5, 0);
				gbc_buyAnimalFeed.gridx = 0;
				gbc_buyAnimalFeed.gridy = 6;
				buyPanel.add(buyAnimalFeed, gbc_buyAnimalFeed);
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

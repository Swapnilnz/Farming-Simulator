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
		setBounds(100, 100, 497, 378);
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
			txtpnWhatWouldYou.setBounds(10, 48, 183, 23);
			getContentPane().add(txtpnWhatWouldYou);
		}
		
		// Show Money
		JLabel lblYouCurrentlyHave = new JLabel("You currently have $");
		lblYouCurrentlyHave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYouCurrentlyHave.setBounds(24, 267, 128, 23);
		getContentPane().add(lblYouCurrentlyHave);
		
		JLabel money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(144, 267, 29, 23);
		getContentPane().add(money);
		{
			JPanel buyPanel = new JPanel();
			buyPanel.setBounds(208, 84, 173, 225);
			getContentPane().add(buyPanel);
			GridBagLayout gbl_buyPanel = new GridBagLayout();
			gbl_buyPanel.columnWidths = new int[]{291, 0};
			gbl_buyPanel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
			gbl_buyPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_buyPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
			buyPanel.setLayout(gbl_buyPanel);
			
			textAmount = new JTextField();
			textAmount.setBounds(59, 120, 64, 20);
			getContentPane().add(textAmount);
			textAmount.setColumns(10);
				
			
			JLabel avocadoCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Avocado")));
			avocadoCount.setBounds(391, 94, 46, 17);
			getContentPane().add(avocadoCount);
			avocadoCount.setHorizontalAlignment(SwingConstants.CENTER);
			avocadoCount.setMinimumSize(new Dimension(46, 23));
			avocadoCount.setMaximumSize(new Dimension(46, 23));
			
			JLabel cornCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Corn")));
			cornCount.setBounds(391, 121, 46, 23);
			getContentPane().add(cornCount);
			cornCount.setHorizontalAlignment(SwingConstants.CENTER);
			cornCount.setMinimumSize(new Dimension(46, 23));
			cornCount.setMaximumSize(new Dimension(46, 23));
			cornCount.setPreferredSize(new Dimension(46, 23));
					
					
			JLabel wheatCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Wheat")));
			wheatCount.setBounds(391, 152, 46, 23);
			getContentPane().add(wheatCount);
			wheatCount.setHorizontalAlignment(SwingConstants.CENTER);
			wheatCount.setMinimumSize(new Dimension(46, 23));
			wheatCount.setMaximumSize(new Dimension(46, 23));
			wheatCount.setPreferredSize(new Dimension(46, 23));
						
						
			JLabel potatoCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Potato")));
			potatoCount.setBounds(391, 182, 46, 23);
			getContentPane().add(potatoCount);
			potatoCount.setHorizontalAlignment(SwingConstants.CENTER);
			potatoCount.setMinimumSize(new Dimension(46, 23));
			potatoCount.setMaximumSize(new Dimension(46, 23));
			potatoCount.setPreferredSize(new Dimension(46, 23));
							
							
			JLabel carrotCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Carrot")));
			carrotCount.setBounds(391, 214, 46, 23);
			getContentPane().add(carrotCount);
			carrotCount.setHorizontalAlignment(SwingConstants.CENTER);
			carrotCount.setMinimumSize(new Dimension(46, 23));
			carrotCount.setMaximumSize(new Dimension(46, 23));
			carrotCount.setPreferredSize(new Dimension(46, 23));
								
								
			JLabel appleCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Apple")));
			appleCount.setBounds(391, 246, 46, 23);
			getContentPane().add(appleCount);
			appleCount.setHorizontalAlignment(SwingConstants.CENTER);
			appleCount.setMinimumSize(new Dimension(46, 23));
			appleCount.setMaximumSize(new Dimension(46, 23));
			appleCount.setPreferredSize(new Dimension(46, 23));
									
									
			JLabel animalFeedCount = new JLabel(Integer.toString(game.farm.getAnimalFeed()));
			animalFeedCount.setBounds(391, 278, 46, 23);
			getContentPane().add(animalFeedCount);
			animalFeedCount.setHorizontalAlignment(SwingConstants.CENTER);
			animalFeedCount.setMinimumSize(new Dimension(46, 23));
			animalFeedCount.setMaximumSize(new Dimension(46, 23));
			animalFeedCount.setPreferredSize(new Dimension(46, 23));
			
			{
				JLabel youHave = new JLabel("You have:");
				youHave.setHorizontalAlignment(SwingConstants.CENTER);
				youHave.setBounds(363, 53, 97, 23);
				getContentPane().add(youHave);
			}
			
			{
				// Buy avocado
				JButton buyAvocado = new JButton("Buy Avocado ($" + cropMarket.cropPurchaseDic.get("Avocado") + ")");
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
				JButton buyCorn = new JButton("Buy Corn ($" + cropMarket.cropPurchaseDic.get("Corn") + ")");
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
				JButton buyWheat = new JButton("Buy Wheat ($" + cropMarket.cropPurchaseDic.get("Wheat") + ")");
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
				JButton buyPotato = new JButton("Buy Potato ($" + cropMarket.cropPurchaseDic.get("Potato") + ")");
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
				JButton buyCarrot = new JButton("Buy Carrot ($" + cropMarket.cropPurchaseDic.get("Carrot") + ")");
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
				JButton buyApple = new JButton("Buy Apple ($" + cropMarket.cropPurchaseDic.get("Apple") + ")");
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
				JButton buyAnimalFeed = new JButton("Buy Animal Feed ($" + cropMarket.cropPurchaseDic.get("Animal Feed") + ")");
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
			txtpnEnterAmountBefore.setBounds(10, 88, 163, 21);
			getContentPane().add(txtpnEnterAmountBefore);
		}
		
		// Button/error label to enter and check amount
		{
			JLabel error = new JLabel("");
			error.setHorizontalAlignment(SwingConstants.CENTER);
			error.setBounds(10, 178, 163, 20);
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
			enter.setBounds(43, 144, 97, 23);
			getContentPane().add(enter);
		}
		
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(43, 223, 97, 23);
		getContentPane().add(exitButton);
		
		
		
		
				
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

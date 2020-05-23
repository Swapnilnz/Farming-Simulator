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
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

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
		setBounds(100, 100, 497, 378);
		getContentPane().setLayout(null);
		{
			JTextPane txtpnWelcomeToToms = new JTextPane();
			txtpnWelcomeToToms.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			txtpnWelcomeToToms.setBackground(new Color(233, 150, 122));
			txtpnWelcomeToToms.setEditable(false);
			txtpnWelcomeToToms.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtpnWelcomeToToms.setText("Welcome to Cassie's Crop Market!");
			txtpnWelcomeToToms.setBounds(10, 11, 315, 31);
			getContentPane().add(txtpnWelcomeToToms);
		}
		{
			JTextPane txtpnWhatWouldYou = new JTextPane();
			txtpnWhatWouldYou.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			txtpnWhatWouldYou.setBackground(new Color(233, 150, 122));
			txtpnWhatWouldYou.setEditable(false);
			txtpnWhatWouldYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtpnWhatWouldYou.setText("What would you like to buy?");
			txtpnWhatWouldYou.setBounds(20, 53, 183, 23);
			getContentPane().add(txtpnWhatWouldYou);
		}
		
		// Show Money
		JLabel lblYouCurrentlyHave = new JLabel("You currently have $");
		lblYouCurrentlyHave.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblYouCurrentlyHave.setHorizontalTextPosition(SwingConstants.CENTER);
		lblYouCurrentlyHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouCurrentlyHave.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
		lblYouCurrentlyHave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYouCurrentlyHave.setBounds(40, 267, 163, 23);
		getContentPane().add(lblYouCurrentlyHave);
		
		JLabel money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(144, 267, 29, 23);
		getContentPane().add(money);
		{
			
			textAmount = new JTextField();
			textAmount.setBounds(89, 168, 64, 20);
			getContentPane().add(textAmount);
			textAmount.setColumns(10);
				
			
			JLabel avocadoCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Avocado")));
			avocadoCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			avocadoCount.setHorizontalTextPosition(SwingConstants.CENTER);
			avocadoCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			avocadoCount.setBounds(414, 112, 46, 20);
			getContentPane().add(avocadoCount);
			avocadoCount.setHorizontalAlignment(SwingConstants.CENTER);
			avocadoCount.setMinimumSize(new Dimension(46, 23));
			avocadoCount.setMaximumSize(new Dimension(46, 23));
			
			JLabel cornCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Corn")));
			cornCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			cornCount.setHorizontalTextPosition(SwingConstants.CENTER);
			cornCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			cornCount.setBounds(414, 145, 46, 20);
			getContentPane().add(cornCount);
			cornCount.setHorizontalAlignment(SwingConstants.CENTER);
			cornCount.setMinimumSize(new Dimension(46, 23));
			cornCount.setMaximumSize(new Dimension(46, 23));
			cornCount.setPreferredSize(new Dimension(46, 23));
					
					
			JLabel wheatCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Wheat")));
			wheatCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			wheatCount.setHorizontalTextPosition(SwingConstants.CENTER);
			wheatCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			wheatCount.setBounds(414, 180, 46, 20);
			getContentPane().add(wheatCount);
			wheatCount.setHorizontalAlignment(SwingConstants.CENTER);
			wheatCount.setMinimumSize(new Dimension(46, 23));
			wheatCount.setMaximumSize(new Dimension(46, 23));
			wheatCount.setPreferredSize(new Dimension(46, 23));
						
						
			JLabel potatoCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Potato")));
			potatoCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			potatoCount.setHorizontalTextPosition(SwingConstants.CENTER);
			potatoCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			potatoCount.setBounds(414, 214, 46, 20);
			getContentPane().add(potatoCount);
			potatoCount.setHorizontalAlignment(SwingConstants.CENTER);
			potatoCount.setMinimumSize(new Dimension(46, 23));
			potatoCount.setMaximumSize(new Dimension(46, 23));
			potatoCount.setPreferredSize(new Dimension(46, 23));
							
							
			JLabel carrotCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Carrot")));
			carrotCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			carrotCount.setHorizontalTextPosition(SwingConstants.CENTER);
			carrotCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			carrotCount.setBounds(414, 246, 46, 20);
			getContentPane().add(carrotCount);
			carrotCount.setHorizontalAlignment(SwingConstants.CENTER);
			carrotCount.setMinimumSize(new Dimension(46, 23));
			carrotCount.setMaximumSize(new Dimension(46, 23));
			carrotCount.setPreferredSize(new Dimension(46, 23));
								
								
			JLabel appleCount = new JLabel(Integer.toString(game.farm.cropInventory.get("Apple")));
			appleCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			appleCount.setHorizontalTextPosition(SwingConstants.CENTER);
			appleCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			appleCount.setBounds(414, 276, 46, 20);
			getContentPane().add(appleCount);
			appleCount.setHorizontalAlignment(SwingConstants.CENTER);
			appleCount.setMinimumSize(new Dimension(46, 23));
			appleCount.setMaximumSize(new Dimension(46, 23));
			appleCount.setPreferredSize(new Dimension(46, 23));
									
									
			JLabel animalFeedCount = new JLabel(Integer.toString(game.farm.getAnimalFeed()));
			animalFeedCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			animalFeedCount.setHorizontalTextPosition(SwingConstants.CENTER);
			animalFeedCount.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			animalFeedCount.setBounds(414, 306, 46, 20);
			getContentPane().add(animalFeedCount);
			animalFeedCount.setHorizontalAlignment(SwingConstants.CENTER);
			animalFeedCount.setMinimumSize(new Dimension(46, 23));
			animalFeedCount.setMaximumSize(new Dimension(46, 23));
			animalFeedCount.setPreferredSize(new Dimension(46, 23));
			
			{
				JLabel youHave = new JLabel("You have:");
				youHave.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
				youHave.setHorizontalTextPosition(SwingConstants.CENTER);
				youHave.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				youHave.setHorizontalAlignment(SwingConstants.CENTER);
				youHave.setBounds(372, 78, 97, 23);
				getContentPane().add(youHave);
			}
			
			{
				// Buy avocado
				JButton buyAvocado = new JButton("Buy Avocado ($" + cropMarket.cropPurchaseDic.get("Avocado") + ")");
				buyAvocado.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyAvocado.setHorizontalTextPosition(SwingConstants.CENTER);
				buyAvocado.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyAvocado.setBounds(241, 112, 163, 20);
				getContentPane().add(buyAvocado);
				buyAvocado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyAvocado(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							avocadoCount.setText(Integer.toString(game.farm.cropInventory.get("Avocado")));
						}
					}
				});
				

			}
			{
				// Buy corn
				JButton buyCorn = new JButton("Buy Corn ($" + cropMarket.cropPurchaseDic.get("Corn") + ")");
				buyCorn.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyCorn.setHorizontalTextPosition(SwingConstants.CENTER);
				buyCorn.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyCorn.setBounds(241, 145, 163, 20);
				getContentPane().add(buyCorn);
				buyCorn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyCorn(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							cornCount.setText(Integer.toString(game.farm.cropInventory.get("Corn")));

						}
					}
				});

			}
			{
				// Buy wheat
				JButton buyWheat = new JButton("Buy Wheat ($" + cropMarket.cropPurchaseDic.get("Wheat") + ")");
				buyWheat.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyWheat.setHorizontalTextPosition(SwingConstants.CENTER);
				buyWheat.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyWheat.setBounds(241, 180, 163, 20);
				getContentPane().add(buyWheat);
				buyWheat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyWheat(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							wheatCount.setText(Integer.toString(game.farm.cropInventory.get("Wheat")));

						}
					}
				});

			}
			{
				// Buy potato
				JButton buyPotato = new JButton("Buy Potato ($" + cropMarket.cropPurchaseDic.get("Potato") + ")");
				buyPotato.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyPotato.setHorizontalTextPosition(SwingConstants.CENTER);
				buyPotato.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyPotato.setBounds(241, 214, 163, 20);
				getContentPane().add(buyPotato);
				buyPotato.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyPotato(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							potatoCount.setText(Integer.toString(game.farm.cropInventory.get("Potato")));


						}
					}
				});
			}
			{
				// Buy carrot
				JButton buyCarrot = new JButton("Buy Carrot ($" + cropMarket.cropPurchaseDic.get("Carrot") + ")");
				buyCarrot.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyCarrot.setHorizontalTextPosition(SwingConstants.CENTER);
				buyCarrot.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyCarrot.setBounds(241, 246, 163, 20);
				getContentPane().add(buyCarrot);
				buyCarrot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyCarrot(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							carrotCount.setText(Integer.toString(game.farm.cropInventory.get("Carrot")));


						}
					}
				});

			}
			{
				// Buy apple
				JButton buyApple = new JButton("Buy Apple ($" + cropMarket.cropPurchaseDic.get("Apple") + ")");
				buyApple.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyApple.setHorizontalTextPosition(SwingConstants.CENTER);
				buyApple.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyApple.setBounds(241, 276, 163, 20);
				getContentPane().add(buyApple);
				buyApple.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyApple(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							appleCount.setText(Integer.toString(game.farm.cropInventory.get("Apple")));

						}
					}
				});
			}
			{
				// Buy animal feed
				JButton buyAnimalFeed = new JButton("Buy Animal Feed ($" + cropMarket.cropPurchaseDic.get("Animal Feed") + ")");
				buyAnimalFeed.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
				buyAnimalFeed.setHorizontalTextPosition(SwingConstants.CENTER);
				buyAnimalFeed.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
				buyAnimalFeed.setBounds(241, 306, 163, 20);
				getContentPane().add(buyAnimalFeed);
				buyAnimalFeed.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (valid) {
							cropMarket.buyAnimalFeed(game, amount, window);
							money.setText(Integer.toString(game.farm.getFarmMoney()));
							animalFeedCount.setText(Integer.toString(game.farm.getAnimalFeed()));


						}
					}
				});
			}
		}
		{
			JTextPane txtpnEnterAmountBefore = new JTextPane();
			txtpnEnterAmountBefore.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			txtpnEnterAmountBefore.setBackground(new Color(233, 150, 122));
			txtpnEnterAmountBefore.setEditable(false);
			txtpnEnterAmountBefore.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnEnterAmountBefore.setText("Enter amount before buying");
			txtpnEnterAmountBefore.setBounds(40, 126, 163, 21);
			getContentPane().add(txtpnEnterAmountBefore);
		}
		
		// Button/error label to enter and check amount
		{
			JLabel error = new JLabel("");
			error.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			error.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
			error.setHorizontalAlignment(SwingConstants.CENTER);
			error.setBounds(40, 226, 163, 20);
			getContentPane().add(error);
			
			JButton enter = new JButton("Enter");
			enter.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
			enter.setHorizontalTextPosition(SwingConstants.CENTER);
			enter.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
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
			enter.setBounds(73, 192, 97, 23);
			getContentPane().add(enter);
		}
		
		JButton exitButton = new JButton("Exit");
		exitButton.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/button.jpg")));
		exitButton.setBounds(372, 11, 97, 23);
		getContentPane().add(exitButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewCropMarket.class.getResource("/images/cropMarketBackground.png")));
		lblNewLabel.setBounds(0, 0, 491, 349);
		getContentPane().add(lblNewLabel);
		
		
		
		
				
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

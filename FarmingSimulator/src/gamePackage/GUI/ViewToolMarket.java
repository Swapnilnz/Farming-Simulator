package gamePackage.GUI;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

import gamePackage.GameEnvironment;
import gamePackage.ToolMarket;

/**
 * View tool market, allows buying of utility items
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class ViewToolMarket extends JDialog {


	/**
	 * Create the tool market
	 * @param game main game
	 * @param window main window
	 * @param toolMarket tool market instance
	 */
	public ViewToolMarket(GameEnvironment game, JFrame window, ToolMarket toolMarket) {
		super(window, "Tom's Tool Market", true);
		setResizable(false);
		setBounds(100, 100, 468, 393);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/sheep.png")));
		label.setBounds(296, 261, 53, 40);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/portalImage.png")));
		lblNewLabel.setBounds(85, 248, 53, 53);
		getContentPane().add(lblNewLabel);
		
		// Images
		JLabel cowImage = new JLabel("");
		cowImage.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/cowImage.png")));
		cowImage.setBounds(296, 167, 53, 40);
		getContentPane().add(cowImage);
		
		JLabel wateringCanImage = new JLabel("");
		wateringCanImage.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/wateringcanImage.png")));
		wateringCanImage.setBounds(85, 167, 53, 40);
		getContentPane().add(wateringCanImage);
		
		JLabel animalStatueImage = new JLabel("");
		animalStatueImage.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/animalStatue-removebg-preview.png")));
		animalStatueImage.setBounds(296, 84, 53, 40);
		getContentPane().add(animalStatueImage);
		
		JLabel harvesterImage = new JLabel("");
		harvesterImage.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/harvesterr.png")));
		harvesterImage.setBounds(45, 84, 130, 40);
		getContentPane().add(harvesterImage);
		
		{
			JTextPane txtpnWelcomeToToms = new JTextPane();
			txtpnWelcomeToToms.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			txtpnWelcomeToToms.setBackground(new Color(233, 150, 122));
			txtpnWelcomeToToms.setEditable(false);
			txtpnWelcomeToToms.setFont(new Font("Tahoma", Font.BOLD, 20));
			txtpnWelcomeToToms.setText("Welcome to Tom's Tool Market!");
			txtpnWelcomeToToms.setBounds(10, 11, 322, 31);
			getContentPane().add(txtpnWelcomeToToms);
		}
		{
			JTextPane txtpnWhatWouldYou = new JTextPane();
			txtpnWhatWouldYou.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			txtpnWhatWouldYou.setBackground(new Color(233, 150, 122));
			txtpnWhatWouldYou.setEditable(false);
			txtpnWhatWouldYou.setFont(new Font("Tahoma", Font.BOLD, 14));
			txtpnWhatWouldYou.setText("What would you like to buy?");
			txtpnWhatWouldYou.setBounds(10, 57, 204, 23);
			getContentPane().add(txtpnWhatWouldYou);
		}

		// Harvester owned
		JLabel harvesterCount = new JLabel("Not Owned");
		harvesterCount.setFont(new Font("Tahoma", Font.BOLD, 11));
		harvesterCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		harvesterCount.setHorizontalTextPosition(SwingConstants.CENTER);
		harvesterCount.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		harvesterCount.setHorizontalAlignment(SwingConstants.CENTER);
		harvesterCount.setBounds(75, 147, 71, 14);
		getContentPane().add(harvesterCount);
		
		// Animal Statue owned
		JLabel animalStatueCount = new JLabel("Not Owned");
		animalStatueCount.setFont(new Font("Tahoma", Font.BOLD, 11));
		animalStatueCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		animalStatueCount.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		animalStatueCount.setHorizontalTextPosition(SwingConstants.CENTER);
		animalStatueCount.setHorizontalAlignment(SwingConstants.CENTER);
		animalStatueCount.setBounds(289, 147, 71, 14);
		getContentPane().add(animalStatueCount);
		
		// Ultimate Watering Can owned
		JLabel canCount = new JLabel("Not Owned");
		canCount.setFont(new Font("Tahoma", Font.BOLD, 11));
		canCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		canCount.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		canCount.setHorizontalTextPosition(SwingConstants.CENTER);
		canCount.setHorizontalAlignment(SwingConstants.CENTER);
		canCount.setBounds(75, 230, 71, 14);
		getContentPane().add(canCount);
		
		// Milk Master owned
		JLabel milkCount = new JLabel("Not Owned");
		milkCount.setFont(new Font("Tahoma", Font.BOLD, 11));
		milkCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		milkCount.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		milkCount.setHorizontalTextPosition(SwingConstants.CENTER);
		milkCount.setHorizontalAlignment(SwingConstants.CENTER);
		milkCount.setBounds(289, 230, 71, 14);
		getContentPane().add(milkCount);
		
		// Teleportation pad owned, if so how many
		JLabel telePadCount = new JLabel("Not Owned");
		telePadCount.setFont(new Font("Tahoma", Font.BOLD, 11));
		telePadCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		telePadCount.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		telePadCount.setHorizontalTextPosition(SwingConstants.CENTER);
		telePadCount.setHorizontalAlignment(SwingConstants.CENTER);
		telePadCount.setBounds(75, 323, 71, 14);
		getContentPane().add(telePadCount);
		
		// Shear Master owned
		JLabel shearCount = new JLabel("Not Owned");
		shearCount.setFont(new Font("Tahoma", Font.BOLD, 11));
		shearCount.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		shearCount.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		shearCount.setHorizontalTextPosition(SwingConstants.CENTER);
		shearCount.setHorizontalAlignment(SwingConstants.CENTER);
		shearCount.setBounds(289, 323, 71, 14);
		getContentPane().add(shearCount);
		
		// Show Money
		JLabel lblYouCurrentlyHave = new JLabel("You currently have $" + game.farm.getFarmMoney());
		lblYouCurrentlyHave.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblYouCurrentlyHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouCurrentlyHave.setHorizontalTextPosition(SwingConstants.CENTER);
		lblYouCurrentlyHave.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/button.jpg")));
		lblYouCurrentlyHave.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYouCurrentlyHave.setBounds(230, 57, 183, 23);
		getContentPane().add(lblYouCurrentlyHave);
		

		{
			// Buy Harvester
			JButton btnBuyHarvester = new JButton("Buy Harvester: $" + toolMarket.getHarvesterPrice());
			btnBuyHarvester.setBackground(new Color(210, 180, 140));
			btnBuyHarvester.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			btnBuyHarvester.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBuyHarvester.setVerticalTextPosition(JButton.CENTER);
			btnBuyHarvester.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyHarvester(game, window);
					if (game.farm.getItemList().contains("Harvester")) {
						harvesterCount.setText("Owned");
						lblYouCurrentlyHave.setText("You currently have $" + game.farm.getFarmMoney());
					}
				}
			});
			btnBuyHarvester.setToolTipText("Harvests one random crop at the end of the day");
			btnBuyHarvester.setBounds(21, 125, 183, 23);
			getContentPane().add(btnBuyHarvester);
		}
		{
			// Buy Animal Statue
			JButton btnBuyAnimalStatue = new JButton("Buy Animal Statue: $" + toolMarket.getAnimalStatuePrice());
			btnBuyAnimalStatue.setBackground(new Color(210, 180, 140));
			btnBuyAnimalStatue.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			btnBuyAnimalStatue.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBuyAnimalStatue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyAnimalStatue(game, window);
					if (game.farm.getItemList().contains("Animal Statue")) {
						animalStatueCount.setText("Owned");
						lblYouCurrentlyHave.setText("You currently have $" + game.farm.getFarmMoney());

					}

				}
			});
			btnBuyAnimalStatue.setToolTipText("Animals will see that they are worshipped and will not lose happiness at the end of the day");
			btnBuyAnimalStatue.setBounds(230, 125, 183, 23);
			getContentPane().add(btnBuyAnimalStatue);
		}
		{
			// Buy Milk Master
			JButton btnBuyMilkMaster = new JButton("Buy Milk Master: $" + toolMarket.getMilkMasterPrice());
			btnBuyMilkMaster.setBackground(new Color(210, 180, 140));
			btnBuyMilkMaster.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			btnBuyMilkMaster.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBuyMilkMaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyMilkMaster(game, window);
					if (game.farm.getItemList().contains("Milk Master")) {
						milkCount.setText("Owned");
						lblYouCurrentlyHave.setText("You currently have $" + game.farm.getFarmMoney());

					}
				}
			});
			btnBuyMilkMaster.setToolTipText("Automates milking of cows on farm ($5 per cow)");
			btnBuyMilkMaster.setBounds(230, 208, 183, 23);
			getContentPane().add(btnBuyMilkMaster);
		}
		{
			// Buy Shear Master
			JButton btnBuyShearMaster = new JButton("Buy Shear Master: $" + toolMarket.getShearMasterPrice());
			btnBuyShearMaster.setBackground(new Color(210, 180, 140));
			btnBuyShearMaster.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			btnBuyShearMaster.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBuyShearMaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyShearMaster(game, window);
					if (game.farm.getItemList().contains("Shear Master")) {
						shearCount.setText("Owned");
						lblYouCurrentlyHave.setText("You currently have $" + game.farm.getFarmMoney());

					}
				}
			});
			btnBuyShearMaster.setToolTipText("Automates shearing of sheep ($5 per sheep)");
			btnBuyShearMaster.setBounds(230, 301, 183, 23);
			getContentPane().add(btnBuyShearMaster);
		}
		{
			// Buy Watering Can
			JButton btnBuyWateringCan = new JButton("Buy Ultimate Watering Can: $" + toolMarket.getWateringCanPrice());
			btnBuyWateringCan.setBackground(new Color(210, 180, 140));
			btnBuyWateringCan.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			btnBuyWateringCan.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBuyWateringCan.setToolTipText("Doubles the effect of tending to crops!");
			btnBuyWateringCan.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyWateringCan(game, window);
					if (game.farm.getItemList().contains("Watering Can")) {
						canCount.setText("Owned");
						lblYouCurrentlyHave.setText("You currently have $" + game.farm.getFarmMoney());

					}
				}
			});
			btnBuyWateringCan.setBounds(21, 208, 183, 23);
			getContentPane().add(btnBuyWateringCan);
		}
		{
			// Buy Teleportation Pad
			JButton btnBuyTeleportationPad = new JButton("Buy Teleportation Pad: $" + toolMarket.getTeleportationPadPrice());
			btnBuyTeleportationPad.setBackground(new Color(210, 180, 140));
			btnBuyTeleportationPad.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			btnBuyTeleportationPad.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBuyTeleportationPad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyTeleportationPad(game, window);
					if (game.farm.getTelePadCount() > 0) {
						harvesterCount.setText(game.farm.getTelePadCount() + " Owned");
						lblYouCurrentlyHave.setText("You currently have $" + game.farm.getFarmMoney());

					}
				}
			});
			btnBuyTeleportationPad.setToolTipText("You can now teleport around our farm! (One extra action per day)");
			btnBuyTeleportationPad.setBounds(21, 301, 183, 23);
			getContentPane().add(btnBuyTeleportationPad);
		}
		
		// Exit
		JButton exitButton = new JButton("Exit");
		exitButton.setBackground(new Color(210, 180, 140));
		exitButton.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.setBounds(349, 19, 89, 23);
		getContentPane().add(exitButton);
		
		// Background
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ViewToolMarket.class.getResource("/images/toolMarketBackground.jpg")));
		background.setBounds(0, 0, 452, 354);
		getContentPane().add(background);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
}

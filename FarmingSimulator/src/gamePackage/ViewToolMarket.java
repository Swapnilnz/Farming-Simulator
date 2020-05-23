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
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ViewToolMarket extends JDialog {


	/**
	 * Create the dialog.
	 */
	public ViewToolMarket(GameEnvironment game, JFrame window, ToolMarket toolMarket) {
		super(window, "Tom's Tool Market", true);
		setBounds(100, 100, 468, 393);
		getContentPane().setLayout(null);
		{
			JTextPane txtpnWelcomeToToms = new JTextPane();
			txtpnWelcomeToToms.setEditable(false);
			txtpnWelcomeToToms.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtpnWelcomeToToms.setText("Welcome to Tom's Tool Market!");
			txtpnWelcomeToToms.setBounds(10, 11, 291, 31);
			getContentPane().add(txtpnWelcomeToToms);
		}
		{
			JTextPane txtpnWhatWouldYou = new JTextPane();
			txtpnWhatWouldYou.setEditable(false);
			txtpnWhatWouldYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtpnWhatWouldYou.setText("What would you like to buy?");
			txtpnWhatWouldYou.setBounds(10, 57, 183, 23);
			getContentPane().add(txtpnWhatWouldYou);
		}

		
		JLabel harvesterCount = new JLabel("Not Owned");
		harvesterCount.setHorizontalAlignment(SwingConstants.CENTER);
		harvesterCount.setBounds(21, 147, 183, 14);
		getContentPane().add(harvesterCount);
		
		JLabel animalStatueCount = new JLabel("Not Owned");
		animalStatueCount.setHorizontalAlignment(SwingConstants.CENTER);
		animalStatueCount.setBounds(230, 147, 183, 14);
		getContentPane().add(animalStatueCount);
		
		JLabel canCount = new JLabel("Not Owned");
		canCount.setHorizontalAlignment(SwingConstants.CENTER);
		canCount.setBounds(21, 229, 183, 14);
		getContentPane().add(canCount);
		
		JLabel milkCount = new JLabel("Not Owned");
		milkCount.setHorizontalAlignment(SwingConstants.CENTER);
		milkCount.setBounds(230, 229, 183, 14);
		getContentPane().add(milkCount);
		
		JLabel telePadCount = new JLabel("Not Owned");
		telePadCount.setHorizontalAlignment(SwingConstants.CENTER);
		telePadCount.setBounds(21, 324, 183, 14);
		getContentPane().add(telePadCount);
		
		JLabel shearCount = new JLabel("Not Owned");
		shearCount.setHorizontalAlignment(SwingConstants.CENTER);
		shearCount.setBounds(230, 324, 183, 14);
		getContentPane().add(shearCount);
		
		// Show Money
		JLabel lblNewLabel = new JLabel("You currently have $");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(252, 57, 128, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel money = new JLabel(Integer.toString(game.farm.getFarmMoney()));
		money.setFont(new Font("Tahoma", Font.PLAIN, 12));
		money.setBounds(372, 57, 29, 23);
		getContentPane().add(money);
		{
			// Buy Harvester
			JButton btnBuyHarvester = new JButton("Buy Harvester: $" + toolMarket.getHarvesterPrice());
			btnBuyHarvester.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyHarvester(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					if (game.farm.getItemList().contains("Harvester")) {
						harvesterCount.setText("Owned");
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
			btnBuyAnimalStatue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyAnimalStatue(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					if (game.farm.getItemList().contains("Animal Statue")) {
						animalStatueCount.setText("Owned");
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
			btnBuyMilkMaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyMilkMaster(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					if (game.farm.getItemList().contains("Milk Master")) {
						milkCount.setText("Owned");
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
			btnBuyShearMaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyShearMaster(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					if (game.farm.getItemList().contains("Shear Master")) {
						shearCount.setText("Owned");
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
			btnBuyWateringCan.setToolTipText("Doubles the effect of tending to crops!");
			btnBuyWateringCan.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyWateringCan(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					if (game.farm.getItemList().contains("Watering Can")) {
						canCount.setText("Owned");
					}
				}
			});
			btnBuyWateringCan.setBounds(21, 208, 183, 23);
			getContentPane().add(btnBuyWateringCan);
		}
		{
			// Buy Teleportation Pad
			JButton btnBuyTeleportationPad = new JButton("Buy Teleportation Pad: $" + toolMarket.getTeleportationPadPrice());
			btnBuyTeleportationPad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyTeleportationPad(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));
					if (game.farm.getTelePadCount() > 0) {
						harvesterCount.setText(game.farm.getTelePadCount() + " Owned");
					}
				}
			});
			btnBuyTeleportationPad.setToolTipText("You can now teleport around our farm! (One extra action per day)");
			btnBuyTeleportationPad.setBounds(21, 301, 183, 23);
			getContentPane().add(btnBuyTeleportationPad);
		}
		
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(335, 19, 89, 23);
		getContentPane().add(exitButton);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
}

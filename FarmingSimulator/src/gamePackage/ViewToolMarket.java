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

public class ViewToolMarket extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the dialog.
	 */
	public ViewToolMarket(GameEnvironment game, JFrame window, ToolMarket toolMarket) {
		super(window, "Tom's Tool Market", true);
		setBounds(100, 100, 450, 300);
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
					
				}
			});
			btnBuyHarvester.setToolTipText("Harvests one random crop at the end of the day");
			btnBuyHarvester.setBounds(21, 116, 183, 23);
			getContentPane().add(btnBuyHarvester);
		}
		{
			// Buy Animal Statue
			JButton btnBuyAnimalStatue = new JButton("Buy Animal Statue: $" + toolMarket.getAnimalStatuePrice());
			btnBuyAnimalStatue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyAnimalStatue(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));

				}
			});
			btnBuyAnimalStatue.setToolTipText("Animals will see that they are worshipped and will not lose happiness at the end of the day");
			btnBuyAnimalStatue.setBounds(230, 116, 183, 23);
			getContentPane().add(btnBuyAnimalStatue);
		}
		{
			// Buy Milk Master
			JButton btnBuyMilkMaster = new JButton("Buy Milk Master: $" + toolMarket.getMilkMasterPrice());
			btnBuyMilkMaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyMilkMaster(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));

				}
			});
			btnBuyMilkMaster.setToolTipText("Automates milking of cows on farm ($5 per cow)");
			btnBuyMilkMaster.setBounds(230, 173, 183, 23);
			getContentPane().add(btnBuyMilkMaster);
		}
		{
			// Buy Shear Master
			JButton btnBuyShearMaster = new JButton("Buy Shear Master: $" + toolMarket.getShearMasterPrice());
			btnBuyShearMaster.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyShearMaster(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));

				}
			});
			btnBuyShearMaster.setToolTipText("Automates shearing of sheep ($5 per sheep)");
			btnBuyShearMaster.setBounds(230, 227, 183, 23);
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

				}
			});
			btnBuyWateringCan.setBounds(21, 173, 183, 23);
			getContentPane().add(btnBuyWateringCan);
		}
		{
			// Buy Teleportation Pad
			JButton btnBuyTeleportationPad = new JButton("Buy Teleportation Pad: $" + toolMarket.getTeleportationPadPrice());
			btnBuyTeleportationPad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					toolMarket.buyTeleportationPad(game, window);
					money.setText(Integer.toString(game.farm.getFarmMoney()));

				}
			});
			btnBuyTeleportationPad.setToolTipText("You can now teleport around our farm! (One extra action per day)");
			btnBuyTeleportationPad.setBounds(21, 227, 183, 23);
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

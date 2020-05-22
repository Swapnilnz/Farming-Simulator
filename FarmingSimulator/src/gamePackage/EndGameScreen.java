package gamePackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EndGameScreen extends JDialog {


	/**
	 * Create the dialog.
	 */
	public EndGameScreen(GameEnvironment game) {
		setResizable(false);
		setTitle("Finished");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnYouFinishedThe = new JTextPane();
		txtpnYouFinishedThe.setEditable(false);
		txtpnYouFinishedThe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnYouFinishedThe.setText("You finished the game!");
		txtpnYouFinishedThe.setBounds(93, 24, 263, 37);
		getContentPane().add(txtpnYouFinishedThe);
		
		JLabel lblNewLabel = new JLabel("Farm name: " + game.farm.getFarmName());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 72, 444, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Game duration: " + game.getGameDuration() + " days");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(0, 107, 444, 37);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Over this time, you made $" + (game.farm.farmMoney - game.farm.staticFarmMoney));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(0, 142, 444, 37);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(2, 181, 444, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label_3 = new JLabel("Your score was: " + game.calculateScore());
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(0, 202, 444, 37);
		getContentPane().add(label_3);
		
		JLabel label_2 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		label_2.setBounds(0, 246, 444, 14);
		getContentPane().add(label_2);
		

	}
}

package gamePackage.GUI;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

import gamePackage.GameEnvironment;

/**
 * View farm money
 * @author Swapnil
 *
 */
public class ViewFarmMoney extends JDialog {

	
	/**
	 * Default serial version ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 * @param game main game
	 * @param window main window
	 */
	public ViewFarmMoney(GameEnvironment game, JFrame window) {
		super(window, "View Farm Money", true);
		setResizable(false);
		setBounds(100, 100, 442, 215);
		getContentPane().setLayout(null);
		
		JTextPane txtpnYourFarmCurrently = new JTextPane();
		txtpnYourFarmCurrently.setBackground(new Color(233, 150, 122));
		txtpnYourFarmCurrently.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		txtpnYourFarmCurrently.setEditable(false);
		txtpnYourFarmCurrently.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnYourFarmCurrently.setText("Your farm currently has");
		txtpnYourFarmCurrently.setBounds(83, 31, 274, 26);
		getContentPane().add(txtpnYourFarmCurrently);
	
		// Show current farm money
		JLabel lblMoney = new JLabel("$" + game.farm.getFarmMoney());
		lblMoney.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoney.setIcon(new ImageIcon(ViewFarmMoney.class.getResource("/images/button.jpg")));
		lblMoney.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMoney.setBounds(190, 69, 64, 37);
		getContentPane().add(lblMoney);
		
		// Exit
		JButton exitButton = new JButton("Exit");
		exitButton.setBackground(new Color(210, 180, 140));
		exitButton.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.setBounds(335, 151, 89, 23);
		getContentPane().add(exitButton);
		
		// Background
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ViewFarmMoney.class.getResource("/images/grassBackground.png")));
		background.setBounds(0, 0, 444, 195);
		getContentPane().add(background);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

}

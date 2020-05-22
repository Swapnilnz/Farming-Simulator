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

public class ViewFarmMoney extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the dialog.
	 */
	public ViewFarmMoney(GameEnvironment game, JFrame window) {
		super(window, "View Farm Money", true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnYourFarmCurrently = new JTextPane();
		txtpnYourFarmCurrently.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnYourFarmCurrently.setText("Your farm currently has");
		txtpnYourFarmCurrently.setBounds(110, 51, 216, 31);
		getContentPane().add(txtpnYourFarmCurrently);
	
		
		JLabel lblMoney = new JLabel("$" + game.farm.getFarmMoney());
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMoney.setBounds(197, 93, 64, 37);
		getContentPane().add(lblMoney);
		
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(335, 227, 89, 23);
		getContentPane().add(exitButton);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

}

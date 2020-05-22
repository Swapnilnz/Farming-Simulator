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

public class NotEnoughMoney extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the dialog.
	 */
	public NotEnoughMoney(JFrame window) {
		super(window, "Error", true);
		setTitle("Error");
		setBounds(100, 100, 266, 143);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Not enough money!");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(40, 35, 176, 25);
			getContentPane().add(lblNewLabel);
		}
		JButton exitButton = new JButton("Go Back");
		exitButton.setBounds(151, 71, 89, 23);
		getContentPane().add(exitButton);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	

}

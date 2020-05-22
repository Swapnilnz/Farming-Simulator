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
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class PopUp extends JDialog {


	/**
	 * Create the dialog.
	 */
	public PopUp(GameEnvironment game, JFrame window, String errorMessage) {
		super(window, "Error", true);
		setType(Type.POPUP);
		setTitle("Error");
		setBounds(100, 100, 469, 146);
		getContentPane().setLayout(null);
		{
			JLabel errorMessage_1 = new JLabel(errorMessage);
			errorMessage_1.setHorizontalAlignment(SwingConstants.CENTER);
			errorMessage_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			errorMessage_1.setBounds(10, 11, 433, 57);
			getContentPane().add(errorMessage_1);
			
		}
		JButton exitButton = new JButton("Go Back");
		exitButton.setBounds(354, 79, 89, 23);
		getContentPane().add(exitButton);
		

		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		if (errorMessage.equals("You still have actions left, are you sure?")) {
			JButton btnYes = new JButton("Yes");
			btnYes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					game.nextDay(window, true);
				}
			});
			btnYes.setBounds(50, 71, 89, 23);
			getContentPane().add(btnYes);
		}

	}
	

}

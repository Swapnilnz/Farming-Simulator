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
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PopUp extends JDialog {


	/**
	 * Create the dialog.
	 */
	public PopUp(GameEnvironment game, JFrame window, String errorMessage) {
		super(window, "Error", true);
		setResizable(false);
		setType(Type.POPUP);
		setTitle("Error");
		setBounds(100, 100, 469, 146);
		getContentPane().setLayout(null);
		{
			JLabel errorMessage_1 = new JLabel(errorMessage);
			errorMessage_1.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
			errorMessage_1.setHorizontalTextPosition(SwingConstants.CENTER);
			errorMessage_1.setIcon(new ImageIcon(PopUp.class.getResource("/images/errorText.png")));
			errorMessage_1.setHorizontalAlignment(SwingConstants.CENTER);
			errorMessage_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			errorMessage_1.setBounds(10, 11, 433, 57);
			getContentPane().add(errorMessage_1);
			
		}
		JButton exitButton = new JButton("Go Back");
		exitButton.setBackground(new Color(210, 180, 140));
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		exitButton.setBounds(354, 79, 89, 23);
		getContentPane().add(exitButton);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(PopUp.class.getResource("/images/errorBackground.png")));
		background.setBounds(0, 0, 463, 117);
		getContentPane().add(background);
		

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
			btnYes.setBounds(50, 79, 89, 23);
			getContentPane().add(btnYes);
			btnYes.setBackground(new Color(210, 180, 140));
			btnYes.setHorizontalTextPosition(SwingConstants.CENTER);
			btnYes.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		}

	}
	

}

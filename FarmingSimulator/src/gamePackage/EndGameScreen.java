package gamePackage;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * End game screen, shows farm name, game duration, money earnt, and score
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class EndGameScreen extends JDialog {


	/**
	 * Create the end game screen
	 */
	public EndGameScreen(GameEnvironment game) {
		setResizable(false);
		setTitle("Finished");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		// Exit game
		JButton btnNewButton = new JButton("Exit game");
		btnNewButton.setBackground(new Color(210, 180, 140));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnNewButton.setBounds(179, 227, 89, 23);
		getContentPane().add(btnNewButton);
		
		// Score
		JLabel scoreLabel = new JLabel("You got " + game.calculateScore() + " points!");
		scoreLabel.setOpaque(true);
		scoreLabel.setBackground(new Color(154, 205, 50));
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		scoreLabel.setBounds(0, 187, 444, 37);
		getContentPane().add(scoreLabel);
		
		// Farm name
		JLabel farmName = new JLabel("Farm name: " + game.farm.getFarmName());
		farmName.setBorder(new LineBorder(new Color(139, 69, 19), 2, true));
		farmName.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		farmName.setHorizontalTextPosition(SwingConstants.CENTER);
		farmName.setHorizontalAlignment(SwingConstants.CENTER);
		farmName.setFont(new Font("Tahoma", Font.BOLD, 18));
		farmName.setBounds(0, 57, 444, 37);
		getContentPane().add(farmName);
		
		// Game duration
		JLabel gameDuration = new JLabel("Your game lasted " + game.getGameDuration() + " days");
		gameDuration.setBorder(new LineBorder(new Color(139, 69, 19), 2, true));
		gameDuration.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		gameDuration.setHorizontalTextPosition(SwingConstants.CENTER);
		gameDuration.setHorizontalAlignment(SwingConstants.CENTER);
		gameDuration.setFont(new Font("Tahoma", Font.BOLD, 18));
		gameDuration.setBounds(0, 92, 444, 37);
		getContentPane().add(gameDuration);
		
		// Money earnt
		JLabel label_1 = new JLabel("Over this time, you made $" + (game.farm.farmMoney - game.farm.staticFarmMoney));
		label_1.setBorder(new LineBorder(new Color(139, 69, 19), 2, true));
		label_1.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(0, 127, 444, 37);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(2, 166, 444, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		label_2.setBounds(0, 231, 444, 14);
		getContentPane().add(label_2);
		
		// Congratulation message
		JLabel lblNewLabel_2 = new JLabel("Congratulations! Game Finished!");
		lblNewLabel_2.setBorder(new LineBorder(new Color(139, 69, 19), 4, true));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(0, 11, 444, 37);
		getContentPane().add(lblNewLabel_2);
		
		// Background
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/endGameBackground.png")));
		background.setBounds(0, 0, 444, 271);
		getContentPane().add(background);
		

	}
}

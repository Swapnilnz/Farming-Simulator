package gamePackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewTendToCrops extends JDialog {

	/**
	 * Create the dialog.
	 */
	public ViewTendToCrops(GameEnvironment game, JFrame window) {
		super(window, "Tend to Crops", true);
		setResizable(false);
		setTitle("Tend To Crops");
		setBounds(100, 100, 290, 220);
		getContentPane().setLayout(null);
		
		JTextPane txtpnWhichCropWould = new JTextPane();
		txtpnWhichCropWould.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnWhichCropWould.setEditable(false);
		txtpnWhichCropWould.setText("Which crop would you like to tend to?");
		txtpnWhichCropWould.setBounds(10, 9, 251, 33);
		getContentPane().add(txtpnWhichCropWould);
		
		// Make combo box of crops
		JComboBox<String> cropDropDown = new JComboBox<String>();
		cropDropDown.setBounds(81, 53, 107, 22);
		getContentPane().add(cropDropDown);
		cropDropDown.addItem("Avocado");cropDropDown.addItem("Corn");cropDropDown.addItem("Wheat");
		cropDropDown.addItem("Potato");cropDropDown.addItem("Carrot");cropDropDown.addItem("Apple");
			
		
		
		// Choose crop
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (game.getNumActions() > 0) {
					game.tendToCrops(window, cropDropDown.getSelectedItem().toString());
					dispose();
				} else {
					PopUp error = new PopUp(game, window, "Sorry, you don't have any actions left!");
					error.setVisible(true);
					dispose();
				}
			}
		});
		btnEnter.setBounds(81, 103, 107, 23);
		getContentPane().add(btnEnter);
		
		// Exit
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exit.setBounds(175, 154, 89, 23);
		getContentPane().add(exit);
	}

}

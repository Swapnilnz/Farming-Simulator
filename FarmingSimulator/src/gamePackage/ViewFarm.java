package gamePackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class ViewFarm extends JDialog {

	
	/**
	 * Launch the application. //TESTING ONLY
	 */
	public static void main(String[] args) {

	}
	
	/**
	 * Create the dialog.
	 */
	public ViewFarm(GameEnvironment game, JFrame window) {
		super(window, "View Farm", true);
		setResizable(false);
		setTitle("View Farm");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnViewCrop = new JTextPane();
		txtpnViewCrop.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		txtpnViewCrop.setBackground(new Color(233, 150, 122));
		txtpnViewCrop.setEditable(false);
		txtpnViewCrop.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnViewCrop.setText("View Crop");
		txtpnViewCrop.setBounds(58, 23, 80, 26);
		getContentPane().add(txtpnViewCrop);
		
		JTextPane txtpnViewAnimal = new JTextPane();
		txtpnViewAnimal.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		txtpnViewAnimal.setBackground(new Color(233, 150, 122));
		txtpnViewAnimal.setEditable(false);
		txtpnViewAnimal.setText("View Animal");
		txtpnViewAnimal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnViewAnimal.setBounds(280, 23, 96, 26);
		getContentPane().add(txtpnViewAnimal);
		
		
		
		// Exit
		JButton exitButton = new JButton("Exit");
		exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
		exitButton.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		exitButton.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setBounds(335, 227, 89, 23);
		getContentPane().add(exitButton);
		
		
		
		// Days till harvest
		JLabel lblDaysTill = new JLabel("Days till harvest:");
		lblDaysTill.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblDaysTill.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		lblDaysTill.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDaysTill.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysTill.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysTill.setBounds(22, 117, 119, 26);
		getContentPane().add(lblDaysTill);

		JLabel lblDaysTillHarvest = new JLabel("");
		lblDaysTillHarvest.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblDaysTillHarvest.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		lblDaysTillHarvest.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDaysTillHarvest.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysTillHarvest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysTillHarvest.setBounds(140, 117, 29, 26);
		getContentPane().add(lblDaysTillHarvest);
		
		// Days grown
		JLabel lblDaysG = new JLabel("Days grown:");
		lblDaysG.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblDaysG.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		lblDaysG.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDaysG.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysG.setBounds(22, 154, 119, 26);
		getContentPane().add(lblDaysG);
		
		JLabel lblDaysGrown = new JLabel("");
		lblDaysGrown.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblDaysGrown.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		lblDaysGrown.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDaysGrown.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysGrown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysGrown.setBounds(140, 154, 29, 26);
		getContentPane().add(lblDaysGrown);
		
		// Happiness
		JLabel happiness = new JLabel("");
		happiness.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		happiness.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		happiness.setHorizontalTextPosition(SwingConstants.CENTER);
		happiness.setHorizontalAlignment(SwingConstants.CENTER);
		happiness.setFont(new Font("Tahoma", Font.PLAIN, 14));
		happiness.setBounds(370, 117, 29, 26);
		getContentPane().add(happiness);
		
		JLabel lblAnimalHappiness = new JLabel("Animal happiness:");
		lblAnimalHappiness.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblAnimalHappiness.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		lblAnimalHappiness.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAnimalHappiness.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalHappiness.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnimalHappiness.setBounds(252, 117, 119, 26);
		getContentPane().add(lblAnimalHappiness);
		
		// Health
		JLabel lblAnimalHealth = new JLabel("Animal health:");
		lblAnimalHealth.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblAnimalHealth.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		lblAnimalHealth.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAnimalHealth.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalHealth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnimalHealth.setBounds(252, 154, 119, 26);
		getContentPane().add(lblAnimalHealth);
		
		JLabel health = new JLabel("");
		health.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		health.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/button.jpg")));
		health.setHorizontalTextPosition(SwingConstants.CENTER);
		health.setHorizontalAlignment(SwingConstants.CENTER);
		health.setFont(new Font("Tahoma", Font.PLAIN, 14));
		health.setBounds(370, 154, 29, 26);
		getContentPane().add(health);
		
		
		// Crop drop down
		JComboBox<Crop> cropComboBox = new JComboBox<Crop>();
		cropComboBox.setBounds(22, 65, 147, 26);
		getContentPane().add(cropComboBox);
		for (Crop crop : game.farm.cropList) {
			cropComboBox.addItem(crop);
		}
		cropComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<Crop> comboBox = (JComboBox<Crop>) e.getSource();
				Crop selected = (Crop) comboBox.getSelectedItem();
				lblDaysTillHarvest.setText(Integer.toString(selected.getDaysTillHarvest()));
				lblDaysGrown.setText(Integer.toString(selected.getCropDic().get(selected.getCropType()) - selected.getDaysTillHarvest()));
			}
		});

		
		// Animal drop down
		JComboBox<Animal> animalComboBox = new JComboBox<Animal>();
		animalComboBox.setBounds(252, 67, 147, 26);
		getContentPane().add(animalComboBox);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ViewFarm.class.getResource("/images/viewFarmGrass.png")));
		background.setBounds(0, 0, 444, 271);
		getContentPane().add(background);
		for (Animal animal : game.farm.animalList) {
			animalComboBox.addItem(animal);
		}
		animalComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				JComboBox<Crop> comboBox = (JComboBox<Crop>) e.getSource();
				Animal selected = (Animal) comboBox.getSelectedItem();
				happiness.setText(Integer.toString(selected.getHappiness()));
				health.setText(Integer.toString(selected.getHealth()));
			}
		});		
		



		
		
	}
}

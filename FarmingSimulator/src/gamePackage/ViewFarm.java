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
		setTitle("View Farm");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnViewCrop = new JTextPane();
		txtpnViewCrop.setEditable(false);
		txtpnViewCrop.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnViewCrop.setText("View Crop");
		txtpnViewCrop.setBounds(61, 23, 80, 26);
		getContentPane().add(txtpnViewCrop);
		
		JTextPane txtpnViewAnimal = new JTextPane();
		txtpnViewAnimal.setEditable(false);
		txtpnViewAnimal.setText("View Animal");
		txtpnViewAnimal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnViewAnimal.setBounds(284, 23, 96, 26);
		getContentPane().add(txtpnViewAnimal);
		
		
		
		// Exit
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setBounds(335, 227, 89, 23);
		getContentPane().add(exitButton);
		
		
		
		// Days till harvest
		JLabel lblNewLabel = new JLabel("Days till harvest:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 117, 119, 26);
		getContentPane().add(lblNewLabel);

		JLabel lblDaysTillHarvest = new JLabel("");
		lblDaysTillHarvest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysTillHarvest.setBounds(140, 123, 29, 14);
		getContentPane().add(lblDaysTillHarvest);
		
		// Days grown
		JLabel lblDaysGown = new JLabel("Days grown:");
		lblDaysGown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysGown.setBounds(22, 154, 119, 26);
		getContentPane().add(lblDaysGown);
		
		JLabel lblDaysGrown = new JLabel("");
		lblDaysGrown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDaysGrown.setBounds(140, 162, 29, 14);
		getContentPane().add(lblDaysGrown);
		
		// Happiness
		JLabel happiness = new JLabel("");
		happiness.setFont(new Font("Tahoma", Font.PLAIN, 14));
		happiness.setBounds(370, 123, 29, 14);
		getContentPane().add(happiness);
		
		JLabel lblAnimalHappiness = new JLabel("Animal happiness:");
		lblAnimalHappiness.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnimalHappiness.setBounds(252, 117, 119, 26);
		getContentPane().add(lblAnimalHappiness);
		
		// Health
		JLabel lblAnimalHealth = new JLabel("Animal health:");
		lblAnimalHealth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnimalHealth.setBounds(252, 154, 119, 26);
		getContentPane().add(lblAnimalHealth);
		
		JLabel health = new JLabel("");
		health.setFont(new Font("Tahoma", Font.PLAIN, 14));
		health.setBounds(370, 162, 29, 14);
		getContentPane().add(health);
		
		
		// Crop drop down
		JComboBox<Crop> cropComboBox = new JComboBox<Crop>();
		cropComboBox.setBounds(35, 65, 134, 26);
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
		animalComboBox.setBounds(265, 67, 134, 26);
		getContentPane().add(animalComboBox);
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

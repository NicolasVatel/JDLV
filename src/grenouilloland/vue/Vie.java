package grenouilloland.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe Vie .
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class Vie extends JPanel{
	
	private JPanel vie = new JPanel();
	private JLabel coeur = new JLabel("");
	public JLabel ptVie = new JLabel("");
	private ImageIcon imageCoeur = new ImageIcon("ressources/coeur.png");
	private ImageIcon dimension; 
	
	public Vie()
	{
		dimension = new ImageIcon(imageCoeur.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		coeur.setIcon(dimension);
		vie.add(coeur);
		vie.add(ptVie);
		vie.setBackground(Color.gray);
		vie.setPreferredSize(new Dimension(200, 1000));
		vie.repaint();
		add(vie, BorderLayout.WEST);
		
		setVisible(true);
	}
	
}

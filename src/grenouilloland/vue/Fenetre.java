package grenouilloland.vue;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import grenouilloland.vue.*;

import grenouilloland.presenter.Presenter;

import grenouilloland.modele.Grenouille;

/**
 * Classe Fenetre.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class Fenetre extends JFrame
{	
	public static Presenter presenter;
	
	//private JMenuBar menu = new JMenuBar();
	//private JMenu nouvellePartie = new JMenu("Nouvelle partie");
	//private JMenu lancerPartie = new JMenu("Lancer une partie");
	//private JMenu Aide = new JMenu("Aide");
	//private JMenu quitter = new JMenu("Quitter");
	
	private Vie vie = new Vie();
	private Grille grille;
	private Resolution scroll = new Resolution();
	public Fenetre(int resolution)
	{
		grille = new Grille(resolution);
		setTitle("GrenouilloLand");
		setSize(1000,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		JMenu menu1 = new JMenu("Menu");
		//JMenuItem lancer = new JMenuItem(new LancerPartie(this, "nouvellePartie"));
		//JMenuItem pause = new JMenuItem(new Pause(this, "Pause"));
		//JMenuItem enregistrer = new JMenuItem(new Lancer(this,"lancerPartie"));
		//JMenuItem charger = new JMenuItem(new Charger(this,"Charger"));
		JMenuItem quitter = new JMenuItem(new QuitterAction("Quitter"));
		//menu1.add(lancer);
		//menu1.add(enregistrer);
		//menu1.add(pause);
		//menu1.add(charger);
		menu1.add(quitter);

		JMenu menu2 = new JMenu("Aide");
		JMenuItem aPropos = new JMenuItem(new AProposAction(this,"A propos"));
		menu2.add(aPropos);

		JMenu add = menuBar.add(menu1);
		menuBar.add(menu2);
		
		this.getContentPane().add(menuBar, BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(vie, BorderLayout.WEST);
		add(grille, BorderLayout.CENTER);
		add(scroll, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	

	public Vie getVie()
	{
		return vie;
	}
	
	public Grille getGrille()
	{
		return grille;
	}
	
	public Resolution getResolution()
	{
		return scroll;
	}
	
	public void setGrille(Grille grille)
	{
		this.grille=grille;
	}
	
	public void setPresenter(Presenter pres)
	{
		presenter = pres;
		presenter.afficherVie();
		presenter.afficherPlateau();
		presenter.afficherColonneNenuphar();
		presenter.afficherGrenouille();
		revalidate();
		repaint();
	}
	
	public Presenter getPresenter()
	{
		return presenter;
	}
}


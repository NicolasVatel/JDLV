package grenouilloland.vue;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import grenouilloland.vue.*;

/**
 * Classe Grille .
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class Grille extends JPanel implements ActionListener{
	
	public JButton bouton[][];
	private Vie vie = new Vie();
	private int resolution;
	  public Grille(int resolution)
	  {
		  	this.resolution=resolution;
		  	bouton=new JButton[resolution][resolution];
		  	setLayout(new GridLayout(resolution, resolution));
		    for(int i = 0; i < resolution; i++)
		    {
		    	for(int j = 0; j < resolution; j++)
		    	{
		    		bouton[i][j] = new JButton();
		    		bouton[i][j].addActionListener(this);
		    		
		        
		    		add(bouton[i][j]);
		    	}
		    }
	   }

	public void actionPerformed(ActionEvent e) 
	{
		for(int i = 0; i < resolution; i++)
	    {
	    	for(int j = 0; j < resolution; j++)
	    	{
	    		if(bouton[i][j]==e.getSource())
	    		{
	    			if(Fenetre.presenter.caseAdjacente(i, j))
	    				Fenetre.presenter.changerPosition(i,j);
	    			Fenetre.presenter.positionElement(i,j);
	    		}
	    	}
	    }
		Fenetre.presenter.afficherPlateau();
		if(Fenetre.presenter.victoire())
		{
			System.out.println("GAGNE");
		}
		if(Fenetre.presenter.estMort())
		{
			System.out.println("MORT");
		}
	}
	
}

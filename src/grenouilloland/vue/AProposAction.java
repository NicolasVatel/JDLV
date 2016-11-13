package grenouilloland.vue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 * Classe du bouton permettant l'affichage du message lie a 'a propos'.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class AProposAction extends AbstractAction {
	
	private Fenetre fenetre;
	
	public AProposAction(Fenetre fenetre,String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}

	/**
	 * Affiche le message d'a propos.
	 * @param e clic sur le bouton
	 */
	public void actionPerformed(ActionEvent e) { 
		JOptionPane.showMessageDialog(fenetre,"Ce programme a ete developpé par \n"+
				"Alexis Prevost Mayhen, \n"+
				"Guillaume Drouart, \n"+
				"Lucas Gouedart, \n"+
                "Nicolas Vatel, \n"+
				"Dans le cadre d'un projet de la Fac de Sciences CAEN \n"+
				"");
	} 
}

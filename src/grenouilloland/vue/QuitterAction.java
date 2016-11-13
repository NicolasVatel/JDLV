package grenouilloland.vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * Classe du bouton 'quitter', permettant de quitter le jeu.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class QuitterAction extends AbstractAction {
	public QuitterAction(String texte){
		super(texte);
	}
	
    /**
    * Arrete le jeu.
    * @param e clic sur le bouton
    */
    public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}


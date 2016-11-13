package grenouilloland.vue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * Classe du bouton permettant de lancer une partie, qui s'execute seule.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class LancerPartie extends AbstractAction {
	
	private Fenetre fenetre;
	
	public LancerPartie(Fenetre fenetre, String string){
		super(string);
		this.fenetre = fenetre;
	}
	
    /**
    * Lance la partie.
    * @param e clic sur le bouton
    */
	public void actionPerformed(ActionEvent e) {

	} 
}

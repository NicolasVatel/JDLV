package grenouilloland.vue;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Classe du bouton 'pause', permettant de mettre le jeu en pause.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class Pause extends AbstractAction {
	
	private Fenetre fenetre;
	
	public Pause(Fenetre fenetre, String string){
		super(string);
		this.fenetre = fenetre;
	}
	
    /**
    * Met en pause la partie.
    * @param e clic sur le bouton
    */
	public void actionPerformed(ActionEvent e) {

	} 
}

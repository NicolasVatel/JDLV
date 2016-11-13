package grenouilloland.vue;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Classe du bouton permettant l'affichage du message lie a 'Aide'.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class Aide extends AbstractAction {

	private Fenetre fenetre;

	public Aide(Fenetre fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}

    /**
     * Affiche un message d'aide.
     * @param e clic sur le bouton
     */
	public void actionPerformed(ActionEvent e) { 
		JOptionPane.showMessageDialog(fenetre,"\n"+
            "Eau : une grenouille qui tombe à l’eau meurt dévorée par l’un des nombreux brochets qui infestent\n" +
            "la mare. \n"+
            " \n"+
			"Nénuphar : de couleur verte, ce nénuphar n’a aucun effet sur la grenouille. \n"+
            " \n"+
			"Nénuphar vénéneux : de couleur jaune, il rend la grenouille malade et divise par deux \n"+
			"le nombre de ses points de vie. Si la grenouille était déjà malade alors elle meurt de	surinfection. \n"+
            " \n"+
			"Nénuphar nutritif : de couleur rose, il augmente le nombre de points de vie de la grenouille d’une\n" +
			"unité et la guérit si elle était malade. \n"+
            " \n"+
            "Nénuphar dopant : de couleur rouge, il double les points de vie de la grenouille et la guérit si elle\n" +
			"était malade. \n"+
            " \n"+
			"Nénuphar mortel : de même couleur que le nénuphar dopant (on ne peut pas les différencier), il\n" +
			"provoque la mort instantanée de la grenouille.\n"+
            " \n"+
			" ");
	} 
}

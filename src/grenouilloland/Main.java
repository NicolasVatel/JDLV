package grenouilloland;


import grenouilloland.modele.Grenouille;
import grenouilloland.modele.GrilleElement;
import grenouilloland.presenter.Presenter;
import grenouilloland.vue.Fenetre;

/**
 *
 * Main du jeu Grenouilloland.
 *
 * @author Guillaume Drouart
 * @author Nicolas Vatel
 * @version 1.0
 */
public class Main
{
	public static void main(String [] args)
	{
		Fenetre fen = new Fenetre(10);
		fen.setPresenter(new Presenter(new GrilleElement(10), new Grenouille(9,0,1,false),fen));
	}
}

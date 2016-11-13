package grenouilloland.presenter;


import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import grenouilloland.vue.Fenetre;
import grenouilloland.vue.ImageSuperposee;
import grenouilloland.modele.Element;
import grenouilloland.modele.Grenouille;
import grenouilloland.modele.GrilleElement;
import grenouilloland.modele.Modele;
import grenouilloland.modele.TypeElement;

/**
 * Classe Presenter.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class Presenter {
	private GrilleElement grilleElement;
	private Grenouille gr;
	private Fenetre fen;
	private Element e;
	private TypeElement type;
	private Modele modele;
	private String[] images = {"ressources/petit-nenuphare-vert-96x96.png",
			"ressources/petit-nenuphare-vert-96x96.png",
			"ressources/mosaique.jpg",
            "ressources/petit-nenuphare-jaune-96x96.png",
            "ressources/petit-nenuphare-rose-96x96.png",
            "ressources/petit-nenuphare-rouge-96x96.png",
            "ressources/petit-nenuphare-rouge-96x96.png"};
	public Presenter(GrilleElement grilleElement, Grenouille gr, Fenetre fen)
	{
		this.grilleElement=grilleElement;
		this.grilleElement.setType(0, grilleElement.getGrille().length-1, TypeElement.NENUPHARIMMORTEL);
		this.gr=gr;
		//this.modele=modele;
		this.fen=fen;
	}
	
	public void changerVie()
	{
		gr.ajouteVie();
		fen.getVie().ptVie.setText(""+gr.getPtVie());
	}
	
	public void afficherVie()
	{
		fen.getVie().ptVie.setText(""+gr.getPtVie());
	}
	public void afficherGrenouille()
	{
		fen.getGrille().bouton[gr.getX()][gr.getY()].setIcon(new ImageIcon("ressources/grenouille-verte-96x57.png"));	
	}
	
	public TypeElement nenupharAleatoire(int indice)
	{
		switch(indice){
		case 0: return TypeElement.NENUPHAR;
		case 1: return TypeElement.NENUPHARDOPANT;
		case 2: return TypeElement.NENUPHARMORTEL;
		case 3: return TypeElement.NENUPHARNUTRITIF;
		case 4: return TypeElement.NENUPHARVENENEUX;
		}
		
		return type;
	}
	
	public void afficherColonneNenuphar()
	{
		int max=5,min=0;
		int nbAl = (int)(Math.random()*(max-min))+min;
		if(gr.getX()==0)
		{
			for(int i=gr.getY()+1 ; i<grilleElement.getResolution()-1 ; i++)
			{
				grilleElement.getGrille()[gr.getX()][i].setType(nenupharAleatoire(nbAl));
				fen.getGrille().bouton[gr.getX()][i].setIcon(new ImageIcon(images[grilleElement.getGrille()[gr.getX()][i].getType().ordinal()]));
				nbAl = (int)(Math.random()*(max-min))+min;
			}
		}
		else if(gr.getY()==grilleElement.getResolution()-1)
		{
			for(int i=gr.getX()-1 ; i>0 ; i--)
			{
				grilleElement.getGrille()[i][gr.getY()].setType(nenupharAleatoire(nbAl));
				fen.getGrille().bouton[i][gr.getY()].setIcon(new ImageIcon(images[grilleElement.getGrille()[i][gr.getY()].getType().ordinal()]));
				nbAl = (int)(Math.random()*(max-min))+min;
			}
		}
		else
		{
			for(int i=gr.getY()+1 ; i<grilleElement.getResolution() ; i++)
			{
				grilleElement.getGrille()[gr.getX()][i].setType(nenupharAleatoire(nbAl));
				fen.getGrille().bouton[gr.getX()][i].setIcon(new ImageIcon(images[grilleElement.getGrille()[gr.getX()][i].getType().ordinal()]));
				nbAl = (int)(Math.random()*(max-min))+min;
			}
			for(int i=gr.getY()+1 ; i<grilleElement.getResolution() ; i++)
			{
				grilleElement.getGrille()[0][i].setType(nenupharAleatoire(nbAl));
				fen.getGrille().bouton[0][i].setIcon(new ImageIcon(images[grilleElement.getGrille()[0][i].getType().ordinal()]));
				nbAl = (int)(Math.random()*(max-min))+min;
			}
			
			
			for(int i=0 ; i<gr.getX() ; i++)
			{
				grilleElement.getGrille()[i][gr.getY()].setType(nenupharAleatoire(nbAl));
				fen.getGrille().bouton[i][gr.getY()].setIcon(new ImageIcon(images[grilleElement.getGrille()[i][gr.getY()].getType().ordinal()]));
				nbAl = (int)(Math.random()*(max-min))+min;
			}
			for(int i=0 ; i<gr.getX() ; i++)
			{
				grilleElement.getGrille()[i][grilleElement.getResolution()-1].setType(nenupharAleatoire(nbAl));
				fen.getGrille().bouton[i][grilleElement.getResolution()-1].setIcon(new ImageIcon(images[grilleElement.getGrille()[i][grilleElement.getResolution()-1].getType().ordinal()]));
				nbAl = (int)(Math.random()*(max-min))+min;
			}
		}
	}
	
	public void afficherPlateau()
	{
		for (int i=0; i<grilleElement.getResolution();i++)
		{
			for(int j=0; j<grilleElement.getResolution(); j++)
			{
				fen.getGrille().bouton[i][j].setIcon(new ImageIcon(images[grilleElement.getGrille()[i][j].getType().ordinal()]));				
				afficherGrenouille();
				
			}
		}
	}
	
	public void positionElement(int x, int y)
	{
		TypeElement currentType = grilleElement.getGrille()[x][y].getType();
		
		if(currentType==type.EAU)
		{
			System.out.println("eau");
			type.EAU.effetSurGrenouille(gr);
			afficherVie();
		}
		else if(currentType==type.NENUPHARIMMORTEL || currentType==type.NENUPHAR)
		{
			System.out.println("nenuphar");
			type.NENUPHAR.effetSurGrenouille(gr);
			afficherVie();
		}
		else if(currentType==type.NENUPHARNUTRITIF)
		{
			type.NENUPHARNUTRITIF.effetSurGrenouille(gr);
			afficherVie();
		}
		else if(currentType==type.NENUPHARDOPANT)
		{
			type.NENUPHARDOPANT.effetSurGrenouille(gr);
			afficherVie();
		}
		else if(currentType==type.NENUPHARVENENEUX)
		{
			type.NENUPHARVENENEUX.effetSurGrenouille(gr);
			afficherVie();
		}
		else if(currentType==type.NENUPHARMORTEL)
		{
			type.NENUPHARMORTEL.effetSurGrenouille(gr);
			afficherVie();
		}
	}
	
	public void changerPosition(int x, int y)
	{
		//effacerGrenouille();
		gr.setX(x);
		gr.setY(y);
		afficherGrenouille();
		System.out.println("X = "+gr.getX()+ "Y = "+gr.getY());
	}
	public void effacerGrenouille()
	{
		//fen.getGrille().bouton[gr.getX()][gr.getY()].setIcon(new ImageIcon("ressources/mosaique.jpg"));
	}
	public boolean caseAdjacente(int x, int y)
	{
		if((x==gr.getX()&&(gr.allerAGauche(y)||gr.allerADroite(y)))||(gr.allerEnHaut(x)||gr.allerEnBas(x))&&(gr.allerADroite(y)||gr.allerAGauche(y)||y==gr.getY()))
			return true;
		else
			return false;		
	}
	
	public boolean estMort()
	{
		if(gr.getPtVie()==0)
			return true;
		else
			return false;
	}
	
	public boolean victoire()
	{
		if(gr.getX()==0 && gr.getY()==grilleElement.getResolution()-1)
		{
			return true;
		}
		else
			return false;
	}
	
}

package grenouilloland.modele;

/**
 * Classe Grenouille.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedard
 * @author Nicolas Vatel
 */
public class Grenouille 
{
	private int ptVie;
	boolean malade;
	private static int x;
	private static int y;
	
	public Grenouille(int x, int y, int ptVie, boolean malade)
	{
		this.x=x;
		this.y=y;
		this.ptVie = ptVie;
		this.malade=malade;
	}
	
	public int getPtVie()
	{
		return ptVie;
	}
	
	public void setPtVie(int ptVie)
	{
		this.ptVie = ptVie;
	}
	
	public static int getX()
	{
		return x;
	}
	
	public static int getY()
	{
		return y;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
	public void ajouteVie()
	{
		ptVie++;
	}
	
	public void retirerVie()
	{
		ptVie--;
	}
	
	public void mourir()
	{
		ptVie=0;
	}
	
	public boolean estMalade()
	{
		return malade == true;
	}
	
	public boolean allerEnHaut(int abs)
	{
		if(abs==x-1)
			return true;
		return false;
	}
	public boolean allerEnBas(int abs)
	{
		if(abs==x+1)
			return true;
		return false;
	}
	public boolean allerAGauche(int ord)
	{
		if(ord==y-1)
			return true;
		return false;
	}
	public boolean allerADroite(int ord)
	{
		if(ord==y+1)
			return true;
		return false;
	}
}

package grenouilloland.modele;

import grenouilloland.modele.*;


/**
 * Classe GrilleElement.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public class GrilleElement 
{
	protected Element e;
	protected Element[][] grilleElement;
	int resolution;
	public GrilleElement(int resolution)
	{
		this.resolution = resolution;
		grilleElement=new Element[resolution][resolution];
		for(int i = 0;i<resolution;i++)
		{
			for(int j = 0; j<resolution; j++)
			{
				grilleElement[i][j] = new Element(i,j,TypeElement.EAU);
			}
		}
		grilleElement[0][resolution-1]= new Element(0,resolution,TypeElement.NENUPHARIMMORTEL);
		grilleElement[resolution-1][0]= new Element(resolution,0,TypeElement.NENUPHARIMMORTEL);
	}
	
	public void setType(int x, int y, TypeElement type) {
		grilleElement[x][y].setType(type);
	}
	
	public int getResolution() {
		return resolution;
	}
	
	public Element[][] getGrille() {
		return grilleElement;
	}
}

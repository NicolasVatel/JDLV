package grenouilloland.modele;

import grenouilloland.modele.*;


/**
 * Enum TypeElement.
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
public enum TypeElement 
{
	 
	 NENUPHAR{
		public void effetSurGrenouille(Grenouille gr)
		{
			//rien
		}
	},
	
	NENUPHARIMMORTEL{
		public void effetSurGrenouille(Grenouille gr)
		{
			//rien
		}
	},
	EAU{
		public void effetSurGrenouille(Grenouille gr)
		{
			gr.mourir();
		}
	},
	
	NENUPHARVENENEUX{
		public void effetSurGrenouille(Grenouille gr)
		{
			if(gr.estMalade())
			{
				gr.mourir();
			}
			else
			{
				gr.estMalade();
				gr.setPtVie(gr.getPtVie()/2);
			}
		}
	},
	
	NENUPHARNUTRITIF{
		public void effetSurGrenouille(Grenouille gr)
		{
			gr.setPtVie(gr.getPtVie()+1);
			if(gr.estMalade())
				gr.malade=false;
		}
	},
	
	NENUPHARDOPANT{
		public void effetSurGrenouille(Grenouille gr)
		{
			gr.setPtVie(gr.getPtVie()*2);
			if(gr.estMalade())
				gr.malade=false;
		}
	},
	
	NENUPHARMORTEL{
		public void effetSurGrenouille(Grenouille gr)
		{
			gr.mourir();
		}
	};
	public abstract void effetSurGrenouille(Grenouille gr);
}

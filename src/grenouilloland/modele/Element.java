package grenouilloland.modele;

import grenouilloland.modele.TypeElement;

public class Element  {
	protected int x;
	protected int y;
	protected TypeElement type;
	public Element(int x, int y, TypeElement type)
	{
		this.x=x;
		this.y=y;
		this.type=type;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
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
	public TypeElement getType()
	{
		return type;
	}
	public void setType(TypeElement type)
	{
		this.type=type;
	}
}

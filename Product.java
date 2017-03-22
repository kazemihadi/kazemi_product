package gitProjekt;

public class Product {
	
	private String name = "Coca Cola" ;
	
	
	
	public Product(String name)
	{
		setName(name);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String getName()
	{
		return name;
	}
	

}

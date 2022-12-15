
public class Prize {
	private int price;
	private String name;
	public Prize()
	{
		this.price = 0;
		this.name = "none yet";
	}
	public Prize(int aPrice, String aName)
	{
		this.setPrice(aPrice);
		this.setName(aName);
	}
	public double getPrice() 
	{
		return price;
	}
	public String getName() 
	{
		return name;
	}
	public void setPrice(int aPrice) 
	{
		this.price = aPrice;
	}
	public void setName(String aName) 
	{
		this.name = aName;
	}
	
}

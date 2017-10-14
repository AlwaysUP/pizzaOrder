
public class Pizza {
	
	int size;
	String topping;
	String crust;
	String sauce;
	String finishers;
	public Pizza()
	{
		size = 0;
		topping = "";
		crust = "";
		sauce = "";		
	}
   public Pizza(int size, String topping, String crust, String sauce)
   {
      this.size = size;
      this.topping = topping;
      this.crust = crust;
      this.sauce = sauce;
   }
	public void setsize(int size)
	{
		this.size = size;
	}
	public void setfinishers(String finishers)
	{
		this.finishers = finishers;
	}
	public void setsauce(String sauce)
	{
		this.sauce = sauce;
	}
	public void setcrust(String crust)
	{
		this.crust = crust;
	}
	public void settopping(String topping)
	{
		this.topping = topping;
	}
	public int getsize()
	{
		return size;
	}
	public String getcrust()
	{
		return crust;
	}
	public String getsauce()
	{
		return sauce;
	}
	public String gettopping()
	{
		return topping;
	}
	public String getfinishers()
	{
		return finishers;
	}
}


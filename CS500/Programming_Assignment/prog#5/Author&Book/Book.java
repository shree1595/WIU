/*
 *   Define the class BOOk 
 */
public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInstock = 0;
	
	
	public Book(String nm,Author auth,double p)			//constructor
	{

		this.name = nm;
		this.author = auth;
		this.price = p;
	}
	
	public Book(String nm,Author auth,double p,int qty)	//constructor
	{
		
		this.name = nm;
		this.author = auth;
		
		this.price = p;
		this.qtyInstock = qty;
	}
	
	public String getName()										
	{
		return name;
	}
	
	public Author getAuthor()									
	{
		return author;
	}
	
	public double getPrice()									
	{		
		return price;
	}
	
	public void setPrice(double p)			// set price					
	{
		price = p;
	}
	
	public int getQtyInStock()									
	{
		return qtyInstock;
	}
	
	public void setQtyInStock(int qty)		// set the qtyInstock					
	{
		qtyInstock = qty;
	}	
	
	public String toString()									
	{
		return "'"+name+"' by " + author.getName() + "(" + author.getGender() +")" + author.getEmail();
	}	
}

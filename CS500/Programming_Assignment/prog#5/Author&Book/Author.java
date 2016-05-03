/*
 * Define author class
 */
public class Author {

	private String name;
	private String email;
	private char gender;
	
	public Author(String na,String em,char gen)	//constructor
	{
		name = na;
		email = em;
		gender = gen;
	}	
	
	public String getName()						
	{
		return name;
	}
	
	public String getEmail()					
	{
		return email;
	}
	
	public void setEmail(String em)			
	{
		email = em;
	}
	
	public char getGender()						
	{
		return gender;
	}

	public String toString()					
	{
		
		return name + " " + gender + " " + email;		
	}
}

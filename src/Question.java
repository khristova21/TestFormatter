
public abstract class Question 
{

	private int number;
	private String text;
	
	//constructors
	public Question (String input)
	{
		number = 1;
		text = input;
	}
	//public Question()
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	public abstract String getSolution();
	
}

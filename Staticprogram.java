package allJavaProgram;

public class Staticprogram {
	
	String God = "GANESHA";
	double salary = 3689.00;
	static String car = "HONDA ACCORD 2016";
	static int year =1986;
	
	public void Godmethod()
	{
		if(God!=null)
		{
			car = "HONDA ACCORD";
		}
	}
			
	public static void God2method()
	{
		Staticprogram sp = new Staticprogram();
		sp.God ="";
		sp.salary=45.00;
		if(year!=1986)
		{
			car = "";
		}
	}
	
	protected void accessmodifiers()
	{
		if(car!=null)
			car="honda accord";
	}
	
	private void accessmodifiers1()
	{
		if(salary <=3000)
			year =1986;
	}
	//Means default
	void mehod1()
	{
		
	}
	
}

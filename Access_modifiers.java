package allJavaProgram;

public class Access_modifiers {

	String God = "GANESHA";
	double salary = 3689.00;
	static String car = "HONDA ACCORD 2016";
	static int year =1986;


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
	void mehod1(String god)
	{
      if(god=="GANE")
      {
    	  System.out.println("Next loop");
      }
      else
      {
    	  System.out.println("Success");
      }
	}


}

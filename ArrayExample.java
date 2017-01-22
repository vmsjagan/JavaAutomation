package allJavaProgram;

public class ArrayExample {
	
	static int a =13;
	//int a1 = 14;
	static int b[]= {5,3,4,6};
	
	public void passbyvalue(int b)
	{
		b = b+1;
		System.out.println("value of a inside the value method " +b);
		
			
	}
	
	
	public void passbyreference(int b[])
	{   
		
		for(int i=0;i<=b.length;i++)
		{
			if(i==2)
			{
				b[i] = 14;
			}
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample ae = new ArrayExample();

	 ae.passbyvalue(a);
	 System.out.println("Pass by value outside the method" + a);
	 System.out.println("value before mthod calling" + b[2]);
	 ae.passbyreference(b);
	 System.out.println("Pass by reference" + b[2]);
	 Access_modifiers am = new Access_modifiers();
	 am.accessmodifiers();
	 am.mehod1("GANESHA");
	 
	 
	
		

	}

}

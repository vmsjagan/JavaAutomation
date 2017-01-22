package allJavaProgram;


public class Stringrequirements {
	
	static String Original_Name = "MADAM";
	String Reverse_Name ="";
	String Searched="";
	
	public String Palindrome()
	
	{   
		int length = Original_Name.length();
		for(int i=length-1;i>=0;i--)
		{
			char s = Original_Name.charAt(i);
			System.out.println("Name"+ s);
			Reverse_Name = Reverse_Name+s;				
			
		}
		
		return Reverse_Name;
	}

	public String Search()
	{
		String Sentence ="Please Dont get Tensed";
		String searchword ="get";
    	String[] s1 = Sentence.split(" ");
    	for(int i=0;i<s1.length;i++)
    	{
    		if(s1[i].equalsIgnoreCase(searchword))
    		{
    			System.out.println("string is present or not present"+ s1[i]);
    		}
    		    	
	    	
	    }
    	    	
	    return Searched;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringrequirements sr = new Stringrequirements();
		String Reverse = sr.Palindrome();
		System.out.println("Reverse string" + Reverse);
		if(Original_Name.equalsIgnoreCase(Reverse))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
        String searched = sr.Search();
        System.out.println("Seacrhed String"+ searched);
	}

}

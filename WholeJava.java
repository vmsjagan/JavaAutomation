package allJavaProgram;
public class WholeJava {
	
	//Varibles can only start with a,_,OV.o_V and $
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primitive data types - int,double,boolean,char and String - Non Primitive data type
		double tution = 100.00;
		int age1 = 20;
		
		if(age1>65)
		{
		 tution = 0;	
		}
		int num = '1';
		double price = 25.0;double num1 = 25.0;
		int aaas=2;
		int num4=5; int num2='3';
		int ace$num5,jag;
		int _numm =45; int jaha = 34;
		char c, d;
		char c1='d' ;char dq = 'r';	
		boolean b = false;
		final boolean b3=false;
		
		final double price33= 23.5;
		int y =1;
		int x=y++;
		System.out.println("x" + "   " +x);
		System.out.println("y" + "   " +y);
		
		int age = 38;
		if((age>=25 && age<=35)||(age>=35 && age<=40))
		{
			
		}
		
		//Assignment operator
		int i=0;
		//Arithmetic Operator - Date type - Variable, 
		//Assignment operator, Expression(3+2),Additional operator,Left operand and right operand
		int r = 3+2;
		
		if(b!=true){
			System.out.println("my guess is right");
		}
		else 
		{
			System.out.println("my guess is wrong");
		}
		//float price1 = 23.0;
		String pagename = "Product details page";
		System.out.println("Hello World" + "   " +pagename);
		      
        PartOfJava poj = new PartOfJava();
        String awe = poj.AmWhatIam("Shut up");
        int p = poj.Sendit(2);
        
        WholeJava wj = new WholeJava();
        //wj.getClass()
        
        GeoTax gt = new GeoTax();
        gt.message();
        
        
        	



        
	}

}

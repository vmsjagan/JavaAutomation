package allJavaProgram;

public class Justclasses {
	
	private String name ;
	public double salary ;
	private int year = 2;
	public String lastname;

	public ArrayExample Arraexa;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getYear() {
		return year;
	}

	
	
		public Justclasses()
		
			{
			System.out.println(fullname("NITHYA","JAGAN"));
			
			}
	
	public Justclasses(int yearIn,String nameIn, double SalaryIn)
	{
	    this.name = nameIn;
	    this.salary = SalaryIn;
	    this.year = yearIn;
	    
	    		
	}
	//Adding methods as class members
	 public String fullname(String F_name, String L_name)
	 {
		 String fullname = F_name+L_name;
		 return fullname;
	 }
	
	
			

}

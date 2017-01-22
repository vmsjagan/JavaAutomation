package allJavaProgram;

public class ConstructorMainMethod {

	public static void main(String[] args) {
		Justclasses jc = new Justclasses();
		jc.setName("JAGAN");
		jc.setSalary(30000.00);
		jc.setYear(2016);
		
		
		System.out.println("Name:" + jc.getName());
		System.out.println("Salary: "+ jc.salary);
		System.out.println("Year :"+ jc.getYear());
		
		Justclasses jc1 = new Justclasses(1986, "JAGAN",90000);
		
		
		System.out.println(jc1.getName());
		System.out.println(jc1.getSalary());
		System.out.println(jc1.getYear());
		jc1.lastname = "XXX";
		//System.out.println("INside constructor : " + jc1.fullname);
		System.out.println("For fun only - Nithya's name after marriage "+ jc1.fullname("NITHYA", "JAGAN"));
	}

}

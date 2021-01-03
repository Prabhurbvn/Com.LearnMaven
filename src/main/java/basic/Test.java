package basic;

public class Test {

	public static void main(String[] args) {
		
		Emp es1=new Emp(1,"Janani");
		
		EmpService es=new EmpService();
		
		es.save(es1);

	}

}

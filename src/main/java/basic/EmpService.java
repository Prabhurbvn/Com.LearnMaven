package basic;

public class EmpService {
	
	public void save(Emp e)
	{
		System.out.println(e.getEmpid()+"------"+e.getEmpName());
	}
	
	public Emp getData()
	{
		Emp e=new Emp(1,"prabhu");
		
		return e;
		
	}
	
	
	public static void main(String[] args)
	{
		EmpService es=new EmpService();
		
		Emp res=es.getData();
		
		
	}

}

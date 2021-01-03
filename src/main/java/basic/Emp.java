package basic;

public class Emp {
	
	int empid;
	String empName;
	
	
	public Emp(int empid, String empName)
	{
		this.empid=empid;
		
		this.empName=empName;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	
	public String getEmpName()
	{
		return empName;
	}

}

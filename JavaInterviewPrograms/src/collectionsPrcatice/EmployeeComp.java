package collectionsPrcatice;

public class EmployeeComp implements Comparable<EmployeeComp> {
	
	int empId;
	
	public EmployeeComp(int empId)
	{
		this.empId=empId;
	}

	@Override
	public int compareTo(EmployeeComp e) {
		
	   if(this.empId==e.empId)
	   {
		   return 0;
	   }
	   else if(this.empId>e.empId) 
	   {
		   return 1;
	   }
	   else
	   {
		   return -1;
	   }
		
		//return e.empId-this.empId;
	}
	
	
	public String toString()
	{
		return empId+"";
	}
	
	
	

}

package employee;
class Employee
{
	String empName;
	int empNo;
	float salary;
	byte expYrs;
	String empDesig;
	void setEmployee (String name,int No,float Sal,String Des,byte Ex)
	{
		empName=name;
		empNo=No;
		salary=Sal;
		empDesig=Des;
		expYrs=Ex;
	}
	void getEmployee()
	{
System.out.println(empName+"\t"+empNo+"\t" +salary+"\t"+empDesig+"\t"+expYrs+"\n");
	}
	
	
}

class DemoEmployee
{
	public static void main(String args[])
	{
		Employee rahul=new Employee();
		rahul.setEmployee("Rahul",128966,99999.0f,"PM",(byte)20);
		System.out.println("empName\tempNolt salary\tempDesig\texpYrs\n"); 
		rahul.getEmployee();
		
		
		Employee rakesh=new Employee();
		rakesh.setEmployee("Rakesh",128969,98765.4f,"Projectlead",(byte)10); 
		rakesh.getEmployee();
	}
}	
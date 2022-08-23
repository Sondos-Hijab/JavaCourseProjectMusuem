package defaultPackage;

import java.sql.Date;

public class Employee extends Person{
	private int employment_id;
	private Date hireDate;
	public int getEmployment_id() {
		return employment_id;
	}
	public void setEmployment_id(int employment_id) {
		while(employment_id<=0) {System.out.println("enter a positive value >0:"); employment_id=s.nextInt();}
		this.employment_id = employment_id;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Employee() {
		super();
	}
	public String toString() {
		return "Employment id is: "+this.getEmployment_id()+" and hire date is:"+this.getHireDate()+"\n";
		
	}
	

}

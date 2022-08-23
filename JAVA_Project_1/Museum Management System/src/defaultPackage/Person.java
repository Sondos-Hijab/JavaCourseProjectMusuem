package defaultPackage;

import java.sql.Date;
import java.util.Scanner;

public class Person {
	Scanner s=new Scanner(System.in);
	//constructor
	public Person() {}
	public Person(String name, int id, Date dob) {
		this.name=name;
		this.id=id;
		this.dob=dob;
	}
	//states
	private String name;
	private int id;
	private Date dob;
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		while(id<=0) {System.out.println("enter a positive value >0:"); id=s.nextInt();}
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob =dob;
	}
	//toString
	public String toString() {
		return "Person name is: "+this.getName()+" ,id is: "+this.getId()+" ,Date of birth is:"+this.getDob();
	}
}

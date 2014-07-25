package asg05;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee extends Person {
protected int salary;

	public Employee( String name, Date birth, int sal) 
	{
		super(name, birth);
		salary = sal;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return ( "Employee: \n\tName: " + getName() + "\tBirthday: " +
					format.format(birthday) + "\tSalary: " + getSalary() );
	}


}

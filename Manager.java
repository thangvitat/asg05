package asg05;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee {

private Employee assistant;

	public Manager(String name, Date birth, int sal){
		super(name, birth, sal);
	}
	public void setAssistant( Employee assistant1 )
	{
		assistant = assistant1;
	}
	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return ( "Manager: \n\tName: " + getName() 
				+ "\tBirthday: " + format.format(birthday)
				+ "\tSalary: " + getSalary()
				+ "\nAssistant: " + assistant.toString() );
	}

}

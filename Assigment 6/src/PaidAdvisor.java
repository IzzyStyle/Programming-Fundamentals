public class PaidAdvisor extends Person{

public double regularPayRate = 25;
public double specialPayRate = 50;
public double overtimePayRate =  1.5 * regularPayRate;
private double hours;
private double specialHours;
private double totalpay;

public PaidAdvisor (String first, String last, double hoursWorked, double specialHoursWorked) 
{
	
	super (first, last);
	setHours ( hoursWorked, specialHoursWorked);
	setHoursspecial  (specialHoursWorked);
}
	
public void setHours ( double hoursWorked, double specialHoursWorked )
{
	
if ( hoursWorked > 0)
{
	if (specialHoursWorked <= 0)
	hours = hoursWorked;
	
	if (specialHoursWorked > 0)
		hours = hoursWorked - specialHoursWorked;
}

else 
System.out.println("Do you even work here?");

}


public void setHoursspecial (double specialHoursWorked )

{
if (specialHoursWorked >0)
	specialHours = specialHoursWorked;
}

public double getHours()
{

	return hours;
}

public double getSpecialhours()
{
return specialHours;	
}

public double calculatePay()

{
	
	if (getHours() <=30  && getSpecialhours() == 0)
		return regularPayRate * getHours();
		
	else if (getHours() <=30 && getSpecialhours() > 0)
		return regularPayRate * getHours() + (getSpecialhours() * specialPayRate);
	
	else if (getHours() > 30 && getSpecialhours() == 0) 
		return  (regularPayRate * 30) + (getHours() - 30) * overtimePayRate;
	
	else if (getHours() > 30 && getSpecialhours() > 0)
		return  (regularPayRate * 30) + ((getHours() - 30) * overtimePayRate) + (getSpecialhours() * specialPayRate) ;
	
	return totalpay;
	
}
	
public String setNameRateHours() {
	System.out.println("Employee: " + getFirstName() + " " + getLastName());
	
	System.out.println("Regular rate: " + regularPayRate);
	System.out.println("Special rate: " + specialPayRate);
	System.out.println("OverTime rate: " + overtimePayRate);
	System.out.println("Special hours you have worked: " + getSpecialhours() +" | Regular hours you have Worked: " +
			 getHours());
	return null;
}

public String toString()
{

	System.out.println("You have earned: " + calculatePay());
	return null;
}


}
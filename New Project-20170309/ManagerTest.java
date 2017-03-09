import java.util.Date;
import java.util.GregorianCalendar;
public class ManagerTest  
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("hi");
	}
}

class Employee
{
    private String name;
    private double salary;
    private Date hireDay;
    
    public Empolyee(String s, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public Date getHireDay()
    {
        return hireDay;
    }
    
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    
    class Manager extends Employee
    {
        private bonus;
        
        public Manager(String n, double s, int year, int month, int day)
        {
            
        }
    }
}
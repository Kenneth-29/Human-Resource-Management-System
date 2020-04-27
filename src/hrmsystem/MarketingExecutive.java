package hrmsystem;

/**
 *
 * @author Kenneth-29
 */
public class MarketingExecutive extends Employee
{
    private static final String DEPARTMENT = "Marketing";
    private static final double carAllowanceRate = 0;
    
    public MarketingExecutive(int employeeId) 
    {
        this.employeeId = employeeId;
    }

    /**
     * Getters:
     */
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }


    public double getCarAllowanceRate() {
        return carAllowanceRate;
    }

    @Override
    public double calculateCarAllowance() 
    {
        this.carAllowance = this.salary * MarketingExecutive.carAllowanceRate;
        
        return this.carAllowance;
    }

    @Override
    public double calculateGrossSalary() 
    {
        double grossSalary = this.carAllowance + this.salary + this.monthlyGratuity;
        
        return grossSalary;
    }
    
}

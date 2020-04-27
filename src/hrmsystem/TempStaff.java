package hrmsystem;

/**
 *
 * @author Kenneth-29
 */
public class TempStaff extends Employee 
{
    private static final String DEPARTMENT = "Temporary Staff";
    private static final double carAllowanceRate = 0;
    
    public TempStaff(int employeeId) {
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
        this.carAllowance = this.salary * TempStaff.carAllowanceRate;
        
        return this.carAllowance;
    }

    @Override
    public double calculateGrossSalary() 
    {
        double grossSalary = this.carAllowance + this.salary + this.monthlyGratuity;
        
        return grossSalary;
    }
    
    
}

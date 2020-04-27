package hrmsystem;

/**
 *
 * @author Kenneth-29
 */
public class ManagementTeam extends Employee
{
    private static final String DEPARTMENT = "Management";
    private static final double carAllowanceRate = 0.3;
    
    public ManagementTeam(int employeeId) {
        this.employeeId = employeeId;
    }
    
    
    /**
     * Getters:
     */
    @Override
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    

    @Override
    public double getCarAllowanceRate() {
        return carAllowanceRate;
    }

    @Override
    public double calculateCarAllowance() 
    {
        this.carAllowance = this.salary * ManagementTeam.carAllowanceRate;
        
        return this.carAllowance;
    }

    @Override
    public double calculateGrossSalary() 
    {
        double grossSalary = this.carAllowance + this.salary + this.monthlyGratuity;
        
        return grossSalary;
    }
    
}

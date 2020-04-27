package hrmsystem;

/**
 *
 * @author Kenneth-29
 */
public abstract class Employee 
{
    protected int employeeId, leaveDays;
    protected String firstName ,lastName, dateOfBirth, address, city, titleOfEmployment, dateHired;
    protected char gender;
    protected double hoursWorked, rateOfPay, salary = 0, carAllowance = 0, monthlyGratuity, taxRate;

    /**
     * Getters:
     */
    public int getEmployeeId() {
        return employeeId;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
    
    public String getCity() {
        return city;
    }

    public String getTitleOfEmployment() {
        return titleOfEmployment;
    }

    public String getDateHired() {
        return dateHired;
    }

    public char getGender() {
        return gender;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public double getSalary() {
        return salary;
    }

    public double getCarAllowance() {
        return carAllowance;
    }

    public double getMonthlyGratuity() {
        return monthlyGratuity;
    }

    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Setters:
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public void setTitleOfEmployment(String titleOfEmployment) {
        this.titleOfEmployment = titleOfEmployment;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setCarAllowance(double carAllowance) {
        this.carAllowance = carAllowance;
    }

    public void setMonthlyGratuity(double monthlyGratuity) {
        this.monthlyGratuity = monthlyGratuity;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    
    /**
     * Other Functions
     */
    
    //Calculate Salary:
    public double calculateBaseSalary()
    {
        this.salary = this.hoursWorked * this.rateOfPay;
        
        return this.salary;
    }
    
    //Calculate CarAllowance:
    public abstract String getDEPARTMENT();
    
    public abstract double getCarAllowanceRate();
    
    public abstract double calculateCarAllowance();
    
    public abstract double calculateGrossSalary();
    
}

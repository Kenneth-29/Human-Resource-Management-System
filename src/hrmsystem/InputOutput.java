package hrmsystem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kenneth-29
 */
public class InputOutput 
{
    //ArrayList to hold values:
    private ArrayList<Employee> records = new ArrayList<>();
    //Delimiter used in CSV file
    private static final String DELIMITER = ",";
    private static final String FILE_NAME = "EnviesDeTour.txt";
    
    private Scanner input;
    private File file;
    
    
    //DataStructure to hold Employee Objects:
    ArrayList <Employee> employeeList = new ArrayList<>();
    
    /**
    * Method to open file for reading:
    */
    public void openFile() 
    {
        try 
	{
            //Get the input file instance:
            file = new File(FILE_NAME);
            //Use Scanner to read file:
            input = new Scanner(file);
            
	} 
	catch (Exception e) {
		e.printStackTrace();
	} 
    }
    
    /**
     * empId[0], fName[1], lName[2], gender[3], dob[4], address[5],
     * city[6],department[7], titleOfEmp[8], dateHired[9], hoursWorked[10],
     * rateOfPay[11], salary[12], carAllowanceRate[13], carAllowance[14], monthlyGrat[15],
     * taxRate[16], leaveDays[17]
     * 
     * @throws IOException, returns ArrayList of records 
     */
    public ArrayList<Employee> readIntoArray() throws IOException 
    {
        while (input.hasNext()) 
        {
            String data = input.nextLine(); //Read row
            String[] values = data.split(DELIMITER);
            
            /**
             * Method call to find out which Employee Object type the row contains:
             */
            Employee emp = resolveEmployeeType(Integer.parseInt(values[0]), values[7]);
            /**
             * Set attributes or Objects:
             */
            emp.setFirstName(values[1]);
            emp.setLastName(values[2]);
            emp.setGender(values[3].charAt(0));
            emp.setDateOfBirth(values[4]);
            emp.setAddress(values[5]);
            emp.setCity(values[6]);
            //(Department is static constant)
            emp.setTitleOfEmployment(values[8]);
            emp.setDateHired(values[9]);
            emp.setHoursWorked(Double.parseDouble(values[10]));
            emp.setRateOfPay(Double.parseDouble(values[11]));
            emp.calculateBaseSalary();
            //(Car allowance rate is static constant)
            emp.calculateCarAllowance();
            emp.setMonthlyGratuity(Double.parseDouble(values[15]));
            //(Tax rate is static constant)
            emp.setLeaveDays(Integer.parseInt(values[17]));
            
            //Add employye record to list:
            this.records.add(emp);     
        }
        
        return this.records;
    }
    
    /**
     * 
     * @param id
     * @param department
     * @return Correctly casted type of Employee
     */
    public Employee resolveEmployeeType(int id, String department) 
    {
        Employee emp;
        switch(department) 
        {
            case "Marketing":
                emp = new MarketingExecutive(id);
                break;
            case "Human Resource":
                emp = new HumanResourceOfficer(id);
                break;
            case "Accounts":
                emp = new AccountsOfficer(id);
                break;
            case "Support Staff":
                emp = new SupportStaff(id);
                break;
            case "Management":
                emp = new ManagementTeam(id);
                break;
            case "Temporary Staff":
                emp = new TempStaff(id);
                break;
            default:
                emp = null;
        }
        return emp;
    }
    
    /**
    * Method to close file:
    */
    public void closeFile() throws IOException 
    {
        try
        {
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
    }
    
}

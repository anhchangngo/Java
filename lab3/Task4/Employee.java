/* 
public class Employee {
    private String id;
    private String fullname;
    private String department;
    private double basicSalary;
    private double extraSalary;

    //Constructor
    public Employee(String id, String fullname, String department, double basicSalary, double extraSalary) {
        this.id = id;
        this.fullname = fullname;
        this.department = department;
        this.basicSalary = basicSalary;
        this.extraSalary = extraSalary;
    }

    //Get and set value 
    public String getID() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDepartment() {
        return department;
    }

    public double getbasicSalary(){
        return basicSalary;
    }

    public double getextraSalary(){
        return extraSalary;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setbasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public void setextraSalary(double extraSalary){
        this.extraSalary = extraSalary;
    }

    public double Income(){
        return basicSalary + extraSalary*2.5;
    }
}
*/

public class Employee {
    private String ID;
    private String fullname;
    private String department;
    private double basic_salary;
    private double extra_salary;

    public Employee(String ID, String fullname, String department, double basis_salary, double extra_salary) {
        this.ID = ID;
        this.fullname = fullname;
        this.department = department;
        this.basic_salary = basis_salary;
        this.extra_salary = extra_salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getfullName() {
        return fullname;
    }

    public void setfullName(String fullname) {
        this.fullname = fullname;
    }

    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    public double getbasicSalary() {
        return basic_salary;
    }

    public void setbasicSalary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public double getextraSalary() {
        return extra_salary;
    }

    public void setextraSalary(double extra_salary) {
        this.extra_salary = extra_salary;
    }

    public double Income() {
        return basic_salary + extra_salary * 2.5;
    }

}
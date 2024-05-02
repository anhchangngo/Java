public class hw14 {
    private int ID;
    private String full_name;
    private String department;
    private double basic_salary;
    private double extra_salary;

    public hw14(int ID, String full_name, String department, double basic_salary, double extra_salary) {
        this.ID = ID;
        this.full_name = full_name;
        this.department = department;
        this.basic_salary = basic_salary;
        this.extra_salary = extra_salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return full_name;
    }

    public void setName(String full_name) {
        this.full_name = full_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasicSalary() {
        return basic_salary;
    }

    public void setBasicSalary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public double getExtraSalary() {
        return extra_salary;
    }

    public void setExtraSalary(double extra_salary) {
        this.extra_salary = extra_salary;
    }

    public double getIncome() {
        return basic_salary + (extra_salary * 2.5);
    }

}

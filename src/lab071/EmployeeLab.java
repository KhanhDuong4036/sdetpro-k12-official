package lab071;

public class EmployeeLab {
    private String name;
    private int salary;

    public EmployeeLab() {
    }

    public EmployeeLab(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
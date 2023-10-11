package lesson07;

public class Employee {
    /*
    * Inheritance | Tinh Ke Thua
    * Abstraction | Tinh Truu Tuong
    * Encapsulation | Tinh dong goi
    * Polymorphism | Tinh da hinh
    * */

    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
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

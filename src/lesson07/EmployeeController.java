package lesson07;

import java.util.List;

public class EmployeeController {
    // Functional Programming
    public static int totalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;

    }
}

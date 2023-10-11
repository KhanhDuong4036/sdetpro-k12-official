package lab071;

import lesson07.Employee;

import java.util.List;

public class EmployeeController {
    public static int totalSalary(List<EmployeeLab> employeeList){
        int totalSalary = 0;
        for (EmployeeLab employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}

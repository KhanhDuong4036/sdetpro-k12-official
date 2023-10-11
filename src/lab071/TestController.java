package lab071;


import java.util.Arrays;

public class TestController {
    public static void main(String[] args) {
        EmployeeLab employee01 = new FullTime();
        EmployeeLab employee02 = new FullTime();
        EmployeeLab employee03 = new FullTime();
        EmployeeLab employee04 = new Contractor();
        EmployeeLab employee05 = new Contractor();
        EmployeeLab employee06 = new Contractor();

        int totalSalary = EmployeeController.totalSalary(Arrays.asList(employee01, employee02, employee03, employee04, employee05, employee06));
        System.out.println(totalSalary);
    }
}


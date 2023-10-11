package lesson07;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        //Data from Object
        // Controller to process data
        Employee fte = new FTE();
        Employee contractor = new Contractor();
        int totalSalary = EmployeeController.totalSalary(Arrays.asList(fte, contractor));
        System.out.println(totalSalary);
    }
}

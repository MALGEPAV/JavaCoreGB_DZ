import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

public class Simulation {
    public static void main(String[] args) {
        System.out.println(Employee.compareDates("1998-04-05","1999-13-31"));
        Employee[] empList = new Employee[5];
        for (int i = 0; i < empList.length-1; i++) {
            empList[i] = new Employee();
        }
        empList[empList.length-1] = new Boss();
        System.out.println("Before raise:");
        for (Employee emp :
                empList) {
            System.out.println(emp);
        }
        Boss.raiseSalary(empList);
        System.out.println("After raise: ");
        for (Employee emp :
                empList) {
            System.out.println(emp);
        }
    }
}

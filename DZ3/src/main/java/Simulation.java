import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

public class Simulation {
    enum Parties {NONE, NEW_YEAR, MARCH_8, FEB_23}

    private static final Parties today = Parties.NONE;

    public static void main(String[] args) {
        System.out.println(Employee.compareDates("1998-04-05", "1999-13-31"));
        Employee[] empList = new Employee[5];
        for (int i = 0; i < empList.length - 1; i++) {
            empList[i] = new Employee();
        }
        empList[empList.length - 1] = new Boss();
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

    private static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
             switch (today) {
                 case NEW_YEAR:
                     System.out.println(emp[i].name + ", happy New Year!");
                     break;
                 case FEB_23:
                    if (emp[i].gender == Employee.Genders.MALE)
                         System.out.println(emp[i].name + ", happy February 23rd!");
                     break;
                 case MARCH_8:
                     if (emp[i].gender == Employee.Genders.FEMALE)
                         System.out.println(emp[i].name + ", happy march 8th!");
                     break;
                 default:
                     System.out.println(emp[i].name + ", celebrate this morning!");
                    }
             }
         }
}

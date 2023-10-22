public class Boss extends Employee{
    public Boss(){
        super();
        this.position = "Boss";
        this.salary = 200000;
    }
    public static void raiseSalary(Employee[] empList){
        for (Employee currentEmp : empList) {
            if (!(currentEmp instanceof Boss) && currentEmp.getAge() > 45) currentEmp.increaseSalary(5000);
        }
    }
}

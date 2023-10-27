import MyExceptions.*;

import java.util.Calendar;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
   public static enum Genders{MALE, FEMALE};
    protected String name;
    protected String position;
    protected String phoneNumber;
    protected int salary;
    protected int age;

    protected Genders gender;

    public Employee() {
        Random random = new Random();
        int randomFirstnameIndex = random.nextInt(FirstNames.values().length);
        String randomFirstName = FirstNames.values()[randomFirstnameIndex].toString();
        int randomLastNameIndex = random.nextInt(LastNames.values().length);
        String randomLastName = LastNames.values()[randomLastNameIndex].toString();
        String randomName = randomFirstName + " " + randomLastName;
        String defaultPosition = "manager";
        String defaultPhoneNumber = "123456789";
        int randomSalary = random.nextInt(49999, 100001);
        int randomAge = random.nextInt(18, 101);
        Genders randomGender = Genders.values()[new Random().nextInt(2)];

        setName(randomName);
        setPosition(defaultPosition);
        setPhoneNumber(defaultPhoneNumber);
        setSalary(randomSalary);
        setAge(randomAge);
        setGender(randomGender);
    }

    public Employee(String name, String position, String phoneNumber, int salary, int age, Genders gender) {
        setName(name);
        setPosition(position);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) throw new InvalidEmployeeNameException();
        this.name = name;

    }

    public void setPosition(String position) {
        if (position.isEmpty() || position.isBlank()) throw new InvalidPositionException();
        this.position = position;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty() || phoneNumber.isBlank()) throw new InvalidPhoneNumberException();
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        if (salary < 0) throw new InvalidSalaryException();
        this.salary = salary;
    }

    public void setAge(int age) {
        if (age < 18 || age > 100) throw new InvalidAgeException();
        this.age = age;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("NAME: %s, POSITION: %s, PHONE NUMBER: %s, SALARY: %d, AGE: %d\n",
                name, position, phoneNumber, salary, age);
    }

    protected void increaseSalary(int raise) {
        if (raise < 0) throw new InvalidRaiseException();
        this.salary += raise;
    }

    public static int compareDates(String date1, String date2) {
        Pattern datePattern = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
        Matcher matcher1 = datePattern.matcher(date1);
        Matcher matcher2 = datePattern.matcher(date2);
        if (!matcher1.matches() || !matcher2.matches()) throw new InvalidDateException();
        String[] dateArray1 = date1.split("-");
        String[] dateArray2 = date2.split("-");

        int y1 = Integer.parseInt(dateArray1[0]);
        int y2 = Integer.parseInt(dateArray2[0]);

        int m1 = Integer.parseInt(dateArray1[1]);
        int m2 = Integer.parseInt(dateArray2[1]);

        int d1 = Integer.parseInt(dateArray1[2]);
        int d2 = Integer.parseInt(dateArray2[2]);

        Calendar cal1 = Calendar.getInstance();
        cal1.clear();
        Calendar cal2 = Calendar.getInstance();
        cal2.clear();
        cal1.set(y1, m1, d1);
        cal2.set(y2, m2, d2);
        return cal1.compareTo(cal2);
    }
}

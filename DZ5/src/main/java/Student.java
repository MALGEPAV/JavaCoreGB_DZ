import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private final String name;
    private final List<Double> grades;
    private final String speciality;

    public Student() {
        Random random = new Random();
        FirstNames[] firstNames = FirstNames.values();
        String randomFirstName = firstNames[random.nextInt(firstNames.length)].toString();
        LastNames[] lastNames = LastNames.values();
        String randomLastName = lastNames[random.nextInt(lastNames.length)].toString();

        name = randomFirstName + " " + randomLastName;

        Specialities[] specialities = Specialities.values();
        speciality = specialities[random.nextInt(specialities.length)].toString();

        EducationalPerformance[] educationalPerformances = EducationalPerformance.values();
        EducationalPerformance randomPerformance = educationalPerformances[random.nextInt(educationalPerformances.length)];

        grades = new ArrayList<>();
        int gradesListLength = 20;

        if (randomPerformance == EducationalPerformance.двоечник){
            for (int i = 0; i < gradesListLength; i++) {
                grades.add((double) random.nextInt(2, 4));
            }
        } else if (randomPerformance == EducationalPerformance.хорошист) {
            for (int i = 0; i < gradesListLength; i++) {
                grades.add((double) random.nextInt(3, 5));
            }
        } else  {
            for (int i = 0; i < gradesListLength; i++) {
                grades.add((double) random.nextInt(4, 6));
            }
        }
    }

    public double getAverageGrade() {
        return grades.stream().reduce(0.0, Double::sum) / grades.size();
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return String.format("NAME: %s, SPECIALITY: %s, AVERAGE GRADE: %.2f", name, speciality, getAverageGrade());
    }
}

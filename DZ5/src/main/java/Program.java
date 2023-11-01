import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        ArrayList<Student> studList = new ArrayList<>();
        int studCount = 100;
        for (int i = 0; i < studCount; i++) {
            studList.add(new Student());
        }

        List<Student> querry = studList
                .stream()
                .filter(student -> student.getSpeciality().equals("Информатика"))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((s1,s2)->Double.compare(s2.getAverageGrade(),s1.getAverageGrade()))
                .limit(5).toList();
        querry.forEach(System.out::println);
    }
}

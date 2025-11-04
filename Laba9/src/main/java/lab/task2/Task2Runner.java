package lab.task2;

import java.util.*;


public class Task2Runner {
    public static void main(String[] args) {

        Map<String, Double> gradesDemidovich = new HashMap<>();
        gradesDemidovich.put("C#", 4.5);
        gradesDemidovich.put("Java", 3.8);
        gradesDemidovich.put("Python", 4.0);

        Map<String, Double> gradesGavruk = new HashMap<>();
        gradesGavruk.put("C#", 2.5);
        gradesGavruk.put("Java", 2.8);
        gradesGavruk.put("Python", 2.9);

        Map<String, Double> gradesSlysh = new HashMap<>();
        gradesSlysh.put("C#", 3.5);
        gradesSlysh.put("Java", 4.2);
        gradesSlysh.put("Python", 3.7);


        List<Student> students = new ArrayList<>();
        students.add(new Student("Демидович А.И.", "Т-319", 2, gradesDemidovich));
        students.add(new Student("Гаврук А.И.", "Т-319", 2, gradesGavruk));
        students.add(new Student("Слыш Д.В.", "Т-319", 2, gradesSlysh));


        System.out.println("=== ЗАДАНИЕ 2: СТУДЕНТЫ ===");
        System.out.println("До обработки:");


        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + " — средний: " + String.format("%.2f", s.getAverageGrade()));
        }


        Student.processStudents(students);

        System.out.println("\nПосле обработки:");


        it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + " — курс: " + s.getCourse());
        }

        System.out.println();

        Student.printStudents(students, 3);
    }
}
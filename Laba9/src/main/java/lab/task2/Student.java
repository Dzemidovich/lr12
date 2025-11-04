package lab.task2;

import java.util.*;

// Класс студента
public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Double> grades;


    public Student(String name, String group, int course, Map<String, Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>(grades);
    }


    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }


    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }


    public void promoteToNextCourse() {
        this.course++;
    }


    public static void processStudents(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getAverageGrade() < 3.0) {
                it.remove();
            } else {
                student.promoteToNextCourse();
            }
        }
    }


    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
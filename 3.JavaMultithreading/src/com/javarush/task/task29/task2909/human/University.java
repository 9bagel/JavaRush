package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University extends UniversityPerson {

    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade)
                return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student studentWithMaxValue = null;
        double tmpAverageGrade = Integer.MIN_VALUE;

        for (Student student : students) {
            if (tmpAverageGrade < student.getAverageGrade()) {
                tmpAverageGrade = student.getAverageGrade();
                studentWithMaxValue = student;
            }
        }
        return studentWithMaxValue;
    }

    public void expel(Student student) {
        students.remove(student);
    }

    public Student getStudentWithMinAverageGrade() {
        Student studentWithMinAverageValue = null;
        double tmpAverageGrade = Integer.MAX_VALUE;

        for (Student student : students) {
            if (tmpAverageGrade > student.getAverageGrade()) {
                studentWithMinAverageValue = student;
                tmpAverageGrade = student.getAverageGrade();
            }
        }
        return studentWithMinAverageValue;
    }
}
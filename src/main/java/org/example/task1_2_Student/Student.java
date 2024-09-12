package org.example.task1_2_Student;

public class Student implements Printable {
    private String studentName;
    private int gradeBookNumber;
    private double gradePointAverage;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentName() {
        return this.studentName;
    }

    public void setGradeBookNumber(int gradeBookNumber) {
        this.gradeBookNumber = gradeBookNumber;
    }
    public int getGradeBookNumber() {
        return this.gradeBookNumber;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    @Override
    public void print() {
        System.out.println("Student: " + this.getStudentName() + "\n Student's grade book number: " + this.getGradeBookNumber() + "\n Student's average grade point: " + this.getGradePointAverage());

    }
}

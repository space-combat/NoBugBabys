package org.example;

import org.example.task1_1_Book.Book;
import org.example.task1_2_Student.Student;
import org.example.task1_4_Clock.Clock;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Task 1: Book
        System.out.println("Task 1:\n");
        Book book1 = new Book();
        book1.setNameOfBook("Harry Potter and the Prisoner of Azkaban");
        book1.setDateOfPublishing(1999);
        book1.setNameOfAutor("J. K. Rowling");

        book1.display();

        //Task 2: Student
        System.out.println("\nTask 2:\n");
        Student student1 = new Student();
        student1.setStudentName("Sasha Levshina");
        student1.setGradeBookNumber(92938474);
        student1.setGradePointAverage(4.3);

        student1.print();

        //Task 4: Clock
        System.out.println("\nTask 3:\n");
        Clock clock1 = new Clock();
        clock1.setHours(3);
        clock1.setMinutes(59);
        clock1.setSeconds(7);

        clock1.tick();
        clock1.readTime();
    }



}
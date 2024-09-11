package org.example;

import org.example.task1_1.Book;
import org.example.task1_4_Clock.Clock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.setNameOfBook("Harry Potter and the Prisoner of Azkaban");
//        book1.setDateOfPublishing(1999);
//        book1.setNameOfAutor("J. K. Rowling");
//
//        book1.display();

        Clock clock1 = new Clock();
        clock1.setHours(3);
        clock1.setMinutes(59);
        clock1.setSeconds(7);
        clock1.tick();
    }



}
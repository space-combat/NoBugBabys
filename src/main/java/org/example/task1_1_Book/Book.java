package org.example.task1_1_Book;

public class Book implements Displayable {
        private String nameOfBook;
        private String nameOfAuthor;
        private int dateOfPublishing;


        public void setNameOfBook(String nameOfBook) {
            this.nameOfBook = nameOfBook;
        }
        public void setNameOfAutor(String nameOfAuthor) {
            this.nameOfAuthor = nameOfAuthor;
        }
        public void setDateOfPublishing(int dateOfPublishing) {
            this.dateOfPublishing = dateOfPublishing;
        }

        public String getNameOfBook() {
            return this.nameOfBook;
        }

        public String getNameOfAuthor() {
            return this.nameOfAuthor;
        }
        public int getDateOfPublishing() {
            return this.dateOfPublishing;
        }

        @Override
        public void display() {
            System.out.println(this.getNameOfBook() + ", " + this.getDateOfPublishing() + " by " + this.getNameOfAuthor());
        }


    }


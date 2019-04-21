package com.company;

public class Shelf {
    public Book[] books;

    public Shelf (int size) {
        this.books = new Book[size];
    }

    public Book getBookAt(int position){
        return this.books[position];
    }

    public void setBookAt(int position, Book book){
        this.books[position] = book;
    }

    public int findBookByTitle(String titleFinded){
        for(int i=0; i < this.books.length; i++) {
            Book book = this.books[i];
            if (book != null && book.getTitle().equals(titleFinded)) {
               return i;
            }
        }
        return -1;
    }

    public String findBookByAuthor(String authorFinded){
        String books = "";
        for(int i=0; i < this.books.length; i++) {
            Book book = this.books[i];
            if (book != null && book.getAuthor().equals(authorFinded)) {
                books += book + "\n";
            }
        }
        return books;
    }

    public String showBooks(){
        String books = "";
        for(Book book: this.books) {
            if (book != null) {
                books += book + "\n";
            }
        }
        return books;
    }

    public int availablePlace(){
        int availablePlace = 0;
        for(Book book: this.books) {
            if (book == null) availablePlace++;
        }
        return availablePlace;
    }
}

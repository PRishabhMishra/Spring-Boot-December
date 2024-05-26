package com.AuthorBook.AuthorBook.models;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String bookName;
    String publication;
    int pages;
    @ManyToOne
    Author author;


    public Book() {
    }

    public Book(String bookName, String publication, int pages, Author author) {
        this.bookName = bookName;
        this.publication = publication;
        this.pages = pages;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

package com.AuthorBook.AuthorBook.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     Integer id;

    String authorName;

    @OneToMany(mappedBy = "book")
    List<Book>bookList;
    int age;

    public Author() {
    }

    public Author(String authorName, List<Book> bookList, int age) {
        this.authorName = authorName;
        this.bookList = bookList;
        this.age = age;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

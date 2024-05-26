package com.AuthorBook.AuthorBook.Service;

import com.AuthorBook.AuthorBook.Repository.AuthorRepo;
import com.AuthorBook.AuthorBook.Repository.BookRepo;
import com.AuthorBook.AuthorBook.models.Author;
import com.AuthorBook.AuthorBook.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    BookRepo bookRepo;

    public void  addAuthor(Author author){

        Author author1 = new Author();
        author1.setAuthorName(author.getAuthorName());
        author1.setAge(author.getAge());
        authorRepo.save(author1);

        List<Book>books = author.getBookList();
        for(Book book : books){
            bookRepo.save(book);
        }

    }
}

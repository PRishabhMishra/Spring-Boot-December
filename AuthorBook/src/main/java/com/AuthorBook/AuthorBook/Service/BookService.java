package com.AuthorBook.AuthorBook.Service;

import com.AuthorBook.AuthorBook.Exceptions.BookNotFoundException;
import com.AuthorBook.AuthorBook.Repository.BookRepo;
import com.AuthorBook.AuthorBook.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public void addBook(Book book){
        bookRepo.save(book);

    }

    public String getBookPublication(Integer bookId) {
        Book book = bookRepo.findById(bookId);
        if (book == null) {
            throw  new BookNotFoundException(String.format("Book is not found"));
        } else {
            String bookPublication = book.getPublication();
            return bookPublication;

        }

    }
}

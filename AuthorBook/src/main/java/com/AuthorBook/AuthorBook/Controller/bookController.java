package com.AuthorBook.AuthorBook.Controller;

import com.AuthorBook.AuthorBook.Exceptions.BookNotFoundException;
import com.AuthorBook.AuthorBook.Service.BookService;
import com.AuthorBook.AuthorBook.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class bookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String  addBook(@RequestBody Book book){
        bookService.addBook(book);
        return "Book Added successfully";
    }

    @GetMapping("/getBook")
    public String  getBookPublication(@RequestParam Integer id){
        try {
            String publication = bookService.getBookPublication(id);
            return publication;
        }catch (BookNotFoundException b){
            return b.getMessage();
        }
    }


}

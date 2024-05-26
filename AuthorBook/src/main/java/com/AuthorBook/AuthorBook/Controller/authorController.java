package com.AuthorBook.AuthorBook.Controller;

import com.AuthorBook.AuthorBook.Repository.AuthorRepo;
import com.AuthorBook.AuthorBook.Service.AuthorService;
import com.AuthorBook.AuthorBook.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class authorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/addAuthor")
    public ResponseEntity<String> addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return  ResponseEntity.ok("Author added Successfully");
    }
}

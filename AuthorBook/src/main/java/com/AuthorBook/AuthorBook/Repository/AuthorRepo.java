package com.AuthorBook.AuthorBook.Repository;

import com.AuthorBook.AuthorBook.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer> {
}

package com.AuthorBook.AuthorBook.Repository;

import com.AuthorBook.AuthorBook.models.Book;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}

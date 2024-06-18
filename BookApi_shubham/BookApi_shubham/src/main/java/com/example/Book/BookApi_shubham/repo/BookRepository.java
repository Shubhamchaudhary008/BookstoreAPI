package com.example.Book.BookApi_shubham.repo;


import com.example.Book.BookApi_shubham.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

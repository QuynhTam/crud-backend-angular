package c0520h.service;

import c0520h.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(Long id);

    void remove(Long id);

    Book save(Book book);
}

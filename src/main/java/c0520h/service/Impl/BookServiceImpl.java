package c0520h.service.Impl;

import c0520h.model.Book;
import c0520h.repository.BookRepository;
import c0520h.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book save(Book book) {
       return bookRepository.save(book);
    }
}

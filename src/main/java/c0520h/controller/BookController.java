package c0520h.controller;

import c0520h.model.Book;
import c0520h.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @PostMapping("/books/")
    public Book addBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping("books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book currentBook = bookService.findById(id);
        currentBook.setNameBook(book.getNameBook());
        currentBook.setAuthor(book.getAuthor());
        currentBook.setDescription(book.getDescription());
        Book updateBook = bookService.save(currentBook);
        return ResponseEntity.ok(updateBook);
    }

    @DeleteMapping("books/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBook(@PathVariable Long id) {
        bookService.remove(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}

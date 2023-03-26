package org.abhi;

import com.abhi.openapi.api.BooksApiDelegate;
import com.abhi.openapi.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksApiDelegateImpl implements BooksApiDelegate {

    @Override
    public ResponseEntity<Book> addBook(Book book) {
        // TODO: Implement adding a book
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> deleteBookById(Integer bookId) {
        // TODO: Implement deleting a book by ID
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Book> getBookById(Integer bookId) {
        // TODO: Implement getting a book by ID
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        // TODO: Implement getting all books
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Book> updateBookById(Integer bookId, Book book) {
        // TODO: Implement updating a book by ID
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}

package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.coderslab.Book;
import pl.coderslab.BookService;
import pl.coderslab.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Primary
@Service
public class JpaBookService implements BookService {


    private final BookRepository bookRepository;

@Autowired
    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> get(Long id) {
        return bookRepository.findById(id);
    }


    @Override
    public void add(Book book) {
bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
bookRepository.deleteById(id);
    }

    @Override
    public void update(Book book) {
bookRepository.save( book);
    }
}

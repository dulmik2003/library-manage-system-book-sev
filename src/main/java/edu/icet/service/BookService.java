package edu.icet.service;

import edu.icet.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    BookDto addBook(BookDto dto);

    List<BookDto> getBooks();

    boolean deleteBook(Long id);

    BookDto getBookById(Long id);
}

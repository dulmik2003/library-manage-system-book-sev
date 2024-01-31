package edu.icet.service;

import edu.icet.dto.BookDto;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    void addBook(BookDto dto);
}

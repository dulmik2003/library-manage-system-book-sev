package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.BookDto;
import edu.icet.entity.Book;
import edu.icet.repository.BookRepository;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    final BookRepository repository;
    
    final ObjectMapper mapper;

    @Override
    public void addBook(BookDto dto) {
        Book book = mapper.convertValue(dto, Book.class);
        repository.save(book);
    }

    @Override
    public List<BookDto> getBooks() {
        List<BookDto> bookList = new ArrayList<>();

        Iterable<Book> iterable = repository.findAll();
        Iterator<Book> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            Book entity = iterator.next();
            BookDto dto = mapper.convertValue(entity, BookDto.class);
            bookList.add(dto);
        }
        return bookList;
    }
}

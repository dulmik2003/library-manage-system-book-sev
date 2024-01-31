package edu.icet.controller;

import edu.icet.dto.BookDto;
import edu.icet.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
@RequiredArgsConstructor
public class BookController {

    final BookServiceImpl service;

    @PostMapping(path = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody BookDto dto) {
        service.addBook(dto);
    }

    @GetMapping(path = "/get")
    @ResponseStatus(HttpStatus.FOUND)
    public List<BookDto> getBooks() {
        return service.getBooks();
    }
}

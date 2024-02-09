package edu.icet.controller;

import edu.icet.dto.BookDto;
import edu.icet.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(path = "/book")
@RequiredArgsConstructor
public class BookController {

    final BookServiceImpl service;

    @PostMapping(path = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public BookDto addBook(@RequestBody BookDto dto) {
        return service.addBook(dto);
    }

    @GetMapping(path = "/get-all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<BookDto> getBooks() {
        return service.getBooks();
    }

    @DeleteMapping(path = "/delete/{id}")
    public Map deleteBook(@PathVariable Long id) {
        boolean isDeleted = service.deleteBook(id);

        if (isDeleted) {
            return Collections.singletonMap("status", "Sucessfully Deleted");
        }
        return Collections.singletonMap("status", "Failed");
    }

    @GetMapping(path = "/search/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return service.getBookById(id);
    }
}

package edu.icet.controller;

import edu.icet.dto.BookDto;
import edu.icet.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/book")
@RequiredArgsConstructor
public class BookController {

    final BookServiceImpl service;

    @PostMapping(path = "/add")
    public void addBook(@RequestBody BookDto dto) {
        service.addBook(dto);
    }
}

package edu.icet.dto;

import lombok.Data;

@Data
public class BookDto {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;
}

package com.librarion.controller;

import com.librarion.dto.BookDto;
import com.librarion.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/app/books")
    public String listBooks(Model model) {
        List<BookDto> books = bookService.findAllBooks();
        model.addAttribute("books", books);
        return "list-books";
    }

}

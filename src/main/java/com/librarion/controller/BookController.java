package com.librarion.controller;

import com.librarion.dto.BookDto;
import com.librarion.models.Books;
import com.librarion.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/app/books/add")
    public String addBook(Model model) {
        Books book = new Books();
        model.addAttribute("books", book);
        return "add-book";
    }

    //POST MAPPING
    @PostMapping("/app/books/new")
    public String saveNewBook(@Validated @ModelAttribute("clubs") BookDto bookDto, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("books", bookDto);
            return "add-book";
        }
        bookService.saveNewBook(bookDto);
        return "redirect:/app/books";
    }


}

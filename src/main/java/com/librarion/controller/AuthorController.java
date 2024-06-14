package com.librarion.controller;

import com.librarion.dto.AuthorDto;
import com.librarion.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/app/authors")
    public String listAuthors(Model model) {
        List<AuthorDto> authors = authorService.findAllAuthors();
        model.addAttribute("authors", authors);
        return "list-authors";
    }
}
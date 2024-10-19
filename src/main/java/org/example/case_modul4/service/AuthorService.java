package org.example.case_modul4.service;

import org.example.case_modul4.model.Author;
import org.example.case_modul4.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }



    public Author findById(int id) {
        return authorRepository.findById(id).orElse(null); // Tìm tác giả theo ID
    }

}

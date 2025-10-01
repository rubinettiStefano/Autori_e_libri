package com.generation.autori_e_libri.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TODO 2 - Annotare qui Author
@Entity
@Getter
@Setter
public class Author extends BaseEntity
{
    @NotBlank@NotNull
    private String fullName;
    @Past
    private LocalDate dob;
    @NotBlank@NotNull
    private String nationality;

    //TODO 3 - Creare proprietà

    //TODO 4 - Impostare relazione
    //la cascade deve essere ALL
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    //TODO 5 - Creare metodi
    public int numbersOfBooks()
    {
        return books.size();
    }

    public int numbersOfBooksInStocks()
    {
        int somma=0;
        for (Book b : books)
            if (b.isInStock())
                somma++;

        return somma;
    }

    public void addBook(Book b)
    {
        books.add(b);
        b.setAuthor(this);
    }

}

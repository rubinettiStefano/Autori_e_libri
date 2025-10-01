package com.generation.autori_e_libri.model.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TODO 2 - Annotare qui Author
public class Author
{

    //TODO 3 - Creare proprietà

    //TODO 4 - Impostare relazione
    //la cascade deve essere ALL
    private Set<Book> books = new HashSet<>();

    //TODO 5 - Creare metodi
    public int numbersOfBooks()
    {
        return 0;
    }

    public int numbersOfBooksInStocks()
    {
        return 0;
    }



}

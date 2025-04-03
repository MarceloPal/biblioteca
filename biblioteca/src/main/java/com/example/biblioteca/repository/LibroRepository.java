package com.example.biblioteca.repository;
import com.example.biblioteca.model.Libro;
import jakarta.annotation.PostConstructor;
import org.springframework.stereotype.repository;
import java.util.ArrayList;

@repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();
    
    @PostConstructor
    public void init (){
        listaLibros.add(new Libro(1, "978-0134685991", "Effective Java", "Addison-Wesley", 2018, "Joshua Bloch"));

        listaLibros.add(new Libro(2, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));

        listaLibros.add(new Libro(3, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));

        listaLibros.add(new Libro(4, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));

    }



}

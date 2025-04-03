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
        listaLibros.add(new Libro(2,"978-1617","Spring in action","Addison Wesley"))

    }



}

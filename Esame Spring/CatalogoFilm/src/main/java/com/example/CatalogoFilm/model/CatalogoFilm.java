package com.example.CatalogoFilm.model;
import java.util.*;
import java.util.stream.Collectors;

// package com.example.CatalogoFilm.model;
public class CatalogoFilm {

    List<Film> catalogo = new ArrayList<>();
    int contatore = 1;

    public List<Film> getAllFilm() {
        return catalogo;
    }
    
    public List<Film> getByGender(String genere) {
        return catalogo.stream()
                        .filter(f -> genere.equals(f.getGenere()))
                        .collect(Collectors.toList());
    }

    public Film addFilm(Film film){
        film.setId(contatore);
        contatore ++;
        catalogo.add(film);
        return film;
    }

    public boolean removeFilm(int id){
        return catalogo.removeIf(f -> f.getId() == id);
    }

    public Optional<Film> getById(int id) {
        return catalogo.stream().filter(f -> f.getId() == id)
                                .findFirst();
    }
}
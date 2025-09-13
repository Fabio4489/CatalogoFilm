import java.util.*;

public class CatalogoFilm {

    List<Film> catalogo = new ArrayList<Film>();
    
    public CatalogoFilm(){}
    public CatalogoFilm(List<Film> catalogo){
        catalogo = new ArrayList<>();

    }

    public Optional<Film> findOne(int id){
            return catalogo.stream()
            .filter(oggetto -> Objects.equals(oggetto.getId(),id))
            .findFirst();
    }

    public void addFilm(Film film){
        if (findOne(film.getId()).isPresent()) {
            System.out.println("Errore, nell'id");
        }
        catalogo.add(film);
        System.out.println( "ok");
    }
        // VECCHIO CODICE PER AGGIUNGERE, (senza l'uso dei metodi)
        // boolean trovato = false;
        // for(Film f:catalogo){
        //     if(film.getId() == f.getId()){
        //         System.out.println("Errore, nell'id");
        //         trovato = true;
        //     }
        // }
        // if (trovato == false) {
        //     catalogo.add(film);
        //     System.out.println( "ok");    
        // }

    public void printCatalogo(){
        System.out.println("________________________________________________________________________________________________________________");
        System.out.println(" Film | Titolo | Genere | Regista | Anno |");
        catalogo.forEach(f -> System.out.println(" - "+f.getId()+" | "+f.getTitolo()+"         | "+f.getGenere()+"         | "+f.getRegista()+"        | "+f.getAnno()+"       |"));;
    }
        // VECCHIO CODICE PER PRINTARE, (senza l'uso dei metodi)
        // System.out.println("   Film  |          Titolo           |  Genere  |    Regista    | Anno |");
        // for(Film f:catalogo){
        //     System.out.println("  -  "+f.getId()+"   | "+f.getTitolo()+" | "+f.getGenere()+" | "+f.getRegista()+" | "+f.getAnno()+" |");
        // }
    
    public void deleteFilm(int id){
        boolean removed = catalogo.removeIf(f -> f.getId() == id);
        if (removed) {
            System.out.println("ok");
        } else {
            System.out.println("Id non presente");
        }
    }

    public String modificaFilm(int id, Film film){
        return findOne(id).map(f -> {
            f.setTitolo(film.getTitolo());
            f.setGenere(film.getGenere());
            f.setRegista(film.getRegista());
            f.setAnno(film.getAnno());
            return ("Aggiornamnto ok");
        }).orElseThrow(() -> new NoSuchElementException("Errore nell'aggiornamento"));
        
    }

    public void findOneByGenere(String genere) {
    catalogo.stream()
                   .filter(f -> Objects.equals(genere, f.getGenere()))
                   .forEach(f -> System.out.println(" - "+f.getId()+" | "+f.getTitolo()+"         | "+f.getGenere()+"         | "+f.getRegista()+"        | "+f.getAnno()+"       |"));
    }
}

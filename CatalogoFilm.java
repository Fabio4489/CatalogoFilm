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

    public boolean addFilm(Film film){
        if (findOne(film.getId()).isPresent()) {
            return false;
        }
        catalogo.add(film);
        return true;
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

    public String printCatalogo(){
        if(catalogo.size() == 0){
            return "|     Catalogo vuoto      |";
        }else{
            StringBuilder sb = new StringBuilder("|-------------------------|\n");
            catalogo.forEach(f -> sb.append("| Id.         "+f.getId()+"\n| Titolo.     "+f.getTitolo()+"\n| Genere.     "+f.getGenere()+"\n| Regista.    "+f.getRegista()+"\n| Anno.       "+f.getAnno() + "\n|-------------------------|\n"));;
            return sb.toString();
        }
    }
        // VECCHIO CODICE PER PRINTARE, (senza l'uso dei metodi)
        // System.out.println("   Film  |          Titolo           |  Genere  |    Regista    | Anno |");
        // for(Film f:catalogo){
        //     System.out.println("  -  "+f.getId()+"   | "+f.getTitolo()+" | "+f.getGenere()+" | "+f.getRegista()+" | "+f.getAnno()+" |");
        // }
    
    public boolean deleteFilm(int id){
        return catalogo.removeIf(f -> f.getId() == id);
    }

    public boolean modificaFilm(int id, Film film){
        return findOne(id).map(f -> {
            f.setTitolo(film.getTitolo());
            f.setGenere(film.getGenere());
            f.setRegista(film.getRegista());
            f.setAnno(film.getAnno());
            return true;
        }).orElse(false);
    }

    public void findOneByGenere(String genere) {
    catalogo.stream()
                   .filter(f -> Objects.equals(genere, f.getGenere()))
                   .forEach(f -> System.out.println(" - "+f.getId()+" | "+f.getTitolo()+"         | "+f.getGenere()+"         | "+f.getRegista()+"        | "+f.getAnno()+"       |"));
    }
}

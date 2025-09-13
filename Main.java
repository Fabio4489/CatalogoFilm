public class Main {
    public static void main(String[] args) {

        CatalogoFilm c = new CatalogoFilm();

        Film f  = new Film(1, "The Godfather", "Francis Ford Coppola", 1972, "Crime");
        Film f1 = new Film(2, "Inception", "Christopher Nolan", 2010, "Sci-Fi");
        Film f2 = new Film(3, "Il Padrino - Parte II", "Francis Ford Coppola", 1974, "Crime");
        Film f3 = new Film(4, "Pulp Fiction", "Quentin Tarantino", 1994, "Crime");
        Film f4 = new Film(5, "The Shawshank Redemption", "Frank Darabont", 1994, "Drama");
        Film f5 = new Film(6, "Il Signore degli Anelli: La Compagnia dell'Anello", "Peter Jackson", 2001, "Fantasy");
        c.addFilm(f);
        c.addFilm(f1);
        c.addFilm(f2);
        c.addFilm(f3);
        c.addFilm(f4);
        c.addFilm(f5);
        c.printCatalogo();
        c.deleteFilm(1);
        c.addFilm(f);
        c.printCatalogo();
        System.out.println(c.modificaFilm(3, f1));
        c.printCatalogo();
        c.findOneByGenere("Crime");
    
    }
}

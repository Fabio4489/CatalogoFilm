# Applicazione java per i film
## PRIMO COMMIT:

In questo commit abbiamo aggiunto il file Film.java e definendo la classe Film.

La classe contiene:

- Gli attributi principali che descrivono un film ( Id, Titolo, Anno, Regista, Genere);
- I metodi getter e setter per accedere e modificare i valori degli attributi;
- I costruttori, sia quello vuoto sia quello parametrizzato, per creare oggetti Film in modi diversi.

## SECONDO COMMIT:
In questo secondo commit abbiamo creato il file CatalogoFilm.java che contiene la classe CatalogoFilm.

Questa classe contiene:
  - L'`array` che conterrà tutti i film;
  - Un contatore che gestirà gli Id;
  - I metodi `getAllFilm()`, `addFilm()`, `removeFilm()`, `getById()`. Questi metoci ci permetteranno di interagire con l'array.

## TERZO COMMIT:
In questo commit abbiamo creato 2 file:
 - CatalogoFilmService.java,
 - FilmController.java.

Tramite il primo gestiamo la logica di business, andando a richiamare le funzioni della classe CatalogoFilm per tutte le funzioni tranne che per l'update.

Con il secondo invece gestisce le chiamate api. Infatti qui siamo andati a mappare le varie richieste (`Get`, `Post`, `Put` e `Delete`) dotandole di una route e di un codice da eseguire (che chiamerà le funzioni del service e gestirà eventuali errori[tramite i ``ResponseEntity``]). 

Con l'aggiunta di anche questi 2 file abbiamo finalmente creato un'applicazione che ci permette di svolgere le operazioni CRUD.

## QUARTO COMMIT:
In questo commit abbiamo modificato questi 3 file:
 - CatalogoFilmService.java,
 - CatalogoFilm.java,
 - FilmController.java.

Abbiamo implementato una nuova funzione del programma ricercherà nel catalogo dei film tuttii film del genere che vuole l'utente.

Abbiamo anche svolto qualche ritocco ad altre funzioni nel programma.
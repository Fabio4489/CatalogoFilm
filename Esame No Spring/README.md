# Applicazione java per i Film
Raccontiamo lo sviluppo di quest'app tramite i commit che sono stati effettuati:
## Il primo commit:
Il primo commit è stato quello di prova, per verificare il corretto funzionamento della repository, ed abbiamo caricato il primo file (Film.java) vuoto.

## Il secondo commit:
Nel secondo commit abbiamo sviluppato la classe Film.java scrivendo i costruttori e i metodi set e get.

## Il terzo commit:
Nel terzo commit abbiamo creato la classe CatalogoFilm con l'`arraylist` catalogo che conterrà tutti i film inseriti, e delle versioni molto grezze dei metodi per: 
- Trovare un film tramite id;
- Inserire un film;
- Stampare un film;
- Cancellare un film;
- Modificare un film;
- Ricercare un film per genere.

Inoltre abbiamo popolato il Main con dei test per controllare il corretto funzionamento delle funzioni.

## Il quarto commit:
Il quarto commit è stato un errore in cui ho sporcato il file Film.java.

## Il quinto commit:
Quindi il quinto commit che va a correggere l'errore e ripushare.

## Il sesto commit:
Il sesto stato un grande push, dato che abbiamo riscritto il main implementando il controllo di un potenziale utilizzatore dell'app. 

Quindi abbiamo implementato lo `Scanner`, un ciclo `do-while` e uno `switch-case` per permettere all'utente di scegliere l'azione da compiere.

Abbiamo implementato una funzione per il menù, e una funzione per ogni azione crud (tranne la ricerca per genere).

Abbiamo dovuto modificare anche i metodi nel file CatalogoFilm.java adattandoli ai bisogni del Main.

Abbiamo deciso di utilizzara una visualizzazione tipo tabella così da rendere buona la UI/UX.  

## Il settimo commit:
Infine il commit sette implementa la ricerca per genere che mancava, corregge delle piccolezze visive che non ci piacevano (es. inserire il numero lateralmente e non sotto).

Abbiamo inserito anche un aggiornamento al metodo modifica:
 - Prima: voleva che fossero reinseriti tutti i parametri anche se non volevamo cambiarli;
 - Adesso: se premiamo INVIO (oppure lo 0 per l'anno) possiamo tenere l'inserimento già presente prima.

 ## L'Ottavo commit:
L'ultimo commit corregge l'errore di non mettere gli attributi privati nella classe Film.java, e aggiunge il file README.md.

---

### Lavoro realizzato da:
- *D'Angelo Fabio*;
- *Finore Andrea Raffaele*.
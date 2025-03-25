/**
 * @author Luan
 * @version 1.0.0
 */

public class Buch {
    private String titel;
    private String autor;
    private String isbn;
    private int jahr;

    public Buch(String titel, String autor, String isbn, int jahr) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        this.jahr = jahr;
    }

    // GET-Methoden
    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getJahr() {
        return jahr;
    }

    // SET-Methoden
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
}

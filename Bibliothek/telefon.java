/**
 * @author Luan
 * @version 1.0.0
 */

public class Kontakt {
    private String kontakt_Name;
    private String kontakt_NachName;
    private int kontakt_Nummer;
    private int kontakt_Alter;

    public Kontakt(String pKontakt_Name, String pKontakt_NachName, int pKontakt_Nummer, 
        int pKontakt_Alter) {
        this.kontakt_Name = pKontakt_Name;
        this.kontakt_NachName = pKontakt_NachName;
        this.kontakt_Nummer = pKontakt_Nummer;
        this.kontakt_Alter = pKontakt_Alter;
    }

    // GET-Methoden
    public String getName() {
        return kontakt_Name;
    }

    public String getNachName() {
        return kontakt_NachName;
    }

    public int getKontakt_Nummer() {
        return kontakt_Nummer;
    }

    public int getkontakt_Alter() {
        return kontakt_Alter;
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

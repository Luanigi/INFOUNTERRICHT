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

    public int getNummer() {
        return kontakt_Nummer;
    }

    public int getAlter() {
        return kontakt_Alter;
    }

    // SET-Methoden
    public void setName(String pKontakt_Name) {
        this.kontakt_Name = pKontakt_Name;
    }

    public void setNachName(String pKontakt_NachName) {
        this.kontakt_NachName = pKontakt_NachName;
    }

    public void setNummer(int pKontakt_Nummer) {
        this.kontakt_Nummer = pKontakt_Nummer;
    }

    public void setAlter(int pKontakt_Alter) {
        this.kontakt_Alter = pKontakt_Alter;
    }
}
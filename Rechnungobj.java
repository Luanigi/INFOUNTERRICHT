/**
 * @author Luan 
 * @version 1.0.0
 */

public class Rechnungobj {
    public class Rechnung {
        public int rechnungsNummer;
        public float rechnungsBetrag;

        public Rechnung(int rechnungsNummer, float rechnungsBetrag){
            this.rechnungsNummer = rechnungsNummer;
            this.rechnungsBetrag = rechnungsBetrag;
        }

        int getRechnungsNummer(int rechnungsNummer) {
            return rechnungsNummer;
        }

        void setRechnungsNummer(int rechnungsNummer) {
            this.rechnungsNummer = rechnungsNummer;
        }

        float getRechnungsBetrag() {
            return rechnungsBetrag;
        }
    
        void setRechnungsBetrag(float rechnungsBetrag) {
            this.rechnungsBetrag = rechnungsBetrag;
        }

        void datenAusgeben() {
            System.out.println("Rechnungsnummer: " + rechnungsNummer + ", Betrag: " + rechnungsBetrag);
        }

    }

    public Rechnungobj () {
        Rechnung rechnung1 = new Rechnung (1, 250.75f);
        Rechnung rechnung2 = new Rechnung (2, 130.50f);
        Rechnung rechnung3 = new Rechnung (3, 499.99f);
    
        Rechnung[] rechnungen = {rechnung1, rechnung2, rechnung3};

        for (Rechnung rechnung : rechnungen) {
            rechnung.datenAusgeben();
        }

        rechnungen[0].setRechnungsNummer(5);
        rechnungen[0].setRechnungsBetrag(300.99f);

        

        System.out.println("-----");

        for (Rechnung rechnung : rechnungen) {
            rechnung.datenAusgeben();
        }
    }
}

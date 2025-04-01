import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    Buch Die_Verwandlung;
    List<String> Buchlist = new ArrayList<>();
    
    // Konstruktor
    public Bibliothek() {
        Die_Verwandlung = new Buch("Die Verwandlung", "Franz Kafka", "123456", 2025);
    }

    // Buch hinzuzufügen
    public void buchHinzufuegen(Buch buch) {
        Buchlist.add(buch.getTitel());
        Buchlist.add(buch.getAutor());
        Buchlist.add(buch.getIsbn());
        Buchlist.add(String.valueOf(buch.getJahr()));
    }
    
    // Buch entfernen
    public void buchEntfernen(int index) {
        Buchlist.add(index, null);
        System.out.println("Das sind die aktuellen Bücher: ");
        alleBuecherAnzeigen();
    }

    // alle Bücher der Bibliothek anzeigen
    public void alleBuecherAnzeigen() {
        for (int i = 0; i < Buchlist.size(); i++) {
            System.out.println(Buchlist.get(i));
        }
    }
}

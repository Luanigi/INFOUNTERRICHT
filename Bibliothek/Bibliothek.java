import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    Buch Die_Verwandlung;
    Buch George_Orwell;
    
    List<String> Buchlist = new ArrayList<>();
    
    public Buch[] bücher;
    
    public int len = bücher.length;
    
    // Konstruktor
    public Bibliothek(Buch[] bücher) {
        this.bücher = bücher;
        
        Die_Verwandlung = new Buch("Die Verwandlung", "Franz Kafka", "123456", 2025);
        George_Orwell = new Buch("1984", "George Orwell", "0987654321", 1949);
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
        if (index < Buchlist.size() || index > Buchlist.size()) {
            System.out.println("Error: Diesen Index gibt es nicht!");
        } else {
            Buchlist.add(index, null);    
        }
        
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
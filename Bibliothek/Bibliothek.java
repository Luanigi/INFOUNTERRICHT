// Bibliothek.java - Die Klasse, die die Bibliothek verwaltet und ein Buch hinzufügt.
import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    Buch Die_Verwandlung;

    // Konstruktor
    public Bibliothek() {
        Die_Verwandlung = new Buch("Die Verwandlung", "Franz Kafka");
    }

    // Methode, um ein Buch hinzuzufügen
    public void hinzufuegenBuch(Buch buch) {
        buchList.add(buch);
    }

    // Methode, um alle Bücher der Bibliothek anzuzeigen
    public void alleBuecherAnzeigen() {
        for (Buch buch : buchList) {
            System.out.println(buch);
        }
    }
}

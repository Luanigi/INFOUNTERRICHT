/**
 * @author Luan
 * @version 1.0.0
 */

public class Startklasse {
    
    public Startklasse() {
        new Bibliothek(new Buch[] {
            new Buch("1984", "George Orwell", "123456789", 1949),
            new Buch("Der Prozess", "Franz Kafka", "987654321", 1925)
        });
    }
     
    public void ausgeben() {
        System.out.println(" ");
        for(int i=0; i< Bibliothek.len; i++) { //fix this
            System.out.println(bücher[i].getTitel()); //fix this
        }
    }
}
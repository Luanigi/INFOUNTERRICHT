/**
 * @author Luan
 * @version 1.0.0
 */

public class Startklasse {
    Buch [] bücher = new Buch[1];
    
    public Startklasse() {
        Buch buch1 = new Buch("Die Verwandlung", "Franz Kafka", "1234567890", 1915);
        Buch buch2 = new Buch("1984", "George Orwell", "0987654321", 1949);
        bücher[0]=buch1;
        bücher[1]=buch2;
    }
     
    public void ausgeben() {
        System.out.println(" ");
        for(int i=0; i<bücher.length; i++) {
            System.out.println(bücher[i].getTitel());
        }
    }
}

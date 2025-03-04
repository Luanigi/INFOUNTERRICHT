/**
 * @author Luan 
 * @version 1.0.0
 */
public class Hundarraymitobjekt {  
    
    public class Hund {
        public String name;
        public int alter;
        
        public Hund(String name, int alter){
            this.name = name;
            this.alter = alter;
        }

        public void huepf(){
            System.out.println(this.name + " - Hüpf!");
        }

        public void datenAusgeben() {
            System.out.println("Name: " + name + ", Alter: " + alter);
        }
    }

    public Hundarraymitobjekt() {
        Hund hund1 = new Hund("Bello", 3);
        Hund hund2 = new Hund("Kello", 7);
        Hund hund3 = new Hund("Nello", 33);

        Hund[] hundeliste = {hund1, hund2, hund3};

        for (Hund hund : hundeliste) {
            hund.datenAusgeben();
            hund.huepf();
            System.out.println("");
        }
    }
}

import java.util.Arrays;

public class array
{
    public int[] monyy = new int[4];
    public int[] primzahlen = {2, 3, 5, 7, 11};
    public int[] primzahlenDuplikat = primzahlen;
    public array() {
        System.out.println("");
        System.out.println("Zu Beginn hatte ich " + monyy[0] + " Euro, am 01.04. habe ich " + monyy[3] + " Euro.");
        monyy[0] = 20;
        
    }
    
    public void res() {
        for (int i = 0; i < monyy.length; i++) {
            System.out.println(monyy[i]);
        }
    }
    
    public void prime() {
        for (int i = 0; i < primzahlen.length; i++) {
          System.out.println(primzahlen[i]);
        }
        
        System.out.println("----------");
        
        for (int i = 0; i < primzahlenDuplikat.length; i++) {
          System.out.println(primzahlenDuplikat[i]);
        }

        System.out.println("----------");

        primzahlenDuplikat = primzahlen.clone();
        System.out.println(Arrays.toString(primzahlen));
        System.out.println(Arrays.toString(primzahlenDuplikat));
    }
    
    public void listebefuellen() {
        System.out.println("");
        
        System.out.println(monyy[0]);
        
        for (int i = 1; i < monyy.length; i++) {
            monyy[i] = monyy[i-1] * 2;
            System.out.println(monyy[i]);
        }
    }
    
    public void durchlaufen (int choose) {
        if (choose == 1) {
             int[] wetterdaten = {1,4,2,6};
             int anz = wetterdaten.length; 
             System.out.println("Anzahl der Elemente: " + anz); 
        } else if (choose == 2) {
            String[] name = {"Heinrich","Margarete","Joe Mama"}; 
            for(int i = 0;i < name.length; i++) { 
                System.out.println("Name " + i + ": " + name[i]); 
            }
        } else if (choose == 3) {
            String[] text = {"eloquent", "adäquat", "extrinsisch", "Quintessenz"};
            
            for (String i : text) {
                System.out.println(i);
            }
        }
    }
    
  public void arrayBefuellen() {
      int[] tage = new int[365];
      
      for (int i : tage) {
          tage[i] = tage[i] + 1;
          System.out.println(tage[i]);
      }
  }
  
  public void listeAusgeben(int tage) {
      System.out.println("");
      int[] Stunden = new int[100];
      Stunden[0] = 24;
      
      for (int i = 1; i < tage; i++) {
          System.out.println(i + " Tage haben " + Stunden[i-1] + " Stunden");
          Stunden[i] = Stunden[i-1] + 24;
      } 
  }
    
    
}

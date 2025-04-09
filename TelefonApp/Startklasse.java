/**
 * @author Luan
 * @version 1.0.0
 */
import java.util.Scanner;
import java.util.ArrayList;


// TODO
// gebe alter aus methode
// gebe nummer aus methode

public class Startklasse {
    Kontakt Malik, Kevin, Peter;
    ArrayList<Kontakt> kontakte = new ArrayList<>();
    
    public Startklasse() throws InterruptedException {
        Malik = new Kontakt("Malik", "Nazlican", 1234421, 16);
        Kevin = new Kontakt("Kevin", "Gong", 12343221, 17);
        Peter = new Kontakt("Peter", "Mauer", 5634421, 33);
        
        kontakte.add(Malik);
        kontakte.add(Kevin);
        kontakte.add(Peter);
        
        loadingScreen();
        clearConsole();
        ausgeben();
        fragen();
    }
     
    public void ausgeben() {
        System.out.println();
        System.out.println("Das sind deine Kontakte: ");
        
        for (Kontakt k : kontakte) {
            System.out.println(k.getName() + " " + k.getNachName());
        }
    }
    
    public void loadingScreen() throws InterruptedException {
        for (int i = 0; i < 2; i++) { 
            clearConsole();

            System.out.println("TelefonEpp lädt.");
            Thread.sleep(500);

            clearConsole();
            System.out.println("TelefonEpp lädt..");
            Thread.sleep(500);

            clearConsole();
            System.out.println("TelefonEpp lädt...");
            Thread.sleep(500);
        }
        
        Thread.sleep(1500);
        
        System.out.println("Fertig geladen!");
    }
    
    public void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
    
    public void fragen() {
        Scanner scanner = new Scanner(System.in);
        int auswahl;
        
        while (true) {
            System.out.println("\n \n \n \n \n \n \n \n \n \n--- TelefonEpp Menü ---");
            System.out.println("1. Alle Kontakte anzeigen");
            System.out.println("2. Kontakt hinzufügen");
            System.out.println("3. Kontakt entfernen");
            System.out.println("4. Programm beenden");
            System.out.print("Wählen Sie eine Option aus: ");
    
            auswahl = scanner.nextInt();
            scanner.nextLine();
    
            switch (auswahl) {
                case 1:
                    ausgeben();
                    break;
                case 2:
                    kontaktHinzufügen();
                    break;
                case 3:
                    kontaktEntfernen();
                    break;
                case 4:
                    System.out.println("Programm wird beendet...");
                    return;
                default:
                    System.out.println("Ungültige Eingabe. Bitte nochmal versuchen.");
            }
        }
    }

    public void kontaktHinzufügen() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();
    
        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();
    
        System.out.print("Telefonnummer: ");
        int telefonnummer = scanner.nextInt();
    
        System.out.print("Alter: ");
        int alter = scanner.nextInt();

        scanner.close();
    
        Kontakt neuerKontakt = new Kontakt(vorname, nachname, telefonnummer, alter);
    
        kontakte.add(neuerKontakt);
        System.out.println("Kontakt wurde hinzugefügt!");
        
        fragen();
    }



    public void kontaktEntfernen() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Welchen Kontakt wollen Sie entfernen? ");
        String kontaktName = scanner.nextLine();
    
        for (int i = 0; i < kontakte.size(); i++) {
            if (kontakte.get(i) != null && kontakte.get(i).getName().equals(kontaktName)) {
                kontakte.remove(i);
                System.out.println("Kontakt wurde entfernt!");
                break;
            }
        }
    
        scanner.close();
    
        fragen();
    }
}
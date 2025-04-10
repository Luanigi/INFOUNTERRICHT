/**
 * @author Luan
 * @version 1.0.0
 */
import java.util.Scanner;
import java.util.ArrayList;


// TODO
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
        System.out.println("Das sind deine Kontakte: \n\n\n");
        
        for (Kontakt k : kontakte) {
            System.out.println(k.getName() + " " + k.getNachName());
            System.out.println("~~~~~~~~~");
            System.out.println("Alter: " + k.getAlter());
            System.out.println("Nummer: " + k.getNummer() + "\n");
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
            System.out.println("\n \n \n \n \n \n \n \n \n \n--- TelefonEpp Menü --- \n");
            System.out.println("1. Alle Kontakte anzeigen");
            System.out.println("2. Kontakt hinzufügen");
            System.out.println("3. Kontakt entfernen");
            System.out.println("4. Alter angeben");
            System.out.println("5. Nummer angeben");
            System.out.println("6. Nummer ändern");
            System.out.println("7. Programm beenden \n");
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
                    alterAngeben();
                    break;
                case 5:
                    nummerAngeben();
                    break;
                case 6:
                    nummerÄndern();
                    break;
                case 7:
                    System.out.println("Programm wird beendet...");
                    System.exit(0);
                    return;
                default: 
                    System.out.println("Ungültige Eingabe. Bitte nochmal versuchen.");
            }

            scanner.close();
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
    
    public void alterAngeben() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kontakt Name: ");
        String kontaktName = scanner.nextLine();
        
        for (int i = 0; i < kontakte.size(); i++) {
            if (kontakte.get(i) != null && kontakte.get(i).getName().equals(kontaktName)) {
                int alter = kontakte.get(i).getAlter();
                String name = kontakte.get(i).getName();

                System.out.println(name + " ist: " + alter + " Jahre alt!");
                break;
            } else {
                System.out.println(kontaktName + " ist nicht in deiner Kontakt Liste!");
            }
        }

        scanner.close();
    }
    
    public void nummerAngeben() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kontakt Name: ");
        String kontaktName = scanner.nextLine();
        
        for (int i = 0; i < kontakte.size(); i++) {
            if (kontakte.get(i) != null && kontakte.get(i).getName().equals(kontaktName)) {
                int nummer = kontakte.get(i).getNummer();
                String name = kontakte.get(i).getName();
                System.out.println("Die nummer von: " + name + " ist: " + nummer);
                break;
            } else {
                System.out.println(kontaktName + " ist nicht in deiner Kontakt Liste!");
            }
        }

        scanner.close();
    }
    
    
    public void nummerÄndern() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kontakt Name: ");
        String kontaktName = scanner.nextLine();
        
        System.out.print("Neue Nummer: ");
        int neueNummer;

        try {
            neueNummer = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Nummer! Bitte eine gültige Zahl eingeben.");
            scanner.close();
            return;
        }

        for (int i = 0; i < kontakte.size(); i++) {
            if (kontakte.get(i) != null && kontakte.get(i).getName().equals(kontaktName)) {
                String name = kontakte.get(i).getName();               
                
                kontakte.get(i).setNummer(neueNummer);
                

                System.out.println("Die neue Nummer von: " + name + " ist: " + neueNummer);
                break;
            } else {
                System.out.println(kontaktName + " ist nicht in deiner Kontakt Liste!");
            }
        }

        scanner.close();
    }
}
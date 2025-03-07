class Spiel
{
    int runden = 0;
    boolean richtig = true;
    int punkte1 = 0;
    int punkte2 = 0;    
    Spiel()
    {
    }

    boolean rateEinmal()
    {
        int zahl1 = zufallszahl(10);
        int zahl2 = zufallszahl(10);
        int loesung = zahl1 + zahl2;
        boolean richtig = true;
        
        System.out.println("Wie viel ist " + zahl1 + " + " + zahl2 + "?");
        
        int antwort = leseZahl();
        
        if(loesung == antwort) {
            System.out.println( "Das Ergebnis war " + loesung );
            richtig = true;
        } else {
            System.out.println( "Das Ergebnis war " + loesung );
            richtig = false;
        }
        
        return richtig;
    }

    int zufallszahl(int n)
    {
        return new java.util.Random().nextInt(n);
    }

    int leseZahl()
    {
        return new java.util.Scanner(System.in).nextInt();
    }

    void eineRundeSpielen() { 
        System.out.print(String.format("\033"));
        runden++; 
        punkte1 = 0;
        punkte2 = 0;
        boolean ergebnis1 = rateEinmal(); 
        
        if (ergebnis1) { 
            punkte1 = punkte1 + 1;
            System.out.println("Spieler-1 hat " + punkte1); 
        }  
        
        boolean ergebnis2 = rateEinmal(); 
        
        if (ergebnis2) { 
            punkte2 = punkte2 + 1;
            System.out.println("Spieler-2 hat " + punkte2); 
        } 
        
        System.out.println("Spieler-1: " + punkte1 + " Punkte");
        System.out.println("Spieler-2: " + punkte2 + " Punkte"); 
        System.out.println("Runden gespielt: " + runden); 
    }
}

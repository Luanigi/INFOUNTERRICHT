
/**
 * Beschreiben Sie hier die Klasse test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class durchschnitt
{
    public durchschnitt()
    {
        // Instanzvariable initialisieren
        int[] x = {3, 6, 7, 8};
        int y = 0;
        int z = 0;
        for (int i = 0; i < x.length; i++) {
            y = y + x[i];
      }
      
        System.out.print("Array: ");

        for (int m = 0; m < x.length;m++) {
            System.out.println(x[m]);
        }
        
        System.out.println("Summe: " + y);
        
        z = y / x.length;
        
        System.out.println("Durchschnitt: " + z);
    }
}

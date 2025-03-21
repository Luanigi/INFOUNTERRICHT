
/**
 * Beschreiben Sie hier die Klasse elektrischpruefer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class elektrischpruefer
{
    private int sindElektrisch;
    Auto Auto1, Auto2, Auto3;
    Auto [] autos = new Auto[3];
    
    
    
    public elektrischpruefer() {
        Auto1 = new Auto(200,"Mercedes",false);
        Auto2 = new Auto(150,"BMW", true);
        Auto3 = new Auto(400,"Tesla", true);
        autos[0]=Auto1;
        autos[1]=Auto2;
        autos[2]=Auto3;
        
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getElektrisch() == true) {
                sindElektrisch++;
            } else {
                continue;
            }
        }
        
        System.out.print(sindElektrisch);
    }
}

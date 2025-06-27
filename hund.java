/**
 * Beschreiben Sie hier die Klasse Hund.
 * 
 * @author Luan
 * @version 1.0.0
 */
public class Hund extends Tier {
    
    public boolean istKastriert;
    public boolean istGechippt;
    public String bellen;
    public String[] tricks = {"rollen", "springen", "backflip"};

    public Hund(String name, int alter, String rasse) {
        super(name, alter, rasse); 
    }

    public void führeTrickAus() {
        System.out.println(tricks[(int)(Math.random() * 3 + 1)]);
    }
    
    public void bell(String bellen) {
        this.bellen = bellen;
        System.out.println(bellen);
    }
    
    public void kastriert(boolean y) {
        istKastriert = y;
        String x = istKastriert ? "JAAA" : "NEINNNN der wird noch kastriert";
        System.out.println(x);
    }
    
    public void gechippt(boolean y) {
        istGechippt = y;
        String x = istGechippt ? "JAAA" : "NREIIIINNN";
        System.out.println(x);
    }
}

/**
 * @author Luan 
 * @version 1.0.0
 */
public class Aufgabezwei {        
    String[][] januarKalender = new String[31][24];
    
    void init() {
        //termine
        januarKalender[0][4] = "Aufstehen!!!";
        januarKalender[0][9] = "Mittagessen";
        januarKalender[30][23] = "Gute Nacht!";
        
        alleWerteAusgeben();
    }
    
    void gebe24stundenaus() {
        for (int i = 0; i < 24; i++) {
            System.out.println("1. Januar, " + i + " Uhr: " + januarKalender[0][i]);
        }
        
        System.out.println("----------");        
    }
    
    void gebe31tageaus() {
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 24; j++) {
                System.out.println(i + ". Januar, Uhr: " + j);
            }
            System.out.println("");
        }     
    }

    void kalenderMitNichtswertBefuellen () {
        for (int tag = 0; tag < januarKalender.length; tag++) {
            for (int stunde = 0; stunde < januarKalender[tag].length; stunde++) {
                januarKalender[tag][stunde] = "nichts";
            }
        }
    }

    void alleWerteAusgeben() {
        for (int tag = 0; tag < januarKalender.length; tag++) {
            for (int stunde = 0; stunde < januarKalender[tag].length; stunde++) {
                System.out.println((tag + 1) + ". Januar, " + stunde + " Uhr: " + januarKalender[tag][stunde]);
            }
        }
    }

    void fbiiiii() {
        kalenderMitNichtswertBefuellen();
        alleWerteAusgeben();
    }

}

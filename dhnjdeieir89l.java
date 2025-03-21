public class Auto {
   
    int geschwindigkeit;
    String marke;
    boolean elektrisch;
    String felgen;
    
    public Auto(int pGeschwindigkeit, String pMarke, boolean pElektrisch) {
        this.geschwindigkeit = pGeschwindigkeit; 
        this.marke = pMarke;
        this.elektrisch = pElektrisch;
    }
    
    // GET - METHODEN //

    public String getMarke() {
        return marke;
    }
    
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
    
    public boolean getElektrisch() {
        return elektrisch;
    }
    
    public String getFelgen() {
        return felgen;
    }
    
    // SET - METHODEN //

    public void setMarke(String pMarke) {
        this.marke = pMarke;
    }
    
    public void setGeschwindigkeit(int pGeschwindigkeit){
        this.geschwindigkeit = pGeschwindigkeit;
    }
    
    public void setElektrisch(boolean pElektrisch) {
        this.elektrisch = pElektrisch;
    }
    
    public void setFelgen(String pFelgen) {
        this.felgen = pFelgen;
    }
   
}

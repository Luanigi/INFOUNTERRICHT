
/**
 * @author 
 * @version 
 */
public class Börsentrick
{
    double[] guthaben = new double[4];
    double[] guthaben2 = new double[4];
    public Börsentrick()
    { 
        guthaben[0] = 20;
        guthaben[1] = 40;
        guthaben[2] = 80;
        guthaben[3] = 160;
        
        System.out.println("Zu Beginn hatte ich "+ guthaben[0] + " Euro, am 01.04 habe ich " + guthaben[3] +" Euro.");
        
        

    }
    
    public void Ausgeben()
    { for ( int i=0;i<4;i++)
        System.out.println(guthaben[i]);
        
  
    
  
}
 public void listeBefüllen()
{
    for( int i=20;i<=160;)
    System.out.println(guthaben2[i]); 
    

}
}

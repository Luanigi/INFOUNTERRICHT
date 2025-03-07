
/**
 * @author 
 * @version 
 */
public class Sonnenuntergang
{
    Kreis Scheibe;
          public Sonnenuntergang() 
      { 
       Scheibe = new Kreis();
       Scheibe.sichtbarMachen();
       Scheibe.farbeAendern("gelb"); 
       Scheibe.groesseAendern(90); 
       Scheibe.vertikalBewegen(50); 
       
       
   

    }
    public void Sonnenuntergang()
    { 
     for(int i=1;i<=500;i++)
     { 
     
         Scheibe.vertikalBewegen(5);
        } 
}
public class Sonnenaufgang
{ 

          public Sonnenaufgang()  
      { 
       Scheibe = new Kreis();
       Scheibe.sichtbarMachen();
       Scheibe.farbeAendern("gelb"); 
       Scheibe.groesseAendern(90); 
       Scheibe.vertikalBewegen(250); 
       
       
       
} 
 public void Sonnenuntergang()
    { 
     for(int i=1;i<=500;i++)
     { 
     
         Scheibe.vertikalBewegen(10);
        } 
    }
} 
} 
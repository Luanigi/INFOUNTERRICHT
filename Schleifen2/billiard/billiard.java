

public class billiard
{
 public Kreis kugel1;
 public Kreis Kugel2;
 private boolean istSichtbar;
 public void billiard (){
     Kugel1= new Kreis ();
  Kugel1.sichtbarMachen();
  Kugel1.farbeAendern("blau");
  Kugel1.horizontalBewegen(200);
  Kugel1.setzeY(Kugel1.gibY(2)+1);
   
  Kugel2= new Kreis ();
  Kugel2.sichtbarMachen();
  Kugel2.farbeAendern("gruen");
  Kugel2.horizontalBewegen(200);
  kugel2.vertikalBewegen(300);
  Kugel2.setzeY(Kugel2.gibY(5)+1);
}
}
  
  
  
        
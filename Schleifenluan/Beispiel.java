
public class Beispiel {
  

    public void hallo() {
        System.out.println("Hallo");
        System.out.println("Hallo");
        System.out.println("Hallo");
        System.out.println("Hallo");
        System.out.println("Hallo");
    }

    public void hallo2() {
        int i=1;
        while (i<=8) {
            System.out.println("Hallo");    
            i=i+1;    
        }
    }
    
    public void hallo3() {
        int i=1;
        while (i<=8) {
            System.out.println("Hallo");    
            i++;    
        }
    }
    
    public void hallo4() {
      for(int i=1;i<=5;i++) {
        System.out.println("Hallo");    
      }
    }
    
    public void tafel() {
        System.out.println("");
  
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= -1*i+8; j++) {
                 System.out.print(" ");
            }
            for (int x = 1; x <= 2*i-1;x++) {
                 System.out.print("x");
            }
            System.out.println("");
        }
    }
    
    public void dreiecklinks() {
        int n = 7;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            
        }
    }
   
    public void pyramides() {
        System.out.println("");
        System.out.println("           x");
        for (int i = 10; i > 0; i--) {
            String s = "";
            for (int j = 0; j < i; j++) {
                s += " ";
            }
            for (int k = 0; k <= 10-i; k++) {
                s += "x";
            }
            s += "x";
            for (int k = 0; k <= 10-i; k++) {
                s += "x";
            }
            for (int j = 0; j < i; j++) {
                s += " ";
            }
            System.out.println(s);
        }
    }
    
    
    public void zaehler() {
        System.out.println("");
        for (int i = 1; i <= 100; i++) {
           System.out.println(i);
        }
    }
    
    public void supertoll() {
        System.out.println("");
        for (int i = 1; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("supertoll");
           }
           if (i % 3 == 0) {
               System.out.println("super");
           }
           if (i % 5 == 0) {
               System.out.println("toll");
           }
           System.out.println(i);
        }
    }
    
    
    public void wurfel() {
        System.out.println("");
        
        int versuche = 0;
        int i;
        while (true) {
            versuche++;
            i = (int)(Math.random() * 6 + 1);
            System.out.println("gewürfelte Zahl: " + i);
            if (i == 6) {
                break;
            }
        } 
        System.out.println(versuche);
    }
    
    public void quada() {
        System.out.println("");
        for (int i = 0; i <= 20; i++) {
            String res = i + " x " + i + " = ";
            System.out.print(res);
            System.out.println((int)Math.pow(i,2));
        }
    }
    
    public void einmaleins() {
        System.out.println("");
        String res;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
               res = i + " x " + j + " = " + (i * j) + " \n";
               System.out.print(res);

            }
        }
    }
}


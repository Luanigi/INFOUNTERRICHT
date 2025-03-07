

public class Beispiel
{
  
    public Beispiel()
    {
       
    }

    public void hallo()
    {
    System.out.println("Hallo");
    System.out.println("Hallo");
    System.out.println("Hallo");
    System.out.println("Hallo");
    System.out.println("Hallo");
}

    public void hallo2()
    {
    int i=1;
    while (i<=8)
    {
    System.out.println("Hallo");    
    i=i+1;    
    }
    }
    
    public void hallo3()
    {
    int i=1;
    while (i<=8)
    {
    System.out.println("Hallo");    
    i++;    
    }
    }
    
    public void hallo4()
    {
    for(int i=1;i<=5;i++)
    {
    System.out.println("Hallo");    
    }
}

    public void hallo5()
    {
    System.out.println("");    
    for(int i=1;i<=5;i++)
    {
    System.out.println("Hallo "+i*2);    
    }
}

 public void hallo6()
    {
    System.out.println(""); 
    for(int i=1;i<=5;i++)
    {
    System.out.println("Hallo");
    System.out.println("Schluss");
    }
}

 public void hallo7()
    {
    System.out.println(""); 
    for(int i=1;i<=5;i++)
    {
    System.out.println("Hallo");
    }
    System.out.println("Schluss");
}

public void hallo8()
    {
    System.out.println(""); 
    for(int j=1;j<=3;j++)
    {
    for(int i=1;i<=5;i++)
    {
    System.out.println("Hallo");
    }
    System.out.println("Schluss");
}
}

public void hallo9()
    {
    System.out.println(""); 
    for(int j=1;j<=6;j++)
    {
    for(int i=1;i<=j;i++)
    {
    System.out.println("Hallo");
    }
    System.out.println("Schluss");
}
}
}

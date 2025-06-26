
/**
 * fibonacciiiiiii
 * 
 * @author Luan 
 * @version 1.0.0
 */
public class fibonacci {

    public fibonacci() {
        System.out.println("Rekursiv: " + rekursiv(10));
        System.out.println("Iterativ: " + iterativ(10));
    }

    int rekursiv(int n) {
        if (n <= 1) {
            return n;
        }
        
        return rekursiv(n-1) + rekursiv(n-2);
    }
    
    int iterativ(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a, b;
        a = 0;
        b = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;
    }
}


/**
 * fakultääääääääääääääääääääät
 * 
 * @author Luan 
 * @version 1.0.0
 */
public class Fakultaet {

    public Fakultaet() {
        System.out.println("Rekursiv: " + rekursiv(5)); 
        System.out.println("Iterativ: " + iterativ(5));
    }

    int rekursiv(int n) {
        
        if (n <= 1) {
            return 1;   
        }
        
        return n * rekursiv(n - 1);
    }

    int iterativ(int n) {
        
        int res = 1;
        
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}

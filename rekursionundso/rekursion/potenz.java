
/**
 * potennnnnzzzz
 * 
 * @author Luan 
 * @version 1.0.0
 */
public class potenz {

    public potenz() {
        System.out.println("Rekursiv: " + rekursiv(2, 5));
        System.out.println("Iterativ: " + iterativ(2, 5));
    }

    int rekursiv(int basis, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        
        return basis * rekursiv(basis, exponent - 1);
    }
    
    int iterativ(int basis, int exponent) {
        int res = 1;
        
        for (int i = 0; i < exponent; i++) {
            res *= basis;
        }
        
        return res;
    }
}

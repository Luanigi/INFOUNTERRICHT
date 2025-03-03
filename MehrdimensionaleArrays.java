
/**
 * @author Luan 
 * @version 1.0.0
 */
public class MehrdimensionaleArrays {    
    private String[] puppe = {"gerda", "hanna", "martha"};
    
    private String[][] puppe2D = {
            {"Gerda", "Schmitt"},
            {"Hanna", "Müller"},
            {"Martha", "Metz"}
    };

    public void arrayPrinting() {
        System.out.println(puppe[0]);
        
        System.out.println(puppe2D[0][0]);
        System.out.println(puppe2D[0][1]); 
    }
    
    public void arrayPrinting2() {
        for (int i = 0; i < puppe2D.length; i++) {
            for (int j = 0; j < puppe2D[i].length; j++) {
                System.out.print(puppe2D[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

package tpexception;

/**
 *
 * @author dmr
 */
public class TPException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = 2, b = 12, c;
                
        try {
            c = Calculette.division(a, b);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}

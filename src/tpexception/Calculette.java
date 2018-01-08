package tpexception;

import tpexception.exception.DivBy12Exception;

/**
 *  
 * @author dmr
 */
public class Calculette {
    
     /**
     * Effectue la division de a et b
     * @param a le dividende
     * @param b le diviseur
     * @return le résultat
     * @throws Exception si le diviseur = 0
     */
    // En ajoutant throws Exception à la méthode, on oblige le dev à vérifier 
    // notre retour dans un bloc try-catch dans le Main
    public static double division(double a, double b) throws Exception {
        if (b == 0) {
            Exception e = new Exception("Division par zéro");
            throw e;
        }
        if (b == 12) {
            DivBy12Exception e =new DivBy12Exception();
            throw e;
        }
        return a/b;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeralchallenge;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Devang
 */
public class NumeralChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Number n = new Number("[003256,3]");
        } catch (ExceptionString ex) {
            System.err.println(ex);
        }
    }
    
}

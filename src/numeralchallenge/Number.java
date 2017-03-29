/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeralchallenge;

/**
 *
 * @author Devang
 */
public class Number {
    String tupla;
    
    public Number(String tupla) throws ExceptionString{
         if(!tupla.matches("^[([0-9])+(,)([0-9])+]")){
            throw new ExceptionString("Are you even trying? Syntax [<<number>>,<<number>>] ");
        }
        String[] alfa= tupla.substring(1, tupla.length()-2).split(",");
        String numero= alfa[0];
        int length= Integer.parseInt(alfa[1]);
        if(length>=alfa.length-1)
            throw new ExceptionString("Yeaaaaah.... nope... Length for 2nd entry doesn't fit");
        
    }
    
}

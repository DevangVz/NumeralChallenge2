/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeralchallenge;

import java.util.LinkedList;

/**
 *
 * @author Devang
 */
public class Number {
    String string;
    int limit;
    LinkedList<Integer> values;
    public Number(String tupla) throws ExceptionString{
         if(!tupla.matches("^\\[([0-9])+(,)([0-9])+\\]")){
            throw new ExceptionString("Are you even trying? Syntax [<<number>>,<<number>>] ");
        }
        String[] alfa= tupla.substring(1, tupla.length()-1).split(",");
        string= alfa[0];
        limit= Integer.parseInt(alfa[1]);
        if(limit>=string.length()&&limit>1)
            throw new ExceptionString("Yeaaaaah.... nope... Length for 2nd entry doesn't fit");
    }
    public void setValues(){}
    
    
}

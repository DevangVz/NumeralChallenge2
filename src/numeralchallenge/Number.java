/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeralchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Devang
 */
public class Number {
    String string;
    int limit;
    List<Integer> values;
    public Number(String tupla) throws ExceptionString{
         if(!tupla.matches("^\\[([0-9])+(,)([0-9])+\\]")){
            throw new ExceptionString("Are you even trying? Syntax [<<number>>,<<number>>] ");
        }
        String[] alfa= tupla.substring(1, tupla.length()-1).split(",");
        string= alfa[0];
        limit= Integer.parseInt(alfa[1]);
        
        if(limit>=string.length() )
            throw new ExceptionString("Yeaaaaah.... nope... Length for 2nd entry doesn't fit");
        System.out.println("["+string+"]");
        setValues();
    }
    public void setValues(){
        values=new ArrayList<Integer>(); 
        String setV="[ ";
        for(int i=0; i <string.length()-limit+1;i++){
            setV+=string.substring(i, limit+i).concat(" ");
            values.add(Integer.parseInt(string.substring(i, limit+i)));
             
        }
        setV+="]";
        System.out.println(setV);
        sorting();
    }
    
    public void sorting(){
        Collections.sort(values);
        System.out.println("Max:"+values.get(values.size()-1) +" Min:"+values.get(0));
    }
    
    
    
    
}

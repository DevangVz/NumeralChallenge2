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
        setValues();
    }
    public void setValues(){
        values=new ArrayList<Integer>();
        for(int i=0; i <string.length()-limit+1;i++){
            values.add(Integer.parseInt(string.substring(i, limit+i)));
            //System.out.println(values.size());
        }
        sorting();
    }
    
    public void sorting(){
        Collections.sort(values);
        Iterator<Integer> a= values.iterator();
        while(a.hasNext())
            System.out.println(a.next());
        

        System.out.println("Max:"+values.get(values.size()-1) +" Min:"+values.get(0));
    }
}

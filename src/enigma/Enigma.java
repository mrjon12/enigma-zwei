/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Enigma {

    public static void main(String[] args) {

        String tekst = "ABDFSDFYZ";
        String wynik,wynik1;
       Cypher c = new Cypher();
   
       //czy w alfabecie ---------------------------        
       if (!tekst.matches("^["+c.getAlphabet()+"]*$")) {
            throw new IllegalArgumentException("Poza alfabetem");
        }
      // ------------------------------------------
       
       
      wynik = c.encrypt(tekst);
      System.out.println(wynik);
      wynik1 = c.decrypt(wynik);
      System.out.println(wynik1);
        
 
        

        
        
        
    }
}

//------------------------------------------
// spacja ma 32
// duze Z ma 90
//regex101.com
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions
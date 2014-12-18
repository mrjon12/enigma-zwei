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

        StringBuilder sb = new StringBuilder();

        String tekst = "ABCDFGZ";
        int offset = 1;
        int tmp;
        char znak;
        
// czy w alfabecie ---------------------------        
        if (!tekst.matches("^[ -Z]*$")) {
            throw new IllegalArgumentException("Poza alfabetem");
        }
// zmiana wg offseta -------------------------
        for (int j = 0; j < tekst.length(); j++) {
            
            znak = tekst.charAt(j);
            //znak +=offset;
            tmp = (int)znak-32;
            tmp = ((tmp+offset) % 59);
            tmp+=32;
            znak = (char)tmp;
            sb.append((char)znak);
        }
        System.out.println(sb.toString());
    }
}

//------------------------------------------
// spacja ma 32
// duze Z ma 90
//regex101.com
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions
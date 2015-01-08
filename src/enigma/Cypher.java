/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

/**
 *
 * @author Student
 */
public class Cypher {
    
    private int offset;
    private String alphabet="ABCDEFGHIJKLMNOPQRSTUWVXYZ";
    
    public String getAlphabet()
    {
        return alphabet;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    public Cypher()
    {
        offset=1;
    }
    
    public String encrypt(String tekst)
    {
        StringBuilder sb = new StringBuilder();
         int tmp;
         char znak;
         for (int j = 0; j < tekst.length(); j++) 
         {
            znak = tekst.charAt(j);
            tmp = alphabet.indexOf(znak);
            tmp = ((tmp+offset) % alphabet.length());
            if(tmp<0)tmp+=alphabet.length();
            znak = alphabet.charAt(tmp);
            sb.append(znak);
        }
       
        return sb.toString();
    }
    
    public String decrypt(String tekst)
    {
        StringBuilder sb = new StringBuilder();
         int tmp;
         char znak;
         for (int j = 0; j < tekst.length(); j++) 
         {
            znak = tekst.charAt(j);
            tmp = alphabet.indexOf(znak);
            tmp = ((tmp-offset) % alphabet.length());
            if(tmp<0)tmp+=alphabet.length();
            znak = alphabet.charAt(tmp);
            sb.append(znak);
        }
       
        return sb.toString();
    }
    
}

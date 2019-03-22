/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev1;

import java.io.*;//SINIFLARI EKLEME


/**
 *
 * @author Cengoo
 */
public class Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String yazi="[sayı] ::= [rakam] | [sayı] [rakam] [rakam] ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 ";
        String str;
        try{
            FileInputStream fStream=new FileInputStream("BNF.txt");
            DataInputStream dStream=new DataInputStream("BNF.txt");
        }catch(Exception e)
        {
            System.err.println("hata : "+ e.getMessage());
        }
        
        
        String yazi="[A] ::= [A] | [A][B] | [A][B][C] [B] ::= [B] | [C] | e [C] ::= [C] | [A] | f | g | h ";
        String terminal="";
        File dosya = new File("BNF.txt");
        FileReader DosyaOku = new FileReader(dosya);
        for(int i=0;i<yazi.length();i++){    
            if(yazi.charAt(i)== '[')
            {
                do{//non-terminal bitene kadar döngü
                    i++;
                }while(yazi.charAt(i)==']');
            }
            else if(yazi.charAt(i)=='|'){
                if(yazi.charAt(i-2)!= ']')
                {
                    terminal=terminal+yazi.charAt(i-2);
                }
            }
            else if(i==(yazi.length()-1)){            
                    terminal=terminal+yazi.charAt(i-1);
            }
        }
        
        System.out.println(terminal);
    }
    
}

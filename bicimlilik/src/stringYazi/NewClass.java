/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringYazi;

/**
 *
 * @author Cengoo
 */
import java.util.*;
public class NewClass {
    public static void main(String[] arg)
    {
        /*String s="asd";
        StringBuffer s1=new StringBuffer();
        s1.append(s).append(15);
        System.out.println(s1);
        s1.insert(3, "dada");
        System.out.println(s1);
        s1.deleteCharAt(1);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        */
        Scanner veriAl=new Scanner(System.in);
        System.out.print("Kelime girin lütfen..:");
        String yazi=veriAl.next();
        if(kontrol(yazi))
            System.out.println("Kelime palindorme");
        else
            System.out.println("Kelime palindorme değil");
        
        
    }
    public static boolean kontrol(String x)
    {
        int s=x.length();
        String ss="";
        for(int i=(s-1);i>=0;i--)
        {
            ss+=x.charAt(i);
        }
        return ss.equals(x);
    }
}

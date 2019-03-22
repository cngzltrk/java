/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat;

/**
 *
 * @author Cengoo
 */
import java.util.*;
public class mat {
    public static void main(String[] arg)
    {
        Scanner veriAl=new Scanner(System.in);
        System.out.println("Derece gir...:");
        int derece=veriAl.nextInt();
        System.out.println(Math.cos(Math.toRadians(derece)));
        System.out.println(Math.sin(derece));
        System.out.println(Math.cos(derece)/Math.sin(derece));
        System.out.println(Math.sin(derece)/Math.cos(derece));
    }
    String as="";
}

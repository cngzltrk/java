/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygu;

/**
 *
 * @author Cengoo
 */
import java.util.*;


public class UYGU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Karakter k=new Karakter();
        /*System.out.println(k.RastgeleKarakter());
        System.out.println(k.RastgeleKarakter());
        System.out.println(k.RastgeleKarakter(3));
        System.out.println(k.RastgeleKarakter(3));
        System.out.println(k.verilenKarakter('A', 'd'));
        System.out.println(k.verilenKarakter('K', 'z',3));
        System.out.println(k.belirtilenKarakter("asdfghjk"));
        System.out.println(k.belirtilenKarakter("asdfghjk",2));*/
        //k.Aralik('a', 'A');
        Calendar simdi=Calendar.getInstance();
       /*// System.out.println(simdi.get(Calendar.DATE));         // 24
        //System.out.println(simdi.get(Calendar.YEAR));         // 2014
       // System.out.println(simdi.get(Calendar.HOUR));         // 2
       // System.out.println(simdi.get(Calendar.MINUTE));       // 12
               // 51
        int saniye=simdi.get(Calendar.SECOND);
        System.out.println(saniye);*/
       //Thread.sleep(1000);
      // System.out.println(simdi.get(Calendar.MILLISECOND));
     //  System.out.println(simdi.get(Calendar.MILLISECOND));
       //Thread.sleep(1000);
       RastgeleSayi rs= new RastgeleSayi();
      
        System.out.println(rs.Sayi());
       
        System.out.println(rs.Sayi());
        System.out.println(rs.Sayi());
        System.out.println(rs.Sayi());
        System.out.println(rs.Sayi());
        System.out.println(rs.Sayi());
        System.out.println(rs.Sayi());
        System.out.println(rs.Sayi());
        
     //  System.out.println(rs.Sayi());
      // Scanner gir=new Scanner(System.in);
      // int x;
       /*do
       {
           System.out.println(rs.Sayi());
           x=gir.nextInt();
           
       }while(x!=0);*/
        
    }
    
}

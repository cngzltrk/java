/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
*
* @author Cengiz Altürk  G140910048 cngzltrk@gmail.com  
*         Elmar Dadaşov  G151210564
* @since 29.04.2017

*/
public class Odev4 {

    public static void main(String[] args) {
        Scanner veriAl=new Scanner(System.in);
        System.out.print("Sayi giriniz...:");
        Sayi sy=new Sayi(veriAl.nextLong());
        Sayi snc=new Sayi();
        havuz h=new havuz(sy,snc);
        Dosyalama d=new Dosyalama();
        ExecutorService hvz=Executors.newFixedThreadPool(1);
        sy.sureBas();
        hvz.execute(h);
        hvz.shutdown();
        while(!hvz.isTerminated())
        {}
        sy.sureBit();
        System.out.println("Seri Hesaplanma Süresi " + String.format("%.2f", sy.sure()) + " milisaniye.");
        h.HavuzSayisi(sy.getSayi());
        hvz=Executors.newFixedThreadPool(h.HavuzSayisi());
        snc.setSifirla();
        sy.sureBas();
        long aralik=sy.getSayi()/h.HavuzSayisi();
        long bas=0,bit=0;
        for(int i=1;i<=h.HavuzSayisi();i++)
        {
            if(i==1)
            {
                bas=sy.getSayi();
                bit=bas-aralik;
            }
            else
            {
                bas=bit-1;
                bit=bas-aralik;
                if(bit<1)
                {
                    bit=1;
                }
            }
            hvz.execute(new havuz(sy,snc,bas,bit));
        }
        hvz.shutdown();
        while(!hvz.isTerminated())
        {}
        sy.sureBit();
        System.out.println("Paralel Hesaplanma Süresi " + String.format("%.2f", sy.sure()) + " milisaniye.");
        d.writer(String.valueOf(snc.getSnc())+"    \n");
        System.out.println("Sonuc Dosyaya Yazıldı.");

    }
    
}

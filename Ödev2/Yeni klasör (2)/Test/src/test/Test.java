/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import Rastgele.*;
import java.util.*;
/*
 * 
 * @author Yazar Cengiz Altürk   ve Özge Rudabe Külekçi
cngzltrk@gmail.com  
* @since Programın yazıldığı tarih: 13.3.2017
* 
*/ 
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Karakter k=new Karakter();
        for(int i=1;i<=7;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==1)
                    System.out.println("Rastgele karakter ..: "+k.RastgeleKarakter());
                else if(i==2)
                    System.out.println("Rastgele 3 karakter ..: "+k.RastgeleKarakter(3));
                else if(i==3)
                    System.out.println("Verilen  karakter (a,z) ..: "+k.verilenKarakter('a', 'z'));
                else if(i==4)
                    System.out.println("Verilen  karakterlerden 2 karakter uzunluğunda(a,z) ..: "+k.verilenKarakter('a', 'z',2));
                else if(i==5)
                    System.out.println("Belirtilen  karakter (abcdefg) ..: "+k.belirtilenKarakter("abcdefg"));
                else if(i==6)
                    System.out.println("Belirtilen  karakter 2 karakter uzunluğunda (abcdefg) ..: "+k.belirtilenKarakter("abcdefg",2));
                else
                    System.out.println("5 kelimeli rastgele cümle) ..: "+k.Cumle(5));
            }
        }
        System.out.println("========================================================================="); 
        //Burda menümüz bulunmaktadır istenirse menüden de seçim yaparak işlem yapmak istenirse
        /*byte secim=0;
        String x,y;
        int sayi;
        Scanner veriAl=new Scanner(System.in);
        do{
            System.out.println("1- Rastgele Tek Karakter..");
            System.out.println("2- Rastgele İstenilen Karakter..");
            System.out.println("3- Verilen  Karakter ve rastgele tek karakter  ..");
            System.out.println("4- Verilen  Karakter ve rastgele istenilen karakter..");
            System.out.println("5- Belirtilen  Karakter ve rastgele tek karakter..");
            System.out.println("6- Belirtilen  Karakter ve rastgele istenilen karakter..");
            System.out.println("7- Rastgele Cümle oluşturmak  ..");
            System.out.println("0- Çıkış");

            System.out.print("Seçim...:");
            secim=veriAl.nextByte();
            
            switch(secim){
                case 1:
                    System.out.println("Rastgele karakter ...: "+k.RastgeleKarakter());
                    break;
                case 2:
                    System.out.print("Kaç Karakterli ..:");
                    sayi=veriAl.nextInt();
                    System.out.println("Rastgele " + sayi + "Karakter ...: "+ k.RastgeleKarakter(sayi));
                    break;
                case 3:
                    
                    System.out.print("1 .Karakter Aralıgı ..:");
                    x=veriAl.next();
                    System.out.print("2 .Karakter Aralıgı ..:");
                    y=veriAl.next();
                    System.out.println("Verilen  karakter ("+x+","+y+") ..: "+k.verilenKarakter(x.charAt(0), y.charAt(0)));
                    break;
                case 4:
                    System.out.print("1 .Karakter Aralıgı ..:");
                    x=veriAl.next();
                    System.out.print("2 .Karakter Aralıgı ..:");
                    y=veriAl.next();
                    System.out.print("Kaç Karakterli ..:");
                    sayi=veriAl.nextInt();
                    System.out.println("Verilen  karakter ("+x+","+y+") ..: "+k.verilenKarakter(x.charAt(0), y.charAt(0),sayi));
                break;
                case 5:
                    System.out.print("Karakterler girin ..:");
                    x=veriAl.next();
                    System.out.println("Belirtilen  karakter ("+x+") ..: "+k.belirtilenKarakter(x));

                    break;
                case 6:
                    System.out.print("Karakterler girin ..:");
                    x=veriAl.next();
                    System.out.print("Kaç Karakterli ..:");
                    sayi=veriAl.nextInt();
                    System.out.println("Belirtilen  karakter ("+x+") ..: "+k.belirtilenKarakter(x,sayi));
                    break;
                case 7:
                    System.out.print("Kaç Kelimeli  ..:");
                    sayi=veriAl.nextInt();
                    System.out.println("Cümle  ..: "+k.Cumle(sayi));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı Seçim");
                    break;
            }
        
        }while(secim!=0);*/
        
    }
    
}

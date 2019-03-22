/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rastgele;
import java.util.*;

/*
 * 
 * @author Yazar Cengiz Altürk   ve Özge Rudabe Külekçi
    cngzltrk@gmail.com  
* @since Programın yazıldığı tarih: 13.3.2017
* 
*/ 
public class Sayi {
    private Calendar saniye;
    private int sayi;
    Sayi(){
    }
    //burdaki hata yakalama kullanılan  bekleme metodu yani sleep komutundan kaynaklı ve her fonskiyonda kontrolünü istediğinden tüm fonksiyonlarımda bulunmaktadır
    private void Bekleme() throws InterruptedException{//bu fonksiyonum bilgisayarın rastgele sayı üretmesi için bekleme sağlamk için yoksa hep sabit sonuç vermektedir
        saniye= Calendar.getInstance();
        sayi=(saniye.get(Calendar.MILLISECOND)%50);
        Thread.sleep(sayi);
    }
    public int RastgeleSayi() throws InterruptedException
    {
        short k=0;//burda dizimin uzunlugunda olmasını sağlicak sayı elde etmek için
        Bekleme();//ardarda çağrıldığında aynı sonuç vermemesi için bekletme
        saniye= Calendar.getInstance();
        //burda rastgele sayımızı dizi uzunluğuna göre  rastgele sayı sonuç veresini sağlıyorm
        for(int i=0;i<=(saniye.get(Calendar.MILLISECOND)%100);i++)//miilisecond 0-999 değer aldığı için işlemciyi falza yormamak için kısmende olsa azaltmaya çalıştım
        {
            k++;
            if(k==52)//dizi uzunluğu 51 i geçtimi k yı sıfırlatma
                k=0;
        }
        return k;
    }
    public int RastgeleSayi(int x) throws InterruptedException //bu fonksiyonm bertilen karakterlerin sayısı uzunluğunda rastgele seçim sağlaması için
    {
        short k=0;
        Bekleme();
        saniye= Calendar.getInstance();
        for(int i=0;i<=(saniye.get(Calendar.MILLISECOND)%100);i++)
        {
            k++;
            if(k==x)
                k=0;
        }
        return k;
    }
    public int RastgeleSayi(int x,int y) throws InterruptedException //bu fonksiyonum verilen indeksler içinde rastgele seçim yapmamızı sağlıyor
    {
        int k=x;
        Bekleme();
        saniye= Calendar.getInstance();
        for(int i=0;i<=(saniye.get(Calendar.MILLISECOND)%100);i++)
        {
            k++;
            if(k==(y+1))//y+1 yapmamın sebebi yani son karakteride kapsaması için
                k=x;
        }
        return k;
    }
}

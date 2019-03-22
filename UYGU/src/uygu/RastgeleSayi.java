/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygu;
import java.util.*;
/**
 *
 * @author Cengoo
 */
public class RastgeleSayi {
    private Calendar saniye ;
    private int sayi;
    public RastgeleSayi(){
        saniye=Calendar.getInstance();
        sayi=(saniye.get(Calendar.MILLISECOND)%100);
    }
    public void Sayimiz() throws InterruptedException
    {
        saniye= Calendar.getInstance();
        sayi=(saniye.get(Calendar.MILLISECOND)%100);
        Thread.sleep(sayi);
    }
    public int Sayi() throws InterruptedException 
    {
        short k=0;
        Sayimiz();
        //Thread.sleep(sayi);
        saniye= Calendar.getInstance();
        //burda rastgele sayımızı dizi uzunluğuna göre  rastgele sayı sonuç veresini sağlıyorm
        for(int i=0;i<=(saniye.get(Calendar.MILLISECOND)%100);i++)
        {
            k++;
            if(k==52)//dizi uzunluğu 51 i geçtimi k yı sıfırlatma
                k=0;
        }
        return k;
    }
    public int Sayi(int x) 
    {
        short k=0;
        //Thread.sleep(51);
        saniye= Calendar.getInstance();
        for(int i=0;i<=saniye.get(Calendar.MILLISECOND);i++)
        {
            k++;
            if(k==(x))
                k=0;
        }
        return k;
    }
    public int Sayi(int x,int y) 
    {
        int k=x;
        //Thread.sleep(51);
        saniye= Calendar.getInstance();
        for(int i=0;i<=saniye.get(Calendar.MILLISECOND);i++)
        {
            k++;
            if(k==(y+1))
                k=x;
        }
        return k;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;

/**
*
* @author Cengiz Altürk  G140910048 cngzltrk@gmail.com  
*         Elmar Dadaşov  G151210564
* @since 29.04.2017

*/
public class havuz implements Runnable {
    private Sayi sayi;
    private Sayi sonuc;
    private int havuzSayisi;
    private long bas,bit;
    public havuz(Sayi sayi,Sayi sonuc){
        this.sayi=sayi;
        this.sonuc=sonuc;
        this.bas=sayi.getSayi();
        this.bit=1;
    }
    public havuz(Sayi sayi,Sayi sonuc,long bs,long bt){
        this.sayi=sayi;
        this.sonuc=sonuc;
        HavuzSayisi(sayi.getSayi());
        this.bas=bs;
        bit=bt;
    }
    public void HavuzSayisi(long s){
        havuzSayisi=2;
        for(int i=1;true;i++)
        {
            s=s/10;
            if(s< 1)
            {
                break;
            }
            havuzSayisi++;
        }
    }
    public int HavuzSayisi(){
        return havuzSayisi;
    }
    @Override
    public void run() {
        for(long i=bas;i>=bit;i--)
        {
            sonuc.setSayi(i);
        }
    }
}

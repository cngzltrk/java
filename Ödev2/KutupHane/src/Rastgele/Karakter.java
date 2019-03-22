/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rastgele;

/*
 * 
 * @author Yazar Cengiz Altürk   ve Özge Rudabe Külekçi
	cngzltrk@gmail.com  
* @since Programın yazıldığı tarih: 13.3.2017
* 
*/ 
public class Karakter {
    Sayi rs;//rastgele Sayi
    private char Karakterler[]=new char[]{// ascıı den de direk alabilirdim  ama ben dizi oluşturdum ve bu diziyi ascı ye benzeterek yaptım
        'A','B','C','D','E','F','G','H','İ','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
    };
     public Karakter()
    {
        rs=new Sayi();
    }
    public char RastgeleKarakter() throws InterruptedException{//tek karakter rastgele seçim
        return Karakterler[rs.RastgeleSayi()];
    }
    public String RastgeleKarakter(int x) throws InterruptedException{//belirtilen uzunluk kadar kelime üsretimi
        String yazi="";
        for(int i=0;i<x;i++)
            yazi+=RastgeleKarakter();
        return yazi;
    }
    public char verilenKarakter(char x,char y) throws InterruptedException//karakter aralıkları rastgele seçim
    {
        int buyuk,kucuk;//burda amacım eğer z b verse bile program hangisinin büyük hangisi küçük  olduğunu bulması için kontrol
        if((int)x>(int)y)
        {
            buyuk=(int)x;
            kucuk=(int)y;
        }
        else
        {
            buyuk=(int)y;
            kucuk=(int)x;
        }  
        if(kucuk<91)//burda eğer büyük harf küçükse girsin ve benim dizimin indekslerine uyum sağlicak şekilde işlem yapmak için kontrolüm
        {
            kucuk=kucuk-65;//harfimiz Büyük yani 65 çıkarırsam dizimin indeklerindeki harfleri ayarlamış olurum
            if(buyuk>96)//buyuk sayımız yani küçük harfli ise dizeme uyum sağlaması için
                buyuk=buyuk-71;//burda aslında ascıı 97 den başlıyor küçük harfler ama benim dizimde de 26 cı indeksten başıyor o yüznde 71 çıkardım
            else
                buyuk=buyuk-65;//eğer küçük harf değilse demek ki bütyük harffli onuda dizime uyum sağlaması için indeksi ayarladım
        }
        else//eğer yukardakler değilse demeki ikiside küçük
        {
            kucuk=kucuk-71;//burda ascıı de  97 den başlıyor küçük harfler ama benim dizimde de 26 cı indeksten başıyor o yüznde 71 çıkardım
            buyuk=buyuk-71;
        }
        return Karakterler[rs.RastgeleSayi(kucuk,buyuk)];
    }
    public String verilenKarakter(char x,char y,int s) throws InterruptedException //verilen aralıkta istenilen uzunlukta kelime
    {
        String yazi="";
        for(int i=0;i<s;i++)
            yazi+=verilenKarakter(x,y);
        return yazi;
    }
    public char belirtilenKarakter(String x) throws InterruptedException//belirtilen karkaterlerden rastgele seçim
    {
        return x.charAt(rs.RastgeleSayi(x.length()));
    }
    public String belirtilenKarakter(String x,int s) throws InterruptedException//belirtilen karakterlerden istenilen uzunlukta kelime 
    {
        String yazi="";
        for(int i=0;i<s;i++)
            yazi+=belirtilenKarakter(x);
        return yazi;
    }
    public String Cumle(int x) throws InterruptedException//istenilen uzunlukta cümle  oluşturmak
    {
        String yazi="";
        String kelime="";
        int s;
        for(int i=0;i<x;i++)
        {
            do//burda rastgelen gelen sayı 0 ve 1 ise kelime saymamak için kontrolüm
            {
                s=rs.RastgeleSayi()%10;//kelime uzunluğunu 10 olarak ayarladım 
            }while(s<2);
            kelime=RastgeleKarakter(s);
            yazi+=kelime+" ";
        }
        return yazi;
    }
}

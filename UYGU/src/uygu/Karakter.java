/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygu;

/**
 *
 * @author Cengoo
 *//*
public class Karakter {
    RastgeleSayi rs;
   
    private char Karakterler[]=new char[]{
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        'A','B','C','D','E','F','G','H','İ','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };
     public Karakter()
    {
        rs=new RastgeleSayi();
    }
    public char RsKr() throws InterruptedException{
        return Karakterler[rs.Sayi()];
    }
    public String RsKr(int x) throws InterruptedException{
        String yazi="";
        int k=1;
        for(int i=1;i<=x;i++)
        {
            k++;
            if(k==15)
                k=1;
                
            Thread.sleep(k*k);
            yazi+=RsKr();
        }
        return yazi;
        
    }
    
}*/

public class Karakter {
    RastgeleSayi rs;//rastgele Sayi
    private char Karakterler[]=new char[]{
        'A','B','C','D','E','F','G','H','İ','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'  
    };
     public Karakter()
    {
        rs=new RastgeleSayi();
    }
    public char RastgeleKarakter() throws InterruptedException{//tek karakter rastgele seçim
        return Karakterler[rs.Sayi()];
    }
    public String RastgeleKarakter(int x) throws InterruptedException{
        String yazi="";
        /*
        Burdaki k hem rastgele sayı üretmemize olanak sağlıyor hemde fit olarak bilgisayarın
        bekleme süresini  kısmen de olsa kısıtlıyor 
        */
        int k=1;
        for(int i=1;i<=x;i++)//burdaki dönkü istenilen uzunluk kadar kelime üretiyor
        {
            k++;
            if(k==15)//burda 15 olarak ayarladım fazla bekletme olamsın diye
                k=1;
            Thread.sleep(k*k);//burda bekletme sağlıyorum çünkü rastgele sayı istediğimde farklı sonuç vermesi için 
            yazi+=RastgeleKarakter();
        }
        return yazi;
    }
    public char verilenKarakter(char x,char y)
    {
        int buyuk,kucuk;
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
        
        if(kucuk<91)
        {
            kucuk=kucuk-65;
            if(buyuk>96)
                buyuk=buyuk-71;
            else
                buyuk=buyuk-65;
        }
        else
        {
            kucuk=kucuk-71;
            buyuk=buyuk-71;
        }
        return Karakterler[rs.Sayi(kucuk,buyuk)];
    }
    public String verilenKarakter(char x,char y,int s) throws InterruptedException
    {
        String yazi="";
        int k=1;
        for(int i=1;i<=s;i++)
        {
            k++;
            if(k==10)
                k=1;
            Thread.sleep(k*k);
            yazi+=verilenKarakter(x,y);
        }
        return yazi;
    }
    public char belirtilenKarakter(String x)
    {
        return x.charAt(rs.Sayi(x.length()));
    }
    public String belirtilenKarakter(String x,int s) throws InterruptedException
    {
        String yazi="";
        int k=1;
        for(int i=1;i<=s;i++)
        {
            k++;
            if(k==10)
                k=1;
            Thread.sleep(k*k);
            yazi+=belirtilenKarakter(x);
        }
        return yazi;
    }
}

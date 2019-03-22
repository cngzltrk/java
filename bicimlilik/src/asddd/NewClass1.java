/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asddd;

/**
 *
 * @author Cengoo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
/**
 *
 * @author Cengoo
 */
public class NewClass1 {
    private int maksimum;
    private int son ;
    private int minimum;
    //bu min ve max değerlerini alarak rastgele sayı üreten fonksiyonlar
    public int RastgeleSayiUret(int max,int min){
        this.maksimum = max;
        this.minimum = min;
        son = (int) (System.currentTimeMillis() % max);
        return this.sayiUret();
    }
    
    public int sayiUret(){
        int sayi= son % maksimum;
            while(sayi<minimum || sayi>maksimum)
            {
              
                son = (son * 32719 + 3) % 32749;
                sayi= son % maksimum;
            }
            if(sayi>90&&sayi<98)
                this.RastgeleSayiUret(122, 65);
            return sayi;
    }
}

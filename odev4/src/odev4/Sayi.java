/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;

import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
*
* @author Cengiz Altürk  G140910048 cngzltrk@gmail.com  
*         Elmar Dadaşov  G151210564
* @since 29.04.2017

*/
public class Sayi {
    private long sayimiz;
    private long bas,bit;
    public BigInteger sonuc=new BigInteger("1");
    private final Lock bolge = new ReentrantLock();
    public Sayi(long s){
        sayimiz=s;
        
    }
    public Sayi(){
        sayimiz=1;
    }
    public void sureBas(){
        bas=System.nanoTime();
    }
    public void sureBit(){
        bit=System.nanoTime();
    }
    public double sure(){
        return (bit-bas)/1000000.0;
    }
    public void setSayi(long s){
        bolge.lock();
        sonuc=sonuc.multiply(BigInteger.valueOf(s));
        bolge.unlock();
    }
    public void setSifirla(){
        sonuc=new BigInteger("1");
    }
    public BigInteger getSnc(){
        //bolge.lock();
        return sonuc;
        //bolge.unlock();
    }
    public long getSayi(){
        return sayimiz;
    }

}

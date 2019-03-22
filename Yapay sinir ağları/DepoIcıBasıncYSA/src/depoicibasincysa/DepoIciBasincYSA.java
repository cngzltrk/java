/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoicibasincysa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cergo
 */
public class DepoIciBasincYSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int araKatmanNoronSayisi;
        double momentum,ogrenmeKatsayisi,error;
        int epoch,sec=0;
        YSA ysa=null;
        do{
            System.out.println("1. Egitim  Yap");
            System.out.println("2. Ağı test et  ");
            System.out.println("3. Tekli Test Yap");
            System.out.println("4. Cikis");
            System.out.print("?=>");
            sec = in.nextInt();
            int kontrol=0;
            switch(sec)
            {
                case 1:
                    System.out.print("Ara Katman Noron Sayisi  =");
                    araKatmanNoronSayisi = in.nextInt();
                    System.out.print("Momentum  =");
                    momentum = in.nextDouble();
                    System.out.print("Ogrenme Kaysayisi  =");
                    ogrenmeKatsayisi = in.nextDouble();
                    System.out.print("Min Hata  =");
                    error = in.nextDouble();
                    System.out.print("Epoch Sayısı  =");
                    epoch = in.nextInt();
                    ysa = new YSA(araKatmanNoronSayisi, momentum , ogrenmeKatsayisi , error, epoch);
                    ysa.egit();
                    System.out.println("Egitim Sonunda Elde Edilen Hata : "+ysa.EgitimHata()+"\n");
                    kontrol=1;
                    break;
                case 2:
                    if(kontrol==1)
                        System.out.print("Test Sonunda Elde Edilen Hata : "+ysa.test());
                    else
                        System.out.println("önce eğitim");
                    break;
                case 3:
                    if(ysa ==null)
                    {
                        System.out.println("önce eğitim");
                        break;
                    }
                    double []inputs = new double[2];
                    System.out.print("Sicaklik (0-60) : ");
                    inputs[0]=in.nextDouble();
                    System.out.print("Hacim (Küp hacmi Hesaplanacaktır lütfen metre girin (5-450): ");
                    inputs[1]=in.nextDouble();
                    inputs[1]=inputs[1]*inputs[1]*inputs[1];
                    System.out.print("Basınç : "+ysa.tekTest(inputs));
                    break;
            }
        }while(sec != 4);
    }
    
}

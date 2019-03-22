/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


/**
*
* @author Cengiz Altürk  G140910048 cngzltrk@gmail.com  
*         Elmar Dadaşov  G151210564
* @since 29.04.2017

*/
public class Dosyalama {
    
    private String dosyaYolu="C:\\Users\\Cengo\\Desktop\\Ders\\Java\\Netblans\\Uygulamalar\\odev4\\sonuc.txt";
    private File dosya=new File(dosyaYolu);
    private FileWriter fw;
    private BufferedWriter bf;
    public Dosyalama(){
        try{
            dosya.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void writer(String metin)
    {
        try{
            
            fw=new FileWriter(dosya,true);
            bf=new BufferedWriter(fw);
            bf.write(metin);
            bf.flush();
            bf.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoıcıbasınc;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import net.sourceforge.jFuzzyLogic.FIS;
/**
 *
 * @author Cergo
 */
public class Basinc {
    private FIS fis;
    private double sicaklik;
    private double hacim;
     public Basinc(double s,double h)throws URISyntaxException
    {
        sicaklik=s;
        hacim=h;
        //hata fırlattığınfan yakamak gerek
        File dosya=new File(getClass().getResource("model.fcl").toURI());
        //2 . değişken eğer daha önce yüklenmişse onun üstüne yazmak için
        fis=FIS.load(dosya.getPath(),true);
        fis.setVariable("sicaklik",sicaklik );
        fis.setVariable("hacim", hacim);
        fis.evaluate();//hesaplandı
        
    }
    public Basinc()throws URISyntaxException
    {
        File dosya=new File(getClass().getResource("model.fcl").toURI());
        //2 . değişken eğer daha önce yüklenmişse onun üstüne yazmak için
        fis=FIS.load(dosya.getPath(),true);
    }
    public FIS getModel()
    {
        return fis;
    }
    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.000");    
        
        String cikti=sicaklik+" "+hacim+" "+ formatter.format(fis.getVariable("basinc").getValue());
        try{
                  File dosya = new File("test.txt");
                  FileWriter yazici = new FileWriter(dosya,true);
                  BufferedWriter yaz = new BufferedWriter(yazici);
                  yaz.write(cikti);
                  yaz.newLine();
                  yaz.close();
                  System.out.println("Ekleme İşlemi Başarılı");
            }
            catch (Exception hata){
                  hata.printStackTrace();
            }
        return cikti;
    }
}

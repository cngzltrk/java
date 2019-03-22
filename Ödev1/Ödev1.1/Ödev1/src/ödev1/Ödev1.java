/*
 * 
 * @author Yazar Cengiz Altürk   ve cngzltrk@gmail.com  
* @since Programın yazıldığı tarih: 2.3.2017
* 
*/ 
 package ödev1;
//gerekli kütüphaneler
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author Cengoo
 */
public class Ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //dosya okuma
        File f = new File("BNF.txt");
        FileReader fr = new FileReader(f);
        LineNumberReader lnreader = new LineNumberReader(fr);
        String yazi = "",terminal="";
        while ((yazi = lnreader.readLine()) != null) {
            String trim = yazi.trim();
            //baştan ve sondan olan boşlukları kaldır
            boolean sol=false;
            for(int i=0;i<trim.length();i++){
                if(trim.charAt(i)== '=')//burda eşitliğin solunda iken terminal olsada kabul etmiyoruz onun için işlem
                    sol =true;
                if(sol)//sol tarafta isek durmadan gir ve terminalleri bul
                {
                    if(trim.charAt(i)== '[')
                    {
                        do{//non-terminal bitene kadar döngü
                            i++;
                        }while(trim.charAt(i)==']');
                    }
                    else if(trim.charAt(i)=='|'){
                        if(trim.charAt(i-2)!= ']')
                        {
                            terminal=terminal+trim.charAt(i-2);
                        }
                    }
                    //sona geldiğinde terminal olup olmadığı kontrolü
                    else if(i==(trim.length()-1)){
                        if(trim.charAt(i) !=']') 
                        {
                            terminal=terminal+trim.charAt(i);
                        }
                    }
                }
            }
            sol=false;//yeni satıra geçtiğinde  sağ tarafı bulana kadar false olması için
        }
        fr.close();
        System.out.println("Toplam terminal : "+terminal.length());
        System.out.println("Terminaller :");
        for(int i=0;i<terminal.length();i++)
        {
            System.out.println(terminal.charAt(i));
        }
    }
}

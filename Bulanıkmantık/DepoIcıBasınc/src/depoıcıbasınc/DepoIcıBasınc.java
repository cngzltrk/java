/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoıcıbasınc;

import java.net.URISyntaxException;
import java.util.Random;
import java.util.Scanner;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

/**
 *
 * @author Cergo
 */
public class DepoIcıBasınc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Scanner in =new Scanner(System.in);
        System.out.println("Sicaklik (0-60):");
        double s =in.nextDouble();
        System.out.println("Hacim (Küp hacmi Hesaplanacaktır lütfen metre girin (5-450)):");
        double h =in.nextDouble();
        try{
                Basinc c=new Basinc(s,h);
                Basinc bosGrafik=new Basinc();
                JFuzzyChart.get().chart(bosGrafik.getModel());
                System.out.println(c);

        }
        catch(URISyntaxException ex)
        {
            System.out.print("HATA");
        }*/
        for(int i=0;i<3000;i++){
        Random r=new Random();
        Random r1=new Random();
        int a=r.nextInt(61);
        int b=r1.nextInt(451)+5;
        //System.out.println("--------------");
            try{
                Basinc c=new Basinc(a,b);
                //JFuzzyChart.get().chart(z.getModel());
                System.out.println(c);
            }
            catch(URISyntaxException ex){
                System.out.println("Hata");
            }
        }
    }
    
}

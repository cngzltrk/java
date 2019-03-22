/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicimlilik;

/**
 *
 * @author Cengoo
 */
public class Bicimlilik {
    
    public static void bicim(araba nesne)
    {
        nesne.yakitAl();
        nesne.Ilerle();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        araba a= new araba();
        benzinliAraba ba=new benzinliAraba();
        gazliAraba ga=new gazliAraba();
        a.yakitAl();
        ba.yakitAl();
        ga.yakitAl();
        bicim(a);
        bicim(ba);
        bicim(ga);
    }
    
}

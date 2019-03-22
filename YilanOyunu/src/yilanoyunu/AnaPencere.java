/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yilanoyunu;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Cengoo
 */
public class AnaPencere extends JFrame {
    private int mGenislik=600;
    private int mYukseklik=600;
    private static AnaPencere pencere=null;
    
    private AnaPencere() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        serDimen();//penceremizini bonumu ve yukselik ve genişiliği 
        setResizable(false);
        
        Yilan y=new Yilan();
        add(y);
        
    }
    public static AnaPencere pencereGetir()
    {
        if(pencere==null)
            pencere= new AnaPencere();
        return pencere;
    }
    public void serDimen()
    {
        Dimension Dim= Toolkit.getDefaultToolkit().getScreenSize();
        int posx=0;
        int posy=0;
        if(mGenislik+100>Dim.width)
            mGenislik=Dim.width-100;
        if(mYukseklik+100>Dim.height)
            mYukseklik=Dim.height-100;
        posx=(Dim.width-mGenislik)/2;
        posy=(Dim.height-mYukseklik)/2;
        setBounds(posx,posy,mGenislik,mYukseklik);
    }
}

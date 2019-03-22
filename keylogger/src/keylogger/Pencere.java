/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylogger;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Cengoo
 */
public class Pencere extends JFrame {
    private int u=200;
    private static Pencere pencere=null;
    
    private Pencere() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        serDimen();//penceremizini bonumu ve yukselik ve genişiliği 
        setResizable(false);
        addKeyListener(new klavye());
    }
    public static Pencere pencereGetir()
    {
        if(pencere==null)
            pencere= new Pencere();
        return pencere;
    }
    public void serDimen()
    {
        Dimension Dim= Toolkit.getDefaultToolkit().getScreenSize();
        int posx=0;
        int posy=0;
        if(u+100>Dim.width)
            u=Dim.width-100;
        if(u+100>Dim.height)
            u=Dim.height-100;
        posx=(Dim.width-u)/2;
        posy=(Dim.height-u)/2;
        setBounds(posx,posy,u,u);
    }
    
}

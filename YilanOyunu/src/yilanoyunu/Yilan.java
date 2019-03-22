/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yilanoyunu;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

/**
 *
 * @author Cengoo
 */
public class Yilan extends JLabel{

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2=(Graphics2D)g;
        Rectangle2D rect=new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setColor((Color.red));
        g2.setStroke(new BasicStroke(10));
        g2.draw(rect);
        
        
    
    }
    Yilan()
    {
        Kutu k=new Kutu();
        add(k);
    }
    
}

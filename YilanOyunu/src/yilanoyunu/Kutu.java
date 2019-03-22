/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yilanoyunu;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;

/**
 *
 * @author Cengoo
 */
public class Kutu extends JLabel{
    private int genislik=20;
    private int yukseklik=20;
    Kutu()
    {
        setBounds(100,100,genislik,yukseklik);
    }
    @Override
    public void paint(Graphics g) {
        //super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2=(Graphics2D)g;
        Rectangle2D rect=new Rectangle2D.Double(1,1,getWidth()-2,getHeight()-2);
        g2.setColor((Color.red));
        g2.setStroke(new BasicStroke(2));
        g2.draw(rect);
    }
}

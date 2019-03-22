/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylogger;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Cengoo
 */
public class klavye implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
       }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("merhaba");
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

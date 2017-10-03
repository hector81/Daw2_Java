/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio8 extends Applet{
    @Override
    public void paint (Graphics g) {
      g.drawLine(5, 10, 20, 20);
      g.setColor(Color.RED);
      g.drawLine(50, 60, 200, 210);
      g.setColor(Color.GREEN);
      g.fillRect (70, 80, 100, 25);
      g.setColor(Color.BLUE);
      g.fillArc(100, 120, 200, 250, 0, 90);
      
      
    }
    
    
}

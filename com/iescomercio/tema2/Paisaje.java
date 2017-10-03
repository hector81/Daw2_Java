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
public class Paisaje extends Applet{
    
    @Override
    public void paint(Graphics g) {
        g.drawRect (30, 200, 150, 120);
        g.setColor(Color.blue);
        g.drawArc(30, 110, 150, 200, 0, 180);
        g.drawOval(85, 140, 40, 40);
        g.fillRect(90, 260, 30, 60);
        g.setColor(Color.YELLOW);
        g.fillOval(200, 60, 50, 50);
        g.setColor(Color.ORANGE);
        g.fillRect(300, 200, 30, 120);
        g.setColor(Color.GREEN);
        g.fillOval(275, 125, 80, 80);
        g.setColor(Color.YELLOW);
        g.drawLine(225, 60, 225, 40);
        g.drawLine(200, 85, 180, 85);
        g.drawLine(250, 85, 270, 85);
        g.drawLine(225, 110, 225, 130);
        
        
        
        
    }
}

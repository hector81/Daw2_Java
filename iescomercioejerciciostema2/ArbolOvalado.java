package iescomercioejerciciostema2;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ArbolOvalado extends Applet {
    Color colorMARRON=new Color(128, 0, 0);
    
    @Override
    public void paint(Graphics g){
             
        //casa
        g.setColor(Color.red);
        g.fillRect(30, 90, 100, 100);
               
        //puerta
        g.setColor(Color.pink);
        g.fillRect(70, 140, 20, 50); 
        
        //tejado
        //g.drawArc(30, 25, 100, 140, 0, 180);
        g.setColor(Color.green);
        g.fillArc(30, 25, 100, 140, 0, 180);
        
        //sol
        g.setColor(Color.yellow);
        g.fillOval(175, 20, 35, 35);
               
        //tronco
        g.setColor(colorMARRON);
        g.fillRect(267, 90, 40, 100);            
        
        //follaje
        g.setColor(Color.green);
        g.fillOval(250, 20, 75, 75);
        
    }
}

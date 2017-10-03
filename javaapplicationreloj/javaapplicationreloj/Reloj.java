/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationreloj.javaapplicationreloj;

/**
 *
 * @author Alumno4-Mañana
 */
public class Reloj 
{
    private int hora;
    private int minuto;
    private int segundo;
    
    public Reloj(int hora, int minuto, int segundo)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void sumarSegundo()
    {
        segundo = (segundo + 1) % 60;
        if (segundo == 0) { // Ha pasado a otro minuto
            minuto = (minuto + 1) % 60;
            if (minuto == 0) { // Ha pasado a otra hora
                hora = (hora + 1) % 24;
            }
        }
    }
    
    public String getHora() 
    {
        String horaCompleta;
        horaCompleta = formateaDigito(hora) + ":" + formateaDigito(minuto) + ":" + formateaDigito(segundo);
        return horaCompleta;
    }
    
    private String formateaDigito(int digito)
    {
        if (digito < 10) {
            return "0" + digito;
        }
        else {
            return "" + digito;
        }
    }
}

/*
La clase CalculadoraControlador implementará ActionListener recogerá
los datos con los métodos getX que dispone la vista y llamará al
modelo para que realice el cálculo mostrándolo en la vista.
 */
package MVC_controlador;

import MVC_modelo.Modelo;
import MVC_vista.VistaConsola;
import MVC_vista.VistaSwing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hector Garcia
 */
public class CalculadoraControlador implements ActionListener{
    //atributos
////    private VistaSwing vista;
    private VistaConsola vista;
    private Modelo modelo;
    
    //constructor
    public CalculadoraControlador(VistaConsola vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setControlador(this);//le pasamos como parametro el objeto CalculadoraControlador
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        String boton = e.getActionCommand();
        double aux;//creamos un double que es lo que tendra que devolver
        //
        if (boton.equals("BotonCalcular")) {
            //llamamos a metodo y le ponemos sus parametros mediante el objeto
            aux = modelo.realizaOperacion(vista.getOperando1(), vista.getOperando2(), vista.getOperador());
            this.vista.setResultado(aux+"");//devolvemos el resultado al JLABEL
            
        } else if (boton.equals("BotonCerrar")) {
            System.exit(0);//cerramos
        }
        //devolver resultado
    }
    
}

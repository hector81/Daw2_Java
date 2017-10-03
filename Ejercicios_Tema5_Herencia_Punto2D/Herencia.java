/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema5_Herencia_Punto2D;

/**
 *
 * @author VESPERTINO
 */
public class Herencia {
    //ATRIBUTOS
	private int codigo;
	private String nombre;
        private double saldo;
        
        //NOTA: DE TODOS LOS CONSTRUCTORES HACER SIEMPRE EL PRIMERO EL MÁS COMPLETO
        public Herencia(int codigo,String nombre,double saldo ){
            this.codigo = codigo;
            this.nombre = nombre;
            this.saldo = saldo;
        }
        //PARA LUEGO PODER LLAMARLO
        public Herencia(int codigo ){
            this(codigo," ", 0.0);
        }
      
}

/*
Desarrollar una clase llamada CuentaAhorro que:

- Es un especialización de CuentaCorriente.
- Tiene un atributo más de tipo double (el interés).
- Tiene un constructor con parámetros de tipo Titular, NumeroDeCuenta, double y 
double.
- Tiene un constructor con parámetros de tipo Titular, NumeroDeCuenta y double. 
El saldo se inicializará a 15,3.
- Tiene un constructor con parámetros de tipo Titular y NumeroDeCuenta. El saldo 
se inicializará a 15,3 y el interés a 2,5.
- Tiene un getter para cada uno de los atributos.
- Tiene un método calcularInterés que incremente el saldo según el interés.
 */
package Ejercicios_Tema5_Herencia_CuentasBancarias;

/**
 *
 * @author H�ctor Garc�a
 */
public class CuentaAhorro extends CuentaCorriente {
	//Atributos
	private double interes;
	
	//Constructores
	////constructor con parámetros de tipo Titular, NumeroDeCuenta, double y double
	public CuentaAhorro(Titular t, NumeroCuenta nc, double saldo, double interes) {
		super(t, nc,saldo);	
                this.interes = interes;
	}
		
	//constructor con parámetros de tipo Titular, NumeroDeCuenta y double. 
	//El saldo se inicializará a 15,3.
	public CuentaAhorro(Titular t2, NumeroCuenta nc2, double interes2) {
		this(t2, nc2, 15.3, interes2);	                
	}
	
	//Tiene un constructor con parámetros de tipo Titular y NumeroDeCuenta. El saldo 
	//se inicializará a 15,3 y el interés a 2,5.
	public CuentaAhorro(Titular t, NumeroCuenta nc) {
		this(t,nc,15.3, 2.5);
	}
	
	//getter para cada uno de los atributos.
	//Métodos getters 
        public double getInteres(){            
            return this.interes;            
        }//fin metodo
	
	//Metodo calcularInterés que incremente el saldo según el interés.
        public void calcularInteres(){
            //incrementamos saldo
            double aux;
            double aux2 = (this.interes /100);
            //cada que ingresamos
            aux =  + (getSaldo() * aux2);
            this.setSaldo(aux);
            
            
        }//fin metodo
	
}//fin clase

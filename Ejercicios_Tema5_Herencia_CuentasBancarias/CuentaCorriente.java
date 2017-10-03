/*
Desarrollar una clase llamada CuentaCorriente que:
- Tenga atributos titular, numero de cuenta y saldo
- Tenga un constructor con parámetros de tipo Titular, NumeroDeCuenta y double para el saldo
- Tenga un constructor con parámetros de tipo Titular, NumeroDeCuenta. El saldo se inicializará a 15.3
- Tenga un getter para cada uno de los atributos.
- Tenga un setter solo para el saldo.
- Tenga un método ingresar que incremente el saldo en una cantidad.
- Tenga un método reintegro que decremente el saldo en una cantidad.
- Método que al llamarlo muestre por pantalla el número de cuenta y su saldo 
(reutilizar código)
- Tenga un método para compara cuentas, sabiendo que dos cuentas serán iguales si 
sus números de cuenta completa son iguales. (equals) 
- Sobrescribir el método toString() de la clase Titular para que retorne las 3 
propiedades que contiene (nombre, apellidos y edad).

Nota 1: Al imprimir por pantalla un Titular saldrá su nombre, apellidos y
edad. 
Nota 2: Para comparar dos String se puede utilizar su método compareTo(String) o equals 
que devuelve 0 si son iguales (No es necesario utilizarlo en este ejercicio)
 */
package Ejercicios_Tema5_Herencia_CuentasBancarias;

/**
 *
 * @author Héctor García
 */
public class CuentaCorriente {
    //ATRIBUTOS
    private Titular titular;
    private NumeroCuenta numeroCuenta;
    private double saldo;
    
    //Constructor con parámetros de tipo Titular, NumeroDeCuenta y double para el saldo
    public CuentaCorriente(Titular t,NumeroCuenta nc, double s ){
        this.titular= t;
        this.numeroCuenta= nc;
        this.saldo= s;
    }//fin constructor
    
    //Constructor con parámetros de tipo Titular, NumeroDeCuenta. El saldo se inicializará a 15.3
    public CuentaCorriente(Titular t,NumeroCuenta nc){
        //llamamos al primer constructor completo al que le pasaran los parametros
        //y el saldo iniciado ira al sueldo del primer constructor
        this(t,nc,15.3);
    }//fin constructor
    
    //Métodos getters 
    public double getSaldo(){
        return saldo;
    }//fin metodo
    
    public Titular getTitular(){
        return titular;
    }//fin metodo
    
    public NumeroCuenta getNumeroCuenta(){
        return numeroCuenta;
    }//fin metodo
    
    //Métodos setters 
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }//fin metodo
    
    //MÉTODOS
    //Método ingresar que incremente el saldo en una cantidad.
    public double incrementarSaldo(double cantidad){
        //sumamos a saldo la cantidad dada
        saldo = saldo + cantidad;
        return saldo;  
    }//fin metodo
    
    //Método reintegro que decremente el saldo en una cantidad.
    public double decrementoSaldo(double cantidad){
        //restamos a saldo la cantidad dada
        saldo = saldo - cantidad;
        return saldo;   
    }//fin metodo
    
    //Método que al llamarlo muestre por pantalla el número de cuenta y su saldo
    //(reutilizar código)
    public void mostrarPantalla(){
        System.out.println("El número de cuenta es :" + getNumeroCuenta().toString() +  " y su saldo es: " 
                + this.saldo); 
    }//fin metodo
    
    //Método para compara cuentas, sabiendo que dos cuentas serán iguales si 
    //sus números de cuenta completa son iguales. (equals) 
    //es sobreescribir el metod object (Object obj)
    @Override
    public boolean equals(Object obj){
        //creamos cuenta instanciando sobreescribimos el numero de cuenta
        CuentaCorriente numCuenta = (CuentaCorriente)obj;        
        //Comparamos el número de cuenta
    	if(this.getNumeroCuenta().equals(numCuenta.numeroCuenta)){
    		//System.out.println("Los n�meros de cuentas son iguales ");
                return true;
    	} else {
    		//System.out.println("Los n�meros de cuentas no son iguales "); 
                return false;
    	}
    }//fin metodo
    
    //Sobrescribir el método toString() de la clase Titular para que retorne las 3 
    //propiedades que contiene (nombre, apellidos y edad).
    @Override
    public String toString(){
        return "El nombre es" + titular.getNombre() + " y los apellidos son " +
        		titular.getApellidos() + " y su edad es " + titular.getEdad() + 
                
                numeroCuenta.toString()
                + " y  su saldo es " + this.saldo;
    }//fin metodo
    
}//fin clase

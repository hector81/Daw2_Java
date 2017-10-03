/*
Desarrollar clase Numero de Cuenta

 Atributos banco(4 dígitos), sucursal (4 dígitos), dígito de control (2) y número 
de cuenta (10 dígitos)
- Setter y getters
- Constructor completo
 */
package Ejercicios_Tema5_Herencia_CuentasBancarias;

/**
 *
 * @author Héctor García
 */
public class NumeroCuenta {
    //ATRIBUTOS
    private int banco;
    private int sucursal;
    private int digitoControl;
    private long numeroCuenta;
    
  //Constructor completo
    public NumeroCuenta(int banco,int sucursal,int digitoControl,long numeroCuenta){
    	setBanco(banco); //para no repetir codigo  ni tener que volver a usar el if
        this.sucursal = sucursal;
        this.digitoControl = digitoControl;
        this.numeroCuenta = numeroCuenta;
    }
    
    //Métodos getters 
    public int getBanco(){
        return this.banco;
    }//fin metodo
    
    public int getSucursal(){
        return this.sucursal;
    }//fin metodo
    
    public int getDigitoControl(){
        return this.digitoControl;
    }//fin metodo
    
    public long getNumeroCuenta(){
        return this.numeroCuenta;
    }//fin metodo
    
    
    //Métodos setters 
    public void setBanco(int banco){
        if(banco >= 0 && banco <= 9999){
        this.banco = banco;
        } else {
            System.out.println("El número tiene que tener 4 digitos");
            this.banco = 0;
        }
    }//fin metodo
    
    public void setSucursal(int sucursal){
        this.sucursal = sucursal;
    }//fin metodo
    
    public void setDigitoControl(int digitoControl){
        this.digitoControl = digitoControl;
    }//fin metodo
    
    public void setNumeroCuenta(long numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }//fin metodo

    @Override
    public String toString() {
        return "NumeroCuenta{" + "banco=" + banco + ", sucursal=" + sucursal + ", digitoControl=" + digitoControl + ", numeroCuenta=" + numeroCuenta + '}';
    }
    
}

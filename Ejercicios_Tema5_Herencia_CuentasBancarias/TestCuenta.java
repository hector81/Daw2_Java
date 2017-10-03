/*
Desarrollar la clase Test que en su método main cree varias cuentas de distinto tipo y
trabaje con ellas. 

- Testear que al crear objetos de tipo CuentaAhorro tenemos acceso a los métodos 
públicos de CuentaCorriente
 */
package Ejercicios_Tema5_Herencia_CuentasBancarias;

/**
 *
 * @author H�ctor Garc�a
 */
public class TestCuenta {
	//main
    public static void main(String[] args) {
    
    System.out.println("************************TITULAR********************************");
    //Creamos 2 titulares 
	Titular titular1 = new Titular("Hector","Garcia Andollo",34);
	Titular titular2 = new Titular("Isabel","Ruiz Santana",31);
	
	//llamamos al metodo to string de Titular
	System.out.println(titular1.toString());
	System.out.println(titular2.toString());
	
	System.out.println("************************NUMERO CUENTA********************************");
	//creamos dos numeros de cuentas
	NumeroCuenta numeroCuenta1 = new NumeroCuenta(4000,5000,22,1234567890);
	NumeroCuenta numeroCuenta2 = new NumeroCuenta(9000,8000,99,987654321);
        
        System.out.println(numeroCuenta1.toString());
        System.out.println(numeroCuenta2.toString());
	
	//llamamos a los getters de numero de cuenta
	System.out.println("El primer numero de cuenta es " + numeroCuenta1.getBanco() + "-" + 
        numeroCuenta1.getSucursal() + "-" + numeroCuenta1.getDigitoControl() + "-" + 
        numeroCuenta1.getNumeroCuenta());
	
	System.out.println("El segundo numero de cuenta es " + numeroCuenta2.getBanco() + "-" + 
        numeroCuenta2.getSucursal() + "-" + numeroCuenta2.getDigitoControl() + "-" + 
        numeroCuenta2.getNumeroCuenta());
	
	System.out.println("************************CUENTA CORRIENTE********************************");
	//Instanciamos y creamos 2 objetos cuentas corrientes
	CuentaCorriente cuentaCorriente1= new CuentaCorriente(titular1, numeroCuenta1);
	CuentaCorriente cuentaCorriente2= new CuentaCorriente(titular2, numeroCuenta2);
	
	cuentaCorriente1.setSaldo(1200.56);
	System.out.println("La cuenta 1 tiene un saldo de "+ cuentaCorriente1.getSaldo());
        System.out.println("Ingresamos en cuenta 1300.26");
	cuentaCorriente1.incrementarSaldo(1300.26);
	System.out.println("Ahora la cuenta 1 tiene un saldo de "+ cuentaCorriente1.getSaldo());
	//llamamos a metodos de cuenta corriente- cuenta corriente1
	System.out.println("El saldo del titular " + titular1.getNombre() + titular1.getApellidos() + " cuya edad es"
        +titular1.getEdad() + " cuyo numero de cuenta es " + numeroCuenta1.getBanco() + "-" + 
        numeroCuenta1.getSucursal() + "-" + numeroCuenta1.getDigitoControl() + "-" + 
        numeroCuenta1.getNumeroCuenta() + " tiene un saldo de " + cuentaCorriente1.getSaldo());
	
	//llamamos a metodos de cuenta corriente- cuenta corriente1
        System.out.println("El saldo cuyo " + titular2.toString() + " cuyo numero de cuenta es " + numeroCuenta2.getBanco() + "-" + 
        numeroCuenta2.getSucursal() + "-" + numeroCuenta2.getDigitoControl() + "-" + 
        numeroCuenta2.getNumeroCuenta() + " tiene un saldo de " + cuentaCorriente2.getSaldo());

       System.out.println("Incrementamos la cuenta 2 en 1000 euros "); 
       cuentaCorriente2.incrementarSaldo(1000);
       System.out.println("Ahora la cuenta 2 tiene " + cuentaCorriente2.getSaldo());
       
       System.out.println("Decrementamos la cuenta 1 en 1000 euros "); 
       cuentaCorriente1.decrementoSaldo(1000);
       System.out.println("Ahora la cuenta 2 tiene " + cuentaCorriente1.getSaldo());

        //o probamos mostrarPantalla
        System.out.println("**MOSTRAMOS POR PANTALLA DATOS CLIENTE 1**");
        cuentaCorriente1.mostrarPantalla();
        //o probamos mostrarPantalla
        System.out.println("**MOSTRAMOS POR PANTALLA DATOS CLIENTE 2**");
        cuentaCorriente2.mostrarPantalla();

        System.out.println("¿El numero de cuenta de hector es correcto?");
        cuentaCorriente1.equals(numeroCuenta1);
        
        System.out.println("*********Llamamos a los tostring sobreescritos***********");
        System.out.println(cuentaCorriente1.toString());
	System.out.println(cuentaCorriente2.toString());
        
	System.out.println("************************CUENTA AHORRO********************************");
	//llamamos a metodo de cuenta-ahorro
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(titular1, numeroCuenta1, 3);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(titular2, numeroCuenta2, 4);

        System.out.println("El interes por año(3%) para la cuenta 1 es " + cuentaAhorro1.getInteres());
        System.out.println("El interes por año(4%) para la cuenta 2 es " + cuentaAhorro2.getInteres());

        //System.out.println("El beneficio por intereses por año para la cuenta 1 es " + cuentaAhorro1.calcularInteres());
        //System.out.println("El beneficio por intereses por año para la cuenta 2 es " + cuentaAhorro2.calcularInteres());
    }//fin main
}//fin clase

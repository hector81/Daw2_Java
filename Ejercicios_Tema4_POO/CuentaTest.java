package Ejercicios_Tema4_POO;

public class CuentaTest {
    //main
    public static void main(String[] args) {
        //Cuenta cuentaDeJulio; //Declaracion
        Cuenta cuentaDeJulio = new Cuenta(700);   //INSTACIACION    
        
        System.out.println("Dame cuenta de Julio " + cuentaDeJulio.dameSaldo() );
        
        ///llamar metodo //sacar 150 de cuenta
        cuentaDeJulio.reintegro(150);
        System.out.println("Dame cuenta de Julio " + cuentaDeJulio.dameSaldo() );
        
        //llamar metodo //ingreso 600
        cuentaDeJulio.ingresar(600);
        System.out.println("Dame cuenta de Julio " + cuentaDeJulio.dameSaldo() );
        
        ///llamar metodo //sacar 15000 de cuenta
        cuentaDeJulio.reintegro(15000); 
        System.out.println("Dame cuenta de Julio " + cuentaDeJulio.dameSaldo() );
    }
}

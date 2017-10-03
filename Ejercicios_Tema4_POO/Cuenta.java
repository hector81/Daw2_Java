package Ejercicios_Tema4_POO;

public class Cuenta {

    //ATRIBUTOS
    double saldo;

    //CONSTRUCTORES
    public Cuenta() {
        saldo = 0;
    }

    public Cuenta(int s) {
        saldo = s;
    }

    //METODOs   
    public void ingresar(double dinero) {
        saldo = saldo + dinero;
    }//fin metodo

    public boolean reintegro(double retiro) {
        if (saldo >= retiro) {
            saldo = saldo + retiro;
            return true;
        }//fin if
        else {
            System.out.println("No se puede sacar tanto dinero");
            return false;
        }//fin else

    }//fin metodo

    //metodo getSaldo
    public double dameSaldo() {
        return saldo;
    }//fin metodo

}

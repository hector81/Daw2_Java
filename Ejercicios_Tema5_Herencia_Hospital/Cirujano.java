package Ejercicios_Tema5_Herencia_Hospital;

public class Cirujano extends Medico {
    //metodos
    @Override
    public void tratarPaciente(){
        System.out.println("Realizar un operación");
    }
    public void hacerIncision(){
        System.out.println("Hacer una incisión, ouch!");
    }
}

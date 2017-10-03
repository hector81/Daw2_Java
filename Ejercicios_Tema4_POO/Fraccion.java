/*
Crea una clase Racional que permita trabajar con números racionales(fracciones) con
las siguientes consideraciones:
-Tendrá los atributos numerador y denominador enteros
-Constructores por defecto. El alumno decide con que valor inicializarlos
-Constructor completamente parametrizado.
-Getter(accedente) y setter (mutador) para las propiedades
-Metodos suma, resta, multiplicación y division que retorne un racional correspondiente
al calculo realizado.
-Método comparación, recibirá un racional y comparará dicho racional con el contenido 
en el objeto. Retorna un booleano.
-Metodo copia devolvera un racional (similar a getRacional)
-Metodo calculaReal que retorna el resultado de numerador / denominador
-Metodo print() muestra por pantalla el numero racional en formato:
        numerador
        ---------
        denominador


 */
package Ejercicios_Tema4_POO;

public class Fraccion {

    //Atributos
    private int numerador;
    private int denominador;

    //constructores
    //1ºconstructor.  Constructores por defecto. El alumno decide con que valor inicializarlos
    public Fraccion() {
        numerador = 4;
        denominador = 7;
    }
    //2ºconstructor. Constructor completamente parametrizado.

    public Fraccion(int num, int denomi) {
        numerador = num;
        denominador = denomi;
    }

    //Getters and setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int num) {
        this.numerador = num;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denomi) {
        this.denominador = denomi;
    }

    //MÉTODOS
    //SUMA DE FRACCIONES HOMOGENEAS
    // (A/C) + (B/C) = (A + B)/C
    //SUMA DE FRACCIONES HETEROGENEAS
    // (A/C) + (B/D) = (A*D + B*C)/ (C*D)
    //Metodo suma
    public Fraccion suma(Fraccion f) { //es un metodo que te devuelve un objeto
        //creamos nuevo objeto , en este caso aux
        Fraccion aux = new Fraccion();
        //declaramos dos variables
        int n, d;

        n = numerador * f.getDenominador() + denominador * f.getNumerador();//(A*D + B*C)
        d = denominador * f.getDenominador();//(C*D)

        //cogemos el el objeto para llamar al metodo setNumerador
        aux.setNumerador(n);
        //cogemos el el objeto para llamar al metodo setDenominador
        aux.setDenominador(d);
        //devolvemos el objeto
        return aux;

    }

    //Metodo resta
    //RESTA DE FRACCIONES HOMOGENEAS
    // (A/C) - (B/C) = (A - B)/C
    //RESTA DE FRACCIONES HETEROGENEAS
    // (A/C) - (B/D) = (A*D - B*C)/ (C*D)
    public Fraccion resta(Fraccion f) {//es un metodo que te devuelve un objeto
        //creamos nuevo objeto , en este caso aux
        Fraccion aux = new Fraccion();
        //declaramos dos variables
        int n, d;

        n = numerador * f.getDenominador() - denominador * f.getNumerador();//(A*D + B*C)
        d = denominador * f.getDenominador();//(C*D)

        //cogemos el el objeto para llamar al metodo setNumerador
        aux.setNumerador(n);
        //cogemos el el objeto para llamar al metodo setDenominador
        aux.setDenominador(d);
        //devolvemos el objeto
        return aux;
    }

    //Metodo multiplicación
    //MULTIPLICACIÓN DE FRACCIONES 
    // (A/C) * (B/D) = (A*B)/ (C*D)
    public Fraccion multiplicacion(Fraccion f) {//es un metodo que te devuelve un objeto
        //creamos nuevo objeto , en este caso aux
        Fraccion aux = new Fraccion();
        //declaramos dos variables
        int n, d;

        n = numerador * f.getNumerador();//(A*B)
        d = denominador * f.getDenominador();//(C*D)

        //cogemos el el objeto para llamar al metodo setNumerador
        aux.setNumerador(n);
        //cogemos el el objeto para llamar al metodo setDenominador
        aux.setDenominador(d);
        //devolvemos el objeto
        return aux;
    }

    //Metodo division 
    // (A/C) / (B/D) = (A*C)/ (D*B) = (A*D)/ (C*B)
    public Fraccion division(Fraccion f) {//es un metodo que te devuelve un objeto
        //creamos nuevo objeto , en este caso aux
        Fraccion aux = new Fraccion();
        //declaramos dos variables
        int n, d;

        n = numerador * f.getDenominador();//(A*D)
        d = denominador * f.getNumerador();//(C*B)

        //cogemos el el objeto para llamar al metodo setNumerador
        aux.setNumerador(n);
        //cogemos el el objeto para llamar al metodo setDenominador
        aux.setDenominador(d);
        //devolvemos el objeto
        return aux;
    }

    //Método comparación, recibirá un racional y comparará dicho racional con el contenido 
    //en el objeto. Retorna un booleano. COMPARAR SI LA FRACCION 1 ES IGUAL A AL RESULTADO
    public boolean compararFraccional(Fraccion f) {
        double aux1, aux2;

        //Llamamos a los metodos para dar valor a aux
        aux1 = calculaReal();
        aux2 = f.calculaReal();

        //Es lo mismo que IF , el condicional devolvera TRUE o FALSE
        return aux1 == aux2;
    }

    //Metodo copia devolvera un racional (similar a getRacional)
    public Fraccion copia() {
        Fraccion aux = new Fraccion(numerador, denominador);
        return aux;
    }

    //Metodo calculaReal que retorna el resultado de numerador / denominador
    public double calculaReal() {
        return (double) getNumerador() / getDenominador();
    }

    //Metodo print() muestra por pantalla el numero racional en formato:
    public void print() {
        System.out.println(numerador);
        System.out.println("--");
        System.out.println(denominador);
    }//fin metodo

}//fin clase



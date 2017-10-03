/*
Realiza una clase llamada Punto que tenga dos propiedades X, Y que indican las
coordenadadas en un plano de 2D
--1. Crea un constructor completo
2. Sobrecarga del constructor por defecto que inicialice a 0 las coordenadas 
haciendo una llamama al constructor completo
3. Sobrecarga del constructor que inicialice sólo la coordenada X la y se 
inicializará a 1 (usa el contructor del punto 1)
4. Sobreescribe el método toString para que muestre las propiedades según el gusto 
del usuario.
5. Sobreescribe el método equals
6. Sobrecarga el método equals para que devuelva un entero correspondiente a la 
coordenada más grande de las dos (x o y)
--2. Crear una clase Test con las siguientes consideraciones
---------1. Cree dos objetos de tipo Punto
---------2. Prueba los métodos realizados: 2 x equals, toString etc...
--3. Documenta las clases indicando en que casos se está utilizando sobrecarga o 
sobreescritura.
 */
package Ejercicios_Tema5_Herencia_Punto2D;



/**
 *
 * @author Héctor García
 */
import java.util.Objects;
public class Punto2D {
    //ATRIBUTOS
    private int x;
    private int y;
    
    //CONSTRUCTORES
    //CONTSTRUCTOR COMPLETO
    public Punto2D(int pX, int pY){
        x = pX;
        y = pY;
    }
    
    //Sobrecarga del constructor por defecto que inicialice a 0 las coordenadas 
    //haciendo una llamama al constructor completo
    public Punto2D(){
         x = 0;
         y = 0;
    }
    
    //Sobrecarga del constructor que inicialice sólo la coordenada X la y se 
    //inicializará a 1 (usa el contructor del punto 1)
    public Punto2D(int pY){
         x = 1;
         y = pY;
    }
    //FIN CONSTRUCTORES
    
    //METODOS GETTERS AND SETTERS
    //metodos getters
    public double getX(){
        return x;
    }//fin metodo
    
    public double getY(){
        return y;
    }//fin metodo
    
    //metodos setters
    public void setX(int pX){
        x = pX;
    }//fin metodo
    
    public void setY(int pY){
        y = pY;
    }//fin metodo
    //FIN METODOS GETTERS AND SETTERS
    
    //MÉTODOS
    //Sobreescribe el método toString para que muestre las propiedades según el gusto 
    //del usuario. SOBREESCRIBE DEL METODO DE LA CLASE DE OBJECT
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    
    //Sobreescribe el método equals. SOBREESCRIBE DEL METODO DE LA CLASE DE OBJECT
    //@Override NO ES NECESARIO. CON EL (Objects o) ya llamas
    
    @Override
    public boolean equals(Object obj){
        //Creamos objeto p a traves de Object, haciendo upcasting
        Punto2D p =(Punto2D)obj;
        if(x == p.x && y == p.y){
            return true;
        }else{
            return false;
        }
    }
    
    //Sobrecarga el método equals para que devuelva un entero correspondiente a la 
    //coordenada más grande de las dos (x o y). SOBRECARGA DEL METODO DE LA CLASE DE OBJECT
    public int equals(int pX, int pY){
        if(x > y){
            return x;
        }else if(x < y){
            return y;
        }
        return 0;
    }
    //FIN MÉTODOS
    
}

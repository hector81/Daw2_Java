/*
Desarrollar la clase Libro con los requerimientos que se detallan a continuación:
· Tenga cuatro atributos isbn, título, numero de páginas del libro y precio
· Tenga un contructor que inicialice isbn y titulo, el resto de atributos con su
valor por defecto
· Sobrecarga del contructor que inicialice sólo el ISBN, el resto por defecto
· Tenga métodos que permitan modificar sus atributos (seters)
· Tenga métodos que permitan obtener el valor de sus atributos (geters)
 */
package Ejercicios_Tema4_POO;


public class Libro {
    //atributos
    private String isbn;
    private String titulo;
    private int numeroPaginas ;
    private double precio;
    
    //constructores
    //1ºconstructor que inicialice isbn y titulo, el resto de atributos con su valor por defecto
    public Libro(String is , String t){
        isbn = is;
        titulo = t;     
        //numeroPaginas =0; //seria lo mismo, inicializa el valor por defecto
        //precio = 0.0; //seria lo mismo, inicializa el valor por defecto
    }
    
    //2ºconstructor que inicialice sólo el ISBN, el resto por defecto
    public Libro(String is){
        isbn = is;
    }
    /*
    //1ºconstructor que inicialice isbn y titulo, el resto de atributos con su valor por defecto
    public Libro(int numP , int pre){
        isbn = "125ZZ99";
        titulo = "El conde de Montecristo";
        numeroPaginas = numP;
        precio = pre;        
    }
    
    //2ºconstructor que inicialice sólo el ISBN, el resto por defecto
    public Libro(String t, int numP , int pre){
        isbn = "125ZZ77";
        titulo = t;
        numeroPaginas = numP;
        precio = pre; 
    }
    */
    //metodos getters and setters
    //metodos getters
    public String getIsbn(){
        return isbn;
    }//fin metodo
    
    public String getTitulo(){
        return titulo;
    }//fin metodo
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }//fin metodo
    
    public double getPrecio(){
        return precio;
    }//fin metodo
    
    
    //metodos setters
    public void setIsbn(String isbn){
        isbn = isbn;
    }//fin metodo
    
    public void setTitulo(String t){
        titulo = t;
    }//fin metodo
    
    public void setNumeroPaginas(int numP){
        numeroPaginas = numP;
    }//fin metodo
    
    public void setPrecio(double pre){
        precio = pre;
    }//fin metodo
    
    
}//fin clase

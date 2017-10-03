/*
Desarrollar la clase Alumno con los requerimientos que se detallan a continuación:
· Atributos número de expediente y tres atributos inventados (a ser posible
intentaremos que sean de distinto tipo tanto complejos como primitivos)
· Constructor por defecto que inicialice las propiedades
· Sobrecarga de constructor que reciba el atributo el número de expediente y
el resto
· Sobrecarga del constructor que inicialice expediente y nombre
· Constructor completo
· Accesores (getter) y mutadores (setter) para todas las propiedades
· Método con nombre presentate que presente al alumno (se deja al alumno que
seleccione en la presentación las propiedades que considere más adecuadas)
Posteriormente realizar una clase llamada AlumnoRun que en su método main permita
probar la clase Alumno realizada en el punto anterior
 */
package Ejercicios_Tema4_POO;

public class Alumno {
    //atributos
    private int numeroExpediente;
    private String nombreAlumno;
    private String primApellidoAlum ;
    private double precioMatricula;
    
    //constructores
    //1ºConstructor por defecto que inicialice las propiedades //DEFAULT
    public Alumno(){      
        numeroExpediente = 123456;
        nombreAlumno = "Hector";
        primApellidoAlum = "García";
        precioMatricula = 10.36;        
    }
    
    
    //2ºConstructor.Sobrecarga de constructor que reciba el atributo el número de expediente y el resto
    public Alumno(int numExp){
        numeroExpediente = numExp;
        //resto por defecto
    }
    
    //3ºConstructor.Sobrecarga del constructor que inicialice expediente y nombre
    public Alumno(int numExp , String nombreA){
        numeroExpediente = numExp;
        nombreAlumno = nombreA;        
    }
    
    //4ºConstructor.Constructor completo
    public Alumno(int numExp , String nombreA, String primAp, double precioM){
        numeroExpediente = numExp;
        nombreAlumno = nombreA;
        primApellidoAlum = primAp;
        precioMatricula = precioM;
        //resto por defecto
    }
    
    //metodos getters and setters
    //metodos getters
    public int getNumeroExpediente(){
        return numeroExpediente;
    }//fin metodo
    
    public String getNombreAlumno(){
        return nombreAlumno;
    }//fin metodo
    
    public String getPrimApellidoAlum(){
        return primApellidoAlum;
    }//fin metodo
    
    public double getprecioMatricula(){
        return precioMatricula;
    }//fin metodo
    
    
    //metodos setters
    public void setNumeroExpediente(int numExp){
        numeroExpediente = numExp;
    }//fin metodo
    
    public void setNombreAlumno(String nombreA){
        nombreAlumno = nombreA;
    }//fin metodo
    
    public void setPrimApellidoAlum(String primAp){
        primApellidoAlum = primAp;
    }//fin metodo
    
    public void setPrecioMatricula(double precioM){
        precioMatricula = precioM;
    }//fin metodo
    
    //Método con nombre presentate que presente al alumno (se deja al alumno que
    //seleccione en la presentación las propiedades que considere más adecuadas)
    public void presentante(){
        System.out.println("Hola, mi nombre es " + nombreAlumno);
        System.out.println("Hola, mi apellido es " + primApellidoAlum);
        System.out.println("Hola, mi número de expediente es " + numeroExpediente);
        System.out.println("Hola, el precio de mi matrícula es " + precioMatricula);
    }//fin metodo
}//fin clase




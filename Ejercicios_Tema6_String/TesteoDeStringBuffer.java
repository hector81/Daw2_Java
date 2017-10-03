/*
3-Crea una clase llamada TesteoDeStringBuffer con dos metodos cuyo codigo sea el que
aparece en la diapositiva 1 y 2 de la pagina 8 de teoria. Crea la clase main para llamar
a dichos metodos. Se deja al alumno que juege con los metodos de la clase StringBuffer
 */
package Ejercicios_Tema6_String;

/**
 *
 * @author Hector Garcia
 */
public class TesteoDeStringBuffer {
    //metodos
    public void probarMetodosStringBuffer1(){
        StringBuffer sb1 = new StringBuffer("abababab"); 
        System.out.println("LA CADENA DE STRING ES : " + sb1);
        System.out.println("LONGITUD DEL STRING : " + sb1.length());
        System.out.println("NÚMERO DE CARACTERES QUE PUEDE ALOJAR SIN ALOCAR MÁS MEMORIA: " + sb1.capacity());
        //reemplaza en este caso el ultimo el caracter por B
        sb1.setCharAt(sb1.length()-1,'B');      
        System.out.println("Reemplazamos el ultimo caracter por B : " + sb1);
        //Reemplezamos ENTRE la 2º y 3º posicion por AB 
        sb1.replace(2, 3, "AB");
        System.out.println("Reemplezamos ENTRE la 2º y 3º posicion por AB (cambia a por AB) : " + sb1); 
        //iNSERTAMOS en la 4º posicion CD
        sb1.insert(4,"CD");
        System.out.println("Insertamos en la 4º posicion CD (cambia una b por CD): " + sb1);
        //BORRAMOS
        sb1.delete(0, 2);
        System.out.println("Borramos entre la posicion 0 y 2 (borramos a y b iniciales): " + sb1);
    }//fin metodo
    
    public void probarMetodosStringBuffer2(){
        //declaramos objeto de Stringbuffer de tamaño 2
        StringBuffer sb2 = new StringBuffer(2); 
        System.out.println("LONGITUD DEL ENTERO : " + sb2.length());
        System.out.println("NÚMERO DE CARACTERES QUE PUEDE ALOJAR SIN ALOCAR MÁS MEMORIA: " + sb2.capacity());
        
        //Hacemos un bucle para que recorra 10 números
        for(int i = 0 ;i<=10 ;i++)
            //añadimos numeros
            sb2.append(i);
        System.out.println("PONEMOS 10 NUMEROS NUEVOS ");
        System.out.println("LONGITUD DEL ENTERO CON LOS NUEVOS NUMEROS : " + sb2.length());
        System.out.println("NÚMERO DE CARACTERES QUE PUEDE ALOJAR CON LOS NUEVOS NUMEROS: " + sb2.capacity());
        System.out.println(sb2);
    }//fin metodo
    
}

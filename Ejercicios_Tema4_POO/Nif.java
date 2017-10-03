/*
Calcular letra del dni
*/
package Ejercicios_Tema4_POO;

import java.util.Scanner;

public class Nif {
    //atributos
    private long numDni;
    private String letraDni;
   
    //constructores
    //1ºConstructor. Constructor predeterminado que inicialize el nº del dni a 0 y la letra en un espacio (sera un nif no valido)
    //predeterminado significa por defecto
    public Nif(){      
          numDni = 0; 
          letraDni = " ";
    }
    
    //2ºConstructor. Constructor que reciba el dni y establezca la letra que le corresponde
    public Nif(long nDni, String letra){      
          numDni = nDni; 
          letraDni = letra;
    }
    
    //metodos getters and setters
    //metodos getters
    public long getNumDni(){
        return numDni;
    }//fin metodo   
    
    //metodos setters
    public void setNumDni(long nDni){
        numDni = nDni;
    }//fin metodo
    
    //METODOS
    //PEDIR NUMERO POR SCANNER
    public void leer(){
        //para que lea los datos
        Scanner sc = new Scanner(System.in);        
        //imprimimos
        System.out.println("Dime tu número de DNI : " );
        //para que nos devuelva el numero en formato long
        numDni = sc.nextLong();
    }
    
    public void mostrarDni(){
        //imprimimos resultados: el numero + el metodo que con el numDni nos devuelve la letra
        System.out.println("Tu dni es : " + numDni + "-" + calculaLetraDni() );
    }
    
    
    private char calculaLetraDni(){
        //declaramos variable para calcular el resto del dni numero partido por 23
        int restoNIF;
        
        //calcular resto %23
        restoNIF = (int) (numDni%23);
        //en caso de que el resto sea X la letra será X
        switch(restoNIF){
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';            
            case 7:
                return 'F';      
            case 8:
                return 'P';     
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';              
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';    
        }//fin del switch
        //hay que añadir en el metodo un return
        return 0;
       
    }//fin del metodo
    
}//fin de la clase

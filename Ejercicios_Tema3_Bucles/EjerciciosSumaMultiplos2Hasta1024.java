/*
7-Realizar un programa en Java que calcula y muestra por pantalla el 
resultado de la serie: 2*4*8*16...1024 salvo el número 128 y 512
 */
package Ejercicios_Tema3_Bucles;

public class EjerciciosSumaMultiplos2Hasta1024 {
    //main
    public static void main(String[] args) {
    //declarar variables
    /*lo pongo en 1 para que empieze en para que la 1ºmultiplicacion sea 1*2
      en el while porque si no sería un bucle infinito 0*2 = 0*0*0*0*0...*/
    long contador = 1;
    long acumulador = 1;   
    // 2*4*8*16*32*64*256*1024  = 549755813888    
        
    /* con do while */
    
        do{
            //Acumulador para que multiplique por 2 hasta llegar al limite de 1024 del while
            contador = contador * 2  ; 
            
             //si es distinto el numero de 128 o 215 ,el contador multiplicara el acumulador
            if(contador != 128 && contador != 512){
                // es lo mismo que poner acumulador = contador *contador;
                acumulador *=contador;
                //para mostrar los numeros que multiplican
                System.out.print(contador + " ");
            }//fin if
           
        }while(contador < 1024);

    
    /* con while */   
         /* 
        while(contador < 1024){
            //Acumulador para que multiplique por 2 hasta llegar al limite de 1024 del while
            contador = contador * 2  ; 
            //si es distinto el numero de 128 o 215 ,el contador multiplicara el acumulador
            if(contador != 128 && contador != 512){
                acumulador = acumulador *contador;
                //para mostrar los numeros que multiplican
                System.out.print(contador + " ");
            }//fin if
            
        }//fin del while
        */
        
          //IMPRIMIR
          System.out.println("Resultado : " + acumulador);
    }//fin del main
}//fin de la clase


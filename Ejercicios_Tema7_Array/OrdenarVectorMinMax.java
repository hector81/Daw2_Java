/*
ordernar de esta forma. el primer menor que encontremos lo poenmos en la
primera posicion, recorremos desde esa posicion i+1,
y repetir operaciones
.
utilizando los metodos ya creados calcula max calcula min
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author VESPERTINO
 */
public class OrdenarVectorMinMax {
    public static void main(String[] args) {
        
    
   int[] vector = {6,5,3,2,4,3,7,4};
   UtilidadesArray.recorrerArray(vector);
   
   System.out.println("");
   System.out.print("INDICE MINIMO " + UtilidadesArray.minIndice(vector) + "\n");
   System.out.print("NUMERO MINIMO  " + UtilidadesArray.min(vector) + "\n");
   System.out.print("NUMERO MAXIMO " + UtilidadesArray.max(vector) + "\n");
   System.out.print("METODO SORT : ");
   UtilidadesArray.ordenarVectorSort(vector);
   System.out.print("\nMETODO BURBUJA : ");
   UtilidadesArray.ordenarArrays(vector);
   System.out.print("\nARRAY MI METODO : ");
   UtilidadesArray.ordenarVectorMiMetdodo(vector);
   System.out.print("\nARRAY METODO ANGEL : ");
   UtilidadesArray.ordenarVectorANGEL(vector); 
       
    }
}
 
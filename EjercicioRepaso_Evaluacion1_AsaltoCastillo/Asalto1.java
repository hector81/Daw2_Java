/*

En estos momentos, Jaime cuenta con 25.000 hombres de diversas ca-
sas afines a los Lannister y esta pensando cual seria la mejor distri-
bución en batallones de cara al ataque de los muros. Quiere repartir-
los de manera que los batallones tengan el mismo numero de hombres 
y se ha dado cuenta de que hay múltiples maneras de realizar el re-
parto; por ejemplo con esos 25.000 hombres podría hacer 100 batallo-
nes de 250 hombres, 250 batallones de 100 hombres y otras configu-
raciones hasta un total de 24

poder saber para cada una de sus batallas pasadas y futuras, como
se podría repartir a sus hombres siguiendo el mismo procedimiento. 

 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Asalto1 {

    //main
    public static void main(String[] args) {
        //atributo
        int batallones = 0;
        int numeroHombresTotales;
        int contadorBatallones = 0;

        //pedir en un do while para que no ponga numeros negativos
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el numero de hombres: ");
            numeroHombresTotales = sc.nextInt();
            if (numeroHombresTotales < 0 || numeroHombresTotales > 500000) {
                System.out.println("Numero no puede ser negativo o mayor de 500.000. Pon otro : ");
            }
            if (numeroHombresTotales > 0 && numeroHombresTotales < 500001) {
                //calcular numeros de batallones
                for (int contador = 1; contador < numeroHombresTotales + 1; contador++) {
                    if (numeroHombresTotales % contador == 0) {
                        //sumo batallones 
                        contadorBatallones++;

                    }
                }//fin for
                //imprimir
                System.out.println("El numero de batallones posible es : " + contadorBatallones);
            }
        } while ((numeroHombresTotales > 0 || numeroHombresTotales < 500000) && (numeroHombresTotales != 0));

        if (numeroHombresTotales == 0) {
            System.out.println("El numero es 0. Se acabo");
        }
    }//fin main
}//fin clase

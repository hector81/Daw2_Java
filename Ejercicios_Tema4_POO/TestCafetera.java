package Ejercicios_Tema4_POO;

public class TestCafetera {

    public static void main(String[] args) {
        //CRE� CON OBJETOS NUEVOS 
        Cafetera cafetera3 = new Cafetera(3000, 5000);
        // Cafetera cafetera2 = new Cafetera();
        //Cafetera cafetera3 = new Cafetera();

        //imprimir m�todo 
        System.out.println("Llenamos la cafetera  ");
        System.out.println("Tiene la cafetera hasta " + cafetera3.getCapacidadMaxima());
        System.out.println("Llenamos 2 tazas de 450 cc");
        cafetera3.servirTaza(450);
        cafetera3.servirTaza(450);
        System.out.println("Rellenamos cafetera ");
        System.out.print("Tiene la cafetera hasta " + cafetera3.getCapacidadMaxima());
        System.out.println("Llenamos 2 tazas de 450 cc");
        cafetera3.servirTaza(450);
        cafetera3.servirTaza(450);
        System.out.println("Llenamos 1 tazas de 4500 cc");
        cafetera3.servirTaza(4500);
        System.out.println("Rellenamos cafetera con 4500 cc");
        cafetera3.agregarCafe(6000);

    }//fin del main
}//fin de la clase

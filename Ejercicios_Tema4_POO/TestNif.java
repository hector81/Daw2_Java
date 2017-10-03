package Ejercicios_Tema4_POO;

public class TestNif {
    //main
    public static void main(String[] args) {
        //llamamos 1º constructor para el primer dni
        Nif nif1 = new Nif();   //INSTACIACION    
        System.out.println("DNI 1 ****************");
        nif1.leer();
        nif1.mostrarDni();
        nif1.setNumDni(532456576);
        nif1.mostrarDni();
      
        //llamamos 2º constructor para el segundo dni
        Nif nif2 = new Nif(16605963,"");   //INSTACIACION    
        System.out.println("DNI 2 ************************* ");
        nif2.mostrarDni();
        
    }//fin del main
}//fin clase


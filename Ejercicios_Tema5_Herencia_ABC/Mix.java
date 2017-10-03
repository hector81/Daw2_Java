/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema5_Herencia_ABC;

/**
 *
 * @author VESPERTINO
 */
public class Mix {
    //main
    public static void main(String[] args) {
        //creamos objetos instanciandolos, 3 objetos a,b y c
        A a = new A();
        B b = new B();
        C c = new C();
        //ESTO SERIA HACER UN UPCASTING, hacemos objeto instanciando a2
        A a2 = new C();
        
        //llamada a metodos
        b.m1();   // B´s m1, 
        c.m2();   // C´s m2, 13
        a.m3();   // A´s m3, 
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        c.m1();  // A´s m1, 
        c.m2();  // A´s m2, 
        c.m3();  // A´s m3, 13
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.m1();  // A´s m1,
        b.m2();  // B´s m2,
        c.m3();  // A´s m3, 13
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        //ESTO SERIA HACER UN UPCASTING ,llamamos al de tipo menor ,c
        a2.m1();  // A´s m3, 
        a2.m2();  // A´s m3, 
        a2.m3();  // A´s m3, 
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        b.m1();  // 
        c.m2();  // 
        a.m3();  // 
    }//fin main
}//fin clase

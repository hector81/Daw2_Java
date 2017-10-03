package iescomercioejerciciostema3;

public class EjemploUpcasting {
    public static void main(String arg[]){
    //EJEMPLO UPCASTING (promociona)
    int x1 = 3; 
    byte y1 =0;
    y1 = 1;
    System.out.println("resultado upcasting" + y1);   
    //EJEMPLO DOWNCASTING (128 es demasiado para x2)
    int x2 = 128; 
    byte y2;
    y2=(byte)x2;   
    System.out.println("resultado upcasting" + y2);  
    
    System.out.println("\'hol\"a\""); 
     
    }
}
//float x= 37.8F;
//float x= (float)37.8;
//byte y =(byte)385;
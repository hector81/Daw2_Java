/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

//    ***
//   ***
//  ***

//   ****** 4 5 
//  *    * 2 1 3 1
// *    *1 1 3 1
//******

/**
 *
 * @author VESPERTINO
 */
public class RomboRaro {
    //2 3 1 3 0 3
    public void rombo1(int n) {
        for (int i = n-1; i >=0; i--) {
            muestraCaracter(i,' ');
            if(i >-1){
                muestraCaracter(n,'*');
            }
            System.out.println("");
        }

    }
    
    public void rombo2(int n){
        for (int i = n-1; i <= n; i++) {
            muestraCaracter(i, ' ');
            if(i == n ){
                muestraCaracter(1, 'n');
                muestraCaracter(i, ' ');
                muestraCaracter(1, 'n');
            } 
           
        }
    }
    
     //2131
    public void rombo3(int n){
        int j = 1;
        int contador1 = 3;
        int contador2 = 2;
        for (int i = n-contador1; i <= n-contador2; i++) {
           muestraCaracter(i,' ');
           if(i <= n-contador2){
                muestraCaracter(j,'*');               
            }
           contador1--;
           contador2--;
           System.out.println("");
        }
        
    }
    
    private void muestraCaracter(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    
    
    public static void main(String[] args) {
        RomboRaro rr = new RomboRaro();
//        rr.rombo1(3);
//        rr.rombo2(5);
        rr.rombo3(5);
    }
}

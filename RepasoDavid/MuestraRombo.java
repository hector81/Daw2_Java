/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

/**
 *
 * @author VESPERTINO
 */
public class MuestraRombo {

    /// 1 1 0 3 1 1
    public void metodoRombo1(int n) {
        for (int i = 1; i <= n; i += 2) {
                muestraCaracter(i, ' ');
                if(i == n){
                    for (int j = n -2; j > 0; j -=2) {
                        muestraCaracter(j, '*');
                    }
                    System.out.println("");
                }
                
            }
        
    }
    
    public void metodoRombo2(int n) {
        for (int i = 1; i >= 0; i--) {
                System.out.print(i + " ");
                if(i == 0){
                    for (int j = 1; j < n; j += 2) {
                        System.out.print(j + " ");
                    }
                }
            }
        
    }
    
    public void metodoRombo3(int n) {
        for (int i = 1; i >= 0; i--) {
            System.out.print(i + " ");
            if (i != -1) {
                for (int j = 1; j <= n; j += 2) {
                    System.out.print(j + " ");                    
                
                    
                }
            }
        }
    }

    private void muestraCaracter(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    
    public static void main(String[] args) {
        MuestraRombo rombo = new MuestraRombo();
        rombo.metodoRombo1(3);
        System.out.println("");
        rombo.metodoRombo2(3);
        System.out.println("");
        rombo.metodoRombo3(3);
    }
}

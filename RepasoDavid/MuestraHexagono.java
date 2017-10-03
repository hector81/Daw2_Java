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
public class MuestraHexagono {

    public void muestraHexagonoAst(int n) {
        int asteriscos = n;
        int espacios = n - 2;
        while (espacios >= 0) {
//            System.out.print(espacios + " ");
//            System.out.print(asteriscos + " ");
            muestraCaracter(espacios, ' ');
            muestraCaracter(asteriscos, '*');
            System.out.println("");
            asteriscos = asteriscos + 2;
            espacios--;
        }
        espacios = espacios + 1;
        asteriscos = asteriscos - 2;
        while (espacios < n - 2) {
            espacios++;
            asteriscos = asteriscos - 2;
            muestraCaracter(espacios, ' ');
            muestraCaracter(asteriscos, '*');
            System.out.println("");
//            System.out.print(espacios + " ");
//            System.out.print(asteriscos + " ");
        }

    }

    private void muestraCaracter(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        MuestraHexagono mh = new MuestraHexagono();
        mh.muestraHexagonoAst(9);
    }
}

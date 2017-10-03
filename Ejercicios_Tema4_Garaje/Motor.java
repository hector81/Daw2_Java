/*
Desarrollar una clase llamada Motor que:

- Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
- Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por 
defecto serán 0.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para los litros.
 */
package Ejercicios_Tema4_Garaje;

/**
 *
 * @author Hecto Garcia
 */
public class Motor {
    //ATRIBUTOS
    private int litrosAceite;
    private int caballos;
    
    //CONSTRUCTORES
    public Motor(int caballos){
    litrosAceite = 25; //todos los coches tendran por defecto 25 litros
    caballos = caballos;
    }
    
    //METODOS GETTERS AND SETTERS
    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
   
    public int getCV() {
        return litrosAceite;
    }
    
}

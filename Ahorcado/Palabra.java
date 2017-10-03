/*
JUEGO AHORCADO
 */
package Ahorcado;

/**
 *
 * @author Hector Garcia
 */
public class Palabra {
    //atributos
    private String palabraEscondida;
    private String palabraMostrar;
    StringBuilder sb= new StringBuilder("");
    
    //construcotr
    public Palabra(String palabraEscondida){
        this.palabraEscondida = palabraEscondida;
        for(int i=0; i<this.palabraEscondida.length();i++){
            sb.append("_");
        }
        this.palabraMostrar= sb.toString();
    }
    
    //metodos
    //metodo que muestra la palabra escondida
    public void mostrarPalabraEscondida(){
        for(int i=0; i< palabraMostrar.length(); i++){
            System.out.print(palabraMostrar.charAt(i) + " ");
        }
    }
    //comprobar que la palabra enviada sea acerta o erronea
    public boolean comprobrarLetra(String letra){
        StringBuilder sb = new StringBuilder(palabraMostrar);
        boolean aux= false;
        for(int i=0; i< palabraEscondida.length(); i++){
            if(palabraEscondida.charAt(i)== letra.charAt(0)){
                aux=true;
                sb.replace(i, i+1, letra);                
            }
        }
        this.palabraMostrar=sb.toString();
        return aux;
    }
    
    // metodo para comprobar si la palabra esta completa
    public boolean estaCompleta(){
        if(palabraMostrar.equals(palabraEscondida)){
            return true;
        }else {
            return false;
        }
    }

}//fin clase

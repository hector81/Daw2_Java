/*
 HACER UN PROGRMA QUE MEUSTR E50 NUMEROS ALEATORIOS ENTRE 10 Y 28
CREAR UNA CLASE LLAMADA Aleatorios.
-CONSTRUCTOR QUE DE EL VALOR INICIAL Y FINAL
-TENGA UN METODO QUE SEA MUESTRAALEATORIOS QUE RECIBA UN ENTERO N , INDICANDO LA CANTIDAD DE NUMEROS Y CALCULE Y MUESTRE POR
PANTALLA N NUMEROS ENTRE INICIO Y FINAL
 */
package Ejercicios_Tema4_Garaje;

public class Aleatorios {
    //ATRIBUTOS
    private int valorIncial  ;
    private int valorFinal  ;
    private int cantidad = 0;
    //CONSTRUCTOR QUE DE EL VALOR INICIAL Y FINAL
    public Aleatorios(int vI, int vF){     
        valorIncial = vI;
        valorFinal = vF;
    }
    
    //Getters and setters
    public int getValorIncial() {
        return valorIncial;
    }

    public void setValorFinal(int vF) {
        this.valorFinal = vF;
    }

    public int getValorFinal() {
        return valorFinal;
    }

    public void setValorIncial(int vI) {
        this.valorIncial = vI;
    }
            
    
    //metodo
    public int muestraAleatorios(int cantidad){
        //int n = (int) (Math.random()*valorFinal  + (valorIncial + 1));//entre 29 y 10
        int n = (int) Math.floor(Math.random()*(valorFinal-valorIncial+1)+valorIncial);
        
        while(cantidad < 50) {                
            for(cantidad = 0 ; cantidad <50; cantidad++ ){
                cantidad++;
                System.out.println("Número " + cantidad + " : " + n); 
            }//fin FOR                      
        }//FIN WHILE
        return n;
    }//FIN METODO
    
    //metodo
    public int dameAleatorio(int valorInicial, int valorFinal){
        int numero;
        numero = (int) (Math.random()*valorFinal+valorInicial);
        return numero;
    }//FIN METODO
    
    //metodo devolver un aleatorio
    
    //main
    public static void main(String[] args) {
        Aleatorios al = new Aleatorios(10,29);
        
        al.muestraAleatorios(50);
    }//fin main
}//fin clase

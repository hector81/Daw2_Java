package Ejercicios_Tema6_Math;

public class MiClase {

    //ATRIBUTO    
    private int valor;
    //CONSTRUCTOR
    public MiClase(int param) {
        this.valor = param;
    }
    //GETTERS AND SETTERS
     public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return Integer.toString(valor);
    }
    static class Test{
        public static void main(String[] args) {
            MiClase a = new MiClase(1);
            MiClase b = new MiClase(2);            
            System.out.println("A: " + a + " B: " + b);
            cambiar(a,b);
            System.out.println("A: " + a + " B: " + b);
        }
    }
    
    public static void cambiar(MiClase a,MiClase b){
        int tmp = a.getValor();
        a.setValor(b.getValor());
        b.setValor(tmp);
    }
}

package AhorcadoAngel;

public class Horca {

    private int estado;
    

    public Horca() {
        estado = 0;
    }

    public void mostrar() {
        switch (estado) {
            case 0:                
                System.out.println("Tienes 4 vidas");
                break;
            case 1:               
                System.out.println("Tienes 3 vidas");
                break;
            case 2:               
                System.out.println("Tienes 2 vidas");
                break;
            case 3:               
                System.out.println("Tienes 1 vidas");
                break;
            default:
                System.out.println("Has muerto");
                break;

        }
    }

    public void ponItem() {
        this.estado++;
    }

    public boolean estaVivo() { //cuando el estado de errores llega a 4 esta muerto
        return estado<4;
    }

}

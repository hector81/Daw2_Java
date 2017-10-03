package usodeltreeset;
public class UsoDelTreeSet {
    public static void main(String[] args) {
        Menu m= new Menu();
        Alumno alu = new Alumno();
        int a;
        do{
        m.mostrarMenu();
        a=alu.pedirOpcion();
        m.ejecutaOpcion(a);
        }while(a!=5);
        
    }
    
}

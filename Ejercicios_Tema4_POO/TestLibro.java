package Ejercicios_Tema4_POO;

public class TestLibro {
    //main
    public static void main(String[] args) {
        
        //llamamos 1º constructor para el primer libro
        Libro libro1 = new Libro("12-98-c", "PRIMER LIBRO");   //INSTACIACION    
        System.out.println("***************PRIMER LIBRO**********");
        
        //usamo set para enviar datos del objeto
        libro1.setNumeroPaginas(1255);
        libro1.setPrecio(69.36); 
        //ejemplo quiero cambiar titulo libro
        libro1.setTitulo("tercer LIBRO"); 
        
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El ISBN del primer libro es " + libro1.getIsbn());
        System.out.println("El título del primer libro es " + libro1.getTitulo());
        System.out.println("El número de paginas del primer libro es " + libro1.getNumeroPaginas());
        System.out.println("El precio del primer libro es " + libro1.getPrecio());
        
        //llamamos 2º constructor para el segundo libro
        Libro libro2 = new Libro("dfdffdfdfdfdf-99-88");   //INSTACIACION 
        System.out.println("***************SEGUNDO LIBRO**********");
        
        //usamo set para enviar datos del objeto
        libro2.setTitulo("SEGUNDO LIBRO");
        libro2.setNumeroPaginas(1985);
        libro2.setPrecio(29.46); 
        
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El ISBN del segundo libro es " + libro2.getIsbn());
        System.out.println("El título del segundo libro es " + libro2.getTitulo());
        System.out.println("El número de paginas del segundo libro es " + libro2.getNumeroPaginas());
        System.out.println("El precio del segundo libro es " + libro2.getPrecio());
        
        //declaro mas objetos
        Libro l2;
        l2 = new Libro("558996-fff-99","El señor de los anillos");
        
        System.out.println("***************prueba l2**********");
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El ISBN del segundo libro es " + l2.getIsbn());
        System.out.println("El título del segundo libro es " + l2.getTitulo());
        System.out.println("El número de paginas del segundo libro es " + l2.getNumeroPaginas());
        System.out.println("El precio del segundo libro es " + l2.getPrecio());
        
    }//fin del main
}//fin clase


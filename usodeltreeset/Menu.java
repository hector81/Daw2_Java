package usodeltreeset;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class Menu {
    private TreeSet listaDeAlumnos;

    public Menu() {
        listaDeAlumnos = new TreeSet();
    }
    public void mostrarMenu() {
        System.out.println("1. Añadir datos alumno");
        System.out.println("2. Borrar por posición");
        System.out.println("3. Mostrar listado");
        System.out.println("4. Salir del programa");
        System.out.println("5. Mostrar por nota.");
        System.out.println("5. Mostrar por Teléfono.");
        System.out.println("5. Mostrar por Nombre.");
        

    }
    

    public void ejecutaOpcion(int x) {
        switch (x) {
            case 1:
                // llamadar a metodo privado que añada un alumno
                darDeAltaAlumno();
                System.out.println("Alumno añadido.");
                break;
            case 2:
                // borrar un alumno
                borrarAlumno();
                System.out.println("Borrado.");
                break;
            case 3:
                // Mostrar listado
                muestraListado();
                break;
            case 4:
                System.out.println("Ha salido del programa.");
                break;
            case 5:
                muestraPorNota();
                System.out.println("Muestra por nota.");
                break;
            case 6:
                alumnoNTlf();
                System.out.println("Por número de teléfono");
                break;
            case 7:
                alumnoPorNombre();
                System.out.println("Alumno ordenado por nombre.");
                break;
        }
    }

    private void darDeAltaAlumno() {
        // Pedir los datos al usuario
        // Creamos un objeto de tipo Alumno
        // añadirlo a la coleccion hashset
        //listaDeAlumnos.add()
        Scanner t = new Scanner(System.in);
        String s;
        int numExp;
        long tlf;
        double nota;
        System.out.println("Introduzca los datos del alumno: ");
        System.out.println("Nombre: ");
        s=t.nextLine();
        System.out.println("Nota:");
        nota=t.nextDouble();
        System.out.println("Número expediente:");
        numExp=t.nextInt();
        System.out.println("Teléfono:");
        tlf=t.nextLong();
        Alumno a = new Alumno(numExp, s, nota, tlf);
        listaDeAlumnos.add(a);
    }

    private void borrarAlumno() {
        // Pedir al usuario que alumno quiere borrar
        /* crear una coleccion nueva de tipo hashset y pasar en ella todos 
        los alumnos menos el que quiere borrar*/
        Scanner t = new Scanner(System.in);
        int indBorrar,c=0;
        Iterator i = listaDeAlumnos.iterator();
        System.out.println("Elija que alumno quiere borrar:");
        while (i.hasNext()){
            System.out.println("Listado alumnos: " + c +"." + i.next());
            c++;
        }
        System.out.println("Elija el número del índice que quiera borrar: ");
        indBorrar=t.nextInt();
        while(i.hasNext()){
        if(indBorrar==c){
          listaDeAlumnos.remove(i.next());
          break;//nos permite salir del bucle
        }
        c++;
    }
        
}

    private void muestraListado() {
        // Recorre la coleccion y muestra los alumnos por pantalla
        Iterator i = listaDeAlumnos.iterator();
        Alumno a;
        while (i.hasNext()){
            a = (Alumno)i.next();
            System.out.println("Listado alumnos: " + a.toString());
        }
    }
    private void muestraPorNota(){
        //crearse un objeto de la lista
        //crearse una lista de treeset  meter ese orden 
        //añadir los alumnos a la lista nueva y dp un iterator
        AlumnoMuestraPorNota a = new AlumnoMuestraPorNota();
        TreeSet lista = new TreeSet(a);//el orden se lo indicas en el objeto
        lista.addAll(listaDeAlumnos);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
    private void alumnoNTlf(){
        AlumnoMuestraPorTlf tlf = new AlumnoMuestraPorTlf();
        TreeSet lista = new TreeSet(tlf);
        lista.addAll(listaDeAlumnos);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    private void alumnoPorNombre(){
        AlumnoOrdenadoPorNombre n = new AlumnoOrdenadoPorNombre();
        TreeSet lista = new TreeSet(n);
        lista.addAll(listaDeAlumnos);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
        
    }
    
}

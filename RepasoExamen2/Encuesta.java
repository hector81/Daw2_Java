/*
Rellenamos una encuestacon N personas con 3 tipos de respuesta, una si es hombre o mujer(1-2),
trabaja o no trabaja(1-2), su sueldo(600-2000). Utilizar estos metodos:
NOTA: HAY QUE USAR ALGÚN TIPO DE COLLECTION.

*Porcentaje de hombre(tengan o no trabajo)---con iterator
*Porcentaje de mujeres(tengan o no trabajo)---con for/in
*Porcentaje de hombres que trabajen---con for
*Porcentaje de mujeres que trabajen---con do/while
*El sueldo promedio de los hombres que trabajen---con while
*El sueldo promedio de los mujeres que trabajen---como se quiera
 */
package RepasoExamen2;

/**
 *
 * @author Hector Garcia
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Encuesta {
    //atributos y objetos
    private ArrayList<Persona> listaEncuestado;
    

    //constructores
    public Encuesta() {
        listaEncuestado = new ArrayList();
     
    }
    
    //metodos
    //añadir objetos a arrayList
    public ArrayList añadir(Persona p, int N) {
        for (int i = 0; i < N; i++) {
            Persona persona = new Persona();
            p = new Persona(persona.getRespuestaSexo(), persona.getRespuestaTrabajo(), persona.getRespuestaSalario());
            listaEncuestado.add(p);
        }  
        return listaEncuestado;
    }//FIN METODO    
    
    //recorrer arrayList
    public void mostrarListado(ArrayList listaEncuestado) {
        int contador=1;
        Iterator it = listaEncuestado.iterator();
        while(it.hasNext()) {
            System.out.println("");
            System.out.println("RESPUESTAS ENCUESTA PERSONA " + contador + " : ");        
            System.out.println(it.next());
            
            contador++;
        }    
    }//FIN METODO
    
    //1*Porcentaje de hombre(tengan o no trabajo)---con iterator
    public double porcentajeHombres(ArrayList listaEncuestado){
        int contadorHombres = 0;//iniciamos variable local
        double resultado =0;
        int tamaño = listaEncuestado.size();//calculamos tamaño del arrayList
        Iterator it = listaEncuestado.iterator();//recorremos arrayList
        while(it.hasNext()) {
            Persona persona =  (Persona) it.next();      
            if( persona.getRespuestaSexo() ==1){
                contadorHombres++;
            }            
        }//fin while
        resultado = (double)(contadorHombres/tamaño)*100;
        return resultado;
    }//fin metodo
    
    
    //2*Porcentaje de mujeres(tengan o no trabajo)---con for/in
    public double porcentajeMujeres(ArrayList listaEncuestado){
        double contadorMujeres = 0;//iniciamos variable local
        double resultado =0;
        int tamaño = listaEncuestado.size();//calculamos tamaño del arrayList
        Persona aux;
        for (Object p : listaEncuestado) {
            aux = (Persona) p;
            if(aux.getRespuestaSexo() == 2){
                contadorMujeres++;
            }
        }
        resultado = (contadorMujeres/tamaño)*100;
        return resultado;
    }//fin metodo
       


    //3*Porcentaje de hombres que trabajen---con for
    public static double porcentajeHombresTrabajo(ArrayList listaEncuestado) {
        int contadorHombresTrabajo = 0;
        double resultado = 0;
        int tamaño = listaEncuestado.size();//calculamos tamaño del arrayList
        for (int i = 0; i < listaEncuestado.size(); i++) {
            Persona persona = (Persona) listaEncuestado.get(i);
            if (persona.getRespuestaSexo() == 1 && persona.getRespuestaTrabajo() == 1) {
                contadorHombresTrabajo++;
            }
        }
        resultado = (contadorHombresTrabajo / tamaño) * 100;
        return resultado;
    }//fin metodo
    
    //4*Porcentaje de mujeres que trabajen---con do/while
    public double porcentajeMujeresTrabaja(ArrayList listaEncuestado){
        int contador = 0;
        int contadorMujeresTrabajo = 0;
        double resultado = 0;
        int tamaño = listaEncuestado.size();//calculamos tamaño del arrayList		
        do{
            Persona persona = (Persona) listaEncuestado.get(contador);
            if (persona.getRespuestaSexo() == 2 && persona.getRespuestaTrabajo() == 1) {
                contadorMujeresTrabajo++;
            }
            contador++;
        }while (contador < tamaño);
        resultado = (contadorMujeresTrabajo / tamaño) * 100;
        return resultado;
    }//fin metodo
    
    //5*El sueldo promedio de los hombres que trabajen---con while
    public double sueldoHombresTrabajo(ArrayList listaEncuestado) {
        int contador = 0;
        int contadorHombresTrabajo = 0;
        double resultado = 0;
        double suma=0;
        double sumaSuma=0;
        int tamaño = listaEncuestado.size();//calculamos tamaño del arrayList		
        while (contador < tamaño) {
            Persona persona = (Persona) listaEncuestado.get(contador);
            if (persona.getRespuestaSexo() == 1 && persona.getRespuestaTrabajo() == 1) {
                contadorHombresTrabajo++;
                suma = persona.getRespuestaSalario();
                sumaSuma +=suma;
            }
            contador++;
        }
        resultado = (double)sumaSuma/contadorHombresTrabajo;
        return resultado;
    }//fin metodo
    
    //6*El sueldo promedio de los mujeres que trabajen---como se quiera
    public double sueldoMujeresTrabajo(ArrayList listaEncuestado) {
        int contadorMujeres = 0;//iniciamos variable local
        double sumaSueldos =0;//iniciamos variable local
        double resultado = 0;//iniciamos variable local
        for (int i = 0; i < listaEncuestado.size(); i++) {
            Persona persona = (Persona) listaEncuestado.get(i);
            if (persona.getRespuestaSexo() == 2 && persona.getRespuestaTrabajo() != 2) {
                contadorMujeres++;//sumamos mujeres
                sumaSueldos += persona.getRespuestaSalario();//acumulamos sueldos
            }
        }
        resultado = (double)sumaSueldos/contadorMujeres;
        return resultado;
    }//fin metodo
    
    
}//fin clase


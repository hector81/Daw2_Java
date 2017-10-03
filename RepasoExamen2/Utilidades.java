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
 * @author VESPERTINO
 */
public class Utilidades {
    //comprobar que el numero es negativo o no
    public static boolean comprobarNegativos(int N) {
        if (N < 1) {
            return false;
        } else {
            return true;
        }
    }//FIN METODO

    //generar numeros aleatorios entre dos rangos
    public static int generarNumerosAleatoriosRangos(int min, int max) {
        int numeroAleatorio;
        numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return numeroAleatorio;
    }//FIN METODO
    
}//fin clase    
    /*
    //generamos una fila con 3 numeros aleatorios entre distintos rangos
    public static int[] generarFilasEncuestasTresPreguntas(){
        int[]array = new int[3];
        //recorremos las posiciones del array y las rellenamos con nº aleatorios
        for (int i = 0; i < array.length; i++) {
            array[0] = generarNumerosAleatoriosRangos(1,2);
            array[1] = generarNumerosAleatoriosRangos(1,2);
            if(array[1] == 1){//si trabaja
                array[2] = generarNumerosAleatoriosRangos(600,2000);
            } else {
                array[2] = 0;//si no trabaja
            }
        }
        return array;
    }//FIN METODO
    
    //metemos unos arrays en otro
    public static int[][] rellenarArraysEnOtro(int N) {
        int[][] nuevoArray = new int[N][3];
        for (int i = 0; i < nuevoArray.length; i++) {
            nuevoArray[i] = generarFilasEncuestasTresPreguntas(); // metemos los array en otro array
            for (int j = 0; j < nuevoArray[i].length; j++) {
                nuevoArray[i][j] = nuevoArray[i][j];
            }
        }
        return nuevoArray;
    }
    
    //recorrer e imprimir un array
    public static void imprimir(int[][] array) {
        int contador = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print("RESPUESTAS ENCUESTA PERSONA " + contador + " : ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            contador++;
            System.out.println();
        }
        
    }//FIN METODO
    
    //metodo iterator
    public static void porcentajeHombresIterator(int[][] array){
        int contador=0;
        int hombres = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[0][j]==1)  {
                hombres++;
                }
            }
            contador++;
        }
        System.out.print("Numero hombres " + hombres);
        System.out.print("Porcentaje hombres " + (hombres/(contador/2))*100  +"%");
    }
  
    //metodo para generar una lista de arrays
    public static ArrayList añadirArraysEnOtro(Persona persona, int N) {
        ArrayList<Persona>listaEncuestado = new ArrayList<>();       
        for (int i = 0; i < N; i++) {
            listaEncuestado.add(persona);           
        } 
        return listaEncuestado;
    }//FIN METODO
    
    //imprimir un arrayList
    public static void imprimirArrayList(ArrayList listaEncuestado){
        int contador=1;
        int[]arrayRespuesta;
        //creamos obejto iterator
        Iterator it = listaEncuestado.iterator();
        while (it.hasNext()) {
            System.out.println("RESPUESTAS ENCUESTAS PERSONA " + contador + " : ");
            arrayRespuesta = (int[]) it.next(); 
            for (int i = 0; i < arrayRespuesta.length; i++) {
                System.out.println(arrayRespuesta[i] + " ");                
            }           
            contador++;
        }
    }
    
    */
    
/*
    public int[] responderPreguntas(){
        int[]array = new int[3];
        //recorremos las posiciones del array y las rellenamos con nº aleatorios
        for (int i = 0; i < array.length; i++) {
            array[0] = this.getRespuestaSexo();
            array[1] = this.getRespuestaTrabajo();
            if(array[1] == 1){//si trabaja
                array[2] = this.getRespuestaSalario();
            } else {
                array[2] = 0;//si no trabaja
            }
        }
        return array;
    
    }
    */
    
    /*
//metodo pasamos el arrayList a array
    public Object[] pasarArrayListArray() {
        ArrayList nuevoArrayList = listaEncuestado;
        Object[] array = nuevoArrayList.toArray();

        int contador = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print("RESPUESTAS ENCUESTA PERSONA " + contador + " : ");
                System.out.print(array[i] + " ");            
            contador++;
            System.out.println();
        }
        return array;
    }//FIN METODO
    
    //recorrer e imprimir un array
    public static void imprimir(int[]array){
        int contador = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[0] == 1){
                System.out.print(" SEXO : HOMBRE");
            }
            if(array[0] == 2){
                System.out.print(" SEXO : MUJER");
            }
            if(array[1] == 1){
                System.out.print(" TRABAJA : SI");
                System.out.print(" SUELDO : " + array[2] + "\n");     
            }
            if(array[1] == 2){
                array[2]=0;
                System.out.print(" TRABAJA : NO");
                System.out.print(" SUELDO : " + array[2] + "\n");      
            }
            System.out.print("RESPUESTAS ENCUESTA PERSONA " + contador + " : ");         
            contador++;
        }     
    }//FIN METODO
    */
    
    
    


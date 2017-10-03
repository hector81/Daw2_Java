/*
METODOS
 */
package Ejercicios_Tema6_String;

import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class MetodosString {

    //METODOS
    /**
     * ***************************************************************************************************
     */
    /*
    1. Implementa la clase StringTest vista en la diapositiva 4 probando los distintos
    métodos ya implementados.
    */
    public static void probarTestString() {
        //creamos 3 string
        String s1 = new String();
        String s2 = new String(" ababABAB "); // Tiene espacios en blanco.
        String s3 = "Ejemplo";
        //imprimimos
        //compara posición que en este caso no esta, da -1
        System.out.println(s1.compareTo(" ")); // “ “ es un espacio en blanco.
        //juntamos 2 string
        System.out.println(s2.concat((s3)));
        //damos la posicion de h que en este caso no esta, da -1
        System.out.println(s1.indexOf('h'));
        //devuelve la cadena sin espacios
        System.out.println(s2.trim());
        //pasa String a minuscula
        System.out.println(s2.toLowerCase());
        //pasa String a mayuscula
        System.out.println(s3.toUpperCase());
        //damos la posicion de b
        System.out.println(s2.indexOf('b'));
        //damos la ultima posicion de donde aparece b
        System.out.println(s2.lastIndexOf('b'));
        //damos la longitud
        System.out.println(s3.length());
        //pasa la posicion 1, en este caso j
        System.out.println(s3.charAt(1));
        //reemplaza
        System.out.println(s2.replace('A', 'x'));
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    1-Implementa la clase StringTest vista en la diapòsitiva 4 probandpo los distintos metodos ya 
    implementados
    */
    public static void ImplementarClaseString() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    /**
     * ***************************************************************************************************
     */
    /*
    2-Realiza un método dentro de la clase StringII que reciba un string leido por teclado(desde la clasee
    prueba) y retorne un booleanao indicnado si es o no palindromo   Palindromo
    metodo volver palabra del reves
    metodo volver palabra del reves
    */
    public static void volverReves(String cadena) {
        String nuevaPalabra = "";
        for (int i = cadena.length(); i > 0; i--) {
            nuevaPalabra += cadena.charAt(i - 1);
        }
        System.out.println(nuevaPalabra);
    }//fin metodo

    public static boolean esPalindromo(String cadena) {
        String c1, c2;
        int mitad = (cadena.length() - 1) / 2;
        c1 = cadena.substring(0, mitad);
        c2 = cadena.substring(mitad + 1, (cadena.length()));
        return c1.equals(c2);
        //c1=reverse(c2)        
    }//fin metodo
    
    public static boolean averiguarPalindromo(String cadena) {
        String palabraVuelta = new StringBuffer(cadena).reverse().toString();

        return cadena.equals(palabraVuelta);        
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    3-Crea una clase llamada TesteoDeStringBuffer con dos metodos cuyo codigo sea el que
    aparece en la diapositiva 1 y 2 de la pagina 8 de teoria. Crea la clase main para llamar
    a dichos metodos. Se deja al alumno que juege con los metodos de la clase StringBuffer
    metodos
    */
    public static void probarMetodosStringBuffer1() {
        StringBuffer sb1 = new StringBuffer("abababab");
        System.out.println("LA CADENA DE STRING ES : " + sb1);
        System.out.println("LONGITUD DEL STRING : " + sb1.length());
        System.out.println("NÚMERO DE CARACTERES QUE PUEDE ALOJAR SIN ALOCAR MÁS MEMORIA: " + sb1.capacity());
        //reemplaza en este caso el ultimo el caracter por B
        sb1.setCharAt(sb1.length() - 1, 'B');
        System.out.println("Reemplazamos el ultimo caracter por B : " + sb1);
        //Reemplezamos ENTRE la 2º y 3º posicion por AB 
        sb1.replace(2, 3, "AB");
        System.out.println("Reemplezamos ENTRE la 2º y 3º posicion por AB (cambia a por AB) : " + sb1);
        //iNSERTAMOS en la 4º posicion CD
        sb1.insert(4, "CD");
        System.out.println("Insertamos en la 4º posicion CD (cambia una b por CD): " + sb1);
        //BORRAMOS
        sb1.delete(0, 2);
        System.out.println("Borramos entre la posicion 0 y 2 (borramos a y b iniciales): " + sb1);
    }//fin metodo

    public static void probarMetodosStringBuffer2() {
        //declaramos objeto de Stringbuffer de tamaño 2
        StringBuffer sb2 = new StringBuffer(2);
        System.out.println("LONGITUD DEL ENTERO : " + sb2.length());
        System.out.println("NÚMERO DE CARACTERES QUE PUEDE ALOJAR SIN ALOCAR MÁS MEMORIA: " + sb2.capacity());

        //Hacemos un bucle para que recorra 10 números
        for (int i = 0; i <= 10; i++) //añadimos numeros
        {
            sb2.append(i);
        }
        System.out.println("PONEMOS 10 NUMEROS NUEVOS ");
        System.out.println("LONGITUD DEL ENTERO CON LOS NUEVOS NUMEROS : " + sb2.length());
        System.out.println("NÚMERO DE CARACTERES QUE PUEDE ALOJAR CON LOS NUEVOS NUMEROS: " + sb2.capacity());
        System.out.println(sb2);
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    4. Crea un método que dado un String leído por teclado retorna un string convertido en
    contraseña con las siguientes modificaciones (tanto mayúsculas como minúsculas).
     * A → @, E → 3, I → 1, O → 0 y U → \ /        StringContraseña
     */
    //metodo replaceWord
    public static void replaceWord(String cadena) {
        String palabraCambiada = cadena;
        //reemplaza para la mayusculas //tambien se puede usar toUpperCase
        palabraCambiada = palabraCambiada.replace('a', 'A');
        palabraCambiada = palabraCambiada.replace('e', 'E');
        palabraCambiada = palabraCambiada.replace('i', 'I');
        palabraCambiada = palabraCambiada.replace('o', 'O');
        palabraCambiada = palabraCambiada.replace('u', 'U');
        //palabra es inmutable y no cambia solo se usa la primera vez, el resto machaca palabraCambiada
        palabraCambiada = palabraCambiada.replace('A', '@');
        palabraCambiada = palabraCambiada.replace('E', '3');
        palabraCambiada = palabraCambiada.replace('I', '1');
        palabraCambiada = palabraCambiada.replace('O', '0');
        palabraCambiada = palabraCambiada.replace("U", "/");
        System.out.print("La palabra cambiada es " + palabraCambiada);
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    5- Realizar un método en la clase StringII que reciba un String con números enteros
     positivos + 0 y de una cifra y muestre dichos números en el siguiente orden: el
     primero, el último, el segundo, el penúltimo, el tercero etc. (el String que se recibe 
     debe tener una longitud par comprobar ese hecho).  NumerosPositivosOrdenados
     1342
     1234
     */
    //Metodo
    public static String ordenarNumeros(String cadena) {
        //declaramos la mitad de la longitud de numeros
        int mitadLongitud = (cadena.length() / 2);
        //construimos 3 StringBuilder
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder ab = new StringBuilder();
        //cogemos los numero de la posicion 0 a la mitad
        a.append(cadena.substring(0, mitadLongitud));
        //cogemos los numeros de la posicion de la mitad al resto de la longitud
        b.append(cadena.substring(mitadLongitud, cadena.length()));
        //le damos la vuelta a b
        b.reverse();
        //recorremos
        for (int j = 0; j < b.length(); j++) {
            //añade la primera posicion a ab la primera de a, luego de b,luego la segunda de a......
            ab.append(a.charAt(j));
            ab.append(b.charAt(j));
        }
        //devuelve resultado pasado a string
        return ab.toString();
    }//fin metodo 

    /**
     * ***************************************************************************************************
     */
    /*
    6. Realizar un nuevo método que dado dos Strings con números enteros y positivos, 
    retorne un String con una mezcla de la forma: el 1o de A, 1o de B, el 2o de A, el 2o
    de B etc. (suponemos que el tamaño de ambos es el mismo, aunque será 
    necesario comprobarlo)   . JuntarDosString3posicionesPrimeras
    EJEMPLO1:
    135
    246
    123456
    */
    //metodo juntarStrings
    public static String juntarStrings(String primerString, String segundoString) {
        //nueva variable local
        String stringJuntos = "";
        int i = 0;
        int j = 0;
        //creamos un objeto StringBuilder del primer string
        StringBuilder js = new StringBuilder();
        //mientras la posicion sea menor al total de la longitud del primer string
        while (i < primerString.length()) {
            //inserta la posicion de j donde deberia ir i
            js.insert(j, primerString.charAt(i));
            //inserta en la siguiente j, la siguiente posicion de i
            js.insert(j + 1, segundoString.charAt(i));
            //sumamos 2 para que se salte en la siguiente vuelta la proxima posicion de i
            j = j + 2;
            //sumamos 1 para que siga contando el contador
            i = i + 1;
        }
        //pasamos a String la nueva variable
        stringJuntos = js.toString();
        //imprimimos     
        return stringJuntos;
    }//fin metodo
    
    //metodo AIDA
    public static String JuntarDosStringsEnOrdenPosicion1 (String primerString,String segundoString){
        StringBuilder cd = new StringBuilder();
        for (int j = 0; j < primerString.length(); j++) {
            cd.append(primerString.charAt(j));
            cd.append(segundoString.charAt(j));
        }
        return cd.toString();
    }

    /**
     * ***************************************************************************************************
     */
    /*
    7. Idem a ejercicio 6 pero retorna: tres números de A, tres de B ... suponemos que el 
    tamaño de ambos es múltiplo de tres y del mismo tamaño (comprobad) .  JuntarDosStringsEnOrdenPosicion
     EJEMPLO 1:
    1ºSTRING: 111222333
    2ºSTRING: 444555666
    RESULTADO: 111444222555333666
    Pon primer String : 374625
    Pon segundo String : 543278
    Resultado: 374543746432
    */
    //metodo juntarStrings
    public static String juntar3(String primerString, String segundoString) {
        //nueva variable local
        String stringJuntos = "";
        //creamos un objeto StringBuilder del primer string
        StringBuilder js = new StringBuilder();
        //recorremos
        for (int i = 0; i < primerString.length(); i += 3) {
            //capturamos las 3 primeras posiciones(del 0 a 2)
            js.append(primerString.substring(i, i + 3));
            js.append(segundoString.substring(i, i + 3));
        } //fin for
        stringJuntos = js.toString();
        //imprimimos     
        return stringJuntos;
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    8-Realizar un método que reciba dos número N y M (entero positivo + 0). Rellene un
    String con 10 números aleatorios de una cifra y añada en el String de aleatorios N 
    asteriscos a partir de la posición M del String, retornando el resultado.  NumerosAleatorios
    Ejemplo
    String: 8956234567
    N: 3   (asteriscos)
    M: 4   (n º posicines)
    Resultado: 8956***234567
     */
    //metodo juntarStrings
    public static String ponerAsteriscosString(String cadena, int N, int M) {
        //nueva variable local
        String asterisco = "*";
        //usamos acumulador para hacer un string con N asteriscos
        for (int i = N - 1; i > 0; i--) {
            asterisco += "*";
        }
        //creamos 2 objeto StringBuilder 
        StringBuilder js1 = new StringBuilder();
        StringBuilder js2 = new StringBuilder();
        //recorremos
        for (int i = 0; i < M; i++) {
            js1.append(cadena.charAt(i));
        } //fin for  
        for (int j = M + 1; j < cadena.length(); j++) {
            js2.append(cadena.charAt(j));
        } //fin for            
        //creamos 2 cadena    ///1234***56789
        String stringJuntos1 = js1.toString();
        String stringJuntos2 = js2.toString();
        //juntamos las tres cadenas
        String fusion = stringJuntos1 + asterisco + stringJuntos2;
        //imprimimos     
        return fusion;
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    9. Realizar un método que reciba un número N (entero positivo + 0) y retorne un 
    String. El método rellenará inicialmente un String del 0 al 9. Posteriormente 
    recorrerá dicho String insertando el número N de forma ordenada en el String y 
    retornándolo.        NumerosAleatorosNM
    EJEMPLO: GENERA 0123456789
    PONG0 N EL 3
    RESULTADO: 01233456789
     */
    //METODO insertar numero igual
    public static String insertarNumeroIgual(String cadena, int N) {
        //declaramos dos objetos StringBuilder
        StringBuilder destino1 = new StringBuilder("");
        StringBuilder destino2 = new StringBuilder("");
        //recorremos de la primera posicion hasta la posicion del numero + 1
        //para que coga el N tambien, añadiendo esas posiciones
        for (int j = 0; j < N + 1; j++) {
            destino1.append(j);
        } //fin for
        //recorremos desde la posicion N hasta la ultima posicion
        // añadiendo esas posiciones
        for (int i = N; i < cadena.length(); i++) {
            destino2.append(i);
        } //fin for
        //devolvemos los dos string juntos
        return destino1.toString() + destino2.toString();
    }//FIN METODO

    /**
     * ***************************************************************************************************
     */
    /*
    10. Realizar un método que recibe un número N (entero + 0) y devuelve un String. El
    método creará inicialmente un String con números entre 1 y 100 y posteriormente
    eliminará el número N del String retornándolo. QuitarNSring
     */
    //METODO insertar numero igual// se puede hacer con replace all
    public static String quitarN(int N) {
        //pasamos el int a char
        char M = (char) N;
        int numeros = 0;
        ///declaramos StringBuilder para LOS NUMEROS DE 1 A 100 con N quitado
        StringBuilder destino1 = new StringBuilder("");
        StringBuilder destino2 = new StringBuilder("");
        //recorremos dde 1 a 100
        for (int i = 1; i <= 100; i++) {
            destino1.append(i); // coge los numeros de 1 a 100 
        }
        //convertimos la serie de 1 a 100 a string
        String numeros1 = destino1.toString();
        for (int j = 0; j <= numeros1.length(); j++) {
            //si el numero es distinto de N, menor que 100 o mayor que 0
            if (j != N && j < 100 && j > 0) {
                destino2.append(j + " "); // coge los numeros de 1 a 100 menos el N
            }
        }
        return "Numeros de 1 a 100 con el N quitado: "
                + destino2.toString();
    }//FIN METODO

    /**
     * ***************************************************************************************************
     */
    /*
    11. Realizar un método que recibe un String con números pares e impares de una cifra
    y retorna dos Strings con los números pares por un lado y los impares por otro.    numerosParesImpares
     */
    //METODO insertar numero igual
    public static String detectarParesImparesString(String cadena) {
        ///declaramos StringBuilder para pares
        StringBuilder pares = new StringBuilder("");
        ///declaramos StringBuilder para impares
        StringBuilder impares = new StringBuilder("");
        //pasamos la cadena completa a los objetos de StringBuilder

        //recorremos la cadena
        for (int i = 0; i < cadena.length(); i++) {
            //pasamos la posiciones a caracteres
            char t = cadena.charAt(i);
            boolean u=Character.isLetter(cadena.charAt(i));
            int y = Character.getNumericValue(cadena.charAt(i));
            //si el resto del caracter es 0 es par y si no es impar. Añadimos
            if (y % 2 == 0) {
                pares.append(y + " ");
            } else {
                impares.append(y + " ");
            }
        }//FIN FOR 1

        return "Numeros pares: " + pares.toString() + "\nNumeros impares: " + impares.toString();

    }//FIN METODO

    /**
     * ***************************************************************************************************
     */
    /*
    13.Realiza una comprobación del rendimiento de las clases StringBuffer y 
    StringBuilder para un programa en Java que concatene (método append) en una 
    cadena inicialmente vacía un millón de string con la palabra “hola”. Calcula y 
    muestra por pantalla cuando tardan ambas clases en realizar esa concatenación. 
    NOTA: No es necesario sacar el resultado de la concatenación por pantalla.
    y caclular elt tiempo que tarda //usar nanoTime y currentTimeMillis . ComprobacionRendimiento
    */
    public static void appendMillonHola(String cadena) {
        //hacemos StringBuilder y StringBuffer
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sbf1 = new StringBuffer();
        //variables locales
        long t1;
        long t2;
        long t3;

        t1 = System.currentTimeMillis();
        //recorremos con StringBuilder
        for (int i = 1; i < 1000001; i++) {
            sb1.append(cadena);
        }

        t2 = System.currentTimeMillis();
        //recorremos con StringBuffer
        for (int i = 1; i < 1000001; i++) {
            sbf1.append(cadena);
        }

        t3 = System.currentTimeMillis();
        //imprimimos
        System.out.println("Tiempo StringBuilder : " + (t2 - t1));
        System.out.println("Tiempo StringBuffer : " + (t3 - t2));
    }//fin metodo

    /**
     * ***************************************************************************************************
     */
    /*
    14-Dado un texto leido por pantalla, desde la clase MAIN realiza un metodo que retorne un entero
    indicando el numero de palabras,vocales, consonantes, simbolos que contiene .     TextNumero
     */
    //METODO 
    public static int calcularPalabras(String cadena) {
        int numeroPalabras = 0;
        /*UNA FORMA DE HACERLO
       //creamos un objeto de StringTokenizer
       StringTokenizer st = new StringTokenizer(cadena);
       //usamos el el metodo countTokens
       numeroPalabras= st.countTokens();
         */
        /* OTRA FORMA DE HACERLO
       //recorremos la cadena
        for (int i = 0; i < cadena.length(); i++) {
            //pasamos la posiciones a caracteres
            char p = cadena.charAt(i);
            //si es vocal añadimos
            if (p == ' ') {
                numeroPalabras++;
            }            
        }//FIN FOR 1
        //sumamos 1 para contar la primera palabra
       return numeroPalabras+1;
         */
        ///declaramos StringBuilder para Vocales
        StringBuilder palabras = new StringBuilder("");
        //recorremos la cadena
        for (int i = 0; i < cadena.length(); i++) {
            //pasamos la posiciones a caracteres
            char p = cadena.charAt(i);
            //si es vocal añadimos
            if (p == ' ') {
                palabras.append(p);
            }
            //creamos string
            String numPab = palabras.toString();
            //calculamos la longitud del string
            numeroPalabras = numPab.length();
        }//FIN FOR 1
        //sumamos 1 para contar la primera palabra
        return numeroPalabras + 1;
    }//FIN METODO

    //METODO 
    public static int calcularVocales(String cadena) {
        int numeroVocales = 0;
        ///declaramos StringBuilder para Vocales
        StringBuilder vocales = new StringBuilder("");
        //pasamos el texto a minusculas
        String textoM = cadena.toLowerCase();
        //recorremos la cadena
        for (int i = 0; i < textoM.length(); i++) {
            //pasamos la posiciones a caracteres
            char v = textoM.charAt(i);
            //si es vocal añadimos
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                vocales.append(v);
            }
            //creamos string
            String numVoc = vocales.toString();
            //calculamos la longitud del string
            numeroVocales = numVoc.length();
        }//FIN FOR 1
        return numeroVocales;
    }//FIN METODO

    //METODO 
    public static int calcularConsonantes(String cadena) {
        int numeroConsonantes = 0;
        ///declaramos StringBuilder para Vocales
        StringBuilder consonantes = new StringBuilder("");
        //pasamos el texto a minusculas
        String textoM = cadena.toLowerCase();
        //recorremos la cadena
        for (int i = 0; i < textoM.length(); i++) {
            //pasamos la posiciones a caracteres
            char c = textoM.charAt(i);
            //si es vocal añadimos
            if (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g'
                    || c == 'h' || c == 'j' || c == 'k' || c == 'l'
                    || c == 'm' || c == 'n' || c == 'ñ' || c == 'p'
                    || c == 'q' || c == 'r' || c == 's' || c == 't'
                    || c == 'v' || c == 'w' || c == 'x' || c == 'y'
                    || c == 'z') {
                consonantes.append(c);
            }
            //creamos string
            String numCon = consonantes.toString();
            //calculamos la longitud del string
            numeroConsonantes = numCon.length();
        }//FIN FOR 1
        return numeroConsonantes;
    }//FIN METODO

    //METODO 
    public static int calcularSimbolos(String cadena) {
        int numeroSimbolos = 0;
        ///declaramos StringBuilder para Vocales
        StringBuilder consonantes = new StringBuilder("");
        //pasamos el texto a minusculas
        String textoM = cadena.toLowerCase();
        //recorremos la cadena
        for (int i = 0; i < textoM.length(); i++) {
            //pasamos la posiciones a caracteres
            char c = textoM.charAt(i);
            //si es vocal añadimos
            if (c == '<' || c == '>' || c == '&' || c == '\"' || c == '\t' || c == '!'
                    || c == '#' || c == '*' || c == '+' || c == ',' || c == '-'
                    || c == '.' || c == '/' || c == ':' || c == ';'
                    || c == '=' || c == '?' || c == '@' || c == '['
                    || c == '\\' || c == ']' || c == '^' || c == '_'
                    || c == '`' || c == '{' || c == '|' || c == '}'
                    || c == '~') {
                consonantes.append(c);
            }
            //creamos string
            String numSim = consonantes.toString();
            //calculamos la longitud del string
            numeroSimbolos = numSim.length();
        }//FIN FOR 1
        return numeroSimbolos;
    }//FIN METODO
    
    //METODO 
    public static int calcularNumeros(String cadena) {
        int numeroNumeros = 0;
        ///declaramos StringBuilder para Vocales
        StringBuilder numeros = new StringBuilder(cadena);
        //recorremos la cadena
        for (int i = 0; i < numeros.length(); i++) {
            //pasamos la posiciones a caracteres
            char c = numeros.charAt(i);
            //si es vocal añadimos
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5'
                    || c == '6' || c == '7' || c == '8' || c == '9') {
                numeros.append(c);
            }
            //creamos string
            String numSim = numeros.toString();
            //calculamos la longitud del string
            numeroNumeros = numSim.length();
        }//FIN FOR 1
        return numeroNumeros;
    }//FIN METODO

    /**
     * ***************************************************************************************************
     */
    /*
    15-Haciendo uso de la clase Stringtokenizer realiza un método en Java que lea po
    teclado una cadena de números enteros separados por comas y calcule y muestre
    por pantalla el maximo y la media de dichos números  ej: "8,2,5,6,7"
    metodo calcular media y maxima . CalcularMaximoMediaStringNumeros
    */
    public static String calculosMediaMax(String cadena) {
        //declaramos variables internas
        int maximo = 0;
        double media = 0;
        int suma = 0;
        String acumulado = "";
        //declaramos un objeto de StringTokenizer
        StringTokenizer calculo = new StringTokenizer(cadena, ",");
        //contamos los numeros con el metodo countTokens
        int numeros = calculo.countTokens();
        //recorremos los elementos separandolos 
        while (calculo.hasMoreElements()) {
            //los acumulamos en una nuevaa cadena de char
            acumulado += calculo.nextElement();
            //AVERIGUAR MAXIMO
            //recorremos la nueva cadena
            for (int i = 0; i < acumulado.length(); i++) {
                //pasamos de char a int
                int s = Character.getNumericValue(acumulado.charAt(i));
                // s es mas que maximo adjudica
                if (s > maximo) {
                    maximo = s;
                }
                //AVERIGUAR MEDIA
                suma += s;//suma caracter                 
            }//fin for  
            media = suma / acumulado.length();
        }

        return "\nEl máximo de la cadena es " + maximo
                + " y la media es " + media;
    }//fin metodo

}//fin clase

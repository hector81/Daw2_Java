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
 * @author user
 */
public class Persona {
    //atributos
    private int respuestaSexo;
    private int respuestaTrabajo;
    private int respuestaSalario;
    //constructores

    public Persona(int respuestaSexo, int respuestaTrabajo, int respuestaSalario) {
        this.respuestaSexo = Utilidades.generarNumerosAleatoriosRangos(1,2);       
        this.respuestaTrabajo = Utilidades.generarNumerosAleatoriosRangos(1,2);
        this.respuestaSalario = calcularSueldo(getRespuestaTrabajo());
    }
    
    
    public Persona() {
        this.respuestaSexo =  Utilidades.generarNumerosAleatoriosRangos(1,2);
        this.respuestaTrabajo = Utilidades.generarNumerosAleatoriosRangos(1,2);
        this.respuestaSalario = calcularSueldo(getRespuestaTrabajo());
    }
    //getters and setters
    public int getRespuestaSexo() {
        return respuestaSexo;
    }

    public void setRespuestaSexo(int respuestaSexo) {
        this.respuestaSexo = respuestaSexo;
    }

    public int getRespuestaTrabajo() {
        return respuestaTrabajo;
    }

    public void setRespuestaTrabajo(int respuestaTrabajo) {
        this.respuestaTrabajo = respuestaTrabajo;
    }

    public int getRespuestaSalario() {
        return calcularSueldo(getRespuestaTrabajo());
    }

    public void setRespuestaSalario(int respuestaSalario) {
        this.respuestaSalario = calcularSueldo(getRespuestaTrabajo());
        
    }

    @Override
    public String toString() {
        return "Sexo = (" + respuestaSexo + ") " + decirSexo(respuestaSexo) + " , ¿Trabaja? = (" 
                + respuestaTrabajo + ") " + decirTrabajo(respuestaTrabajo) 
                + ", Salario = (" + respuestaSalario + ")";
    }//FIN METODO
    
    
    //Enviar el sueldo en funcion de si trabaja o no
    public int calcularSueldo(int respuestaTrabajo){
        int sueldo =0;//iniciamos variable local
        if(getRespuestaTrabajo() == 1){//si trabaja
            sueldo = Utilidades.generarNumerosAleatoriosRangos(600,2000);
        }
        else {//si no trabaja
            sueldo = 0;      
        }
        return sueldo;       
    }//FIN METODO
    
    //Envia un String de hombre o mujer en funcion de la respuesta
    public String decirSexo(int respuestaSexo){
        String sexo = "";//iniciamos variable local
        if(getRespuestaSexo() == 1){
            sexo = "HOMBRE";
        }
        else {
            sexo = "MUJER";
        }
        return sexo;
    }//FIN METODO
    
    //Envia un String de respuesta positiva o negativo en funcion de la respuesta
    public String decirTrabajo(int respuestaTrabajo){
        String respuesta = "";//iniciamos variable local
        if(getRespuestaTrabajo() == 1){
            respuesta = "SI";
        }
        else {
            respuesta = "NO";
        }
        return respuesta;
    }//FIN METODO
    
}//fin clase

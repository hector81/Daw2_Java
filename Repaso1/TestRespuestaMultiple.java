/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso1;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Hector Garcia
 */
public class TestRespuestaMultiple extends Test{

    public TestRespuestaMultiple(String enunciado, String respuesta, int numeroOpciones) {
        super(enunciado, respuesta, numeroOpciones);
    }
    

    @Override
    public int calculaPuntuacion(String respuesta) {
        StringTokenizer st= new StringTokenizer(respuesta,",");
        ArrayList<String> listaUsuario= new ArrayList<>();
        String aux;
        int fallos=0;
        int aciertos=0;
        //meto las respuestas individuales en una collecion
        while(st.hasMoreTokens()){
            aux= st.nextToken();
            //dame el indice de respuesta
            if(aux.indexOf(getRespuesta())!=-1)
                aciertos++;
            else
                fallos++;
            
        }
        return aciertos;
    }//fin metodo
}//fin clase

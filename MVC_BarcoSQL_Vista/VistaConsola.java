/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Vista;

/**
 *
 * @author user
 */
public class VistaConsola {
    private String Matricula;
    private int eslora;
    private int precio;

    public VistaConsola(String Matricula, int eslora, int precio) {
        this.Matricula = Matricula;
        this.eslora = eslora;
        this.precio = precio;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}

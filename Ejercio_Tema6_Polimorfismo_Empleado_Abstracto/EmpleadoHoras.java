/*
Empleado por horas: Nos interesa el precio de la hora trabajada, y el numero de horas 
que ha trabajo este mes. El primero es un dato fijo, mientas que el segundo varia todos los meses.
 */
package Ejercio_Tema6_Polimorfismo_Empleado_Abstracto;

/**
 *
 * @author Hector Garcia
 */
public class EmpleadoHoras extends Empleado {
    //atributos 
    private double precioHoraTrabajada;
    private int numeroHorasTrabajadasMes;
    private int mes;
    //constructor
//    public EmpleadoHoras(String nif, String nombre, int edad, double precioHoraTrabajada
//    ,int numeroHorasTrabajadasMes,int mes) {
//        super(nif, nombre, edad);
//        this.precioHoraTrabajada = precioHoraTrabajada;
//        this.numeroHorasTrabajadasMes = super.horasMesTrabajo(mes);
//        this.mes = mes;
//    }
    
    public EmpleadoHoras(String nif, String nombre, int edad, double precioHoraTrabajada
    ,int numeroHorasTrabajadasMes,int mes) {
        super(nif, nombre, edad);
        this.precioHoraTrabajada = precioHoraTrabajada;
        this.numeroHorasTrabajadasMes = mes;
        this.mes = mes;
    }
    
    //getters and setters
    public double getPrecioHoraTrabajada() {
        return precioHoraTrabajada;
    }

    public void setPrecioHoraTrabajada(double precioHoraTrabajada) {
        this.precioHoraTrabajada = precioHoraTrabajada;
    }

    public int getNumeroHorasTrabajadasMes() {
        return numeroHorasTrabajadasMes;
    }

    public void setNumeroHorasTrabajadasMes(int numeroHorasTrabajadasMes) {
        this.numeroHorasTrabajadasMes = numeroHorasTrabajadasMes;
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    //metodo sobreescrito
    // En los empleados por horas el suelo se calcula multiplicando su sueldo por
    //hora por el número de horas de ese mes + SMI. 
    @Override
    public double calculaSueldo() {
        return getSalario_minimo() +numeroHorasTrabajadasMes*precioHoraTrabajada;
    }

    @Override
    public String toString() {
        return "El nombre del empleado por horas es " + this.getNombre() + " y su nif es " + this.getNif() + 
                " y su edad es " + this.getEdad() + " y su salario es " + calculaSueldo() +
                "\n , el precio de la hora trabajada: " + this.getPrecioHoraTrabajada() + " ,numeroHorasTrabajadasMes: "
                + this.getNumeroHorasTrabajadasMes() + " y el mes es " + this.getMes();

    }
    
}//fin clase


////metodo para calcular la diferencia de años
//    public int diferenciaNumeroYears(GregorianCalendar yearAlta, GregorianCalendar yearBaja) {         
//       Calendar c = Calendar.getInstance();
//        //declaramos variable diferencia
//        int diferenciaYear;
//        //restamos
//        diferenciaYear = yearBaja.get(Calendar.YEAR) - yearAlta.get(Calendar.YEAR);
//        return diferenciaYear;
//        
//    }
//    
//    //En los empleados fijos el sueldo es el resultado de sumarle a la base (SMI) un complemento
//    //anual fijo (20 € en la actualidad, pero hay que permitir la modificación de dicho complemento)
//    //multiplicado por el número de años en la empresa. ◦ Salario = SMI + (Complemento * Años_Antigüedad)
//    @Override
//    public double calculaSueldo() {
//        return getSalario_minimo() + (20*diferenciaNumeroYears(yearAlta,yearBaja));
//    }  
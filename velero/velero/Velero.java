
package velero.velero;

public class Velero {
    private int eslora, manga, puntal, maxTripulacion, año, numMas;
    private String materialConstruccion, descripcion, claseVelero, matricula;

    public Velero(String matricula, int eslora, int manga, int puntal, int maxTripulacion, int año, int numMas, String materialConstruccion, String descripcion, String claseVelero) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.manga = manga;
        this.puntal = puntal;
        this.maxTripulacion = maxTripulacion;
        this.año = año;
        this.numMas = numMas;
        this.materialConstruccion = materialConstruccion;
        this.descripcion = descripcion;
        this.claseVelero = claseVelero;
    }
    
    public Velero(String matricula) {
        this.matricula = matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setManga(int manga) {
        this.manga = manga;
    }

    public void setPuntal(int puntal) {
        this.puntal = puntal;
    }

    public void setMaxTripulacion(int maxTripulacion) {
        this.maxTripulacion = maxTripulacion;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setNumMas(int numMas) {
        this.numMas = numMas;
    }

    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setClaseVelero(String claseVelero) {
        this.claseVelero = claseVelero;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getManga() {
        return manga;
    }

    public int getPuntal() {
        return puntal;
    }

    public int getMaxTripulacion() {
        return maxTripulacion;
    }

    public int getAño() {
        return año;
    }

    public int getNumMas() {
        return numMas;
    }

    public String getMaterialConstruccion() {
        return materialConstruccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getClaseVelero() {
        return claseVelero;
    }
    
    public String toString() {
        return "Matricula: "+matricula+
        "\nMaterial de construcion: "+materialConstruccion+
        "\nDescripción: "+descripcion+
        "\nEslora: "+eslora+
        "\nManga: "+manga+
        "\nPuntal: "+puntal+
        "\nMaxima tripulación: "+maxTripulacion+
        "\nAño: "+año+
        "\nNumero mas: "+numMas+
        "\nClase velero: "+claseVelero;
    }
    
}

package Ejercicios_Tema5_Herencia_Hospital;

public class TestMedico {
    public static void main(String[] args) {
        
        Medico medico1 = new Medico();
        medico1.trabajarEnHospital=true;
        System.out.println("¿Qué hace el médico ? : " ); 
        medico1.tratarPaciente();
        MedicoDecabecera medicoDecabecera1 = new MedicoDecabecera(); 
        System.out.println("¿Qué hace el médico de cabecera ? : "); 
        medicoDecabecera1.aconsejaPacientes();
        medicoDecabecera1.visitaLasCasas=true;
        Cirujano cirujano1 = new Cirujano();
        System.out.println("¿Qué hace el cirujano ? : "); 
        cirujano1.tratarPaciente();
        System.out.println("¿Qué más hace el cirujano ? : "); 
        cirujano1.hacerIncision();
        
    }
}

package Ejercicios_Tema4_POO;


public class AlumnoRun {
    //main
    public static void main(String[] args) {
        //llamamos 1º constructor para el primer alumno
        Alumno alumno1 = new Alumno();   //INSTACIACION    
        System.out.println("***************PRIMER ALUMNO**********");
        
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El número de expediente del primer alumno es " + alumno1.getNumeroExpediente());
        System.out.println("El nombre del primer alumno es " + alumno1.getNombreAlumno());
        System.out.println("El primer apellido del primer alumno es " + alumno1.getPrimApellidoAlum());
        System.out.println("El precio de la matricula del primer alumno es " + alumno1.getprecioMatricula());
        
        //llamamos el metodo presentate 1ºalumno
        System.out.println("RESULTADO MÉTODO PRESENTATE DEL 1º ALUMNO:");
        alumno1.presentante();
        
        //llamamos 2º constructor para el segundo alumno
        Alumno alumno2 = new Alumno(321654);   //INSTACIACION 
        System.out.println("***************SEGUNDO ALUMNO**********");
        
        //usamo set para enviar datos del objeto
        alumno2.setNombreAlumno("Ivan");
        alumno2.setPrimApellidoAlum("Gil");
        alumno2.setPrecioMatricula(1129.46); 
        
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El número de expediente del segundo alumno es " + alumno2.getNumeroExpediente());
        System.out.println("El nombre del segundo alumno es " + alumno2.getNombreAlumno());
        System.out.println("El primer apellido del segundo alumno es " + alumno2.getPrimApellidoAlum());
        System.out.println("El precio de la matricula del segundo alumno es " + alumno2.getprecioMatricula());
        
        //llamamos el metodo presentate 2ºalumno
        System.out.println("RESULTADO MÉTODO PRESENTATE DEL 2º ALUMNO:");
        alumno2.presentante();
        
        //llamamos 3º constructor para el tercer alumno
        Alumno alumno3 = new Alumno(125896,"José");   //INSTACIACION 
        System.out.println("***************TERCER ALUMNO**********");
        
        //usamo set para enviar datos del objeto
        alumno3.setPrimApellidoAlum("Pérez");
        alumno3.setPrecioMatricula(1589.46);
        
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El número de expediente del tercer alumno es " + alumno3.getNumeroExpediente());
        System.out.println("El nombre del tercer alumno es " + alumno3.getNombreAlumno());
        System.out.println("EEl primer apellido del tercer alumno es " + alumno3.getPrimApellidoAlum());
        System.out.println("El precio de la matricula del tercer alumno es " + alumno3.getprecioMatricula());
        
        //llamamos el metodo presentate 3ºalumno
        System.out.println("RESULTADO MÉTODO PRESENTATE DEL 3º ALUMNO:");
        alumno3.presentante();
        
        //llamamos 4º constructor para el cuarto alumno
        Alumno alumno4 = new Alumno(123466, "Isabel", "Magaña", 200);   //INSTACIACION 
        System.out.println("***************CUARTO ALUMNO**********");
        
        //imprimimos llamando al metodo usando el nuevo objeto
        System.out.println("El número de expediente del cuarto alumno es " + alumno4.getNumeroExpediente());
        System.out.println("El nombre del cuarto alumno es " + alumno4.getNombreAlumno());
        System.out.println("El primer apellido del cuarto alumno es " + alumno4.getPrimApellidoAlum());
        System.out.println("El precio de la matricula del cuarto alumno es " + alumno4.getprecioMatricula());
        
        //llamamos el metodo presentate 4ºalumno
        System.out.println("RESULTADO MÉTODO PRESENTATE DEL 4º ALUMNO:");
        alumno4.presentante();
        
    }//fin del main
}//fin clase

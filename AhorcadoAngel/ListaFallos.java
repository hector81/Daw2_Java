package AhorcadoAngel;

public class ListaFallos {
    private StringBuilder sb = new StringBuilder("");
    

   public void mostrarListaDeFallos() {
       System.out.println("Estas letras Han sido erroneas");
       System.out.println(sb.toString());
    }

   public void ponLetra(String v) {// metodo que añade letras erroneas al String
        sb.append(v +" ");
      
    }

}

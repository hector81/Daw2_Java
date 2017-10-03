package Ejercicios_Tema3_Bucles;

public class CalculoVariables {
    public static void main(String[] args){
        
        int x = 0;
        int y = 0;
        
        /* 1º while */
        /*
        while(x<5){
            y = x -y ;
            System.out.println(x + " " + y + " ");
            x = x+1;
        }
        */
        
        
        /* 2º while */
        /*
        while(x<5){
            y= y +x ;
            System.out.println(x + " " + y + " ");
            x = x+1;
        }
        */
        
        /* 3º while */
        
        /*
        while(x<5){
            y= y+2 ;
            if(y<4)
              y= y-1;
            System.out.println(x + " " + y + " ");
            x = x+1;
        }
        */
        
        
        /* 4º while */
        
        /*
        while(x<5){
            x= x +1 ;
            y=y+x;
            System.out.println(x + " " + y + " ");
            x = x+1;
        }
        */
        
        /* 5º while */
        
        
        while(x<5){
            if(y<5){		
                x=x+1;		
                if(y>3)		
                    x= x-1;					
            }
            System.out.println(x + " " + y + " ");
            x = x+1;
        }
        

    }//fin del main
}//fin clase

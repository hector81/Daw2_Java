package iescomercioejerciciostema3;

public class OperadoresUnariosTest {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        y = ++x;
        System.out.println("y vale: " + y + ", x vale: " + x);
        y = x++;
        System.out.println("y vale: " + y + ", x vale: " + x);
    }
}

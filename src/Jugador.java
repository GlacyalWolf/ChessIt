import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jugador{
    private static BufferedReader reader;
    static String correo;
    static Boolean color;

    Jugador(String correo,Boolean color){
        this.correo = correo;
        this.color = color;
        if (color == false){
            System.out.println(correo);
            System.out.print("Tu color asginado es el negro.");
        } else {
            System.out.println(correo);
            System.out.print("Tu color asginado es el blanco.");
        }

        Torre torrel = new Torre(0,0);
        Torre torrer = new Torre(0,7);

    }

}

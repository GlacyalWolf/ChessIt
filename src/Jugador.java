import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**public class Jugador{
    private static BufferedReader reader;
    static String correo;
    static Boolean color;

    Jugador(String correo,Boolean color){
        this.correo = correo;
        this.color = color;
        if (color == false){
            System.out.println(correo);
            System.out.print("Tu color asiginado es el negro.");
            Torre torre1Negra = new Torre(0,0,color);
            Caballo caballo1Negra = new Caballo(1,0,color);
            Alfil alfil1Negra = new Alfil(2,0,color);
            Reina reinaNegra = new Reina(3,0,color);
            Rey reyNegra = new Rey(4,0,color);
            Alfil alfil2Negra = new Alfil(5,0,color);
            Caballo caballo2Negra = new Caballo(6,0,color);
            Torre torre2Negra = new Torre(7,0,color);

            for(int i = 0; i < 8 ; i++){
                Peon peonNegra = new Peon(i,1,color);
            }
        } else {
            System.out.println(correo);
            System.out.print("Tu color asiginado es el blanco.");
            Torre torre1Blanca = new Torre(0,7,color);
            Caballo caballo1Blanca = new Caballo(1,7,color);
            Alfil alfil1Blanca = new Alfil(2,7,color);
            Reina reinaBlanca = new Reina(3,7,color);
            Rey reyBlanca = new Rey(4,7,color);
            Alfil alfil2Blanca = new Alfil(5,7,color);
            Caballo caballo2Blanca = new Caballo(6,7,color);
            Torre torre2Blanca = new Torre(7,7,color);

            for(int i = 0; i < 8 ; i++){
                Peon peonBlanca = new Peon(i,6,color);
            }
        }

    }

}*/

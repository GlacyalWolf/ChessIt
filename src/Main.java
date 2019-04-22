import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // JUGADOR 1, COLOR AUTOASGINADO: BLANCAS
        System.out.print("Introduce tu correo: ");
        String mail1 = reader.readLine();
        Jugador jugador1 = new Jugador(mail1,true);
        System.out.println();

        // JUGADOR 2, COLOR AUTOASGINADO: NEGRAS
        System.out.print("Introduce tu correo: ");
        String mail2 = reader.readLine();
        Jugador jugador2 = new Jugador(mail2,false);
        System.out.println();

        int vol[];
        vol=Torre.posibleMovimiento(2,3);
        for (int i=0;i<vol.length;i++){
            System.out.print(vol[i]);
            System.out.print(" , ");
        }

    }
}

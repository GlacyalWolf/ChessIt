import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("hola");
        int vol[];
        vol=Torre.posibleMovimiento(2,3);
        for (int i=0;i<vol.length;i++){
            System.out.print(vol[i]);
            System.out.print(" , ");
        }

    }
}

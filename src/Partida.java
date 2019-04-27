import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partida {
	
	private static boolean turno=true;
	private static boolean partida=true;
	static int contador;
	
	
	
	public static void partida() throws IOException {
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Board tablero = new Board();
        		
		while (partida==true) {
			int Xinicial;
			int Yinicial;
			tablero.printBoard();			
			if (contador%2==0) {
				turno=true;
			} else {
				turno=false;
			}
			// Seleccionar pieza
			System.out.println("Selecciona una casilla");
			System.out.println("X inicial");
			Xinicial = Integer.parseInt(reader.readLine());
			System.out.println("Y inicial");
			Yinicial = Integer.parseInt(reader.readLine());
			
			// Ver si posición de blancas es valido
			
			while(true) {
				if (turno=true && /* Llamada al método para validar si la posicion es valida
				para fichas blancas*/) {
					break;
				// Ver si posición de negras es valido
				} else if (turno=false && /*Llamada al método si la posicion es valida para
				fichas blancas*/ ) {
					break;
				} else {
					// 
					if (tablero.posicion==" ") {
						System.out.println("La casilla está vacia , selecciona otra");
					}
				}
			}
			
			/* Pedir a la pieza a que casilla ir*/
			
			while (true) {
			
				int Xfinal;
				int Yfinal;
				
				System.out.println("Selecciona la casilla donde quieres ir");
				System.out.println("X final");
				Xfinal = Integer.parseInt(reader.readLine());
				System.out.println("Y final");
				Yfinal = Integer.parseInt(reader.readLine());
				
				if (Xfinal>0 && Xfinal<=7 && Yfinal>0 && Yfinal<=7) {
					break;
				} else {
					System.out.println("Movimiento no válido");
				}
			}
			
			//Imprimir el movimiento de la casilla en el board
			
			contador++;	
		}

	}
	
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // JUGADOR 1, COLOR AUTOASGINADO: BLANCAS
        System.out.print("Introduce tu correo: ");
        String mail1 = reader.readLine();
        /**Jugador jugador1 = new Jugador(mail1,true);**/
        System.out.println();

        // JUGADOR 2, COLOR AUTOASGINADO: NEGRAS
        System.out.print("Introduce tu correo: ");
        String mail2 = reader.readLine();
        //Jugador jugador2 = new Jugador(mail2,false);
        System.out.println();
        
        partida();
        }
	}

	
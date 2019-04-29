import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partida {

	private static boolean turno=true;
	private static boolean partida=true;
	static int contador;
	
	
	
	public void partida() throws IOException {
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Board tablero = new Board();
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Ficha ficha = new Ficha();
		for (int i = 0, x = 0, y = 1; i<8; i++){
			jugador1.peones[i] = ficha.peones[x];
			ficha.peones[x].setNumCol(setNumColJugador1FirstRowPeon());
			ficha.peones[x].setRowNum(1);
			ficha.peones[x].setNombrePeonJugador1(x);
			x=x+2;
			jugador2.peones[i] = ficha.peones[y];
			ficha.peones[y].setNumCol((setNumColJugador1SecondRowPeon()));
			ficha.peones[y].setRowNum(6);
			ficha.peones[y].setNombrePeonJugador2(y);
			y = y+2;
		}
		for (int i = 0, x = 0, y = 1; i<2; i++){
			jugador1.torres[i] = ficha.torres[x];
			if (x==0) {
				ficha.torres[x].setNumCol(0);
			}
			else {
				ficha.torres[x].setNumCol(7);
			}
			ficha.torres[x].setRowNum(0);
			ficha.torres[x].setNombreTorreJugador1(x);
			x=x+2;
			jugador2.torres[i] = ficha.torres[y];
			if (y==1) {
				ficha.torres[y].setNumCol(0);
			}
			else {
				ficha.torres[y].setNumCol(7);
			}
			ficha.torres[y].setRowNum(7);
			ficha.torres[y].setNombreTorreJugador2(y);
			y=y+2;
		}
		for (int i = 0, x = 0, y = 1; i<2; i++){
			jugador1.caballos[i] = ficha.caballos[x];
			if (x==0) {
				ficha.caballos[x].setNumCol(1);
			}
			else {
				ficha.caballos[x].setNumCol(6);
			}
			ficha.caballos[x].setRowNum(0);
			ficha.caballos[x].setNombreCaballoJugador1(x);
			x=x+2;
			jugador2.caballos[i] = ficha.caballos[y];
			if (y==1) {
				ficha.caballos[y].setNumCol(1);
			}
			else {
				ficha.caballos[y].setNumCol(6);
			}
			ficha.caballos[y].setRowNum(7);
			ficha.caballos[y].setNombreCaballoJugador2(y);
			y=y+2;
		}
		for (int i = 0, x = 0, y = 1; i<2; i++){
			jugador1.alfiles[i] = ficha.alfiles[x];
			if (x==0) {
				ficha.alfiles[x].setNumCol(2);
			}
			else {
				ficha.torres[x].setNumCol(5);
			}
			ficha.alfiles[x].setRowNum(0);
			ficha.alfiles[x].setNombreAlfilJugador1(x);
			x=x+2;
			jugador2.alfiles[i] = ficha.alfiles[y];
			if (y==1) {
				ficha.alfiles[y].setNumCol(2);
			}
			else {
				ficha.alfiles[y].setNumCol(5);
			}
			ficha.alfiles[y].setRowNum(7);
			ficha.alfiles[y].setNombreAlfilJugador2(y);
			y=y+2;
		}
		jugador1.reina = ficha.reinas[0];
		ficha.reinas[0].setNumCol(3);
		ficha.reinas[0].setRowNum(0);
		ficha.reinas[0].setNombreReinaJugador1(0);
		jugador2.reina = ficha.reinas[1];
		ficha.reinas[1].setNumCol(3);
		ficha.reinas[1].setRowNum(7);
		ficha.reinas[1].setNombreReinaJugador2(1);
		jugador1.rey = ficha.reyes[0];
		ficha.reyes[0].setNumCol(4);
		ficha.reyes[0].setRowNum(0);
		ficha.reyes[0].setNombreReyJugador1(0);
		jugador2.rey = ficha.reyes[1];
		ficha.reyes[1].setNumCol(4);
		ficha.reyes[1].setRowNum(7);
		ficha.reyes[1].setNombreReyJugador2(1);

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
					if (tablero.getIsOcupied()) {
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
	protected int setNumColJugador1FirstRowPeon(){
		int x1=-1;
		x1++;
		return x1;
	}
	protected int setNumColJugador1SecondRowPeon(){
		int x1=-1;
		x1++;
		return x1;
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

	
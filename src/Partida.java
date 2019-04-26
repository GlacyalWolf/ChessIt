public class Partida {
	
	private boolean mismoEquipo;
	private boolean turno=true;
	private boolean partida=true;
	int contador;
	
	public void partida() {
		
		while (partida==true) {
			
			if (contador%2==0) {
				turno=true;
			} else {
				turno=false;
			}
			
			contador++;
		}
		if (partida==false) {
			
			System.out.println("La partida ha terminado");
			
		}
		
		
	}
	
		
}
	
package org.generation.loops;

public class BreakContinue {
	public static void main(String[] args) {
		//BREAK Se utiliza para salir del bucle en un punto especifico
		//Continue Interrumpe la interacion de un bucle pero continua en e siguiente punto
		
		//Super ozztito va a realizar una rifa para sus primeros 50 clientes 
		// Unos Takis Fuego y unos Frijoles 
		
		for (int cliente= 1; cliente <= 50; cliente++) {
			if (cliente %5==0) {
			System.out.println("Eres el cliente numero " + cliente + " Y te has ganado unos Takis Fuego y unos Frijoles" );
			continue;
			}
			System.out.println("Cliente " + cliente);
		} 
	}
}

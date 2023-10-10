package org.generation.loops;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cuenta = 1;
		while (cuenta <= 10) { 
		    System.out.println("el numero es: " + cuenta);
		    cuenta++;
		}
		
		
		//Crear un programa que solicite al usuario un numero y dicho numero sera el valor final
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("INgresa el valor que sera tomado como valor final");
		int numeroUsuario = scanner.nextInt();
		
		int contador = 1;
		
		while (contador <= numeroUsuario) {
			System.out.println("el numero es: " + contador);
			contador++;
		}
		 scanner.close();
	}
}

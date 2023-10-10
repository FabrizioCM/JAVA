package org.generation.loops;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
		 * Do-While evalua una expresion en la parte inferior del ciclo
		 * Las operaciones se ejecutan al menos una vez
		 * 
		 * */
		
		//Cuenta del 1 al 10 
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("INgresa el valor que sera tomado como valor final");
		int numeroUsuario = scanner.nextInt();
		
		int contador = 1;
		do {
			System.out.println("el numero es: " + contador);
			contador++;
		}
		while (contador <= numeroUsuario);
	
		 scanner.close();*/
		 
		 /*
		  * Crear un programa para cajero bancario
		  * 
		  * */
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido, teclea el numero correspondiente a la opcion deseada: \n \r 1. Consultar saldo \n 2. Retirar Dinero \n 3. Depositar dinero \n 4. Salir ");
		
int opcionBanquito;
		
		do {
			 opcionBanquito = scanner.nextInt();
			
			switch(opcionBanquito) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Retirar dinero");
				break;
			case 3:
				System.out.println("Depositar dinero");
				break;
			case 4:
				System.out.println("Salir");
				break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		} while (opcionBanquito != 4 );
		scanner.close();
	}
}

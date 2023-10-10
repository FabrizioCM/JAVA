package org.generation.controlDeFlujo;
import java.util.Scanner;
/*
 * //Crear un programa que solicite al usuario un número entero y 
 * muestre en consola los días de la semana. 
 * El lunes corresponde al 1, martes al 2, miércoles al 3... 
 * domingo al 7 y si no corresponde, 
 * escribir un mensaje de advertencia.
 * */
public class DayCase {
	public static void main(String[] args) {
	System.out.println("Introduce un  numero para saber el día de la semana: ");
	Scanner EscanerDía = new Scanner(System.in);
	int Día = EscanerDía.nextInt();
	System.out.println("El día de la semana es: ");

	switch (Día) {
	    case 1:
	        System.out.println("Lunes");
	        break;
	    case 2:
	        System.out.println("Martes");
	        break;
	    case 3:
	        System.out.println("Miércoles");
	        break;
	    case 4:
	        System.out.println("Jueves");
	        break;
	    case 5:
	        System.out.println("Viernes");
	        break;
	    case 6:
	        System.out.println("Sábado");
	        break;
	    case 7:
	        System.out.println("Domingo");
	        break;
	    default:
	        System.out.println("Mensaje de Advertencía Literal");
	        break;
	}
	EscanerDía.close();
}
}

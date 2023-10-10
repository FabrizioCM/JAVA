package org.generation.controlDeFlujo;
import java.util.Scanner;

public class ControlDeFlujo {
	public static void main(String[] args) {
		/*
		 * Sentencias Condicionales
		 * IF
		 * Else
		 * Switch
		 * 
		 * */
//Ejemplo 1 momento del día
		
		int Hora = 22;
		if (Hora >= 6 && Hora <12) {
			System.out.println("Es de mañana");			
		} else if (Hora >= 12 && Hora < 18){
			System.out.println("Es la tarde");
		}
			else if (Hora >= 18 && Hora < 24){
				System.out.println("Es noche");
		} else if (Hora >= 0 && Hora < 6 ) {
			System.out.println("Es la madrugada");	
		} else { 
			System.out.println("No es un numero valido");
		}
	//Determinar momento de la semana
		int Day = 4;
		
		if (Day == 1) {
	        System.out.println("Lunes");
	    } else if (Day == 2) {
	        System.out.println("Martes");
	    } else if (Day == 3) {
	        System.out.println("Miércoles");
	    } else if (Day == 4) {
	        System.out.println("Jueves");
	    } else if (Day == 5) {
	        System.out.println("Viernes");
	    } else if (Day == 6) {
	        System.out.println("Sábado");
	    } else if (Day == 7) {
	        System.out.println("Domingo");
	    } else {
	    	System.out.println("No valido");
	    }
		
		
		/*
		 * Java User Input (Scanner)
		 * La clase escaner se utiliza para obtener la entrada del usuario y se encuentra en util.package
		 */
		
		Scanner ScanerInput = new Scanner(System.in);
		System.out.println("Escribe tu nombre de usuario: ");
		String UserName =  ScanerInput.nextLine();
		System.out.println("Escribe tu edad: ");
		int UserAge =  ScanerInput.nextInt();
		System.out.println("Hola " +UserName + " Bienvenido, tu edad es de "+ UserAge + " Años"  );
		int DayScan = ScanerInput.nextInt();
		System.out.println("Que día de la semana es");
		if (DayScan == 1) {
	        System.out.println("Lunes");
	    } else if (DayScan == 2) {
	        System.out.println("Martes");
	    } else if (DayScan == 3) {
	        System.out.println("Miércoles");
	    } else if (DayScan == 4) {
	        System.out.println("Jueves");
	    } else if (DayScan == 5) {
	        System.out.println("Viernes");
	    } else if (DayScan == 6) {
	        System.out.println("Sábado");
	    } else if (DayScan == 7) {
	        System.out.println("Domingo");
	    } else {
	    	System.out.println("No valido");
	    }
		
		/*
		 * Switch (Variable)
		 * */
		ScanerInput.close();
	}
}

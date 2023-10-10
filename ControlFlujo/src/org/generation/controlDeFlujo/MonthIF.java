package org.generation.controlDeFlujo;
import java.util.Scanner;
public class MonthIF {
	public static void main(String[] args) {
		System.out.println("Introduce un  numero y te dire el mes en el que estas: ");
		Scanner ScanerMes = new Scanner(System.in);
		int Mes = ScanerMes.nextInt();
		
		if (Mes == 1) {
	        System.out.println("Enero");
	    } else if (Mes == 2) {
	        System.out.println("Febrero");
	    } else if (Mes == 3) {
	        System.out.println("Marzo");
	    } else if (Mes == 4) {
	        System.out.println("Abril");
	    } else if (Mes == 5) {
	        System.out.println("Mayo");
	    } else if (Mes == 6) {
	        System.out.println("Julio");
	    } else if (Mes == 7) {
	        System.out.println("Junio");
	    } else if (Mes == 8) {
	        System.out.println("Agosto");
	    } else if (Mes == 9) {
	        System.out.println("Septiembre");
	    } else if (Mes == 10) {
	        System.out.println("Octubre");
	    }else if (Mes == 11) {
		    System.out.println("Noviembre");
		}else if (Mes == 12) {
			System.out.println("Diciembre"); 
	    } else {
	    	System.out.println("No valido");
	    }
		ScanerMes.close();
	}
}

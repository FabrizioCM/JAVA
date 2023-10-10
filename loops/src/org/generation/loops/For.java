package org.generation.loops;
import java.util.Scanner;

public class For {
	public static void main(String[]args) {
			//variable local
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Numero es igual a "+ numero);
		}
		
		int contador;
		for (contador = 5; contador >= 1; contador--) {
			System.out.println("Inicia en: " + contador);
        }
		/*
		 * Calcular las primeras 5 potencias de la constante PI y mostrar en consola el valor de cada una de ellas
		 * 	Output:
		 * 	PI elevado a la 1 potencia es igual a 3.141592653589793
		 * 	PI elevado a la 2 potencia es igual a ....
		 */
		double valorPi = Math.PI;
		System.out.println(valorPi);
		
		for(int potencia = 1; potencia <= 5; potencia++){
			double resultado = Math.pow(valorPi, potencia);
			System.out.println("Pi eleveado a la potencia "+ potencia+ " es igual a "+resultado);
		}
		
		//Bucles anidados. mostrar en consola un incremento de asteriscos segun el numero de asteriscos
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el número de asteriscos: ");
        int numeroFilas = scanner.nextInt();
        for (int i = 1; i <= numeroFilas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        scanner.close();
        
    }
	}


/*
 *    for (int i = 1; i <= numeroFilas; i++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int j = 1; j <= numeroFilas - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Cambiar de línea después de cada fila
            System.out.println();
        }
 * */

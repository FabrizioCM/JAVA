package org.generation.dataTypes;

public class DatosPrimitivos {
	public static void main(String[]args) {
		System.out.println("Tipos de dato");
		/*
		 * Sirven para gestionar los tipos de datos mas basicos
		 * que son byte, short 
		 * int float double char y boolean
		 * */
		
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println("El valor maximo de un byte es:" + minByte);
		System.out.println("El valor maximo de un byte es:" + maxByte);
		
		
		// Short.Vmin y Vmax 
		
		short minShort = Short.MAX_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor maximo de un short es:" + minShort);
		System.out.println("El valor maximo de un short es:" + maxShort);
		
		// int
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de un int es: " + minInt);
		System.out.println("El valor máximo de un int es: " + maxInt);

		// long
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de un long es: " + minLong);
		System.out.println("El valor máximo de un long es: " + maxLong);

		// float
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de un float es: " + minFloat);
		System.out.println("El valor máximo de un float es: " + maxFloat);

		// double
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de un double es: " + minDouble);
		System.out.println("El valor máximo de un double es: " + maxDouble);
		
		
		//Tipos de dato que necesita una notacion especial
		long isbn= 283289337329191727L;
		System.out.println("El ISBN de Harry Potter y el caliz de Fuego es " + isbn);
		//Float
		float salary= 20255.83F;
		//Double
		double isr = 1436.70D;
		System.out.println("El salario de Emmanuel es de $" + salary + "y le descuentan $" + isr + "Impuestos");
		
		//Char
		char valorChar1= 64;
		char valorChar2= 52;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char nuevoChar1= 'M';
		System.out.println(nuevoChar1);
		
		/*
		 * casteo de tipos de datos primitivos en JAVA
		 * -Automatico (dato mas pequeño a un dato mas grande)
		 * - manual (dato mas grande a uno mas pequeño)
		 * */
		
		int myNumber =135;
		//CVasteo de int a double
		double myCasting= myNumber;
		System.out.println(myCasting);
		
		
		short age = 28; 
		//casting de shor a int
		int myAge = age;
		System.out.println(myAge);
		
		//Convertir de Float A int
		float myFloat = 5.8F;
		int newFloat =(int)myFloat;
		System.out.println(newFloat);
		
	}
}

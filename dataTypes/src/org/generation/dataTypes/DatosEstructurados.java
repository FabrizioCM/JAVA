package org.generation.dataTypes;

public class DatosEstructurados {
	public static void main(String[]args) {
		/*
		 * Datos Estructurados son tipos de datos que almacenan caracteres,
		 * valores, caracteres o datos de tipo primitivo
		 * */
		String myString = "Hola soy un String";
		System.out.println(myString);
		
		String myNewString = new String("Hola Soy Otro String Creado Como Objeto");
		System.out.println(myNewString);
		
		/*
		 * metodos
		 * */
		String texto = "qWerTy";
		//Lenght.Metodo que me permite conocer la longitud
		System.out.println(texto.length());
		//Upper Case && Tolower Case
		System.out.println("Aplicando metodos: " + texto.toUpperCase()+ " Aplicando metodo: " + texto.toLowerCase());
		
		//IndexOF
		String fraseMotivacional = "Donde pisa leona, no deja huella una gata";
		int metodoIndexOf = fraseMotivacional.indexOf("leona");
		System.out.println(metodoIndexOf);
		//Concentracion
		String firtsName = "Paulo ";
		String lastName = "Cabrera ";
		System.out.println(firtsName.concat(lastName));
		
		
		
		//Metodos de conversion
		String presupuesto = "50000";
		System.out.println("El presupuesto es de " + presupuesto);
		
		
		//metodo de parseo
		
	String presupuesto1 = "5000";
	System.out.println("El presupuesto es de " + "presupuesto y es de tipo"+ presupuesto1.getClass().getSimpleName());
	//Metodo de conversion primitivo a objeto
	int stringParseado = Integer.parseInt(presupuesto);
	System.out.println("el nuevo presupuesto es de: " + stringParseado + " y es de tipo " + ((Object)stringParseado).getClass().getSimpleName());
	
	
	/*
	 * Arrays 
	 * tipoDATO[] nombreArray = {valor1, valor2, valor3};
	 * 
	 * */
	String[] ch32 = {"Tania", "Antonio", "Elizabeth", "Irving", "Gonzalo"};
	
	final int iva = 16;
	System.out.println("El valor del Iva de del" + iva + "%");
	
	int ingresos = 23000;
	System.out.println("Ingresos: " + ingresos);
	ingresos = 25000;
	System.out.println("Nuevo Ingresos: " + ingresos);
	}
}

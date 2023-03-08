package retos2022;
/**
 * 
 * @author speedemon_Antonio_Ruiz_Benito
 *
 */

public class Reto0 {
	/*
	 * Reto #0: EL FAMOSO "FIZZ BUZZ”
	 * Escribe un programa que muestre por consola (con un print) los
	 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
	 * cada impresión), sustituyendo los siguientes:
	 * - Múltiplos de 3 por la palabra "fizz".
	 * - Múltiplos de 5 por la palabra "buzz".
	 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
	 */
	
	
	public static void main (String[] args) {
		// Creo un bucle for para iterar desde el 1 hasta el 100
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) { // Si i es modulo 3 = 0 y i modulo 5 = 0 entra en el if
				// Guardo el valor de la variable i pasandola a tipo String con String.valueOf();
				String palabraFizzBuzz = String.valueOf(i);
				// Camobio el valor de la variable 
				palabraFizzBuzz = "fizzbuzz";
				// Imprimo por consola
				System.out.println(palabraFizzBuzz);
				// Con continue hago que el bucle salte a la siguiente iteracion, sin tener en cuenta la presente 
				continue;
			} else if (i % 5 == 0) { // Si i modulo 5 es igual a 0 entrara en este else if
				// Con String.valueOf() paso el valor de i de tipo int a tipo String
				String palabraBuzz = String.valueOf(i);
				// cambio el valor de la variable i
				palabraBuzz = "buzz";
				// Imprimo por consola
				System.out.println(palabraBuzz);
				// Con continue hago que el bucle salte a la siguiente iteracion 
				continue;
			} else if (i % 3 == 0) { // Si i modulo 3 es igual a 0 entrara en el else if
				// Con String.valueOf() cambio el tipo del valor de i de int a String
				String palabraFizz = String.valueOf(i);
				// Cambio el valor a la palabra fizz
				palabraFizz = "fizz";
				// Muestro por consola el valor de la variable
				System.out.println(palabraFizz);
				// Utilizando continue si el bucle entre en el if salta a la siguiente iteracion
				continue;
			}
					
			// Imprimo por consola el valor de la variable i
			System.out.println(i);
		}
		
	}

}

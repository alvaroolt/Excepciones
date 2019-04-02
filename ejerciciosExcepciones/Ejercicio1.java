package ejerciciosExcepciones;

import java.util.Scanner;

/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * @author Alvaro Leiva Toledano
 * @version 1.0
 */

public class Ejercicio1 {

	/*
	 * escaner, array, y variable auxiliar i estáticas
	 */
	static Scanner sc = new Scanner(System.in);
	static int[] array = new int[6];
	static int i;

	public static void main(String[] args) {

		//bucle que recorre el array llamado array
		for (i = 0; i < array.length; i++) {
			System.out.print("Introduce el valor del indice " + i + ": ");
			array[i] = pideNumero();
		}

		calculaMaximo();
	}

	/**
	 * Devuelve un valor entero, pedido por el usuario. Si no es un valor entero, salta la excepción.
	 * @return numero entero
	 */
	private static int pideNumero() {

		// boolean numeroEntero = false;

		int numero = 0;

		while (true) {
			try {
				numero = sc.nextInt();
				// return numero;
				break;
			} catch (Exception e) {
				System.err.println("Ha introducido un valor erróneo. Inténtalo de nuevo.");
				sc.nextLine();
				System.out.print("Introduce el valor del indice " + i + ": ");
				// return 0;
			}
		}
		return numero;
	}

	/**
	 * Comprueba el máximo del array y lo muestra.
	 */
	private static void calculaMaximo() {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("El máximo es " + max + ".");
	}
}
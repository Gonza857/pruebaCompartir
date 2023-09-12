package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Cerradura;

public class HandleCerradura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa un codigo para tu nueva cerradura");
		int newCodigo = teclado.nextInt();
		Cerradura miCerradura = new Cerradura(newCodigo);

		System.out.println("Ingresa el codigo para abrir tu cerradura");
		int pruebaCodigo = teclado.nextInt();
		System.out.println(miCerradura.abrirCerradura(pruebaCodigo));

		System.out.println(miCerradura.estadoCerradura());

		teclado.close();

	}

}

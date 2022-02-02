package Practicando;

import java.util.Scanner;

public class ejercicioIfCocaCola {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		String nombre = "";
		int clave = 0;
		int antiguedad = 0;
		System.out.println("***********************************************");
		System.out.println("*Bienvenido al sistema vacacional de Coca-Cola*");
		System.out.println("***********************************************");
		System.out.println("");
		System.out.println("");

		System.out.println("¿Cual es su nombre?: ");
		nombre = entrada.nextLine();
		System.out.println(" ");

		System.out.println("¿Cuanto tiempo de servicio tiene?:");
		antiguedad = entrada.nextInt();
		System.out.println(" ");

		System.out.println("¿Cual es su clave?: ");
		clave = entrada.nextInt();
		System.out.println(" ");

		if (clave == 1) {
			if (antiguedad == 1) {
				System.out.println("El trabajador  " + nombre + "tiene derecho a 6 dias de vacaciones");
			} else if (antiguedad >= 2 && antiguedad < 6) {
				System.out.println("El trabajador  " + nombre + "tiene derecho a 14 dias de vacaciones");
			} else if (antiguedad >= 7) {
				System.out.println("El trabajador  " + nombre + "tiene derecho a 20 dias de vacaciones");

			} else if (clave == 2) {
				if (antiguedad == 1) {
					System.out.println("El trabajador  " + nombre + "tiene derecho a 7 dias de vacaciones");
				} else if (antiguedad >= 2 && antiguedad < 6) {
					System.out.println("El trabajador  " + nombre + "tiene derecho a 15 dias de vacaciones");
				} else if (antiguedad >= 7) {
					System.out.println("El trabajador  " + nombre + "tiene derecho a 22 dias de vacaciones");

				}
				if (clave == 3) {
					if (antiguedad == 1) {
						System.out.println("El trabajador  " + nombre + "tiene derecho a 10 dias de vacaciones");
					} else if (antiguedad >= 2 && antiguedad < 6) {
						System.out.println("El trabajador  " + nombre + "tiene derecho a 20 dias de vacaciones");
					} else if (antiguedad >= 7) {
						System.out.println("El trabajador  " + nombre + "tiene derecho a 30 dias de vacaciones");

					} else {
						System.out.println("Error!, la clave del departamento es imcorrecta");
					}
				}
			}
		}
	}
}

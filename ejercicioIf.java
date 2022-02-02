package Practicando;

public class ejercicioIf {
	// Realice un programa que calcule el promedio final de tres materias y que el
	// programa nos indique si el alumno aprobo o reprobo.

	public static void main(String args[]) {

		int matematica = 4;
		int filosofia = 6;
		int lengua = 7;

		float promedio = matematica + filosofia + lengua / 3;

		if (promedio >= 6) {

			System.out.println("El alumno aprobo");
		}

		else {

			System.out.println("El alumno reprobo");
		}
	}
}

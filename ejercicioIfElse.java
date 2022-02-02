package Practicando;

public class ejercicioIfElse {
	// Realizar un programa que pueda realizar una suma, una resta,una
	// multiplicacion o una division de dos numeros enteros,
	// dependiendo de la decision del usuario:
	// si la operacion es igual a 1, realizar suma
	// si la operacion es igual a 2, realizar resta
	// si la operacion es igual a 3, realizar multiplicacion
	// si laoperacion es igual a 4, realizar division

	public static void main(String args[]) {

		int operacion = 1;
		int numUno = 8;
		int numDos = 4;
		int resultado = 0;

		if (operacion == 1) {

			resultado = numUno + numDos;
			System.out.println("El resultado de la suma es " + resultado);
		}

		else if (operacion == 2) {
			resultado = numUno - numDos;

			System.out.println("El resultado de la resta es " + resultado);
		}

		else if (operacion == 3) {
			resultado = numUno * numDos;

			System.out.println("El resultado de la multiplicacion es " + resultado);
		} else if (operacion == 4) {
			resultado = numUno / numDos;

			System.out.println("El resultado de la division es " + resultado);
		} else {
			System.out.println("El resultado no es valido");
		}

	}
}

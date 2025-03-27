package Logging;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		Logger logger = Logger.getInstance();
		

		do {
			System.out.println(" ");
			System.out.println("=== MENÚ ===");
			System.out.println("1. Sumar dos números aleatorios");
			System.out.println("2. Restar dos números aleatorios");
			System.out.println("3. Ver registro de actividad (logs)");
			System.out.println(" ");
			System.out.println("0. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.nextInt();
			System.out.println(" ");

			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado la Opción 1. Sumar dos números aleatorios");
				int a = (int) (Math.random() * 100) + 1;
				int b = (int) (Math.random() * 100) + 1;
				
				Utils.sumarNumeros(a, b);
				System.out.println("Se han sumado correctamente");
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Has seleccionado la Opción 2. Restar dos números aleatorios");
				int c = (int) (Math.random() * 100) + 1;
				int d = (int) (Math.random() * 100) + 1;
				
				Utils.restarNumeros(c, d);
				System.out.println("Se han restado correctamente");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Has seleccionado la Opción 3. Ver registro de actividad (logs)");
				ArrayList<String> registro = logger.getRegistro();
				for (String accion : registro) {
					System.out.println(accion);
				}
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (opcion != 0);

		scanner.close();

	}

}

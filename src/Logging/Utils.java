package Logging;

public class Utils {

	public static int sumarNumeros(int a, int b) {
		Logger.getInstance().addToRegistro("Se han sumado dos números: " + a + " + " + b + " = " + (a+b));
		return a+b;
	}
	
	public static int restarNumeros(int a, int b) {
		Logger.getInstance().addToRegistro("Se han restado dos números: " + a + " - " + b + " = " + (a-b));
		return a-b;
	}
}

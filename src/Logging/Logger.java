package Logging;

import java.util.ArrayList;

public class Logger {
	private static Logger instance;
	private ArrayList<String> registro;
	
	private Logger() {
		this.registro = new ArrayList<String>();
	}
	
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public ArrayList<String> getRegistro() {
		return registro;
	}
	
	public void addToRegistro(String accion) {
		registro.addFirst(accion);
	}
	
}

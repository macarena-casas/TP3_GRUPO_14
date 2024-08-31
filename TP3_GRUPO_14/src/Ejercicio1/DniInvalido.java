package Ejercicio1;

public class DniInvalido extends Exception {

	public DniInvalido() {
		
	}

	@Override
	public String getMessage() {
		
		return "El DNI ingresado es Invalido";
	}
	
}

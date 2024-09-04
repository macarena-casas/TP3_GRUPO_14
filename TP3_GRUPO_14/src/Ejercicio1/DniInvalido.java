package Ejercicio1;

public class DniInvalido extends RuntimeException{

	public DniInvalido() {
		
	}

	@Override
	public String getMessage() {
		
		return "El DNI ingresado es Invalido";
	}
	
}

package Ejercicio1;

import java.io.File;
import java.util.TreeSet;

public class ejercicio1Main {

	public static void main(String[] args) {

		 
		TreeSet<Persona> personas = new TreeSet<Persona>();
	
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(archivo.existe()) {
			System.out.println("Existe archivo");
		}
		else 
		{
			System.out.println("No le hay archivo :(");
		}
		
		personas = archivo.leerPersonas();
		
		archivo.guardarArchivo(personas, new File("Resultado.txt"));	
			
		
	}
	
	

}

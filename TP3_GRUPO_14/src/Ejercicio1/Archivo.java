package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Archivo extends Persona {
	
	private String ruta;
	
	public boolean existe() {
		File archivo = new File(ruta);
		if(archivo.exists()) {
			
			return true;
		}
		
		return false;
		
	}
	
	
	public String getRuta() {
		return ruta;
	}
	
	
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	
	public void leer() {
		 TreeSet<Persona> listaPersonas =new TreeSet<Persona>();
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = "";
			while(linea != null) {
				System.out.println(linea);
		
		     //  revisar
				  String[] datos = linea.split("-");
				  if(datos.length==3) {
				  String nombre = datos[0];		
				  String apellido = datos[1];
				  String dni = datos[2];				  				
				  Persona persona=new Persona(nombre,apellido,dni);
				 
				  listaPersonas.add(persona);
				  }
			//  
				  linea = miBuffer.readLine();
			}
			System.out.println(listaPersonas);	
			miBuffer.close();
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	

}

package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
	
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
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = "";
			while(linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
				
			}
			miBuffer.close();
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	

}

package Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class Archivo extends Persona {
	
	private static final String Comparator = null;
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
	
	
	public TreeSet<Persona> cargarPersonas() {
		
		Comparator<Persona> comparadorPorApellido = new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getApellido().compareTo(p2.getApellido());
			}
		};
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = miBuffer.readLine();
			while(linea != null) {
				String[] datos  = linea.split("-") ;
				try 
				{
					if(datos.length == 3) {
						Persona persona = new Persona(datos[0], datos[1], datos[2]);
						
						Persona.verificarDniInvalido(persona.getDni());
						System.out.println(persona.toString());
						listaPersonas.add(persona);
					}
					
				}
				catch (DniInvalido e) 
				{
					System.out.println(e.getMessage());
				}
				linea = miBuffer.readLine();
			}
			
			miBuffer.close();
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		return listaPersonas;
	}
	
	public void guardarArchivo(TreeSet<Persona> personas, File archivo) {
		
		FileWriter salidas = null;
		BufferedWriter bSalidas = null;
		
		try {
			salidas = new FileWriter(archivo,true);
			bSalidas = new BufferedWriter(salidas);
	            for (Persona persona : personas) {
	                String textoPersona = persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getDni() + "\n";
	                bSalidas.write(textoPersona);
	            }
	            System.out.println("Archivo creado con éxito");
	            bSalidas.close();
	            salidas.close();
	        } catch (IOException e) {
	        	System.out.println("Error al crear el archivo: " + e.getMessage());
	        }
	}
	

}

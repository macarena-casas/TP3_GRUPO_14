package Ejercicio1;



public class ejercicio1Main {

	public static void main(String[] args) {

		 
		
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(archivo.existe()) {
			System.out.println("Existe archivo");
		}
		else 
		{
			System.out.println("No le hay archivo :(");
		}
		
		archivo.leer();

		
			
		
	}
	
	

}

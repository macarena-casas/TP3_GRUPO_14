package Ejercicio1;

public class Persona extends Dni implements Comparable <Persona> {
	
	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona() {
		nombre = "Sin Nombre";
		apellido= "Sin Apellido";
		dni="Sin Dni"; 
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		try {
			if (verificarDniInvalido(dni)==false) {
				this.dni = dni;
			}
		} 
		catch (DniInvalido e) {
			System.out.println("El dni de: "+ nombre + ", "+apellido+ " es invalido.");	
			this.dni = " ";
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	

	@Override
	public String toString() {
		return "nombre:" + nombre + ", Apellido:" + apellido + ", Dni:" + dni;
	}

	@Override
	public int compareTo(Persona o) {
		int s=o.nombre.compareTo(this.nombre);
		if(s == 0)
		return 0;
		
		if(s < 0) {
			return -1;
		}
		return 1;
	}

}
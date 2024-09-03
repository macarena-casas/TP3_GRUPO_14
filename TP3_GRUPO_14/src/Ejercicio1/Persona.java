package Ejercicio1;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona() {
		nombre = "Sin Nombre";
		apellido= "Sin Apellido";
		dni=11111111; 
	}
	
	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
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
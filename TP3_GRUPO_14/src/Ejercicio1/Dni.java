package Ejercicio1;

public class Dni {

	public Dni(){
		
	}	
	public static boolean  verificarDniInvalido (String Dni) throws DniInvalido {
	
		boolean auxLetra = false;
	
	//Falta desarrollo
	for(int i=0; i <Dni.length(); i++)
	{
		if(Character.isDigit(Dni.charAt(i)))
			
		auxLetra=false;
		
	}
	
	if(auxLetra == true)
	{
 throw new DniInvalido();
	}
	return false;
	
 
	}
}

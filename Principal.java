package principal;

import personas.Persona;

public class Principal {

	public static void main(String[]args ) {

					Persona Juan = new Persona("jose") ;
					Persona.parado();
					Persona.caminar();
					Persona.peso();
					System.out.println(Juan.nombre());

								
	
	}	
	
	
	
	
	
	
}

package json;

import entity.Usuario;

public class JsonMain {

	public static void main(String[] args) {
		
		
		Usuario usuario = new Usuario ();
		
		usuario.setNome("João Ricardo");
		usuario.setCPF("699.749.261-49");
		usuario.setEnd("Residencial Costa Azul, Pistão Sul, Taguatinga Norte, Brasília/DF");	
	 
		System.out.println(usuario.toJson());
	}

}

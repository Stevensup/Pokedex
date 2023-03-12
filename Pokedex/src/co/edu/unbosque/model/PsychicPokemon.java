package co.edu.unbosque.model;

import java.util.ArrayList;

	
public	class PsychicPokemon extends Pokemon {
		
		ArrayList<String> movimientos = new ArrayList<String>();
	    
		public PsychicPokemon(String name, int ataque, int defensa) {
	        super(name, ataque, defensa);
	        movimientos.add("Confusión.\n");
	        movimientos.add("Rayo confuso.\n");
	        movimientos.add("Psicoataque.\n");
	        movimientos.add("Hipnosis.\n");
	        movimientos.add("Barrera.\n");
	    }
	    
	    public ArrayList<String> getMovimientos(){
	    	return movimientos;
	    }
	    
	    
	    public String getType() {
	        return "Piquico";
	    }

	    public String getDescription() {
	        return " Los Pokémon de este tipo suelen ser muy inteligentes y, a menudo, \n "
	        		+ "se les atribuye capacidades como prever acciones futuras, hacer \n "
	        		+ "levitar objetos o incluso a ellos mismos.";
	        		
	    }

}

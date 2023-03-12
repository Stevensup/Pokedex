package co.edu.unbosque.model;

import java.util.ArrayList;

	
public	class IcePokemon extends Pokemon {
		
	
		ArrayList<String> movimientos = new ArrayList<String>();
	    
		public IcePokemon(String name, int ataque, int defensa) {
	        super(name, ataque, defensa);
	  
	        movimientos.add("Rayo Hielo.\n");
	        movimientos.add("Ventisca.\n");
	        movimientos.add("Vaho Gélido.\n");
	        movimientos.add("Granizo.\n");
	        movimientos.add("Ventisca.\n");
	        movimientos.add("Cola hielo.\n");
	        movimientos.add("Niebla Gelida.\n");
	        movimientos.add("Golpe bajo.\n");
	    }
	    
	    public ArrayList<String> getMovimientos(){
	    	return movimientos;
	    }
	    
	    
	    public String getType() {
	        return "Hielo";
	    }

	    public String getDescription() {
	        return "Destacan por su gran resistencia y \n adaptación al medio frío o glaciar, \n "
	        		+ "como son las cimas de las montañas, \n las cavernas y cuevas heladas, \n o incluso los polos.";
	        		
	    }
	    public int ataque() {
	    	return 0;
	    }

}

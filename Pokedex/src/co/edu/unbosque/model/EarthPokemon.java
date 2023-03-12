package co.edu.unbosque.model;

import java.util.ArrayList;


	
	public class EarthPokemon extends Pokemon {
		ArrayList<String> movimientos = new ArrayList<String>();
	    
		
		public EarthPokemon (String name, int ataque, int defensa) {
	        super(name, ataque, defensa);
	        movimientos.add("terremoto.\n");
	        movimientos.add("Fisura.\n");
	        movimientos.add("Avalancha.\n ");
	        movimientos.add("Bola Fango.\n");
	        movimientos.add("Deslizador.\n");
	        movimientos.add("Garra metal.\n");
	        movimientos.add("Onda gravitatoria.\n");
	        movimientos.add("Excavar.\n");
	    }
	    
	    public ArrayList<String> getMovimientos(){
	    	return movimientos;
	    }
	    
	    
	    public String getType() {
	        return "Tierra";
	    }

	    public String getDescription() {
	        return "Estos Pokémon se pueden hallar en cuevas \n o zonas rocosas, con excepción  \n de algunos de doble tipo.";
	        		

}
	}

package co.edu.unbosque.model;

import java.util.ArrayList;

public	class PlantPokemon extends Pokemon {
		ArrayList<String> movimientos = new ArrayList<String>();
	    
		
		public PlantPokemon(String name, int ataque, int defensa) {
	        super(name, ataque, defensa);
	        movimientos.add("Hoja afilada.\n");
	        movimientos.add("Rayo solar.\n");
	        movimientos.add("Bomba germen.\n ");
	        movimientos.add("Drenadoras.\n");
	        movimientos.add("Latigazos.\n");
	        movimientos.add("Gigadrenado.\n");
	        movimientos.add("Síntesis.\n");
	        movimientos.add("Hoja Magica.\n");
	    }
	    
	    public ArrayList<String> getMovimientos(){
	    	return movimientos;
	    }
	    
	    
	    public String getType() {
	        return "Planta";
	    }

	    public String getDescription() {
	        return "A los Pokémon de tipo planta les gusta cuidar de las flores \n "
	        		+ "y a los demás, pero también son grandes luchadores \n y son expertos en cambios de estado,\n"
	        		+ " pudiendo envenenar, paralizar o \n dormir al rival en combate\r";
	    }

}

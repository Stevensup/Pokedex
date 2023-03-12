package co.edu.unbosque.model;

import java.util.ArrayList;

	
public	class ElectricPokemon extends Pokemon {
		ArrayList<String> movimientos = new ArrayList<String>();
	    
		public ElectricPokemon(String name, int ataque, int defensa) {
	        super(name, ataque, defensa);
	        movimientos.add("Trueno. \n");
	        movimientos.add("Rayo.\n");
	        movimientos.add("Chispazo.\n");
	        movimientos.add("Onda Trueno.\n");
	        movimientos.add("Electrocañon.\n");
	        movimientos.add("Onda Voltio.\n");
	        movimientos.add("Chispas.\n");
	        movimientos.add("Chispa Paralizante.\n");
	    }
	    
	    public ArrayList<String> getMovimientos(){
	    	return movimientos;
	    }
	    
	    
	    public String getType() {
	        return "Electrico";
	    }

	    public String getDescription() {
	        return "Los Pokémon de tipo eléctrico tienen \n hábitats variados, desde bosques y praderas, \n hasta ciudades y  centrales \n eléctricas";
	        		
	    }

}

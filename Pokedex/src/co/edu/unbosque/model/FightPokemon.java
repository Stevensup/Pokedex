package co.edu.unbosque.model;

import java.util.ArrayList;

public	class FightPokemon extends Pokemon {
		ArrayList<String> movimientos = new ArrayList<String>();
	    
		
		public FightPokemon(String name, int ataque, int defensa) {
	        super(name, ataque, defensa);
	        movimientos.add("Golpe karate.\n");
	        movimientos.add("Puño dinamico.\n");
	        movimientos.add("Tajo cruzado.\n ");
	        movimientos.add("Patada salto.\n");
	        movimientos.add("Venganza.\n");
	        movimientos.add("Ultimo recurso.\n");
	        movimientos.add("Llave Inglesa.\n ");
	        movimientos.add("Patada giro.\n");
	    }
	    
	    public ArrayList<String> getMovimientos(){
	    	return movimientos;
	    }
	    
	    
	    public String getType() {
	        return "Lucha";
	    }

	    public String getDescription() {
	        return "Este tipo de Pokémon son especialistas en el \n combate cuerpo a cuerpo, se podría decir \n"
	        		+ "que son opuestos a los del tipo psíquico, \n ya que, estos últimos, dependen del   ataque especial; \n"
	        		+ "mientras que los del tipo lucha  se especializan en ataque físico.";
	        		
	    }

}

package co.edu.unbosque.model;

import java.util.ArrayList;

public class FirePokemon extends Pokemon {
	ArrayList<String> movimientos = new ArrayList<String>();
    public FirePokemon(String name, int ataque, int defensa) {
        super(name, ataque, defensa);
        movimientos.add("Lanzallamas.\n");
        movimientos.add("Envite ígneo.\n");
        movimientos.add("Rueda fuego.\n");
        movimientos.add("Bola de fuego.\n");
        movimientos.add("Ascuas.\n");
        movimientos.add("Llama.\n");
        movimientos.add("Anillo ígneo.\n");
        movimientos.add("Llamarada.\n");
    }
    
    public ArrayList<String> getMovimientos(){
    	return movimientos;
    }
    
    
    public String getType() {
        return "Fuego";
    }

    public String getDescription() {
        return "Los Pokémon de tipo fuego basan sus ataques, principalmente, \n "
        		+ "en el control de este elemento; y la mayoría pueden quemar \n "
        		+ "al Pokémon oponente, mientras que ellos no sufren quemaduras.\n";
        		
    }
}
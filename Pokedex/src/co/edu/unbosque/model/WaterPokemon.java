package co.edu.unbosque.model;

import java.util.ArrayList;

public class WaterPokemon extends Pokemon {
	
	ArrayList<String> movimientos = new ArrayList<String>();
    
	public WaterPokemon(String name, int ataque, int defensa) {
        super(name, ataque, defensa);
        movimientos.add("Tormenta de agua.\n");
        movimientos.add("Surf.\n");
        movimientos.add("Hidrobomba.\n");
        movimientos.add("Danza de la lluvia.\n");
        movimientos.add("Brubuja.\n");
        movimientos.add("HidroPulso. \n");
        movimientos.add("Rayo burbuja\n");
        movimientos.add("Chorro de agua\n");
    }
    
    public ArrayList<String> getMovimientos(){
    	return movimientos;
    }
    
    
    public String getType() {
        return "Agua";
    }

    public String getDescription() {
        return " Se dice que es puro y que suele adaptarse a \n cualquier situación o condición climática, \n ya que el agua puede adoptar cualquier \n forma en cualquier momento.\n";
        		
        		
    }

   
}
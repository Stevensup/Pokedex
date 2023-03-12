package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pokedex {
	private ArrayList<Pokemon> pokemonList;

    public Pokedex() {
        this.pokemonList = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void removePokemon(String name) {
    	for(int i=0;i<pokemonList.size();i++) {
    		if(pokemonList.get(i).name.equals(name)) {
    			this.pokemonList.remove(i);
    			
    			JOptionPane.showMessageDialog(null, "Pokemon Eliminado de la lista!");
    			
    		}else if(i == pokemonList.size()-1 && !pokemonList.get(i).name.equals(name)){ 
    			JOptionPane.showMessageDialog(null, "No se encuentra el Pokémon");
    			
    		}
    	}
    }

    public Pokemon findPokemon(String name) {
        for (Pokemon pokemon : this.pokemonList) {
            if (pokemon.getName().equals(name)) {
                return pokemon;
            }
        }

        return null;
    }
    
    public ArrayList<String> findPokemonbytype(String type){
    	ArrayList<String> pokemonportipo;
    	pokemonportipo = new ArrayList<String>();
    	for (int i=0; i<pokemonList.size(); i++) {
    		if (pokemonList.get(i).getType().equals(type)) {
    			pokemonportipo.add(pokemonList.get(i).getName());
    			
    			
    		}
    	}
    	return pokemonportipo;
    	
    }

    public ArrayList<Pokemon> getAllPokemon() {
        return this.pokemonList;
    }
}

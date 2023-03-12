package co.edu.unbosque.model;

import java.util.ArrayList;

public abstract class Pokemon {
    protected String name;
    protected int ataque;
    protected int defensa;
    protected ArrayList<String> moves;

    public Pokemon(String name, int ataque, int defensa) {
        this.name = name;
        this.ataque = ataque;
        this.defensa = defensa;
        this.moves = new ArrayList<String>();
    }

    public abstract String getType();
    public abstract String getDescription();

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getMoves() {
        return this.moves;
    }

    public void addMove(String move) {
        this.moves.add(move);
    }

    public void removeMove(String move) {
        this.moves.remove(move);
    }

	public int getAtaque() {
		return ataque;
	}


	public int getDefensa() {
		return defensa;
	}


}
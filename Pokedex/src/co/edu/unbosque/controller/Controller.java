package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.EarthPokemon;
import co.edu.unbosque.model.ElectricPokemon;
import co.edu.unbosque.model.FightPokemon;
import co.edu.unbosque.model.FirePokemon;
import co.edu.unbosque.model.IcePokemon;
import co.edu.unbosque.model.PlantPokemon;
import co.edu.unbosque.model.Pokedex;
import co.edu.unbosque.model.Pokemon;
import co.edu.unbosque.model.PsychicPokemon;
import co.edu.unbosque.model.WaterPokemon;
import co.edu.unbosque.view.MenuPrincipal;
import co.edu.unbosque.view.PaneldeBuscar;
import co.edu.unbosque.view.PaneldeEliminar;
import co.edu.unbosque.view.PaneldeRegistrar;
import co.edu.unbosque.view.VentanaInicial;

public class Controller implements ActionListener {

	private VentanaInicial vista1;
	private MenuPrincipal vista2;
	private SoundHandler sonido1;
	private SoundHandler sonido2;
	private PaneldeBuscar vista3;
	private PaneldeRegistrar vista4;
	private PaneldeEliminar vista5;
	private Pokedex pokedex = new Pokedex();
	private FirePokemon pokemonfuego;
	private EarthPokemon pokemontierra;
	private ElectricPokemon pokemonElectrico;
	private FightPokemon pokemonPelea;
	private IcePokemon pokemonHielo;
	private PlantPokemon pokemonPlanta;
	private WaterPokemon pokemonAgua;
	private PsychicPokemon pokemonSiquico;

	public Controller() {
		vista1 = new VentanaInicial();
		vista2 = new MenuPrincipal();
		vista3 = new PaneldeBuscar();
		vista4 = new PaneldeRegistrar();
		vista5 = new PaneldeEliminar();
		pokemonAgua = new WaterPokemon("",0,0);
		pokemontierra = new EarthPokemon("",0,0);
		pokemonfuego = new FirePokemon("",0,0);
		pokemonElectrico = new ElectricPokemon("",0,0);
		pokemonPelea = new FightPokemon("",0,0);
		pokemonHielo = new IcePokemon("",0,0);
		pokemonPlanta = new PlantPokemon("",0,0);
		pokemonSiquico = new PsychicPokemon("",0,0);
		
		sonido1 = new SoundHandler("src/co/edu/unbosque/view/music/X2Download.wav");
		sonido2 = new SoundHandler("src/co/edu/unbosque/view/music/johtopianomp3.wav");
		asignarOyentes();
	}

	public void asignarOyentes() {
		// BOTONES VENTANA INICIAL

		vista1.getBoton().addActionListener(this);
		vista1.getBoton().setActionCommand("botoniniciar");

		vista1.getBoton2().addActionListener(this);
		vista1.getBoton2().setActionCommand("botonsalir");

		// BOTONES VENTANA MENU

		vista2.getBoton().addActionListener(this);
		vista2.getBoton().setActionCommand("botonbuscar");

		vista2.getBoton2().addActionListener(this);
		vista2.getBoton2().setActionCommand("botonsalir");

		vista2.getBoton3().addActionListener(this);
		vista2.getBoton3().setActionCommand("botonregistrar");

		vista2.getBoton4().addActionListener(this);
		vista2.getBoton4().setActionCommand("botoneliminar");

		// BOTONES VENTANA REGISTRAR
		vista4.getBregistrar().addActionListener(this);
		vista4.getBregistrar().setActionCommand("botonregistrar2");

		vista4.getBoton2().addActionListener(this);
		vista4.getBoton2().setActionCommand("botonsalir2");
		vista4.getBvolver().addActionListener(this);
		vista4.getBvolver().setActionCommand("botonvolver");
		
		
		
		
		vista4.getCtipo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccion=(String) vista4.getCtipo().getSelectedItem();
				vista4.getChabilidad1().removeAllItems();
				vista4.getChabilidad2().removeAllItems();
				vista4.getChabilidad3().removeAllItems();
				vista4.getChabilidad4().removeAllItems();
				if(seleccion.equals("Agua")) {
					vista4.setChabilidad1(pokemonAgua.getMovimientos());
					vista4.setChabilidad2(pokemonAgua.getMovimientos());
					vista4.setChabilidad3(pokemonAgua.getMovimientos());
					vista4.setChabilidad4(pokemonAgua.getMovimientos());
				} else if(seleccion.equals("Tierra")) {
					vista4.setChabilidad1(pokemontierra.getMovimientos());
					vista4.setChabilidad2(pokemontierra.getMovimientos());
					vista4.setChabilidad3(pokemontierra.getMovimientos());
					vista4.setChabilidad4(pokemontierra.getMovimientos());
				} else if(seleccion.equals("Fuego")) {
					vista4.setChabilidad1(pokemonfuego.getMovimientos());
					vista4.setChabilidad2(pokemonfuego.getMovimientos());
					vista4.setChabilidad3(pokemonfuego.getMovimientos());
					vista4.setChabilidad4(pokemonfuego.getMovimientos());
			}else if(seleccion.equals("Electrico")) {
				vista4.setChabilidad1(pokemonElectrico.getMovimientos());
				vista4.setChabilidad2(pokemonElectrico.getMovimientos());
				vista4.setChabilidad3(pokemonElectrico.getMovimientos());
				vista4.setChabilidad4(pokemonElectrico.getMovimientos());
		}else if(seleccion.equals("Lucha")) {
			vista4.setChabilidad1(pokemonPelea.getMovimientos());
			vista4.setChabilidad2(pokemonPelea.getMovimientos());
			vista4.setChabilidad3(pokemonPelea.getMovimientos());
			vista4.setChabilidad4(pokemonPelea.getMovimientos());
	}else if(seleccion.equals("Hielo")) {
		vista4.setChabilidad1(pokemonHielo.getMovimientos());
		vista4.setChabilidad2(pokemonHielo.getMovimientos());
		vista4.setChabilidad3(pokemonHielo.getMovimientos());
		vista4.setChabilidad4(pokemonHielo.getMovimientos());
}else if(seleccion.equals("Planta")) {
	vista4.setChabilidad1(pokemonPlanta.getMovimientos());
	vista4.setChabilidad2(pokemonPlanta.getMovimientos());
	vista4.setChabilidad3(pokemonPlanta.getMovimientos());
	vista4.setChabilidad4(pokemonPlanta.getMovimientos());

}else if(seleccion.equals("Psiquico")) {
	vista4.setChabilidad1(pokemonSiquico.getMovimientos());
	vista4.setChabilidad2(pokemonSiquico.getMovimientos());
	vista4.setChabilidad3(pokemonSiquico.getMovimientos());
	vista4.setChabilidad4(pokemonSiquico.getMovimientos());
}
			}
		});
		
		
		

		// BOTONES VENTANA BUSCAR
		vista3.getBoton2().addActionListener(this);
		vista3.getBoton2().setActionCommand("botonsalir2");

		vista3.getBbuscar().addActionListener(this);
		vista3.getBbuscar().setActionCommand("botonbuscar2");

		vista3.getBvolver().addActionListener(this);
		vista3.getBvolver().setActionCommand("botonvolver2");

		// BOTONES VENTANA ELIMINAR

		vista5.getBbuscar().addActionListener(this);
		vista5.getBbuscar().setActionCommand("botoneliminar2");

		vista5.getBvolver().addActionListener(this);
		vista5.getBvolver().setActionCommand("botonvolver3");

		vista5.getBoton2().addActionListener(this);
		vista5.getBoton2().setActionCommand("botonsalir3");
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		switch (e.getActionCommand()) {

		// BOTONES VENTANA INICIAL
		case "botoniniciar": {
			vista1.setVisible(false);
			vista2.setVisible(true);
			sonido2.play();
			break;
		}
		case "botonsalir": {
			System.exit(0);
			sonido1.stop();
			break;
		}
		
		//VENTANA MENU INICIAL
		case "botonbuscar": {
			vista2.setVisible(false);
			vista3.setVisible(true);
			sonido2.loop();
			break;
		}
		case "botonregistrar": {
			vista2.setVisible(false);
			vista4.setVisible(true);
			vista4.setChabilidad1(pokemonAgua.getMovimientos());
			vista4.setChabilidad2(pokemonAgua.getMovimientos());
			vista4.setChabilidad3(pokemonAgua.getMovimientos());
			vista4.setChabilidad4(pokemonAgua.getMovimientos());
			sonido2.loop();
			break;

		}
		case "botoneliminar": {
			vista2.setVisible(false);
			vista5.setVisible(true);
			sonido2.loop();
			break;

		}
		case "botonregistrar2": {
			
			String nombre = vista4.getCnombre().getText();
			String tipo = vista4.getCtipo().getSelectedItem().toString();
			String movimiento1 = vista4.getChabilidad1().getSelectedItem().toString();
			String movimiento2 = vista4.getChabilidad2().getSelectedItem().toString();
			String movimiento3 = vista4.getChabilidad3().getSelectedItem().toString();
			String movimiento4 = vista4.getChabilidad4().getSelectedItem().toString();
			int ataque = Integer.parseInt(vista4.getTataque().getText()); 
			int defensa = Integer.parseInt(vista4.getTdefensa().getText());
			Pokemon poke;
			
			if(tipo.equals("Fuego")) {
				poke = new FirePokemon(nombre,ataque, defensa);
			} else if(tipo.equals("Planta")) {
				poke = new PlantPokemon(nombre, ataque, defensa);
			} else if(tipo.equals("Lucha")) {
				poke = new FightPokemon(nombre, ataque, defensa);
			} else if(tipo.equals("Tierra")) {
				poke = new EarthPokemon(nombre, ataque, defensa);
			}else if(tipo.equals("Electrico")) {
				poke = new ElectricPokemon(nombre, ataque, defensa);	
			}else if(tipo.equals("Hielo")) {
				poke = new IcePokemon(nombre, ataque, defensa);
			}else if(tipo.equals("Psiquico")) {
				poke = new PsychicPokemon(nombre, ataque, defensa);
			}else if(tipo.equals("Agua")) {
				poke = new WaterPokemon(nombre, ataque, defensa);
			}else {
				poke = new WaterPokemon(nombre, ataque, defensa);
			}
			
			poke.addMove(movimiento1);
			poke.addMove(movimiento2);
			poke.addMove(movimiento3);
			poke.addMove(movimiento4);
			pokedex.addPokemon(poke);
			Pokemon foundPokemon = pokedex.findPokemon(nombre);
			
			JOptionPane.showMessageDialog(null, "Pokemon Registrado!");
			
			vista4.getEresultado().setText("Pokemon Registrado: \n" + "Nombre: " + foundPokemon.getName() + "\n" + 
			                                "Tipo: " + foundPokemon.getType() + "\n" + "Movimientos: " + foundPokemon.getMoves() + "\n"
			                                + "Descripción: " + foundPokemon.getDescription() + "\n" + "Ataque: " + foundPokemon.getAtaque() + "\n" +
			                                "Defensa: " + foundPokemon.getDefensa());
			
	
			break;

		}
		case "botonsalir2": {
			System.exit(0);
			sonido2.stop();
			break;

		}
		case "botonvolver": {
			vista2.setVisible(true);
			vista4.setVisible(false);
			break;

		}
		case "botonvolver2": {
			vista2.setVisible(true);
			vista3.setVisible(false);

			break;

		}
		case "botonvolver3": {
			vista2.setVisible(true);
			vista5.setVisible(false);

			break;

		}
		case "botonsalir3": {
			System.exit(0);
			sonido2.stop();
			break;

		} case "botoneliminar2": {
			
			String nombre = vista5.getCnombre().getText();
			pokedex.removePokemon(nombre);
		
		break;

	}case "botonbuscar2": {
		if (!vista3.getCnombre().getText().equals("")) {
	    	
	    
		String nombre = vista3.getCnombre().getText();
		
		
		Pokemon pokemon = pokedex.findPokemon(nombre);
		vista3.getEresultado().setText(("Pokemon encontrado!: " +nombre));
	    System.out.println("pokemon encontrado es : " +pokemon.getName() );
	    
		}else if (vista3.getCnombre().getText().equals("")) {
	    	String tipo = (String) vista3.getCtipo().getSelectedItem();
	    	ArrayList<String> tipopokemon = pokedex.findPokemonbytype(tipo);
	    	vista3.getEresultado().setText(("Pokemon encontrado(s)!: " + tipopokemon));
	    	System.out.println(tipopokemon);
	    }
	break;

}
	
		}

	}

}

package co.edu.unbosque.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaInicial extends JFrame {

	private JLabel foto1;
	private Image imagen1, imagen2, imagen3;
	private Icon icon1, icon2, icon3;
	private JPanel panel;
	private JButton boton, boton2;


	
	public VentanaInicial () {
		setTitle("Pokedex");
		setBounds(600, 200, 500, 700);
		this.setSize(500, 700);
		setResizable(false);		
		setLocationRelativeTo(null);
		setUndecorated(true);
					
		//PANELES
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(10, 10, 10));
		panel.setBounds(0, 0, 500, 700);
		
		//CURSOR
		Point point = new Point(0,0);
		Toolkit tkit=Toolkit.getDefaultToolkit();
		Image img1 = tkit.getImage("src/co/edu/unbosque/view/imagenes/cursorpoke.png");	
		Cursor cursor1 = tkit.createCustomCursor(img1, point, "src/co/edu/unbosque/view/imagenes/cursorpoke.png");
		
		//GIFS
		imagen1 = new ImageIcon("src/co/edu/unbosque/view/imagenes/pokedex.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(500, 700, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0,0,500,700);
		foto1.setIcon(icon1);
		
		//BOTONES
		imagen2 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botoniniciar.png").getImage();
		icon2 = new ImageIcon(imagen2.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
		boton = new JButton(icon2);
		boton.setBounds(117, 602, 265, 65);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		
		imagen3 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonsalir.png").getImage();
		icon3 = new ImageIcon(imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		boton2 = new JButton(icon3);
		boton2.setBounds(440, 5, 50, 50);
		boton2.setBorderPainted(false);
		boton2.setContentAreaFilled(false);
		
		//SONIDO	
		
		
		//ADD
		
		foto1.setCursor(cursor1);
		boton.setCursor(cursor1);
		boton2.setCursor(cursor1);
		add(boton2);
		add(boton);
		add(foto1);
		add(panel);
		setVisible(true);
	}

	public JLabel getFoto1() {
		return foto1;
	}

	public void setFoto1(JLabel foto1) {
		this.foto1 = foto1;
	}

	public Image getImagen1() {
		return imagen1;
	}

	public void setImagen1(Image imagen1) {
		this.imagen1 = imagen1;
	}

	public Icon getIcon1() {
		return icon1;
	}

	public void setIcon1(Icon icon1) {
		this.icon1 = icon1;
	}

	public Icon getIcon2() {
		return icon2;
	}

	public void setIcon2(Icon icon2) {
		this.icon2 = icon2;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getBoton() {
		return boton;
	}

	public void setBoton(JButton boton) {
		this.boton = boton;
	}

	public Image getImagen2() {
		return imagen2;
	}

	public void setImagen2(Image imagen2) {
		this.imagen2 = imagen2;
	}

	public Image getImagen3() {
		return imagen3;
	}

	public void setImagen3(Image imagen3) {
		this.imagen3 = imagen3;
	}

	public Icon getIcon3() {
		return icon3;
	}

	public void setIcon3(Icon icon3) {
		this.icon3 = icon3;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}
	
	
		
	}



package co.edu.unbosque.view;

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

public class MenuPrincipal extends JFrame {

		private JLabel foto1, foto2;
		private Image imagen1, imagen2, imagen3, imagen4, imagen5, imagen6;
		private Icon icon1, icon2, icon3, icon4, icon5, icon6;
		private JPanel panel;
		private JButton boton, boton2, boton3,boton4;


		
		public MenuPrincipal () {
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
			
			//LABEL
			
			imagen6 = new ImageIcon("src/co/edu/unbosque/view/imagenes/pkedextittle.png").getImage();
			icon6 = new ImageIcon(imagen6.getScaledInstance(280, 70, Image.SCALE_DEFAULT));
			foto2 = new JLabel();
			foto2.setBounds(150, 20, 280, 70);
			foto2.setIcon(icon6);
			
			//CURSOR
			Point point = new Point(0,0);
			Toolkit tkit=Toolkit.getDefaultToolkit();
			Image img1 = tkit.getImage("src/co/edu/unbosque/view/imagenes/cursorpoke.png");	
			Cursor cursor1 = tkit.createCustomCursor(img1, point, "src/co/edu/unbosque/view/imagenes/cursorpoke.png");
			
			//GIFS
			imagen1 = new ImageIcon("src/co/edu/unbosque/view/imagenes/panel1.png").getImage();
			icon1 = new ImageIcon(imagen1.getScaledInstance(500, 700, Image.SCALE_DEFAULT));
			foto1 = new JLabel();
			foto1.setBounds(0,0,500,700);
			foto1.setIcon(icon1);
			
			//BOTONES
			imagen2 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonbuscar.png").getImage();
			icon2 = new ImageIcon(imagen2.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
			boton = new JButton(icon2);
			boton.setBounds(117, 300, 265, 65);
			boton.setBorderPainted(false);
			boton.setContentAreaFilled(false);
			
			imagen4 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonregistrar.png").getImage();
			icon4 = new ImageIcon(imagen4.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
			boton3 = new JButton(icon4);
			boton3.setBounds(117, 400, 265, 65);
			boton3.setBorderPainted(false);
			boton3.setContentAreaFilled(false);
			
			imagen5 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botoneliminar.png").getImage();
			icon5 = new ImageIcon(imagen5.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
			boton4 = new JButton(icon5);
			boton4.setBounds(117, 500, 265, 65);
			boton4.setBorderPainted(false);
			boton4.setContentAreaFilled(false);
			
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
			boton3.setCursor(cursor1);
			boton4.setCursor(cursor1);
			add(foto2);
			add(foto2);
			add(boton2);
			add(boton);
			add(boton3);
			add(boton4);
			add(foto1);
			add(panel);
			setVisible(false);
		}



		public JLabel getFoto1() {
			return foto1;
		}



		public void setFoto1(JLabel foto1) {
			this.foto1 = foto1;
		}



		public JLabel getFoto2() {
			return foto2;
		}



		public void setFoto2(JLabel foto2) {
			this.foto2 = foto2;
		}



		public Image getImagen1() {
			return imagen1;
		}



		public void setImagen1(Image imagen1) {
			this.imagen1 = imagen1;
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



		public Image getImagen4() {
			return imagen4;
		}



		public void setImagen4(Image imagen4) {
			this.imagen4 = imagen4;
		}



		public Image getImagen5() {
			return imagen5;
		}



		public void setImagen5(Image imagen5) {
			this.imagen5 = imagen5;
		}



		public Image getImagen6() {
			return imagen6;
		}



		public void setImagen6(Image imagen6) {
			this.imagen6 = imagen6;
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



		public Icon getIcon3() {
			return icon3;
		}



		public void setIcon3(Icon icon3) {
			this.icon3 = icon3;
		}



		public Icon getIcon4() {
			return icon4;
		}



		public void setIcon4(Icon icon4) {
			this.icon4 = icon4;
		}



		public Icon getIcon5() {
			return icon5;
		}



		public void setIcon5(Icon icon5) {
			this.icon5 = icon5;
		}



		public Icon getIcon6() {
			return icon6;
		}



		public void setIcon6(Icon icon6) {
			this.icon6 = icon6;
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



		public JButton getBoton2() {
			return boton2;
		}



		public void setBoton2(JButton boton2) {
			this.boton2 = boton2;
		}



		public JButton getBoton3() {
			return boton3;
		}



		public void setBoton3(JButton boton3) {
			this.boton3 = boton3;
		}



		public JButton getBoton4() {
			return boton4;
		}



		public void setBoton4(JButton boton4) {
			this.boton4 = boton4;
		}
		
		
}

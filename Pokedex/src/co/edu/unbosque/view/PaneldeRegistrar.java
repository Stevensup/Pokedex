package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PaneldeRegistrar extends JFrame {
	
		
			private JLabel informacion,lnombre, ltipo, foto1, lmovimientos, lataque, ldefensa, foto2, foto3, foto4, habilidad1, habilidad2, habilidad3, habilidad4;
			private JTextField cnombre, tataque, tdefensa;
			private JButton bBuscar, bregistrar, bEliminar, boton2, bvolver;
			private Icon icon1, icon4;
			private JComboBox<String> ctipo, cmovimientos, chabilidad1, chabilidad2, chabilidad3, chabilidad4;
			private Image imagen1,imagen4, imagen3, imagen5, imagen6, imagen;
			private Icon icon, icon3, icon6, icon5;
			private JTextArea eresultado;
			
			
			private int hex(String color_hex) {
				return Integer.parseInt(color_hex, 16);
			}

			public PaneldeRegistrar() {
			
				setSize(1000, 700);
				setBounds(0,0, 1000, 700);
				setBackground(new Color(hex("C48DEB")));
				setResizable(false);
				setLocationRelativeTo(null);
			    setForeground(getBackground());
			    setUndecorated(true);
			    
			
			
				//FONT
				Font letra = new Font("arial",3,18);
				setFont(letra);
				
				Font letra2 = new Font("arial",3,12);
				setFont(letra2);
				
				Font letra3 = new Font("arial",3,18);
				setFont(letra3);
				
				//REGISTRAR
				Point point = new Point(0,0);
				Toolkit tkit=Toolkit.getDefaultToolkit();
				Image img1 = tkit.getImage("src/co/edu/unbosque/view/imagenes/cursorpoke.png");	
				Cursor cursor1 = tkit.createCustomCursor(img1, point, "src/co/edu/unbosque/view/imagenes/cursorpoke.png");
				
				//AREA DE TEXTO
				
				eresultado = new JTextArea("");
				
				eresultado.setBounds(550, 155, 400, 300);
				
				eresultado.setEnabled(true);
				eresultado.setSelectedTextColor(Color.BLACK);
				eresultado.setBackground(new Color(hex("84bce6")));
				eresultado.setForeground(Color.BLACK);
				
                JScrollPane pscroll = new JScrollPane(eresultado);
				pscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				pscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				add(pscroll);
				
				
				
			
				
				//LABEL
				
				imagen6 = new ImageIcon("src/co/edu/unbosque/view/imagenes/registrartittle.png").getImage();
				icon6 = new ImageIcon(imagen6.getScaledInstance(280, 70, Image.SCALE_DEFAULT));
				foto3 = new JLabel();
				foto3.setBounds(150, 20, 280, 70);
				foto3.setIcon(icon6);
				
			
				Font font = eresultado.getFont();
				Font newFont = new Font(font.getFontName(), font.getStyle(), 14); 
			    eresultado.setFont(newFont);
			    eresultado.setForeground(Color.BLACK);
				
				imagen = new ImageIcon("src/co/edu/unbosque/view/imagenes/pikachuregistrar.png").getImage();
				icon5 = new ImageIcon(imagen.getScaledInstance(200, 250, Image.SCALE_DEFAULT));
				foto4 = new JLabel();
				foto4.setBounds(820, 450, 230, 250);
				foto4.setIcon(icon5);
				
				lnombre = new JLabel("Nombre: ");
				lnombre.setBounds(20, 100, 200, 200);
				lnombre.setForeground(Color.BLACK);
				lnombre.setFont(letra);
				
				ltipo = new JLabel("Tipo: ");
				ltipo.setBounds(20, 170, 200, 200);
				ltipo.setForeground(Color.BLACK);
				ltipo.setFont(letra);
				
				lmovimientos = new JLabel("Movimientos: ");
				lmovimientos.setBounds(20, 240, 200, 200);
				lmovimientos.setForeground(Color.BLACK);
				lmovimientos.setFont(letra);
				
				habilidad1 = new JLabel("Habilidad 1: ");
				habilidad1.setBounds(20, 270, 200, 200);
				habilidad1.setForeground(Color.BLACK);
				habilidad1.setFont(letra2);
				
				habilidad2 = new JLabel("Habilidad 2: ");
				habilidad2.setBounds(200, 270, 200, 200);
				habilidad2.setForeground(Color.BLACK);
				habilidad2.setFont(letra2);
				
				habilidad3 = new JLabel("Habilidad 3: ");
				habilidad3.setBounds(20, 300, 200, 200);
				habilidad3.setForeground(Color.BLACK);
				habilidad3.setFont(letra2);
				
				habilidad4 = new JLabel("Habilidad 4: ");
				habilidad4.setBounds(200, 300, 200, 200);
				habilidad4.setForeground(Color.BLACK);
				habilidad4.setFont(letra2);
				
				lataque = new JLabel("Ataque: ");
				lataque.setBounds(20, 340, 100, 200);
				lataque.setForeground(Color.BLACK);
				lataque.setFont(letra2);
				
				ldefensa = new JLabel("Defensa: ");
				ldefensa.setBounds(250, 340, 100, 200);
				ldefensa.setForeground(Color.BLACK);
				ldefensa.setFont(letra2);
				
				// Cuadro de Texto
				cnombre = new JTextField();
				cnombre.setBounds(150, 180, 250, 30);
				
				tataque = new JTextField();
				tataque.setBounds(100, 430, 80, 30);
				
				tdefensa = new JTextField();
				tdefensa.setBounds(340, 430, 80, 30);
				
				//ComoBox

				ctipo = new JComboBox();
				ctipo.setBounds(150, 250, 250, 30);
				ctipo.addItem("Agua");
				ctipo.addItem("Fuego");
				ctipo.addItem("Planta");
				ctipo.addItem("Electrico");
				ctipo.addItem("Hielo");
				ctipo.addItem("Tierra");
				ctipo.addItem("Lucha");
				ctipo.addItem("Psiquico");
				
				chabilidad1 = new JComboBox<String>();
				
				chabilidad1.setBounds(100, 360, 100, 30);
				
				chabilidad2 = new JComboBox<String>();
				chabilidad2.setBounds(270, 360, 100, 30);
				
				chabilidad3 = new JComboBox<String>();
				chabilidad3.setBounds(100, 390, 100, 30);
				
				chabilidad4 = new JComboBox<String>();
				chabilidad4.setBounds(270, 390, 100, 30);
				
				
				
				


			
				//BOTONES
				
				imagen4 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonregistrar.png").getImage();
				icon = new ImageIcon(imagen4.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
				bregistrar = new JButton(icon);
				bregistrar.setBounds(117, 500, 265, 65);
				bregistrar.setBorderPainted(false);
				bregistrar.setContentAreaFilled(false);
				
				imagen3 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonsalir.png").getImage();
				icon3 = new ImageIcon(imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				boton2 = new JButton(icon3);
				boton2.setBounds(950, 10, 50, 50);
				boton2.setBorderPainted(false);
				boton2.setContentAreaFilled(false);
				
				imagen5 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonvolver1.png").getImage();
				icon4 = new ImageIcon(imagen5.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
				bvolver = new JButton(icon4);
				bvolver.setBounds(117, 600, 265, 65);
				bvolver.setBorderPainted(false);
				bvolver.setContentAreaFilled(false);
				
				//FONDO
				imagen1 = new ImageIcon("src/co/edu/unbosque/view/imagenes/fondopoke2.png").getImage();
				icon1 = new ImageIcon(imagen1.getScaledInstance(1000, 700, Image.SCALE_DEFAULT));
				foto1 = new JLabel();
				foto1.setBounds(0,0,1000,700);
				foto1.setIcon(icon1);
				
				
				
				//ADD
				foto1.setCursor(cursor1);
				eresultado.setCursor(cursor1);
				foto3.setCursor(cursor1);
				foto4.setCursor(cursor1);
				
				
				add(habilidad1);
				add(habilidad2);
				add(habilidad3);
				add(habilidad4);
				
				
	
				add(eresultado);
				add(chabilidad1);
				add(chabilidad2);
				add(chabilidad3);
				add(chabilidad4);
				add(foto3);
				add(foto4);
				add(bvolver);
				add(boton2);
				add(bregistrar);
				add(lataque);
				add(ldefensa);
				add(tataque);
				add(tdefensa);
				
				add(ltipo);
				add(lmovimientos);
				add(ctipo);
				add(lnombre);
				add(cnombre);
				add(foto1);
				
				setVisible(false);
			}

			public JLabel getLnombre() {
				return lnombre;
			}

			public void setLnombre(JLabel lnombre) {
				this.lnombre = lnombre;
			}

			public JLabel getLtipo() {
				return ltipo;
			}

			public void setLtipo(JLabel ltipo) {
				this.ltipo = ltipo;
			}

			public JLabel getFoto1() {
				return foto1;
			}

			public void setFoto1(JLabel foto1) {
				this.foto1 = foto1;
			}

			public JLabel getLmovimientos() {
				return lmovimientos;
			}

			public void setLmovimientos(JLabel lmovimientos) {
				this.lmovimientos = lmovimientos;
			}

			public JLabel getLataque() {
				return lataque;
			}

			public void setLataque(JLabel lataque) {
				this.lataque = lataque;
			}

			public JLabel getLdefensa() {
				return ldefensa;
			}

			public void setLdefensa(JLabel ldefensa) {
				this.ldefensa = ldefensa;
			}

			public JTextField getCnombre() {
				return cnombre;
			}

			public void setCnombre(JTextField cnombre) {
				this.cnombre = cnombre;
			}

			public JTextField getTataque() {
				return tataque;
			}

			public void setTataque(JTextField tataque) {
				this.tataque = tataque;
			}

			public JTextField getTdefensa() {
				return tdefensa;
			}

			public void setTdefensa(JTextField tdefensa) {
				this.tdefensa = tdefensa;
			}

			public JButton getbBuscar() {
				return bBuscar;
			}

			public void setbBuscar(JButton bBuscar) {
				this.bBuscar = bBuscar;
			}

			public JButton getBregistrar() {
				return bregistrar;
			}

			public void setBregistrar(JButton bregistrar) {
				this.bregistrar = bregistrar;
			}

			public JButton getbEliminar() {
				return bEliminar;
			}

			public void setbEliminar(JButton bEliminar) {
				this.bEliminar = bEliminar;
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

			public JComboBox getCtipo() {
				return ctipo;
			}

			public void setCtipo(JComboBox ctipo) {
				this.ctipo = ctipo;
			}

			public JComboBox getCmovimientos() {
				return cmovimientos;
			}

			public void setCmovimientos(JComboBox cmovimientos) {
				this.cmovimientos = cmovimientos;
			}

			public Image getImagen4() {
				return imagen4;
			}

			public void setImagen4(Image imagen4) {
				this.imagen4 = imagen4;
			}

			public Icon getIcon() {
				return icon;
			}

			public void setIcon(Icon icon) {
				this.icon = icon;
			}

			public JLabel getFoto2() {
				return foto2;
			}

			public void setFoto2(JLabel foto2) {
				this.foto2 = foto2;
			}

			public JButton getBoton2() {
				return boton2;
			}

			public void setBoton2(JButton boton2) {
				this.boton2 = boton2;
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

			public JButton getBvolver() {
				return bvolver;
			}

			public void setBvolver(JButton bvolver) {
				this.bvolver = bvolver;
			}

			public Icon getIcon4() {
				return icon4;
			}

			public void setIcon4(Icon icon4) {
				this.icon4 = icon4;
			}

			public Image getImagen5() {
				return imagen5;
			}

			public void setImagen5(Image imagen5) {
				this.imagen5 = imagen5;
			}

			public JComboBox<String> getChabilidad1() {
				
				
				return chabilidad1;
			}

			public void setChabilidad1(ArrayList<String> m) {
				
				for(int i=0;i<m.size();i++) {
					chabilidad1.addItem(m.get(i));
					
				}
				
				
				this.chabilidad1 = chabilidad1;
			}

			public JComboBox<String> getChabilidad2() {
				return chabilidad2;
			}

			public void setChabilidad2(ArrayList<String> m) {
				for(int i=0;i<m.size();i++) {
					chabilidad2.addItem(m.get(i));
					
				}
				this.chabilidad2 = chabilidad2;
			}

			public JComboBox<String> getChabilidad3() {
				return chabilidad3;
			}

			public void setChabilidad3(ArrayList<String> m) {
				for(int i=0;i<m.size();i++) {
					chabilidad3.addItem(m.get(i));
					
				}
				this.chabilidad3 = chabilidad3;
			}

			public JComboBox<String> getChabilidad4() {
				return chabilidad4;
			}

			public void setChabilidad4(ArrayList<String> m) {
				for(int i=0;i<m.size();i++) {
					chabilidad4.addItem(m.get(i));
					
				}
				this.chabilidad4 = chabilidad4;
			}

			public JLabel getInformacion() {
				return informacion;
			}

			public void setInformacion(JLabel string) {
				this.informacion = string;
			}

			public JTextArea getEresultado() {
				return eresultado;
			}

			public void setEresultado(JTextArea eresultado) {
				this.eresultado = eresultado;
			}
			
			
			
			
		

			
}


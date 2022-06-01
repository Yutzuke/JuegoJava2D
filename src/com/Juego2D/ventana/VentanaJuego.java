package com.Juego2D.ventana;

import javax.swing.JFrame;

public class VentanaJuego {
	private JFrame ventana; // comentarios
	
	//constructor
	
	public VentanaJuego () {
		ventana = new JFrame(); // inastaciar
		
		ventana.setTitle("ventana de juego 2D"); // nombre de la ventana 
		
		ventana.setSize(640, 640); // tamaño de la venta
		
		ventana.setVisible(true);
	}

}

package com.javier.ventana;

import javax.swing.JFrame;

public class VentanaJuego {

	private JFrame ventana; // Atributo de mi clase VentanaJuego, es la caracteristica de algo en la vida
							// real

	// Constructor
	public VentanaJuego() {

		ventana = new JFrame(); // Instanciando o creando el objeto ventana de la clase JFrame

		ventana.setTitle("Ventana de Juego 2D"); // metodo de la clase JFrame que le pone nombre a la ventana

		ventana.setSize(640, 640); // metodo de la clase JFrame que le da un tamaño a una ventana

		ventana.setVisible(true); // metodo de la clase JFrame que hace visible la ventana

	}

}

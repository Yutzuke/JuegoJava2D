package com.javier.ventana; //Definiendo paquete donde se guardara la clase ventana

import javax.swing.JFrame; //Importando la clase Graphics

import com.javier.graficos.Renderizado2D; //Importando la clase Renderizado2D

/**
 * API para el desarrollo de un Juego 2D para aprender
 */

public class Ventana extends JFrame { // Herencia explicita, heredo de la clase JFrame

	public Ventana() { // Constructor por defecto de la clase Ventana

		super("Ventana"); // llamando al constructor de la super clase JFrame

		// this es yo misma
		this.setSize(640, 480); // Metodo que herede de la clase JFrame, que define un tamaño de la Ventana

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Metodo que herede de la clase JFrame, que controla el
																// cierre de la ventana

		Renderizado2D render2D = new Renderizado2D(); // Instansiando objeto de la clase Renderizado2D

		this.add(render2D); // Metodo que herede de la clase JFrame, que añade a un componete grafico

		this.setVisible(true); // metodo que herede de la clase JFrame, que hace visible la ventana

	}

}

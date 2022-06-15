package com.javier.graficos; //Definiendo paquete donde se guradara la clase Renderizado2D

import java.awt.Canvas; //Importando la clase Canvas
import java.awt.Color; //Importando la clase Color
import java.awt.Graphics; //Importando la clase Graphics

public class Renderizado2D extends Canvas {

	public Renderizado2D() {

	}

	// Sobreescribiendo el metodo heredado de la clase Canvas
	@Override
	public void paint(Graphics pincel) {

		pincel.setColor(Color.blue); // Metodo de la clase Graphics, que define un color

		pincel.fillRect(0, 0, 300, 300); // Metodo de la clase Graphics, que pinta un rectangulo relleno

	}

}

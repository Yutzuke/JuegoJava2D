package com.javier.actor; //Definiendo el paquete donde va la clase Actor

import java.awt.image.BufferedImage; //Importanto clase BufferedImage

public class Actor {

	private BufferedImage textura; // atributo de la clase Actor, este atributo es privado,
																// las clase pueden tener objetos como atributos
																// Instanciando objeto de la clase BufferedImage
	public int peso = 45; // creando un atributo publico de tipo entero de la clase Actor
	
	protected float fuerza = 45.45f; // Creando un atributo protegido de tipo decimal o de coma flotante de la clase
										// Actor

	String mensaje = "Actor de Juego"; // Creando atributo libre o por defecto de tipo cadena de la clase Actor
										// Instanciando objeto de la clase String

	public Actor() { // Metodo constructor de la clase Actor sin argumento

	}

	public Actor(int edad) { // Metodo constructor de la clase Actor con un argumento de tipo entero

	}

	public Actor(String nombre) { // Metodo constructor de la clase Actor con un argumento de tipo cadena

	}

	public void disparar() // Creando metodo publico vacio disparar de la clase Actor
	{

	}

	public void comer(String tipoComida) // Creanado metodo publico vacio comer de la clase Actor
	{                                    // metodo que recibe un agumento de tipo cadena

	}

	public int sumar(int a, int b) { // Creanado metodo publico que retona un valor entero sumar de la clase Actor
										// metodo que recibe dos argumentos de tipo entero
		return a + b;

	}

}

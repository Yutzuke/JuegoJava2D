package com.javier.actores.personajes; //Definiendo el paquete donde va la clase Nave

import com.javier.actores.Actor; //Importanto clase Actor

public class Nave extends Actor { // Heredando de la clase Actor

	// El constructor esta sobrecargado igual que el de la clase Actor
	public Nave() { // Constructor de la clase Nave
		super(); // llamando al constructor de la super clase
	}

	public Nave(int edad) { // Constructor de la clase Nave, que recibe un argumento de tipo entero
		super(edad); // llamando al constructor de la super clase

	}

	public Nave(String nombre) { // Constructor de la clase Nave, que recibe un argumento de tipo cadena
		super(nombre);// llamando al constructor de la super clase

	}

}

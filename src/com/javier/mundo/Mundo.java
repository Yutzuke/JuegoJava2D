package com.javier.mundo; //Definiendo paquete donde se guardara la clase Mundo

public class Mundo {

	private String nombre; // Atributo privado de tipo cadena de la clase Mundo

	private int ancho; // Atributo privado de tipo entero de la clase Mundo

	private int alto; // Atributo privado de tipo entero de la clase Mundo

	public Mundo(String nombre) { // Constructor de la clase Mundo que recibe un argumento de tipo cadena

		// la palabra reservada this signfica yo misma, es un objeto implicito de la
		// clase Mundo, es lo mismo que Mundo objeto = new Mundo(); objeto.nombre
		this.nombre = nombre; // Guardando la cadena en el atributo privado nombre

	}

	public int getAncho() { // Metodo publico de la clase Mundo que retorna un entero
		return ancho;
	}

	public void setAncho(int ancho) { // Metodo publico vacio de la clase Mundo que recibe un entero como argumento
		this.ancho = ancho;
	}

	public int getAlto() { // Metodo publico de la clase Mundo que retorna un entero
		return alto;
	}

	public void setAlto(int alto) { // Metodo publico vacio de la clase Mundo que recibe un entero como argumento
		this.alto = alto;
	}

}

package Heur�stica;

import �tiles.MatrizDeJuego;

public class DistanciaManhattan {

	public static int manhattan (NodoAEstrella a, NodoAEstrella b) {
		return Math.abs(a.getX()-b.getX())+ Math.abs(a.getY()-b.getY());
	}
}

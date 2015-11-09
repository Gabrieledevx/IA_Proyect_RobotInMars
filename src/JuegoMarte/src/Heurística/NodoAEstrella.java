package Heur�stica;

/**
 * Esta clase representa un nodo del mapa de celdas del algoritmo del A*.
 * Indica cu�l es su posici�n (x,y) en ese mapa, as� como su valor F, G, H.
 */
public class NodoAEstrella implements Comparable<NodoAEstrella> {
	/** Componente x (columna) de la posici�n del nodo en el mapa. */
	private int x;
	
	/** Componente y (fila) de la posici�n del nodo en el mapa. */
	private int y;
	
	/** Distancia segun algoritmo */
	private int coste;
	private int g;
	private int h;
	private int f;

	/** CONSTRUCTOR */
//	public NodoAEstrella(int x, int y) {
//		this.x = x;
//		this.y = y;
//		this.f = 0;
//		this.g = 0;
//		this.h = 0;
//	}
	
	public NodoAEstrella(int x, int y, int f, int h, int g) {
		this.x = x;
		this.y = y;
		this.f = f;
		this.g = g;
		this.h = h;
	}
	/** GETTERS AND SETTERS */
	public int getG() {
		return g;
	}

	

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}


	
	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equal(NodoAEstrella nodoE) {
		if (this.getX() == nodoE.getX() && this.getY() == nodoE.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	@Override
    public int compareTo(NodoAEstrella nodoT) {
		
		return this.getF()-nodoT.getF();
		
        //int compareage=((NodoAEstrella)nodoT).getCoste();
        /* For Ascending order*/
//		if ( >= nodoT.getCoste()){
//			return this.getCoste();
//			
//		} else {
//			return nodoT.getCoste();
//		}
		

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

	public void setG(int result) {
		this.g = result;
		
	}

	

}

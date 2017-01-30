package domini;

public class JocCercarMines {

	private TaulellCercaMines taulell;
	private boolean fiJoc;

	//constructor que inicialitza els dos atributs.
	public JocCercarMines() {
		//PENDENT IMPLEMENTAR
	}

	/* El jugador vol destapar la casella de coordenades x i y
	 * 1: comprovar que les coordenades pertanyen al taulell del joc
	 * 		Si no hi pertanyen cal informar-ne en el retorn del mètode.
	 * 2: destapar la casella de les coordenades entrades en l'argument
	 * 3: si la casella destapada té una mina cal informar del fet i finalitzar el joc
	 * 4: si la casella destapada no té cap mina, 
	 * 	  si estan totes les caselles sense mina destapadas, informar del fet i finaltzar el joc*/
	public String destaparCasella(int x, int y) {
		//PENDENT IMPLEMENTAR
		return null;
	}

	/* El jugador vol marcar la casella de coordenades x i y com a possible mina
	 * 1: comprovar que les coordenades pertanyen al taulell del joc
	 * 		Si no hi pertanyen cal informar-ne en el retorn del mètode.
	 * 2: marcar com a possible mina la casella de les coordenades entrades en l'argument*/
	public String marcarMina(int x, int y) {
		//PENDENT IMPLEMENTAR
		return null;
	}

	/* El jugador vol desmarcar la casella com a possible mina de coordenades x i y 
	 * 1: comprovar que les coordenades pertanyen al taulell del joc
	 * 		Si no hi pertanyen cal informar-ne en el retorn del mètode.
	 * 2: desmarcar com a possible mina la casella de les coordenades entrades en l'argument*/	
	public String desmarcarMina(int x, int y) {
		//PENDENT IMPLEMENTAR
		return null;
	}

	//retorna fiJoc
	public boolean esFiJoc() {
		//PENDENT IMPLEMENTAR
		return false;
	}

	/*Retorna el taulell en una matriu de String*/
	public String[][] veureTaulell() {
		//PENDENT IMPLEMENTAR
		return null;
	}

	/*Si els arguments x o y no pertanyen al taulell del joc retorna
	 * un String informant de l'error, altrament retorna null */
	private String validarCoordenades(int x, int y) {
		//PENDENT IMPLEMENTAR
		return null;
	}

	/* Comprova si tot el taulell està destapat, en cas
	 * afirmatiu retorna que el jugador ha guanyat,
	 * i marca el final del joc, altrament retorna nul.*/
	private String estaTotElTaulellDestapat() {
		//PENDENT IMPLEMENTAR
		return null;
	}
}
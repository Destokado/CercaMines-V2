package domini;

public class JocCercarMines {

	private TaulellCercaMines taulell;
	private boolean fiJoc;

	//constructor que inicialitza els dos atributs.
	public JocCercarMines() {
		//PENDENT IMPLEMENTAR
		taulell = new TaulellCercaMines();
		fiJoc = false;
	}

	/* El jugador vol destapar la casella de coordenades x i y, 
	 * 1: comprovar que les coordenades pertanyen al taulell del joc (mètode privat validarCoordenades())
	 * 		Si no hi pertanyen cal informar-ne en el retorn del mètode.
	 * 2: destapar la casella de les coordenades entrades en l'argument (mètode de l'atribut taulell)
	 * 3: si la casella destapada té una mina (mètode de l'atribut taulell) cal informar del fet i finalitzar el joc
	 * 4: si la casella destapada no té cap mina, 
	 * 	  comprovar si totes les caselles sense mina estan destapadas (mètode privat estaTotElTaulellDestapat()),
	 *    si és així cal informar del fet i finaltzar el joc*/
	public String destaparCasella(int x, int y) {
		//PENDENT IMPLEMENTAR
		String coordenadesValides = validarCoordenades(x,y);
		String taulellDestapat;
		if(coordenadesValides != null)
		{
			return coordenadesValides;
		}
		else
		{
			taulell.destapar(x, y);
			if(taulell.hiHaMina(x, y))
			{
				fiJoc = true;
				return "HAS DESTAPAT UNA MINA, HAS PERDUT!";
			}
			else
			{
				taulellDestapat = estaTotElTaulellDestapat();
				if(taulellDestapat != null)
				{
					return taulellDestapat;
				}
			}
		}
		return "Casella " + (x+1) + " , "+(y+1)+" destapada";
	}

	/* El jugador vol marcar la casella de coordenades x i y com a possible mina
	 * 1: comprovar que les coordenades pertanyen al taulell del joc  (mètode privat validarCoordenades())
	 * 		Si no hi pertanyen cal informar-ne en el retorn del mètode.
	 * 2: marcar com a possible mina la casella de les coordenades entrades en l'argument  (mètode de l'atribut taulell)*/
	public String marcarMina(int x, int y) {
		//PENDENT IMPLEMENTAR
		String coordenadesValides = validarCoordenades(x, y);
		if(coordenadesValides == null)
		{
			taulell.marcarMina(x, y);
			return "Casella " + (x+1) + " , "+(y+1)+" marcada com a possible mina";
		}

		return coordenadesValides;

	}

	/* El jugador vol desmarcar la casella com a possible mina de coordenades x i y 
	 * 1: comprovar que les coordenades pertanyen al taulell del joc (mètode privat validarCoordenades())
	 * 		Si no hi pertanyen cal informar-ne en el retorn del mètode.
	 * 2: desmarcar com a possible mina la casella de les coordenades entrades en l'argument (mètode de l'atribut taulell)*/	
	public String desmarcarMina(int x, int y) {
		//PENDENT IMPLEMENTAR
		String coordenadesValides = validarCoordenades(x, y);
		if(coordenadesValides == null)
		{
			taulell.desmarcarMina(x, y);
			return "Casella " + (x+1) + " , "+ (y+1) +" desmarcada com a possible mina";
		}

		return coordenadesValides;
	}

	//retorna fiJoc
	public boolean esFiJoc() {
		//PENDENT IMPLEMENTAR

			return fiJoc;
	}

	//retorna tot el taulell en una matriu de String (mètode de l'atribut taulell)
	public String [][] veureTaulell() {
		//PENDENT IMPLEMENTAR
    	return taulell.veureTaulell();
	}

	/*Si els arguments x o y no pertanyen al taulell del joc retorna
	 * un String informant de l'error, altrament retorna nul */
	private String validarCoordenades(int x, int y) {
		//PENDENT IMPLEMENTAR
		if(x >= 0 && x < taulell.getFiles() && y >= 0 && y < taulell.getColumnes())
		{
			return null;
		}
		else
		{
			return "Coordenades incorrectes";
		}
	}

	/* Comprova si tot el taulell està destapat (mètode de l'atribut taulell), 
	 * en cas afirmatiu retorna que el jugador ha guanyat,
	 * i marca el final del joc, altrament retorna nul.*/
	private String estaTotElTaulellDestapat() {
		//PENDENT IMPLEMENTAR
		if(taulell.estaTotElTaulellDestapat())
		{
			fiJoc = true;
			return "FELICITATS! HAS GUANYAT!!";
			
		}
		else
		{
			return null;
		}
	}
}
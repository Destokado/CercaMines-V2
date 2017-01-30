package presentacio;

import domini.JocCercarMines;
import jconsole.JConsole;

public class IniciJoc {

	private JocCercarMines joc;
	private JConsole console;

	public static void main(String[] args) {
		new IniciJoc();
	}

	/* 1: crear una consola
	 * 2: crear un controlador del joc
	 * 3: mostrar el taulell tot tapat (amb ?)
	 * 4: Mentre el jugado no entri -1 i el joc no finalitzi fer:
	 * 	4.1: llegir entrada de la consola
	 * 	4.2: validar i executar l'entrada
	 * 	4.3: mostrar resultat de l'acció
	 * 	4.4: mostrar l'estat del taulell després de l'acció*/
	private IniciJoc() {
		//PENDENT IMPLEMENTAR
	}
	
	/* Validar l'entrada que ha fet el jugador:
	 * 1: Validar que l'entrada té 3 valors separts per coma
	 * 	Si no és correcte informar de l'error i tornar a demanar entrada
	 * 2: convertir la fila i la columna de text a enter
	 * 	Si no és correcte informar de l'error i tornar a demanar entrada
	 * 3: transformar coordenades de 1..10 a 0..9
	 * 4: validar tipus acció, ha de ser d, m o e
	 * 	Si no és correcte informar de l'error i tornar a demanar entrada
	 * 5: Fer que el joc realitzi l'acció i retornar el resultat de l'executar-la.*/
	private String validarExecutarEntrada(String entrada) {
		//PENDENT IMPLEMENTAR
		return null;
	}
	
	//Retorna cert si la cadena és un enter i fals altrament
    private boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
    
  //Mostrar el taulell a la consola de sortida.
    private void veureTaulell() {
    	String [][] taulell = joc.veureTaulell();
    	for (int fila = 0; fila < taulell.length; fila++){
    		for (int columna = 0 ; columna < taulell[0].length; columna++){
    			if (taulell [fila][columna].equals("")) {
    				console.print ("?\t");    				
    			} else {
    				console.print (taulell [fila][columna] + "\t");
    			}
    		}
    		console.println();
    	}
    }
}
package domini;

public class Coordenada {//cada objecta representarà una coordenada del taulell

	private int fila;//número de la fila dins el taulell (0..9)
	private int columna;//número de la columna dins el taulell (0..9)

	public Coordenada(int fila, int columna) {
		
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		
		
		
		return this.fila;
	}

	public int getColumna() {
	
		return this.columna;
	}
	
	/*Una casella depenent la seva situació en el taulell, pot tenir 3, 5 o 8 veins.
	 * Aquest mètode retorna en un array les coordenades  veines a l'objecte actual.
	 * Cal tenir en compte que una coordenada no és veina de si mateixa.*/
	public Coordenada [] cercarCoordenadesVeines() {
		//PENDENT IMPLEMENTAR
		
		//EL nombre de veins marca la dimensió de l'array.
		Coordenada[] veines;
		int casella = 0;
		int veins = 0;
		if(fila%TaulellCercaMines.getFiles() == 0 && columna%TaulellCercaMines.getColumnes() == 0)
			veins = 3;
		else if (fila%TaulellCercaMines.getFiles() == 0 || columna%TaulellCercaMines.getColumnes() == 0)
			veins = 5;
		else
			veins = 8;

		veines = new Coordenada [veins];
			
		for(int f = -1; f<=1; f++)
		{
			for(int c = -1; c<=1;c++)
			{
				if(f>=0 && f<TaulellCercaMines.getFiles() && c>=0 && c<TaulellCercaMines.getColumnes())
				{
					if(!(f == 0 && c == 0))
					{
						veines[casella] =  new Coordenada(fila +f,columna +c);
						casella++;
					}
				}
			}	
		}
		
		return veines;	
			
	}
}
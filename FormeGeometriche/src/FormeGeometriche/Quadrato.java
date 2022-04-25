package FormeGeometriche;
public class Quadrato extends FormeGeometriche {

	     //ATTRIBUTI
	   public double DimensioneLato;

	 
	   //COSTRUTTORI
	   
	   @Override
		public String toString() {
			return "Quadrato [DimensioneLato=" + DimensioneLato + "]";
		}

	
	public Quadrato(String nomeFigure, int numLati, String colore, double dimensioneLato) {
		super(nomeFigure, numLati, colore);
		DimensioneLato = dimensioneLato;
	}

	//METODI
	
	@Override
	public double perimetro() {
		return 4*DimensioneLato;
	}


	@Override
	public double area() {
		return DimensioneLato*DimensioneLato;
	}
	
}


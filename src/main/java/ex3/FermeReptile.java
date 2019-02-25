package ex3;

/** Représente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {

	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	private static final double MASSE_NOURRITURE = 0.1;

	public FermeReptile(Animal animal) {
		super(animal);
	}
	
	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

}

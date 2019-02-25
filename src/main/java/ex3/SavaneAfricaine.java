package ex3;

public class SavaneAfricaine extends Zone{

	/** MASSE_MOYENNE : double */
	private static final double MASSE_MOYENNE = 10.0;

	public SavaneAfricaine(Animal animal){
		super(animal);
	}

	@Override
	public double getPoids() {
		return MASSE_MOYENNE;
	}
}

package ex3;

public class ZoneCarnivore extends Zone{

	private static final int MAX_POIDS = 10;
	
	public ZoneCarnivore(Animal animal){
		super(animal);
	}
	
	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return MAX_POIDS;
	}
}

package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected List<Animal> animaux = new ArrayList<Animal>();
	
	public Zone(){
	}
	
	public Zone(Animal animal){
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for(int i = 0; i < animaux.size(); i++){
			System.out.println(animaux.get(i).getNom());
		}
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * getPoids();
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	public void setAnimaux(Animal animal){
		this.animaux.add(animal);
	}
}

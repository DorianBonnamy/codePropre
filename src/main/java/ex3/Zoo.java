package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	
	private List<Zone> zones;
	
	public Zoo(){
		zones = new ArrayList<Zone>();
	}
	
	public Zoo(String nom){
		this.nom = nom;
		zones = new ArrayList<Zone>();
	}
	
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			zones.add(new ZoneCarnivore(new Animal(typeAnimal, nomAnimal, comportement)));
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			zones.add(new SavaneAfricaine(new Animal(typeAnimal, nomAnimal, comportement)));
		}
		else if (typeAnimal.equals("REPTILE")){
			zones.add(new FermeReptile(new Animal(typeAnimal, nomAnimal, comportement)));
		}
		else if (typeAnimal.equals("POISSON")){
			zones.add(new Aquarium(new Animal(typeAnimal, nomAnimal, comportement)));
		}
	}
	
	public void afficherListeAnimaux(){
		for(int i = 0; i < zones.size(); i++){
			zones.get(i).afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

package Zoo_Package;

import java.util.HashSet;

public class Zoologico {

	private String nombreZoo="";
	private final Integer CAPACIDAD_MAX_POR_TIPO_ALIMENTACION=10;
	private HashSet <AnimalCarnivoro> listaAnimalesCarnivoros;
	
	
	public Zoologico(String nombreZoo) {
		this.nombreZoo=nombreZoo;
		listaAnimalesCarnivoros=new HashSet<AnimalCarnivoro>();
	}

	
	
	public String getNombreZoo() {
		return nombreZoo;
	}



	public void setNombreZoo(String nombreZoo) {
		this.nombreZoo = nombreZoo;
	}



	public HashSet<AnimalCarnivoro> getListaAnimalesCarnivoros() {
		return listaAnimalesCarnivoros;
	}



	public void setListaAnimalesCarnivoros(HashSet<AnimalCarnivoro> listaAnimalesCarnivoros) {
		this.listaAnimalesCarnivoros = listaAnimalesCarnivoros;
	}



	public void agregarAnimalCarnivoro(AnimalCarnivoro nuevoAnimalCarnivoro) {
		
		if (listaAnimalesCarnivoros.size()<CAPACIDAD_MAX_POR_TIPO_ALIMENTACION){
			listaAnimalesCarnivoros.add(nuevoAnimalCarnivoro);	
		}
		
	}

}

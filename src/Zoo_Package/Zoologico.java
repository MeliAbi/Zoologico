package Zoo_Package;

import java.util.HashSet;

public class Zoologico {

	private String nombreZoo="";
	private final Integer CAPACIDAD_MAX_POR_TIPO_ALIMENTACION=10;
	private final Integer CAPACIDAD_MAX_POR_EMPLEADO=4;
	private HashSet <AnimalCarnivoro> listaAnimalesCarnivoros;
	private HashSet <AnimalHerbivoro> listaAnimalesHerbivoros;
	private HashSet <AnimalOmnivoro> listaAnimalesOmnivoros;
	private HashSet <Planta> listaPlantas;
	private HashSet <Jardinero> listaJardineros;
	private HashSet <Veterinario> listaVeterinarios;
	
	
	public Zoologico(String nombreZoo) {
		this.nombreZoo=nombreZoo;
		listaAnimalesCarnivoros=new HashSet<AnimalCarnivoro>();
		listaAnimalesHerbivoros=new HashSet<AnimalHerbivoro>();
		listaAnimalesOmnivoros=new HashSet<AnimalOmnivoro>();
		listaPlantas=new HashSet<Planta>();
		
		listaJardineros=new HashSet<Jardinero>();
		listaVeterinarios=new HashSet<Veterinario>();
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



	public HashSet<AnimalHerbivoro> getListaAnimalesHerbivoros() {
		return listaAnimalesHerbivoros;
	}



	public void setListaAnimalesHerbivoros(HashSet<AnimalHerbivoro> listaAnimalesHerbivoros) {
		this.listaAnimalesHerbivoros = listaAnimalesHerbivoros;
	}



	
	public HashSet<AnimalOmnivoro> getListaAnimalesOmnivoros() {
		return listaAnimalesOmnivoros;
	}



	public void setListaAnimalesOmnivoros(HashSet<AnimalOmnivoro> listaAnimalesOmnivoros) {
		this.listaAnimalesOmnivoros = listaAnimalesOmnivoros;
	}


	

	public HashSet<Planta> getListaPlantas() {
		return listaPlantas;
	}



	public void setListaPlantas(HashSet<Planta> listaPlantas) {
		this.listaPlantas = listaPlantas;
	}



	public void agregarAnimalCarnivoro(AnimalCarnivoro nuevoAnimalCarnivoro) {
		
		if (listaAnimalesCarnivoros.size()<CAPACIDAD_MAX_POR_TIPO_ALIMENTACION&&(nuevoAnimalCarnivoro.getEspecie()==Especie.Leon||nuevoAnimalCarnivoro.getEspecie()==Especie.Tigre||nuevoAnimalCarnivoro.getEspecie()==Especie.Hiena)){
			listaAnimalesCarnivoros.add(nuevoAnimalCarnivoro);	
		}
		
	}

	public void agregarAnimalHerbivoro(AnimalHerbivoro nuevoAnimalHerbivoro) {

		if (listaAnimalesHerbivoros.size()<CAPACIDAD_MAX_POR_TIPO_ALIMENTACION&&(nuevoAnimalHerbivoro.getEspecie()==Especie.Ciervo||nuevoAnimalHerbivoro.getEspecie()==Especie.Elefante||nuevoAnimalHerbivoro.getEspecie()==Especie.Jirafa)){
			listaAnimalesHerbivoros.add(nuevoAnimalHerbivoro);
		}
		
	}



	public void agregarAnimalOmnivoro(AnimalOmnivoro nuevoAnimalOmnivoro) {
		if (listaAnimalesOmnivoros.size()<CAPACIDAD_MAX_POR_TIPO_ALIMENTACION&&(nuevoAnimalOmnivoro.getEspecie()==Especie.Cerdo||nuevoAnimalOmnivoro.getEspecie()==Especie.Oso||nuevoAnimalOmnivoro.getEspecie()==Especie.Gallina)){
			listaAnimalesOmnivoros.add(nuevoAnimalOmnivoro);
		}
		
	}


	public void agregarPlanta(Planta nuevaPlanta) {
		if (listaPlantas.size()<CAPACIDAD_MAX_POR_TIPO_ALIMENTACION&&(nuevaPlanta.getEspecie()==Especie.Alga||nuevaPlanta.getEspecie()==Especie.Petunia||nuevaPlanta.getEspecie()==Especie.Helecho)){
			listaPlantas.add(nuevaPlanta);
		}
	}



	public void agregarJadinero(Jardinero nuevoJadinero) {
		
		if(listaJardineros.size()< CAPACIDAD_MAX_POR_EMPLEADO){
			listaJardineros.add(nuevoJadinero);
		}
	}



	public HashSet<Jardinero> getListaJardineros() {
		return listaJardineros;
	}



	public void setListaJardineros(HashSet<Jardinero> listaJardineros) {
		this.listaJardineros = listaJardineros;
	}

	

	public HashSet<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}



	public void setListaVeterinarios(HashSet<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}



	public void agregarVeterinario(Veterinario nuevoVeterinario) {
		if(listaVeterinarios.size()< CAPACIDAD_MAX_POR_EMPLEADO){
			listaVeterinarios.add(nuevoVeterinario);
		}
		
	}

	public AnimalHerbivoro buscarAnimalHerbivoro(Integer idAnimal) {
		
		for(AnimalHerbivoro animal : listaAnimalesHerbivoros){
			
			if(idAnimal == animal.getIdAnimal()) {
				return animal;
			}
		}
		return null;
		
	}


}

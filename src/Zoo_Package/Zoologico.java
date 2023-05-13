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
		if (listaPlantas.size()<CAPACIDAD_MAX_POR_TIPO_ALIMENTACION&&(nuevaPlanta.getEspecie()==Especie.Petunia||nuevaPlanta.getEspecie()==Especie.Helecho)){
			listaPlantas.add(nuevaPlanta);
		}
	}



	public void agregarJardinero(Jardinero nuevoJadinero) {
		
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
		for(AnimalHerbivoro animalBuscado:listaAnimalesHerbivoros) {
			if(animalBuscado.getIdAnimal()==idAnimal) {
				return animalBuscado;
			}
		}
		return null;
	}
	
	public AnimalCarnivoro buscarAnimalCarnivoro(Integer idAnimal) {
		
		for(AnimalCarnivoro animalBuscado:listaAnimalesCarnivoros) {
			if(animalBuscado.getIdAnimal()==idAnimal) {
				return animalBuscado;
			}
		}
		
		return null;
	}
	
	public AnimalOmnivoro buscarAnimalOmnivoro(Integer idAnimal) {
		for(AnimalOmnivoro animalBuscado:listaAnimalesOmnivoros) {
			if(animalBuscado.getIdAnimal()==idAnimal) {
				return animalBuscado;
			}
		}
		return null;
	}


	public Planta buscarPlanta(Integer idPlanta) {
		for(Planta plantaBuscada:listaPlantas) {
			if(plantaBuscada.getIdPlanta()==idPlanta) {
				return plantaBuscada;
			}
		}
		return null;
	}


	public Boolean liberarAnimal(Integer idAnimal, Especie especie) {
		
		if(especie.equals(Especie.Ciervo)||especie.equals(Especie.Elefante)||especie.equals(Especie.Jirafa)) {
			for(AnimalHerbivoro animalHerbivoroALiberar:listaAnimalesHerbivoros) {
				if(animalHerbivoroALiberar.getIdAnimal()==idAnimal) {
					this.listaAnimalesHerbivoros.remove(animalHerbivoroALiberar);
					return true;
				}
			}
		}
		
		if(especie.equals(Especie.Leon)||especie.equals(Especie.Tigre)||especie.equals(Especie.Hiena)) {
			for(AnimalCarnivoro animalCarnivoroALiberar:listaAnimalesCarnivoros) {
				if(animalCarnivoroALiberar.getIdAnimal()==idAnimal) {
					this.listaAnimalesCarnivoros.remove(animalCarnivoroALiberar);
					return true;
				}
			}
		}
		if(especie.equals(Especie.Oso)||especie.equals(Especie.Gallina)||especie.equals(Especie.Cerdo)) {
			for(AnimalOmnivoro animalOmnivoroALiberar:listaAnimalesOmnivoros) {
				if(animalOmnivoroALiberar.getIdAnimal()==idAnimal) {
					this.listaAnimalesOmnivoros.remove(animalOmnivoroALiberar);
					return true;
				}
			}
		}
		
		return false;
		
	}
}

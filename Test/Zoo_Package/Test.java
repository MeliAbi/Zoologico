package Zoo_Package;

import static org.junit.Assert.*;

public class Test {
	@org.junit.Test
	public void queSeCreeZoologico() {
		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		assertNotNull(nuevoZoologico);
	}

	@org.junit.Test
	public void queSeCreePersona() {
		String nombrePersona = "Pedro", apellidoPersona = "Pascal";
		Integer dniPersona = 42952902;
		Persona nuevaPersona = new Persona(nombrePersona, apellidoPersona, dniPersona);
		assertNotNull(nuevaPersona);
	}

	@org.junit.Test
	public void queSeCreeSerAnimalCarnivoro() {
		String especie = "Felino";
		Boolean esMarino = false;
		Integer idSector = 123;
		Boolean estaEnCuidados=false;
		Integer idAnimal = 0; 
		Boolean fueAlimentado=false;
		

		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
		
		
		assertNotNull(nuevoAnimalCarnivoro);
	}

	@org.junit.Test
	public void queSeAgregueAnimalAlZoologico() {
		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		
		String especie = "Felino";
		Boolean esMarino = false;
		Integer idSector = 123;
		Boolean estaEnCuidados=false;
		Integer idAnimal = 0; 
		Boolean fueAlimentado=false;
		

		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
		
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		
		assertNotNull(nuevoZoologico.getListaAnimalesCarnivoros());
		
	}
}
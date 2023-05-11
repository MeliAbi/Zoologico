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
	public void queSeCreeAnimalCarnivoro() {

		// Inicializacion de Variables

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		// Se crea animal carnivoro
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, esMarino, idSector, estaEnCuidados,
				idAnimal, fueAlimentado);

		// Validación
		assertNotNull(nuevoAnimalCarnivoro);
	}

	@org.junit.Test
	public void queSeAgregueAnimalCarnivoroAlZoologico() {
		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, esMarino, idSector, estaEnCuidados,
				idAnimal, fueAlimentado);

		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);

		assertNotNull(nuevoZoologico.getListaAnimalesCarnivoros());

	}

	@org.junit.Test
	public void queSeCreeAnimalHerviboro() {

		// Inicializacion de Variables

		Especie especie = Especie.Leon;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		// Se crea animal Herbivoro
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados,
				idAnimal, fueAlimentado);

		// Validación
		assertNotNull(nuevoAnimalHerbivoro);
	}

	@org.junit.Test
	public void queSeAgregueAnimalHerbivoroAlZoologico() {
		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados,
				idAnimal, fueAlimentado);
		
		
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);

		assertEquals(1,nuevoZoologico.getListaAnimalesHerbivoros().size());

	}

	@org.junit.Test
	public void queSeCreeAnimalOmnivoro() {

		// Inicializacion de Variables

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		// Se crea animal carnivoro
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal,
				fueAlimentado);

		// Validación
		assertNotNull(nuevoAnimalOmnivoro);
	}

	@org.junit.Test
	public void queSeAgregueAnimalOmnivoroAlZoologico() {
		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal,
				fueAlimentado);

		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);

		assertNotNull(nuevoZoologico.getListaAnimalesOmnivoros());

	}

	@org.junit.Test
	public void queSeCreeUnaPlanta() {

		Especie especie = Especie.Alga;
		Boolean esMarino = true, fueRegada = false, fuePodada = false;
		Integer idSector = 123;

		Planta nuevaPlanta = new Planta(especie, esMarino, idSector, fueRegada, fuePodada);

		assertNotNull(nuevaPlanta);
	}

	@org.junit.Test
	public void queSeAgreguePlantaAlZoologico() {

		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);

		Especie especie = Especie.Alga;
		Boolean esMarino = true, fueRegada = false, fuePodada = false;
		Integer idSector = 123;

		Planta nuevaPlanta = new Planta(especie, esMarino, idSector, fueRegada, fuePodada);

		nuevoZoologico.agregarPlanta(nuevaPlanta);

		assertNotNull(nuevoZoologico.getListaPlantas());
	}

	
	/*
	 * @org.junit.Test public void queSeCreePersona() { String nombrePersona =
	 * "Pedro", apellidoPersona = "Pascal"; Integer dniPersona = 42952902; Persona
	 * nuevaPersona = new Persona(nombrePersona, apellidoPersona, dniPersona);
	 * assertNotNull(nuevaPersona); }
	 */
	
}
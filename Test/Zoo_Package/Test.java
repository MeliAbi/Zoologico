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

		Especie especie = Especie.Leon;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, esMarino, idSector, estaEnCuidados,
				idAnimal, fueAlimentado);

		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);

		assertEquals(1,nuevoZoologico.getListaAnimalesCarnivoros().size());

	}

	@org.junit.Test
	public void queSeCreeAnimalHerviboro() {

		// Inicializacion de Variables

		Especie especie = Especie.Elefante;
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

		Especie especie = Especie.Oso;
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

		Especie especie = Especie.Oso;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal,
				fueAlimentado);

		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);

		assertEquals(1,nuevoZoologico.getListaAnimalesOmnivoros().size());

	}

	@org.junit.Test
	public void queSeCreeUnaPlanta() {

		Especie especie = Especie.Alga;
		Boolean esMarino = true, fueRegada = false, fuePodada = false;
		Integer idSector = 123;
		Integer idPlanta = 123;

		Planta nuevaPlanta = new Planta(especie, esMarino, idSector, fueRegada, fuePodada, idPlanta);

		assertNotNull(nuevaPlanta);
	}

	@org.junit.Test
	public void queSeAgreguePlantaAlZoologico() {

		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);

		Especie especie = Especie.Alga;
		Boolean esMarino = true, fueRegada = false, fuePodada = false;
		Integer idSector = 123;
		Integer idPlanta = 123;

		Planta nuevaPlanta = new Planta(especie, esMarino, idSector, fueRegada, fuePodada,idPlanta);

		nuevoZoologico.agregarPlanta(nuevaPlanta);

		assertEquals(1,nuevoZoologico.getListaPlantas().size());
	}
	
	@org.junit.Test
	public void queSeCreeJardinero() {

		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Integer idSector = 8;

		Jardinero nuevoJadinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSector);

		assertNotNull(nuevoJadinero);
	}

	@org.junit.Test
	public void queSeAgregueJardinero() {

		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Integer idSector = 8;

		Jardinero nuevoJadinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSector);
		
		nuevoZoologico.agregarJadinero(nuevoJadinero);
		assertEquals(1,nuevoZoologico.getListaJardineros().size());
		
	}
	
	@org.junit.Test
	public void queSeCreeVeterinario() {

		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Integer idSector = 8;

		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSector);

		assertNotNull(nuevoVeterinario);
	}

	@org.junit.Test
	public void queSeAgregueVeterinario() {

		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Integer idSector = 8;

		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSector);

		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		assertEquals(1,nuevoZoologico.getListaVeterinarios().size());
		
	}
	
	@org.junit.Test
	public void queAnimalHerbivoroComa() {
		// Inicializacion de Variables
		String nombreZoo = "";
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
	

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idSector = 123, idAnimal = 0;

		// Se crea animal Herbivoro
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados,
				idAnimal, fueAlimentado);

		
	}
	
	
}
package Zoo_Package;

import static org.junit.Assert.*;

public class Test {
	
	//////////////CREACION DE OBJETO DE TIPO ZOOLOGICO//////////////
	
	@org.junit.Test
	public void queSeCreeZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "";
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		
		// Validación del Test
		assertNotNull(nuevoZoologico);
		
	}
	
	//////////////CREACION DE OBJETOS DE TIPO SER VIVO//////////////
	
	@org.junit.Test
	public void queSeCreeAnimalCarnivoro() {

		// Inicializacion de Variables
		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;

		// Creacion de Objeto/s
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Validación del Test
		assertNotNull(nuevoAnimalCarnivoro);
	}
	
	@org.junit.Test
	public void queSeCreeAnimalHerbivoro() {

		// Inicializacion de Variables
		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;

		// Creacion de Objeto/s
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Validación del Test
		assertNotNull(nuevoAnimalHerbivoro);
	}
	
	@org.junit.Test
	public void queSeCreeAnimalOmnivoro() {

		// Inicializacion de Variables
		Especie especie = Especie.Oso;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;

		// Creacion de Objeto/s
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Validación del Test
		assertNotNull(nuevoAnimalOmnivoro);
	}
	
	@org.junit.Test
	public void queSeCreeUnaPlanta() {
		
		// Inicializacion de Variables
		Especie especie = Especie.Alga;
		Boolean esMarino = true, fueRegada = false, fuePodada = false;
		Sector idSector = Sector.Sector_1;
		Integer idPlanta = 123;

		// Creacion de Objeto/s
		Planta nuevaPlanta = new Planta(especie, esMarino, idSector, fueRegada, fuePodada, idPlanta);
		
		// Validación del Test
		assertNotNull(nuevaPlanta);
	}
	
	//////////////CREACION DE OBJETOS DE TIPO EMPLEADO//////////////
	
	@org.junit.Test
	public void queSeCreeJardinero() {

		// Inicializacion de Variables
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Sector idSectorEmpleado= Sector.Sector_1;

		// Creacion de Objeto/s
		Jardinero nuevoJadinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		// Validación del Test
		assertNotNull(nuevoJadinero);
	}
	
	@org.junit.Test
	public void queSeCreeVeterinario() {

		// Inicializacion de Variables
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Sector idSectorEmpleado= Sector.Sector_1;

		// Creacion de Objeto/s
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		// Validación del Test
		assertNotNull(nuevoVeterinario);
	}
	
	//////////////AGREGADO DE OBJETOS DE TIPO SERVIVO Y EMPLEADO AL ZOOLOGICO//////////////
	
	@org.junit.Test
	public void queSeAgregueAnimalCarnivoroAlZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "";
		
		Especie especie = Especie.Leon;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 14;
		Sector idSector = Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesCarnivoros().size());

	}

	@org.junit.Test
	public void queSeAgregueAnimalHerbivoroAlZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "";

		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 12;
		Sector idSector = Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);

		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesHerbivoros().size());

	}

	@org.junit.Test
	public void queSeAgregueAnimalOmnivoroAlZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "";

		Especie especie = Especie.Oso;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesOmnivoros().size());

	}

	@org.junit.Test
	public void queSeAgreguePlantaAlZoologico() {

		// Inicializacion de Variables
		String nombreZoo = "";

		Especie especie = Especie.Alga;
		Boolean esMarino = true, fueRegada = false, fuePodada = false;
		Sector idSector = Sector.Sector_1;
		Integer idPlanta = 123;

		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, esMarino, idSector, fueRegada, fuePodada,idPlanta);

		// Metodos del Nuevo Test
		nuevoZoologico.agregarPlanta(nuevaPlanta);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaPlantas().size());
	}
	
	@org.junit.Test
	public void queSeAgregueJardinero() {
		
		// Inicializacion de Variables
		String nombreZoo = "";
		
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Sector idSectorEmpleado= Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Jardinero nuevoJadinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarJadinero(nuevoJadinero);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaJardineros().size());
		
	}
	
	@org.junit.Test
	public void queSeAgregueVeterinario() {

		// Inicializacion de Variables
		String nombreZoo = "";
		
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Sector idSectorEmpleado= Sector.Sector_1;

		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaVeterinarios().size());
		
	}
	
	//////////////TESTS DE ALIMENTACION//////////////
	
	@org.junit.Test
	public void queElVeterinarioLeDeComidaAlAnimalHerbivoroYEsteComa() {
		// Inicializacion de Variables
		
		String nombreZoo = "";
		
		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector=Sector.Sector_1;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_1;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Lechuga;
		
		Boolean valorEsperado=nuevoVeterinario.alimentarAnimalHerbivoro(nuevoAnimalHerbivoro,alimentoAIngerir);
		
		//Validacion del Test
		assertTrue(valorEsperado);
	}
	
	@org.junit.Test
	public void queElVeterinarioLeDeCarneAlAnimalHerbivoroYEsteNoComa() {
		// Inicializacion de Variables
		
		String nombreZoo = "";
		
		Especie especie = Especie.Elefante;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector=Sector.Sector_1;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_1;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Carne;
		
		Boolean valorEsperado=nuevoVeterinario.alimentarAnimalHerbivoro(nuevoAnimalHerbivoro,alimentoAIngerir);
		
		//Validacion del Test
		assertFalse(valorEsperado);
	}
	
	@org.junit.Test
	public void queElVeterinarioLeDeComidaAlAnimalCarnivoroYEsteComa() {
		// Inicializacion de Variables
		
		String nombreZoo = "";
		
		Especie especie = Especie.Tigre;
		Boolean esMarino = false, estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 86;
		Sector idSector=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_2;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, esMarino, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Carne;
		
		Boolean valorEsperado=nuevoVeterinario.alimentarAnimalCarnivoro(nuevoAnimalCarnivoro,alimentoAIngerir);
		
		//Validacion del Test
		assertTrue(valorEsperado);
	}
	
	
	
}
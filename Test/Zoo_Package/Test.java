package Zoo_Package;

import static org.junit.Assert.*;

public class Test {
	
	//////////////CREACION DE OBJETO DE TIPO ZOOLOGICO//////////////
	
	@org.junit.Test
	public void queSeCreeZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
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
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;

		// Creacion de Objeto/s
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Validación del Test
		assertNotNull(nuevoAnimalCarnivoro);
	}
	
	@org.junit.Test
	public void queSeCreeAnimalHerbivoro() {

		// Inicializacion de Variables
		Especie especie = Especie.Elefante;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;

		// Creacion de Objeto/s
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Validación del Test
		assertNotNull(nuevoAnimalHerbivoro);
	}
	
	@org.junit.Test
	public void queSeCreeAnimalOmnivoro() {

		// Inicializacion de Variables
		Especie especie = Especie.Oso;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;

		// Creacion de Objeto/s
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Validación del Test
		assertNotNull(nuevoAnimalOmnivoro);
	}
	
	@org.junit.Test
	public void queSeCreeUnaPlanta() {
		
		// Inicializacion de Variables
		Especie especie = Especie.Petunia;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_1;
		Integer idPlanta = 123;

		// Creacion de Objeto/s
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada, idPlanta);
		
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
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Leon;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 14;
		Sector idSector = Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesCarnivoros().size());

	}

	@org.junit.Test
	public void queSeAgregueAnimalHerbivoroAlZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";

		Especie especie = Especie.Elefante;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 12;
		Sector idSector = Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);

		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesHerbivoros().size());

	}

	@org.junit.Test
	public void queSeAgregueAnimalOmnivoroAlZoologico() {
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";

		Especie especie = Especie.Oso;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector = Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);

		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesOmnivoros().size());

	}

	@org.junit.Test
	public void queSeAgreguePlantaAlZoologico() {

		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";

		Especie especie = Especie.Helecho;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_1;
		Integer idPlanta = 123;

		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada,idPlanta);

		// Metodos del Nuevo Test
		nuevoZoologico.agregarPlanta(nuevaPlanta);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaPlantas().size());
	}
	
	@org.junit.Test
	public void queSeAgregueJardinero() {
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		String nombreEmpleado = "Pedro";
		String apellidoEmpleado= "Pascal"; 
		Integer dniEmpleado= 30215620;
		Double sueldo= 177284.99;
		Sector idSectorEmpleado= Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Jardinero nuevoJadinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
		
		// Metodos del Nuevo Test
		nuevoZoologico.agregarJardinero(nuevoJadinero);
		
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaJardineros().size());
		
	}
	
	@org.junit.Test
	public void queSeAgregueVeterinario() {

		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
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
	
	@org.junit.Test
	public void queSeNoSePuedaAgregarSerVivoDelMismoTipoDeAlimentacionConLaMismaIDAnimalOPlanta() { 
		// Probamos con Carnivoros por ejemplo. Para todos va a ser lo mismo, incluso para los Empleados.
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
				
		Especie especie = Especie.Leon;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 14;
		Sector idSector = Sector.Sector_1;
		
		Especie especie2 = Especie.Tigre;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 14;
		Sector idSector2 = Sector.Sector_1;
				
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		AnimalCarnivoro nuevoAnimalCarnivoro2 = new AnimalCarnivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
				
		// Metodos del Nuevo Test
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro2);

				
		// Validacion del Test
		assertEquals(1,nuevoZoologico.getListaAnimalesCarnivoros().size());
		
		
		
	}
	
	//////////////BUSCAR TIPO DE SER VIVO DENTRO DE ZOOLOGICO//////////////
	
	@org.junit.Test
	public void buscarAnimalHerbivoro() { 
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Elefante;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector=Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);
		
		//Validacion del Test
		assertNotNull(nuevoZoologico.buscarAnimalHerbivoro(nuevoAnimalHerbivoro.getIdAnimal()));
	}

	@org.junit.Test
	public void buscarAnimalCarnivoro() { 
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Tigre;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 13;
		Sector idSector=Sector.Sector_1;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		
		//Validacion del Test
		assertNotNull(nuevoZoologico.buscarAnimalCarnivoro(nuevoAnimalCarnivoro.getIdAnimal()));
	}
	
	@org.junit.Test
	public void buscarAnimalOmnivoro() { 
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Oso;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 3;
		Sector idSector=Sector.Sector_2;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);;
		
		//Validacion del Test
		assertNotNull(nuevoZoologico.buscarAnimalOmnivoro(nuevoAnimalOmnivoro.getIdAnimal()));
	}
	
	@org.junit.Test
	public void buscarPlanta() { 
		
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Helecho;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_4;
		Integer idPlanta = 122;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada, idPlanta);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarPlanta(nuevaPlanta);;
		
		//Validacion del Test
		assertNotNull(nuevoZoologico.buscarPlanta(nuevaPlanta.getIdPlanta()));
	}
	
	//////////////TESTS DE ALIMENTACION -  PODAR PLANTA//////////////
	
	@org.junit.Test
	public void queElVeterinarioLeDeComidaAlAnimalHerbivoroYEsteComa() {
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Elefante;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector=Sector.Sector_4;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_4;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Zanahoria;
		

		Boolean valorEsperado=nuevoVeterinario.alimentarAnimalHerbivoro(nuevoZoologico,nuevoAnimalHerbivoro,alimentoAIngerir);

		
		//Validacion del Test
		assertTrue(valorEsperado);
		assertEquals(true,nuevoAnimalHerbivoro.getFueAlimentado());

	}
	
	@org.junit.Test
	public void queElVeterinarioLeDeCarneAlAnimalHerbivoroYEsteNoComa() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Elefante;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 0;
		Sector idSector=Sector.Sector_1;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_1;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalHerbivoro nuevoAnimalHerbivoro = new AnimalHerbivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHerbivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Carne;
		
		Boolean valorEsperado=nuevoVeterinario.alimentarAnimalHerbivoro(nuevoZoologico,nuevoAnimalHerbivoro,alimentoAIngerir);
		
		//Validacion del Test
		assertFalse(valorEsperado);
		assertEquals(false,nuevoAnimalHerbivoro.getFueAlimentado());
	}
	
	@org.junit.Test
	public void queElVeterinarioLeDeComidaAlAnimalCarnivoroYEsteComa() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Tigre;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 86;
		Sector idSector=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_2;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Carne;
		
		Boolean valorEsperado=nuevoVeterinario.alimentarAnimalCarnivoro(nuevoZoologico,nuevoAnimalCarnivoro,alimentoAIngerir);
		
		//Validacion del Test
		assertTrue(valorEsperado);
		assertEquals(true,nuevoAnimalCarnivoro.getFueAlimentado());
	}
	
	@org.junit.Test
	public void queElJardineroRiegueALaPlanta() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Helecho;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_4;
		Integer idPlanta = 122;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_4;
		Double sueldo= 177284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada, idPlanta);
		Jardinero nuevoJardinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarPlanta(nuevaPlanta);
		nuevoZoologico.agregarJardinero(nuevoJardinero);
		
		//Metodos del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Agua;
		Boolean valorEsperado=nuevoJardinero.regarPlanta(nuevoZoologico,nuevaPlanta,alimentoAIngerir);
		Integer nivelDeHumedadEsperadoDespuesDeRegado=10;
		
		//Validacion del Test
		assertEquals(nivelDeHumedadEsperadoDespuesDeRegado, nuevaPlanta.getNivelDeHumedad());
		assertTrue(valorEsperado);
	
	}
	
	@org.junit.Test
	public void queElJardineroExpongaAlSolALaPlanta() {
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Helecho;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_4;
		Integer idPlanta = 122;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_4;
		Double sueldo= 17284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada, idPlanta);
		Jardinero nuevoJardinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarPlanta(nuevaPlanta);
		nuevoZoologico.agregarJardinero(nuevoJardinero);
		
		//Metodos y Validación del Nuevo Test
		
		Integer nivelDeHumedadEsperadoDespuesDeSerExpuestaUnaVez=3;
		Integer nivelDeHumedadEsperadoDespuesDeSerExpuestaPorSegundaVez=1;
		Integer nivelDeHumedadEsperadoDespuesDeSerExpuestaPorTerceraVez=0;
		
		nuevoJardinero.exponerPlantaAlSol(nuevoZoologico,nuevaPlanta);
		assertEquals(nivelDeHumedadEsperadoDespuesDeSerExpuestaUnaVez, nuevaPlanta.getNivelDeHumedad());
		
		nuevoJardinero.exponerPlantaAlSol(nuevoZoologico,nuevaPlanta);
		assertEquals(nivelDeHumedadEsperadoDespuesDeSerExpuestaPorSegundaVez, nuevaPlanta.getNivelDeHumedad());
		
		nuevoJardinero.exponerPlantaAlSol(nuevoZoologico,nuevaPlanta);
		assertEquals(nivelDeHumedadEsperadoDespuesDeSerExpuestaPorTerceraVez, nuevaPlanta.getNivelDeHumedad());
		
		Boolean valorEsperado=nuevoJardinero.exponerPlantaAlSol(nuevoZoologico,nuevaPlanta);
		assertFalse(valorEsperado);
	
	}

	@org.junit.Test
	public void queElJardineroRiegueLaPlantaYLuegoLaExponga2VecesAlSol() {
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Helecho;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_4;
		Integer idPlanta = 122;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_4;
		Double sueldo= 17284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada, idPlanta);
		Jardinero nuevoJardinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarPlanta(nuevaPlanta);
		nuevoZoologico.agregarJardinero(nuevoJardinero);
		
		//Metodos y Validación del Nuevo Test
		Alimento alimentoAIngerir=Alimento.Agua;
	
		nuevoJardinero.regarPlanta(nuevoZoologico,nuevaPlanta,alimentoAIngerir);
		Integer nivelDeHumedadEsperadoDespuesDeRegado=10;
		assertEquals(nivelDeHumedadEsperadoDespuesDeRegado,nuevaPlanta.getNivelDeHumedad());
		
		nuevoJardinero.exponerPlantaAlSol(nuevoZoologico,nuevaPlanta);
		Integer nivelDeHumedadEsperadoDespuesDeSerExpuestaUnaVez=8;
		assertEquals(nivelDeHumedadEsperadoDespuesDeSerExpuestaUnaVez, nuevaPlanta.getNivelDeHumedad());
		
		nuevoJardinero.exponerPlantaAlSol(nuevoZoologico,nuevaPlanta);
		Integer nivelDeHumedadEsperadoDespuesDeSerExpuestaPorSegundaVez=6;
		assertEquals(nivelDeHumedadEsperadoDespuesDeSerExpuestaPorSegundaVez, nuevaPlanta.getNivelDeHumedad());
		
		nuevoJardinero.regarPlanta(nuevoZoologico,nuevaPlanta,alimentoAIngerir);
		Integer nivelDeHumedadEsperadoSiSeIntengaRegarConMayorHumedadA5=6;
		assertEquals(nivelDeHumedadEsperadoSiSeIntengaRegarConMayorHumedadA5,nuevaPlanta.getNivelDeHumedad());

	}
	
	@org.junit.Test
	public void queElJardineroPodeLaPlanta() {
		// Inicializacion de Variables
		String nombreZoo = "TEMAIKEN";
		
		Especie especie = Especie.Helecho;
		Boolean fuePodada = false;
		Sector idSector = Sector.Sector_4;
		Integer idPlanta = 122;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_4;
		Double sueldo= 17284.99;		
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Planta nuevaPlanta = new Planta(especie, idSector, fuePodada, idPlanta);
		Jardinero nuevoJardinero = new Jardinero(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarPlanta(nuevaPlanta);
		nuevoZoologico.agregarJardinero(nuevoJardinero);
		
		//Metodos y Validación del Nuevo Test
		nuevoJardinero.podarPlanta(nuevaPlanta);
		assertTrue(nuevaPlanta.getFuePodada());
	}
	
	
	//////////////TESTS DE INGRESO A CUIDADOS Y ALTAS CON AUMENTO SALARIAL//////////////
	
	@org.junit.Test
	public void queSeIngresenAnimalesACuidados() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie1 = Especie.Leon;
		Boolean estaEnCuidados1 = false, fueAlimentado1 = false;
		Integer idAnimal1 = 59;
		Sector idSector1=Sector.Sector_2;
		
		Especie especie2 = Especie.Ciervo;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 59;
		Sector idSector2=Sector.Sector_2;
		
		Especie especie3 = Especie.Oso;
		Boolean estaEnCuidados3 = false, fueAlimentado3 = false;
		Integer idAnimal3 = 59;
		Sector idSector3=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_2;
		Double sueldo= 177284.99;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie1, idSector1, estaEnCuidados1, idAnimal1, fueAlimentado1);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
		AnimalHerbivoro nuevoAnimalHervivoro = new AnimalHerbivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie3, idSector3, estaEnCuidados3, idAnimal3, fueAlimentado3);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHervivoro);
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalCarnivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalHervivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalOmnivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());
		
		//Validacion del Test
		assertTrue(nuevoAnimalCarnivoro.getEstaEnCuidados());
		assertTrue(nuevoAnimalHervivoro.getEstaEnCuidados());
		assertTrue(nuevoAnimalOmnivoro.getEstaEnCuidados());
	}

	@org.junit.Test
	public void queNoSeIngresenAnimalesACuidadosPorDiferenteSector() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie2 = Especie.Ciervo;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 59;
		Sector idSector2=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_1;
		Double sueldo= 177284.99;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
		AnimalHerbivoro nuevoAnimalHervivoro = new AnimalHerbivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
	
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHervivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalHervivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());
		
		//Validacion del Test
		assertFalse(nuevoAnimalHervivoro.getEstaEnCuidados());
	}
	
	@org.junit.Test
	public void queNoSeIngresenAnimalesACuidadosPorDiferenteId() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie2 = Especie.Ciervo;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 59;
		Sector idSector2=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_1;
		Double sueldo= 177284.99;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
		AnimalHerbivoro nuevoAnimalHervivoro = new AnimalHerbivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
	
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalHerbivoro(nuevoAnimalHervivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Metodos del Nuevo Test
		Integer idAnimalNoExistente = 123;
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, idAnimalNoExistente, nuevoVeterinario.getIdSectorEmpleado());
		
		//Validacion del Test
		assertFalse(nuevoAnimalHervivoro.getEstaEnCuidados());
	}
	
	@org.junit.Test
	public void queSeDeDeAltaUnAnimal() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie1 = Especie.Leon;
		Boolean estaEnCuidados1 = false, fueAlimentado1 = false;
		Integer idAnimal1 = 59;
		Sector idSector1=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_2;
		Double sueldo= 100000.0;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie1, idSector1, estaEnCuidados1, idAnimal1, fueAlimentado1);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Ingresar el Animal A Cuidados
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalCarnivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());

		//Metodos del Nuevo Test
		nuevoVeterinario.darDeAltaAnimal(nuevoZoologico, nuevoAnimalCarnivoro.getIdAnimal(), nuevoVeterinario);
		
		//Validacion del Test
		Double valorEsperado = 110000.0;
		assertFalse(nuevoAnimalCarnivoro.getEstaEnCuidados());
		assertEquals(valorEsperado,nuevoVeterinario.getSueldo());
		
	}
	
	@org.junit.Test
	public void queNoSeDeDeAltaUnAnimalPorDiferenteSector() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie1 = Especie.Leon;
		Boolean estaEnCuidados1 = false, fueAlimentado1 = false;
		Integer idAnimal1 = 59;
		Sector idSector1=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_2;
		Double sueldo= 100000.0;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie1, idSector1, estaEnCuidados1, idAnimal1, fueAlimentado1);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Ingresar el Animal A Cuidados
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalCarnivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());

		//Metodos del Nuevo Test
		Sector sectorIncorrecto = Sector.Sector_1;
		nuevoVeterinario.setIdSectorEmpleado(sectorIncorrecto);
		nuevoVeterinario.darDeAltaAnimal(nuevoZoologico, nuevoAnimalCarnivoro.getIdAnimal(), nuevoVeterinario);
		
		//Validacion del Test
		Double valorEsperado = 110000.0;
		assertTrue(nuevoAnimalCarnivoro.getEstaEnCuidados());
		assertNotEquals(valorEsperado,nuevoVeterinario.getSueldo());
		
	}
	
	@org.junit.Test
	public void queNoSeDeDeAltaUnAnimalPorDiferenteId() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie1 = Especie.Leon;
		Boolean estaEnCuidados1 = false, fueAlimentado1 = false;
		Integer idAnimal1 = 59;
		Sector idSector1=Sector.Sector_2;
		
		String nombreEmpleado = "Pedro",apellidoEmpleado= "Pascal";
		Integer dniEmpleado= 30215620;
		Sector idSectorEmpleado= Sector.Sector_2;
		Double sueldo= 100000.0;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie1, idSector1, estaEnCuidados1, idAnimal1, fueAlimentado1);
		Veterinario nuevoVeterinario = new Veterinario(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);

		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		nuevoZoologico.agregarVeterinario(nuevoVeterinario);
		
		//Ingresar el Animal A Cuidados
		nuevoVeterinario.ingresarAnimalACuidados(nuevoZoologico, nuevoAnimalCarnivoro.getIdAnimal(), nuevoVeterinario.getIdSectorEmpleado());

		//Metodos del Nuevo Test
		Integer idIncorrecto = 1213;
		nuevoVeterinario.darDeAltaAnimal(nuevoZoologico, idIncorrecto, nuevoVeterinario);
		
		//Validacion del Test
		Double valorEsperado = 110000.0;
		assertTrue(nuevoAnimalCarnivoro.getEstaEnCuidados());
		assertNotEquals(valorEsperado,nuevoVeterinario.getSueldo());
		
	}
	
	//////////////TESTS DE LIBERAR ANIMAL A LA NATURALEZA//////////////
	
	@org.junit.Test
	public void queSeAgreguenDosAnimalesConLaMismaAlimentacionYSeLibereAUnoDeEllos () {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie = Especie.Oso;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 56;
		Sector idSector=Sector.Sector_2;
		
		Especie especie2 = Especie.Cerdo;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 59;
		Sector idSector2=Sector.Sector_2;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		AnimalOmnivoro nuevoAnimalOmnivoro2 = new AnimalOmnivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro2);
		
		//Metodos del Nuevo Test
		Boolean valorEsperado=nuevoZoologico.liberarAnimal(nuevoAnimalOmnivoro.getIdAnimal(),nuevoAnimalOmnivoro.getEspecie());
		
		//Validacion del Test
		assertTrue(valorEsperado);
		assertEquals(1,nuevoZoologico.getListaAnimalesOmnivoros().size());
		
	}
	
	@org.junit.Test
	public void queSeAgreguenDosAnimalesDeDistintaAlimentacionYSeLibereUnoDeEllos () {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie = Especie.Oso;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 56;
		Sector idSector=Sector.Sector_2;
		
		Especie especie2 = Especie.Leon;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 59;
		Sector idSector2=Sector.Sector_2;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		
		//Metodos del Nuevo Test
		Boolean valorEsperado=nuevoZoologico.liberarAnimal(nuevoAnimalOmnivoro.getIdAnimal(),nuevoAnimalOmnivoro.getEspecie());
		
		//Validacion del Test
		assertTrue(valorEsperado);
		assertEquals(0,nuevoZoologico.getListaAnimalesOmnivoros().size());
		assertEquals(1,nuevoZoologico.getListaAnimalesCarnivoros().size());
	}
	
	@org.junit.Test
	public void queSeAgreguenDosAnimalesDeDistintaAlimentacionYSeLiberenAmbos() {
		// Inicializacion de Variables
		
		String nombreZoo = "TEMAIKEN";
				
		Especie especie = Especie.Oso;
		Boolean estaEnCuidados = false, fueAlimentado = false;
		Integer idAnimal = 56;
		Sector idSector=Sector.Sector_2;
		
		Especie especie2 = Especie.Leon;
		Boolean estaEnCuidados2 = false, fueAlimentado2 = false;
		Integer idAnimal2 = 59;
		Sector idSector2=Sector.Sector_2;
		
		// Creacion de Objeto/s
		Zoologico nuevoZoologico = new Zoologico(nombreZoo);
		AnimalOmnivoro nuevoAnimalOmnivoro = new AnimalOmnivoro(especie, idSector, estaEnCuidados, idAnimal, fueAlimentado);
		AnimalCarnivoro nuevoAnimalCarnivoro = new AnimalCarnivoro(especie2, idSector2, estaEnCuidados2, idAnimal2, fueAlimentado2);
		
		//Agrego los Objetos al Zoologico
		nuevoZoologico.agregarAnimalOmnivoro(nuevoAnimalOmnivoro);
		nuevoZoologico.agregarAnimalCarnivoro(nuevoAnimalCarnivoro);
		
		//Metodos del Nuevo Test
		Boolean valorEsperado=nuevoZoologico.liberarAnimal(nuevoAnimalOmnivoro.getIdAnimal(),nuevoAnimalOmnivoro.getEspecie());
		Boolean valorEsperado2=nuevoZoologico.liberarAnimal(nuevoAnimalCarnivoro.getIdAnimal(),nuevoAnimalCarnivoro.getEspecie());
		
		//Validacion del Test
		assertTrue(valorEsperado);
		assertTrue(valorEsperado2);
		assertEquals(0,nuevoZoologico.getListaAnimalesOmnivoros().size());
		assertEquals(0,nuevoZoologico.getListaAnimalesCarnivoros().size());
	}

}
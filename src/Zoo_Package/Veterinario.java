package Zoo_Package;

public class Veterinario extends Empleado {

	public Veterinario(String nombreEmpleado, String apellidoEmpleado, Integer dniEmpleado, Double sueldo, Sector idSectorEmpleado){ 
		super(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo,idSectorEmpleado); 
	}


	public Boolean alimentarAnimalHerbivoro(Zoologico zoo, AnimalHerbivoro animalHerbivoro, Alimento alimentoAIngerir) {

		if(zoo.buscarAnimalHerbivoro(animalHerbivoro.getIdAnimal())!=null && this.getIdSectorEmpleado().equals(animalHerbivoro.getIdSector())){

			animalHerbivoro.alimentarse(alimentoAIngerir);	

			if(animalHerbivoro.getFueAlimentado()==true) {
				return true; 
			} 
		}
		return false; 
	}

	public Boolean alimentarAnimalCarnivoro(Zoologico zoo, AnimalCarnivoro animalCarnivoro, Alimento alimentoAIngerir) {

		if(zoo.buscarAnimalCarnivoro(animalCarnivoro.getIdAnimal())!=null && this.getIdSectorEmpleado().equals(animalCarnivoro.getIdSector())){

			animalCarnivoro.alimentarse(alimentoAIngerir);	

			if(animalCarnivoro.getFueAlimentado()==true) {
				return true; 
			} 
		}
		return false;
	}

	public Boolean alimentarAnimalOmnivoro(Zoologico zoo, AnimalOmnivoro nuevoAnimalOmnivoro,
			Alimento alimentoAIngerir) {
		if(zoo.buscarAnimalOmnivoro(nuevoAnimalOmnivoro.getIdAnimal())!=null && this.getIdSectorEmpleado().equals(nuevoAnimalOmnivoro.getIdSector())){
			
			nuevoAnimalOmnivoro.alimentarse(alimentoAIngerir);
			if(nuevoAnimalOmnivoro.getFueAlimentado()==true) {
				return true; 
			} 
		}
		return false;
	}


	public void ingresarAnimalACuidados(Zoologico nuevoZoologico, Integer idAnimal, Sector sectorVeterinario) {
		
		
		AnimalCarnivoro AnimalBuscado1= nuevoZoologico.buscarAnimalCarnivoro(idAnimal);
		AnimalHerbivoro AnimalBuscado2= nuevoZoologico.buscarAnimalHerbivoro(idAnimal);
		AnimalOmnivoro AnimalBuscado3= nuevoZoologico.buscarAnimalOmnivoro(idAnimal);
		
		if(AnimalBuscado1!=null && AnimalBuscado1.getIdAnimal()==idAnimal && AnimalBuscado1.getIdSector() == sectorVeterinario && AnimalBuscado1.getEstaEnCuidados()==false) {
			AnimalBuscado1.setEstaEnCuidados(true);
		}else if(AnimalBuscado2!=null && AnimalBuscado2.getIdAnimal()==idAnimal && AnimalBuscado2.getIdSector() == sectorVeterinario && AnimalBuscado2.getEstaEnCuidados()==false){
			AnimalBuscado2.setEstaEnCuidados(true);
		}else if(AnimalBuscado3!=null && AnimalBuscado3.getIdAnimal()==idAnimal && AnimalBuscado3.getIdSector() == sectorVeterinario && AnimalBuscado3.getEstaEnCuidados()==false){
			AnimalBuscado3.setEstaEnCuidados(true);
		}
		
		
	}


	public void darDeAltaAnimal(Zoologico nuevoZoologico, Integer idAnimal, Veterinario nuevoVeterinario) {
		Double nuevoSueldo = nuevoVeterinario.getSueldo();
		
		AnimalCarnivoro AnimalBuscado1= nuevoZoologico.buscarAnimalCarnivoro(idAnimal);
		AnimalHerbivoro AnimalBuscado2= nuevoZoologico.buscarAnimalHerbivoro(idAnimal);
		AnimalOmnivoro AnimalBuscado3= nuevoZoologico.buscarAnimalOmnivoro(idAnimal);
		
		if(AnimalBuscado1!=null && AnimalBuscado1.getIdAnimal()==idAnimal && AnimalBuscado1.getIdSector() == nuevoVeterinario.getIdSectorEmpleado() && AnimalBuscado1.getEstaEnCuidados()==true) {
			AnimalBuscado1.setEstaEnCuidados(false);
			nuevoSueldo += nuevoSueldo*0.1;
			nuevoVeterinario.setSueldo(nuevoSueldo);
		}else if(AnimalBuscado2!=null && AnimalBuscado2.getIdAnimal()==idAnimal && AnimalBuscado2.getIdSector() == nuevoVeterinario.getIdSectorEmpleado() && AnimalBuscado2.getEstaEnCuidados()==true){
			AnimalBuscado2.setEstaEnCuidados(false);
			nuevoSueldo += nuevoSueldo*0.1;
			nuevoVeterinario.setSueldo(nuevoSueldo);
		}else if(AnimalBuscado3!=null && AnimalBuscado3.getIdAnimal()==idAnimal && AnimalBuscado3.getIdSector() == nuevoVeterinario.getIdSectorEmpleado() && AnimalBuscado3.getEstaEnCuidados()==true){
			AnimalBuscado3.setEstaEnCuidados(false);
			nuevoSueldo += nuevoSueldo*0.1;
			nuevoVeterinario.setSueldo(nuevoSueldo);
		}
		
	}
}

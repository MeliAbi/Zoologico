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
}
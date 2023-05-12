package Zoo_Package;

public class Veterinario extends Empleado {

	public Veterinario(String nombreEmpleado, String apellidoEmpleado, Integer dniEmpleado, Double sueldo,
			Sector idSectorEmpleado) {
		super(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo,idSectorEmpleado);
	}

	
	public Boolean alimentarAnimalHerbivoro(AnimalHerbivoro nuevoAnimalHerbivoro, Alimento alimentoAIngerir) {
		
		//buscarAnimal -- si no encuentra return false
					// -- si lo encuentra (linea 20 a 26)
		
		if (this.getIdSectorEmpleado().equals(nuevoAnimalHerbivoro.getIdSector())){	
			nuevoAnimalHerbivoro.alimentarse(alimentoAIngerir);
			if(nuevoAnimalHerbivoro.getFueAlimentado()==true) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 	public Boolean alimentarAnimalHerbivoro(Zoologico zoo, Integer animalId, Alimento alimentoAIngerir) {
		
		if(zoo.buscarAnimal(animalId) && this.getIdSectorEmpleado().equals(nuevoAnimalHerbivoro.getIdSector())){
			nuevoAnimalHerbivoro.alimentarse(alimentoAIngerir);
			if(nuevoAnimalHerbivoro.getFueAlimentado()==true) {
				return true;
		 }
		return false;
	}
	 * 
	 * */
	

	public Boolean alimentarAnimalCarnivoro(AnimalCarnivoro nuevoAnimalCarnivoro, Alimento alimentoAIngerir) {
		if (this.getIdSectorEmpleado().equals(nuevoAnimalCarnivoro.getIdSector())){	
			nuevoAnimalCarnivoro.alimentarse(alimentoAIngerir);
			if(nuevoAnimalCarnivoro.getFueAlimentado()==true) {
				return true;
			}
		}
		
		return false;
	}
}
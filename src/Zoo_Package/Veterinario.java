package Zoo_Package;

public class Veterinario extends Empleado {

	public Veterinario(String nombreEmpleado, String apellidoEmpleado, Integer dniEmpleado, Double sueldo,
			Sector idSectorEmpleado) {
		super(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo,idSectorEmpleado);
	}

	public Boolean alimentarAnimalHerbivoro(AnimalHerbivoro nuevoAnimalHerbivoro, Alimento alimentoAIngerir) {
		
		if (this.getIdSectorEmpleado().equals(nuevoAnimalHerbivoro.getIdSector())){	
			nuevoAnimalHerbivoro.alimentarse(alimentoAIngerir);
			if(nuevoAnimalHerbivoro.getFueAlimentado()==true) {
				return true;
			}
		}
		return false;
	}

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
package Zoo_Package;

public class AnimalCarnivoro extends Animal {

	public AnimalCarnivoro(String especie, Boolean esMarino, Integer idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado) {
		super(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
	}

	@Override
	public void alimentarse(Alimentos Alimento) {
		
	}

	
	
}

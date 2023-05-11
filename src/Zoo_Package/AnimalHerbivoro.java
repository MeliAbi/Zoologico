package Zoo_Package;

public class AnimalHerbivoro extends Animal {

	public AnimalHerbivoro(Especie especie, Boolean esMarino, Integer idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado) {
		super(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
	}

	@Override
	public void alimentarse(Alimentos Alimento) {
		
	}
}

package Zoo_Package;

public class AnimalOmnivoro extends Animal {
	public AnimalOmnivoro(Especie especie, Boolean esMarino, Integer idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado) {
		super(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
	}

	@Override
	public void alimentarse(Alimentos Alimento) {
		
	}
}

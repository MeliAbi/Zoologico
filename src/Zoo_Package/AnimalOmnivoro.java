package Zoo_Package;

public class AnimalOmnivoro extends Animal {
	public AnimalOmnivoro(Especie especie, Sector idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado) {
		super(especie,idSector,estaEnCuidados,idAnimal,fueAlimentado);
	}

	@Override
	public void alimentarse(Alimento Alimento) {
			this.fueAlimentado=true;
	}
}

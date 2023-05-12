package Zoo_Package;

public class AnimalCarnivoro extends Animal {

	public AnimalCarnivoro(Especie especie, Boolean esMarino, Sector idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado) {
		super(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
	}

	@Override
	public void alimentarse(Alimento Alimento) {
		if (Alimento==Alimento.Carne||Alimento==Alimento.Pollo||Alimento==Alimento.Agua||Alimento==Alimento.Leche) {
			this.fueAlimentado=true;
		}
	}

	
	
}

package Zoo_Package;

public class AnimalHerbivoro extends Animal {

	public AnimalHerbivoro(Especie especie, Boolean esMarino, Sector idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado) {
		super(especie,esMarino,idSector,estaEnCuidados,idAnimal,fueAlimentado);
	}

	@Override
	public void alimentarse(Alimento Alimento) {
		if (Alimento==Alimento.Lechuga||Alimento==Alimento.Zanahoria||Alimento==Alimento.Agua||Alimento==Alimento.Leche) {
			this.fueAlimentado=true;
		}
	}
}

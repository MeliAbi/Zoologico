package Zoo_Package;

public class Planta extends SerVivo{
	
	private Boolean fueRegada=false, fuePodada=false;
	public Planta (Especie especie, Boolean esMarino, Integer idSector, Boolean fueRegada, Boolean fuePodada) {
		super(especie, esMarino, idSector);
		this.fueRegada=fueRegada;
		this.fuePodada=fuePodada;
	}
	@Override
	public void alimentarse(Alimentos alimento) {
		// TODO Auto-generated method stub
		
	}
	
}


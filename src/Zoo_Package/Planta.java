package Zoo_Package;

public class Planta extends SerVivo{
	
	private Boolean fueRegada=false, fuePodada=false;
	private Integer idPlanta;
	
	public Planta (Especie especie, Boolean esMarino, Integer idSector, Boolean fueRegada, Boolean fuePodada, Integer idPlanta) {
		super(especie, esMarino, idSector);
		this.fueRegada=fueRegada;
		this.fuePodada=fuePodada;
		this.idPlanta=idPlanta;
	}
	@Override
	public void alimentarse(Alimentos alimento) {
		// TODO Auto-generated method stub
		
	}
	
}


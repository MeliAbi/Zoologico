package Zoo_Package;

public class Planta extends SerVivo{
	
	private Boolean fueRegada=false, fuePodada=false;
	private Integer idPlanta;
	
	public Planta (Especie especie, Sector idSector, Boolean fueRegada, Boolean fuePodada, Integer idPlanta) {
		super(especie, idSector);
		this.fueRegada=fueRegada;
		this.fuePodada=fuePodada;
		this.idPlanta=idPlanta;
	}
	@Override
	public void alimentarse(Alimento alimento) {
		// TODO Auto-generated method stub
		
	}
	public Boolean getFueRegada() {
		return fueRegada;
	}
	public void setFueRegada(Boolean fueRegada) {
		this.fueRegada = fueRegada;
	}
	public Boolean getFuePodada() {
		return fuePodada;
	}
	public void setFuePodada(Boolean fuePodada) {
		this.fuePodada = fuePodada;
	}
	public Integer getIdPlanta() {
		return idPlanta;
	}
	public void setIdPlanta(Integer idPlanta) {
		this.idPlanta = idPlanta;
	}
	
	
}



package Zoo_Package;

public class Planta extends SerVivo{
	
	private Boolean fuePodada=false;
	private Integer idPlanta, nivelDeHumedad;
	
	public Planta (Especie especie, Sector idSector, Boolean fuePodada, Integer idPlanta) {
		super(especie, idSector);
		this.fuePodada=fuePodada;
		this.idPlanta=idPlanta;
		this.nivelDeHumedad=5;
	}
	@Override
	public void alimentarse(Alimento alimento) {
			if(alimento.equals(Alimento.Agua)){
				this.nivelDeHumedad=10;
			}
	}
	
	public Integer getNivelDeHumedad() {
		return nivelDeHumedad;
	}
	public void setNivelDeHumedad(Integer nivelDeHumedad) {
		this.nivelDeHumedad = nivelDeHumedad;
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPlanta == null) ? 0 : idPlanta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		if (idPlanta == null) {
			if (other.idPlanta != null)
				return false;
		} else if (!idPlanta.equals(other.idPlanta))
			return false;
		return true;
	}
	
	
	
}



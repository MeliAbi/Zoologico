package Zoo_Package;

public abstract class SerVivo {
	protected Especie especie = null;
	protected Boolean esMarino = false;
	protected Integer idSector = 0; 
	
	public SerVivo(Especie especie, Boolean esMarino, Integer idSector){
		this.especie=especie;
		this.esMarino=esMarino;
		this.idSector=idSector;
	}
	
	public abstract void alimentarse(Alimentos alimento);

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Boolean getEsMarino() {
		return esMarino;
	}

	public void setEsMarino(Boolean esMarino) {
		this.esMarino = esMarino;
	}

	public Integer getIdSector() {
		return idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	
}

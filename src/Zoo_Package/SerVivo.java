package Zoo_Package;

public abstract class SerVivo {
	protected Especie especie = null;
	protected Boolean esMarino = false;
	protected Sector idSector = null; 
	
	public SerVivo(Especie especie, Boolean esMarino, Sector idSector){
		this.especie=especie;
		this.esMarino=esMarino;
		this.idSector=idSector;
	}
	
	public abstract void alimentarse(Alimento alimento);

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

	public Sector getIdSector() {
		return idSector;
	}

	public void setIdSector(Sector idSector) {
		this.idSector = idSector;
	}

	
}

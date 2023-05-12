package Zoo_Package;

public abstract class SerVivo {
	protected Especie especie = null;
	protected Sector idSector = null; 
	
	public SerVivo(Especie especie, Sector idSector){
		this.especie=especie;
		this.idSector=idSector;
	}
	
	public abstract void alimentarse(Alimento alimento);

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Sector getIdSector() {
		return idSector;
	}

	public void setIdSector(Sector idSector) {
		this.idSector = idSector;
	}

	
}

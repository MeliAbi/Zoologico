package Zoo_Package;

public abstract class Animal extends SerVivo {
	
	protected Boolean estaEnCuidados=false;
	protected Integer idAnimal=0;
	protected Boolean fueAlimentado=false;
	
	public Animal (String especie, Boolean esMarino, Integer idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado){
		super(especie,esMarino,idSector);
		this.estaEnCuidados=estaEnCuidados;
		this.idAnimal=idAnimal;
		this.fueAlimentado=fueAlimentado;
	}
	
	
	public Boolean getEstaEnCuidados() {
		return estaEnCuidados;
	}
	public void setEstaEnCuidados(Boolean estaEnCuidados) {
		this.estaEnCuidados = estaEnCuidados;
	}
	public Integer getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}

	
}

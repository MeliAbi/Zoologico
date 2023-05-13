package Zoo_Package;

public abstract class Animal extends SerVivo {
	
	protected Boolean estaEnCuidados=false;
	protected Integer idAnimal=0;
	protected Boolean fueAlimentado=false;
	
	public Animal (Especie especie, Sector idSector, Boolean estaEnCuidados, Integer idAnimal, Boolean fueAlimentado){
		super(especie,idSector);
		this.estaEnCuidados=estaEnCuidados;
		this.idAnimal=idAnimal;
		this.fueAlimentado=fueAlimentado;
	}
	
	public Boolean getFueAlimentado() {
		return fueAlimentado;
	}

	public void setFueAlimentado(Boolean fueAlimentado) {
		this.fueAlimentado = fueAlimentado;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAnimal == null) ? 0 : idAnimal.hashCode());
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
		Animal other = (Animal) obj;
		if (idAnimal == null) {
			if (other.idAnimal != null)
				return false;
		} else if (!idAnimal.equals(other.idAnimal))
			return false;
		return true;
	}

	
}

package Zoo_Package;

public abstract class SerVivo {
	protected String especie = "";
	protected Boolean esMarino = false;
	protected Integer idSector = 0; 
	
	public SerVivo(String especie, Boolean esMarino, Integer idSector){
		this.especie=especie;
		this.esMarino=esMarino;
		this.idSector=idSector;
	}
	
	public abstract void alimentarse(Alimentos alimento);

}

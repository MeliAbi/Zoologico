package Zoo_Package;

public class Empleado {

	private String nombreEmpleado="";
	private String apellidEmpleado="";
	private Integer dniEmpleado=0;
	private Double sueldo=0.0;
	private Integer idSector=0;
	
	public Empleado(String nombreEmpleado, String apellidEmpleado, Integer dniEmpleado, Double sueldo, Integer idSector) {
		this.nombreEmpleado=nombreEmpleado;
		this.apellidEmpleado=apellidEmpleado;
		this.dniEmpleado=dniEmpleado;
		this.sueldo=sueldo;
		this.idSector=idSector;
	}

}

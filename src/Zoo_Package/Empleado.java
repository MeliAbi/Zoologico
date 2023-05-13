package Zoo_Package;

public class Empleado {

	protected String nombreEmpleado="";
	protected String apellidEmpleado="";
	protected Integer dniEmpleado=0;
	protected Double sueldo=0.0;
	protected Sector idSectorEmpleado=null;
	
	public Empleado(String nombreEmpleado, String apellidEmpleado, Integer dniEmpleado, Double sueldo, Sector idSectorEmpleado) {
		this.nombreEmpleado=nombreEmpleado;
		this.apellidEmpleado=apellidEmpleado;
		this.dniEmpleado=dniEmpleado;
		this.sueldo=sueldo;
		this.idSectorEmpleado=idSectorEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidEmpleado() {
		return apellidEmpleado;
	}

	public void setApellidEmpleado(String apellidEmpleado) {
		this.apellidEmpleado = apellidEmpleado;
	}

	public Integer getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(Integer dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Sector getIdSectorEmpleado() {
		return idSectorEmpleado;
	}

	public void setIdSectorEmpleado(Sector idSectorEmpleado) {
		this.idSectorEmpleado = idSectorEmpleado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dniEmpleado == null) ? 0 : dniEmpleado.hashCode());
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
		Empleado other = (Empleado) obj;
		if (dniEmpleado == null) {
			if (other.dniEmpleado != null)
				return false;
		} else if (!dniEmpleado.equals(other.dniEmpleado))
			return false;
		return true;
	}
	
	

}

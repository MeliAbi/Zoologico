package Zoo_Package;

public class Jardinero extends Empleado{

	public Jardinero(String nombreEmpleado, String apellidoEmpleado, Integer dniEmpleado, Double sueldo,
			Sector idSectorEmpleado) {
		super(nombreEmpleado, apellidoEmpleado, dniEmpleado, sueldo, idSectorEmpleado);
	}

	public Boolean regarPlanta(Zoologico zoo,Planta planta, Alimento alimentoAIngerir) {
		
		if(zoo.buscarPlanta(planta.getIdPlanta())!=null&&this.getIdSectorEmpleado().equals(planta.getIdSector())&&alimentoAIngerir.equals(Alimento.Agua)) {
			if(planta.getNivelDeHumedad()<=5) {
				planta.alimentarse(alimentoAIngerir);
				return true;
			}
		}
		return false;
	}

	public Boolean exponerPlantaAlSol(Zoologico zoo, Planta planta) {
		if(zoo.buscarPlanta(planta.getIdPlanta())!=null&&this.getIdSectorEmpleado().equals(planta.getIdSector())&&planta.getNivelDeHumedad()!=0) {
			if(planta.getNivelDeHumedad()==1) {
				planta.setNivelDeHumedad(0);
				return true;
			}
			if(planta.getNivelDeHumedad()>=2) {
				Integer auxiliar=planta.getNivelDeHumedad();
				planta.setNivelDeHumedad(auxiliar-2);
				return true;
			}
		}
		return false;
	}

	public Boolean podarPlanta(Planta nuevaPlanta) {
		
		if(nuevaPlanta.getFuePodada()==false) {
			nuevaPlanta.setFuePodada(true);
			return true;
		}
		return false;
	}
	
	
}

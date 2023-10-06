package Persona;

public class Paciente {
//1 atributos
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	
	
//2 constructor que recopile todos los datos
	 Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos,
			String cita, String doctorAsignado, boolean alergias) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}
	
//2.1 constructor que recopile solo los datos obligatorios	
	Paciente (String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
	
//3 métodos
	@Override
	//Metodo llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
				+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}

	

	
	
	
	
	
	//getter
	public boolean getSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}
	
	//setter
	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
	
	
	
}//cierre class paciente

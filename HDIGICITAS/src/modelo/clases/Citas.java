package modelo.clases;

import org.joda.time.DateTime;

public class Citas {

	private DateTime id_fechaHora;
	
	//para poder coger las claves foraneas
	private Pacientes pacientes;
	private Profesionales profesionales;
	
	//private int idPac = pacientes.getId_paciente();  //??
	
	
	public Citas(DateTime idfechaHora, Pacientes paciente, Profesionales profesional) {
		this.id_fechaHora = idfechaHora;
		this.pacientes = pacientes;
		this.profesionales = profesionales;
	}
	
	public DateTime getId_fechaHora() {
		return id_fechaHora;
	}
	public void setId_fechaHora(DateTime id_fechaHora) {
		this.id_fechaHora = id_fechaHora;
	}
	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	public Profesionales getProfesionales() {
		return profesionales;
	}
	public void setProfesionales(Profesionales profesionales) {
		this.profesionales = profesionales;
	}
	
	
}

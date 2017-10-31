package modelo.clases;

import org.joda.time.DateTime;

public class Citas {

	private DateTime id_fechaHora;
	private Pacientes pacientes;
	private Profesionales profesionales;
	

	
	
	public Citas(DateTime idfechaHora, Pacientes pacientes, Profesionales profesionales) {
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

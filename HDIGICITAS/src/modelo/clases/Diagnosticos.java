package modelo.clases;

public class Diagnosticos {

	private int id_diagnostico;
	private int dia_cantidad,dia_precio;
	private String dia_descripcion,dia_alergias,dia_prescripcion,dia_instrucciones,dia_observaciones;
	private Pacientes pacientes;
	private Profesionales profesionales;
	
	
	
	public Diagnosticos(int id_diagnostico, int dia_cantidad, int dia_precio, String dia_descripcion,
			String dia_alergias, String dia_prescripcion, String dia_instrucciones, String dia_observaciones,
			Pacientes pacientes, Profesionales profesionales) {
		this.id_diagnostico = id_diagnostico;
		this.dia_cantidad = dia_cantidad;
		this.dia_precio = dia_precio;
		this.dia_descripcion = dia_descripcion;
		this.dia_alergias = dia_alergias;
		this.dia_prescripcion = dia_prescripcion;
		this.dia_instrucciones = dia_instrucciones;
		this.dia_observaciones = dia_observaciones;
		this.pacientes = pacientes;
		this.profesionales = profesionales;
	}
	
	public int getId_diagnostico() {
		return id_diagnostico;
	}
	public void setId_diagnostico(int id_diagnostico) {
		this.id_diagnostico = id_diagnostico;
	}
	public int getDia_cantidad() {
		return dia_cantidad;
	}
	public void setDia_cantidad(int dia_cantidad) {
		this.dia_cantidad = dia_cantidad;
	}
	public int getDia_precio() {
		return dia_precio;
	}
	public void setDia_precio(int dia_precio) {
		this.dia_precio = dia_precio;
	}
	public String getDia_descripcion() {
		return dia_descripcion;
	}
	public void setDia_descripcion(String dia_descripcion) {
		this.dia_descripcion = dia_descripcion;
	}
	public String getDia_alergias() {
		return dia_alergias;
	}
	public void setDia_alergias(String dia_alergias) {
		this.dia_alergias = dia_alergias;
	}
	public String getDia_prescripcion() {
		return dia_prescripcion;
	}
	public void setDia_prescripcion(String dia_prescripcion) {
		this.dia_prescripcion = dia_prescripcion;
	}
	public String getDia_instrucciones() {
		return dia_instrucciones;
	}
	public void setDia_instrucciones(String dia_instrucciones) {
		this.dia_instrucciones = dia_instrucciones;
	}
	public String getDia_observaciones() {
		return dia_observaciones;
	}
	public void setDia_observaciones(String dia_observaciones) {
		this.dia_observaciones = dia_observaciones;
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

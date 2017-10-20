package modelo.clases;

import java.util.ArrayList;
import java.util.Date;

public class Profesionales extends Usuarios{

	private int id_profesional;
	private Date pro_fechaContratacion;
	private String pro_posicion;
	
	//lo trabajaría esta clase o sería a traves del servlet ?
	//generaría ambos raidlist para poder manejar pacientes de los profesionales
	//y las citas
	private ArrayList<Pacientes> pacientes = new ArrayList<>();
	private ArrayList<Citas> citas = new ArrayList<>();
	
	
	
	public Profesionales(String nif, String nombre, String apellido, String telefono, 
			String domicilio, String Ciudad,String Provincia, String Pais, String imagen_usuario,
			int CP, String nUsuario, String Contrasenia,String tipo, int idPro,Date fcPro,String posPro) {
		super(nif, nombre, apellido, telefono, domicilio, Ciudad, Provincia,
				Pais, imagen_usuario, CP, nUsuario, Contrasenia,tipo);
		this.id_profesional = idPro;
		this.pro_fechaContratacion = fcPro;
		this.pro_posicion = posPro;
		
	}
	
	
	public int getId_profesional() {
		return id_profesional;
	}
	public void setId_profesional(int id_profesional) {
		this.id_profesional = id_profesional;
	}
	public Date getPro_fechaContratacion() {
		return pro_fechaContratacion;
	}
	public void setPro_fechaContratacion(Date pro_fechaContratacion) {
		this.pro_fechaContratacion = pro_fechaContratacion;
	}
	public String getPro_posicion() {
		return pro_posicion;
	}
	public void setPro_posicion(String pro_posicion) {
		this.pro_posicion = pro_posicion;
	}
	
	//cuestionable
	public void addPacientes(Pacientes pacientes)
    {
        this.pacientes.add(pacientes);
    }
	
	
	
}

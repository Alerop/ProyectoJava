package modelo.clases;

import java.util.ArrayList;

public class Pacientes extends Usuarios{

	private int id_paciente;
	
	//esto podria ir aqui o tendria que gestionarse desde el servlet ?
	//Generaría un arraylist para poder añadir citas 
	private ArrayList<Citas> citas = new ArrayList<>();

	
	
	public Pacientes(String nif, String nombre, String apellido, String telefono, String domicilio,
			String Ciudad,String Provincia, String Pais, String imagen_usuario, int CP, String nUsuario,
			String Contrasenia,String tipo, int idPac) {
		super(nif, nombre, apellido, telefono, domicilio, Ciudad, Provincia, Pais, 
				imagen_usuario, CP, nUsuario, Contrasenia,tipo);

		this.id_paciente = idPac;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	
	
}

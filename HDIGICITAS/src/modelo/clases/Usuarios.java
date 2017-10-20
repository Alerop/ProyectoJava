package modelo.clases;

public class Usuarios extends Datos{

	private String usu_nombre_usuario,usu_contrasenia,usu_tipo;

	public Usuarios(String nif, String nombre, String apellido, String telefono, String domicilio, String Ciudad,
			String Provincia, String Pais, String imagen_usuario, int CP, String nUsuario, String Contrasenia, String tipo) {
		super(nif, nombre, apellido, telefono, domicilio, Ciudad, Provincia, Pais, imagen_usuario, CP);
		this.usu_nombre_usuario = nUsuario;
		this.usu_contrasenia = Contrasenia;
		this.usu_tipo = tipo;
		
	}

	public String getUsu_nombre_usuario() {
		return usu_nombre_usuario;
	}

	public void setUsu_nombre_usuario(String usu_nombre_usuario) {
		this.usu_nombre_usuario = usu_nombre_usuario;
	}

	public String getUsu_contrasenia() {
		return usu_contrasenia;
	}

	public void setUsu_contrasenia(String usu_contrasenia) {
		this.usu_contrasenia = usu_contrasenia;
	}

	public String getUsu_tipo() {
		return usu_tipo;
	}

	public void setUsu_tipo(String usu_tipo) {
		this.usu_tipo = usu_tipo;
	}
	
}

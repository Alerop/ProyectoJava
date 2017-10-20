package modelo.clases;

public class Datos {
	private String id_nif;
	private String dat_nombre, dat_apellido,dat_telefono,dat_domicilio,
	dat_Ciudad,dat_Provincia,dat_Pais,dat_imagen_usuario;
	private int dat_CP;
	
	
	
	public Datos(String nif, String nombre, String apellido, String telefono, String domicilio,
			String Ciudad, String Provincia, String Pais, String imagen_usuario, int CP) {
		
		this.id_nif = nif;
		this.dat_nombre = nombre;
		this.dat_apellido = apellido;
		this.dat_telefono = telefono;
		this.dat_domicilio = domicilio;
		this.dat_Ciudad = Ciudad;
		this.dat_Provincia = Provincia;
		this.dat_Pais = Pais;
		this.dat_imagen_usuario = imagen_usuario;
		this.dat_CP = CP;
	}
	
	public Datos(){
		this.id_nif = "00000000V";
		this.dat_nombre = "default";
		this.dat_apellido = "default";
	}
	
	public String getId_nif() {
		return id_nif;
	}
	public void setId_nif(String id_nif) {
		this.id_nif = id_nif;
	}
	public String getDat_nombre() {
		return dat_nombre;
	}
	public void setDat_nombre(String dat_nombre) {
		this.dat_nombre = dat_nombre;
	}
	public String getDat_apellido() {
		return dat_apellido;
	}
	public void setDat_apellido(String dat_apellido) {
		this.dat_apellido = dat_apellido;
	}
	public String getDat_telefono() {
		return dat_telefono;
	}
	public void setDat_telefono(String dat_telefono) {
		this.dat_telefono = dat_telefono;
	}
	public String getDat_domicilio() {
		return dat_domicilio;
	}
	public void setDat_domicilio(String dat_domicilio) {
		this.dat_domicilio = dat_domicilio;
	}
	public String getDat_Ciudad() {
		return dat_Ciudad;
	}
	public void setDat_Ciudad(String dat_Ciudad) {
		this.dat_Ciudad = dat_Ciudad;
	}
	public String getDat_Provincia() {
		return dat_Provincia;
	}
	public void setDat_Provincia(String dat_Provincia) {
		this.dat_Provincia = dat_Provincia;
	}
	public String getDat_Pais() {
		return dat_Pais;
	}
	public void setDat_Pais(String dat_Pais) {
		this.dat_Pais = dat_Pais;
	}
	public String getDat_imagen_usuario() {
		return dat_imagen_usuario;
	}
	public void setDat_imagen_usuario(String dat_imagen_usuario) {
		this.dat_imagen_usuario = dat_imagen_usuario;
	}
	public int getDat_CP() {
		return dat_CP;
	}
	public void setDat_CP(int dat_CP) {
		this.dat_CP = dat_CP;
	}

}

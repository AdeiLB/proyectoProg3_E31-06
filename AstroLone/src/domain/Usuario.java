package domain;
public class Usuario{
	private String nombreUsuario;
	private String contrasenya;
	
	public Usuario() {
		nombreUsuario = "";
		contrasenya="";
	}
	public Usuario(String nombre) {
			this.nombreUsuario = nombre;
			this.contrasenya="";
	}
	
	public Usuario(String nombre, String password) {
		this.nombreUsuario=nombre;
		this.contrasenya=password;
	}
	
	public String getUsuario() {
		return this.nombreUsuario;
	}
	public void setContrasenya(String contrasenyaNueva) {
		this.contrasenya = contrasenyaNueva;
	}
	
	public String getContrasenya() {
		return this.contrasenya;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Usuario) {
			System.out.println("hola");
			Usuario nuevo = (Usuario) obj;
			if(nuevo.nombreUsuario.equals(this.nombreUsuario)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nombreUsuario.hashCode();
	}
	
	
}

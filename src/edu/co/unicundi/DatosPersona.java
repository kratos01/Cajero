package edu.co.unicundi;

public class DatosPersona {

	private String nombre;
	private int cedula;
	private String apellido;
	private int saldo;
	private int clave;
	
	public DatosPersona(int cedula,String nombre,String apellido,int saldo,int clave) {
		super();
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setSaldo(saldo);
		this.setClave(clave);
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
}

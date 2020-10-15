package pe.edu.upeu.lp2exa1davidreyna.entity;

public class Platos {
	private int idplatos;
	private String nombre;
	private Double precio;
	private int cantidad;
	
	public Platos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Platos(int idplatos, String nombre, Double precio, int cantidad) {
		super();
		this.idplatos = idplatos;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getIdplatos() {
		return idplatos;
	}

	public void setIdplatos(int idplatos) {
		this.idplatos = idplatos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}

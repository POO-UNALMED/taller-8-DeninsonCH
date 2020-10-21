package futbol;

public abstract class Futbolista implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	private String nombre;
	private  int edad;
	private String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	public Futbolista() {
		nombre="Maradona";
		edad=30;
		posicion="delantero";
	}
	public String toString() {
		String salida = String.format("El futbolista %s tiene %d, y juega de %s", this.getNombre(),this.getEdad(),this.getPosicion());
		return salida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		return false;
	}
	
	public abstract boolean jugarConLasManos();
	
}

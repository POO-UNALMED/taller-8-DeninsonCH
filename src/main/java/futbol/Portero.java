package futbol;

public class Portero extends Futbolista{

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
	//públicos, golesRecibidos de tipo short y dorsal de tipo byte.
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad,short golesRecibidos, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
	
	public String toString() {
		String salida = String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Le han marcado %d", this.getNombre(),this.getEdad(),this.getPosicion(),this.dorsal,this.golesRecibidos);
		return salida;
	}
	public int compareTo(Object j) {
		Portero temp  = (Portero) j;
		int difGoles = temp.golesRecibidos - this.golesRecibidos;
		return difGoles;
	}

}

package futbol;

public class Jugador extends Futbolista{

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		super(nombre,edad,posicion);
		golesMarcados=goles;
		this.dorsal=dorsal;
		
	}
	public Jugador() {
		super();
		golesMarcados=27;
		dorsal=7;
	}
	public int compareTo(Object j) {
		Jugador temp  = (Jugador) j;
		int difEdad = this.getEdad() - temp.getEdad();
		return difEdad;
	}
	
	public String toString() {
		String salida= String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Ha marcado %s",this.getNombre(),this.getEdad(),this.getPosicion(),this.dorsal,this.golesMarcados);
		return salida;
	}
	public short getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	

}

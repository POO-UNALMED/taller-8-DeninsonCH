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

}

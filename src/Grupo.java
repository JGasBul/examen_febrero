
public class Grupo {
	private  String nombre,estilo;
	private int num_miembros;

	public Grupo() {
	}

	public Grupo(String nombre, String estilo, int num_miembros) {
		this.nombre = nombre;
		this.estilo = estilo;
		this.num_miembros = num_miembros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getNum_miembros() {
		return num_miembros;
	}

	public void setNum_miembros(int num_miembros) {
		this.num_miembros = num_miembros;
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", estilo=" + estilo + ", num_miembros=" + num_miembros + "]";
	}



}

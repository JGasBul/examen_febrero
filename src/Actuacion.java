
public class Actuacion {
	private int escenario;
	private String hora;
	public Actuacion() {
	}
	public Actuacion(int escenario, String hora) {
		this.escenario = escenario;
		this.hora = hora;
	}
	public int getEscenario() {
		return escenario;
	}
	public void setEscenario(int escenario) {
		this.escenario = escenario;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "Actuacion [escenario=" + escenario + ", hora=" + hora + "]";
	}

}

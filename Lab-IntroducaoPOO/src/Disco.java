public class Disco {
	public String marca;
	public String tipo;
	public double capacidade;
	public int rpm;

	public Disco() {

	}

	public Disco(String marca, String tipo, double capacidade, int rpm) {
		this.marca = marca;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.rpm = rpm;
	}

	public String getDescricao() {
		String msg = "Disco: " + "marca=" + this.marca + ", tipo=" + this.tipo + ", Capacidade=" + this.capacidade
				+ "GB, " + "rpm=" + this.rpm + "rpm.";

		return msg;
	}
}

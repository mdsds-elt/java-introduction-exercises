
public class IniciadoJedi {
	String nome;
	String especie;
	int anoNascimento;

	IniciadoJedi() {

	}

	public IniciadoJedi(String nome, String especie, int anoNascimento) {
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}

	public String getAnoNascimento() {
		if (this.anoNascimento < 0) {
			return String.valueOf(Math.abs(this.anoNascimento)) + " ABY";
		} else {
			return String.valueOf(this.anoNascimento) + " DBY";
		}

	}

	public String getDescricao() {
		String msg = this.nome + " (especie=" + this.especie + ", nascimento=" + this.getAnoNascimento()+")";
		return msg;
	}

}

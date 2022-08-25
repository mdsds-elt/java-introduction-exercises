import java.util.ArrayList;

public class SessaoJedi {
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados;

	public SessaoJedi(String nome, TreinadorJedi treinador) {
		this.nome = nome;
		this.treinador = treinador;
		this.iniciados = new ArrayList<IniciadoJedi>();
	}

	public void addIniciado(IniciadoJedi iniciado) {
		this.iniciados.add(iniciado);

	}

	public IniciadoJedi getIniciado(String nome) {
		for (IniciadoJedi iniciado : iniciados) {
			if (iniciado.nome.equals(nome)) {
				return iniciado;

			}
		}
		return null;
	}

	public double getMediaAnoNascimento() {
		double media = 0;
		for (IniciadoJedi iniciado : iniciados) {
			media += iniciado.anoNascimento;
		}
		media = media / iniciados.size();
		return media;

	}

	public String getDescricao() {
		String m1 = "--> SESSÃO " + this.nome + "(Treinador: " + this.treinador.getDescricao() + ")\n";
		String m2 = "";
		for (int i = 0; i < iniciados.size(); i++) {
			m2 = m2 + "  - Iniciado " + String.valueOf(i + 1) + ": " + iniciados.get(i).getDescricao() + "\n";

		}
		return m1 + m2;
	}

}

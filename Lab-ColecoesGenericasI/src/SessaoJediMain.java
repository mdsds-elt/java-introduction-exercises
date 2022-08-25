
public class SessaoJediMain {
	public static void main(String[] args) {

		IniciadoJedi p1 = new IniciadoJedi("Katooni", "Tholothian", -23);
		System.out.println(p1.getDescricao());

		TreinadorJedi t1 = new TreinadorJedi("High Jedi General", "Mace Windu");
		System.out.println(t1.getDescricao());

		SessaoJedi x1 = new SessaoJedi("Instruções de Uso da Força ", t1);
		x1.addIniciado(p1);
		System.out.println(x1.getDescricao());
	}

}

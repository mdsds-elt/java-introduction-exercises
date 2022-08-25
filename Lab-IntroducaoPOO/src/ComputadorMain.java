public class ComputadorMain {
	public static void main(String[] args) {

		Processador p = new Processador("Intel", "i7-6950X", 3.8, 10);
		// Processador p = new Processador();
		System.out.println(p.getDescricao());

		// Memoria m = new Memoria();
		Memoria m = new Memoria("Corsair Vengeance LPX", "DDR4", 8.0, 2.1, 8);
		System.out.println(m.getDescricao());

		Disco d = new Disco();
		System.out.println(d.getDescricao());

		Computador c = new Computador("Alienware", p, m, d);
		System.out.println(c.getDescricao());

	}

}

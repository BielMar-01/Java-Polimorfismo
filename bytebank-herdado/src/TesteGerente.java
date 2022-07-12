
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel Marques");
		
		System.out.println(g1.getNome());
		
		g1.setSenha(2222);
		boolean autentica = g1.autentica(2222);
		System.out.println(autentica);
	}

}

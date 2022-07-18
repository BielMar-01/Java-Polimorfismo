
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel Marques");
		g1.setCpf("11223344");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		
//		g1.setSenha(2222);
//		boolean autentica = g1.autentica(2222);
//		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}
}

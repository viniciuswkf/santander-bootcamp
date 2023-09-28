package collections.set.search;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
	contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
	contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
	System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContatoPorNome(String nome) {
	Set<Contato> contatosPorNome = new HashSet<>();
	for (Contato contato : contatoSet) {
	    if (contato.getNome().startsWith(nome)) {
		contatosPorNome.add(contato);
	    }
	}
	return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
	Contato contatoAtualizado = null;
	for (Contato contato : contatoSet) {
	    if (contato.getNome().equalsIgnoreCase(nome)) {
		contato.setNumero(novoNumero);
		contatoAtualizado = contato;
		break;
	    }
	}

	return contatoAtualizado;
    }

    public static void main(String[] args) {
	// testes

	AgendaContatos contatos = new AgendaContatos();

	contatos.adicionarContato("Joao", 9957);
	contatos.adicionarContato("Ferreira", 9958);
	contatos.adicionarContato("Jackson", 9959);

	contatos.exibirContatos();

	System.out.println("Pesquisando contato João...");
	System.out.println(contatos.pesquisarContatoPorNome("Joao"));
	System.out.println("Pesquisando contato Ferreira...");
	System.out.println(contatos.pesquisarContatoPorNome("Ferreira"));
	;

    }

}

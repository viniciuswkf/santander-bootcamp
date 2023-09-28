package collections.set.basic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
	this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
	convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
	Convidado convidadoParaRemover = null;
	for (Convidado convidado : convidadoSet) {
	    if (convidado.getCodigoConvite() == codigoConvite) {
		convidadoParaRemover = convidado;
		break;
	    }
	}

	convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidados() {
	return convidadoSet.size();
    }

    public void verConvidados() {
	System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
	ConjuntoConvidados convidados = new ConjuntoConvidados();

	convidados.adicionarConvidado("Matheus", 157);
	convidados.adicionarConvidado("João", 158);
	convidados.adicionarConvidado("Silva", 159);

	System.out.println("N° convidados: " + convidados.contarConvidados());

	convidados.removerConvidado(158);

	System.out.println("N° convidados: " + convidados.contarConvidados());

	convidados.verConvidados();

    }

}

package collections.list.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperacoesPessoas {

    List<Pessoa> listaPessoas;

    public OperacoesPessoas() {
	listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
	listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
	List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
	Collections.sort(pessoasPorIdade);
	return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
	List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
	Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
	return pessoasPorAltura;
    }

    public static void main(String[] args) {

	OperacoesPessoas operacoes = new OperacoesPessoas();
	operacoes.adicionarPessoa("Marcos", 18, 1.85);
	operacoes.adicionarPessoa("João", 35, 1.75);
	operacoes.adicionarPessoa("Fernanda", 20, 1.65);

	System.out.println("Lista criada:");
	System.out.println(operacoes.listaPessoas);
	System.out.println("Ordenado por altura:");
	System.out.println(operacoes.ordenarPorAltura());
	System.out.println("Ordenado por idade:");
	System.out.println(operacoes.ordenarPorIdade());

    }

}

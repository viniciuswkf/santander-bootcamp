package collections.listsearch;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
	this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String livro, String autor, int anoPublicacao) {
	listaLivros.add(new Livro(livro, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
	List<Livro> livrosPorAutor = new ArrayList<>();
	if (listaLivros.isEmpty() == false) {
	    for (Livro livro : listaLivros) {
		if (livro.getAutor().equalsIgnoreCase(autor)) {
		    livrosPorAutor.add(livro);
		}
	    }
	}
	return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoMinimo, int anoMaximo) {
	List<Livro> livrosPorIntervalo = new ArrayList<>();
	if (listaLivros.isEmpty() == false) {
	    for (Livro livro : listaLivros) {
		if (livro.getAnoPublicacao() >= anoMinimo && livro.getAnoPublicacao() <= anoMaximo) {
		    livrosPorIntervalo.add(livro);
		}
	    }
	}
	return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String livro) {
	Livro resultado = null;
	if (listaLivros.isEmpty() == false) {
	    for (Livro l : listaLivros) {
		if (l.getLivro().equalsIgnoreCase(livro)) {
		    resultado = l;
		    break;
		}
	    }
	}
	return resultado;
    }

    public static void main(String[] args) {
	CatalogoLivros catalogo = new CatalogoLivros();

	catalogo.adicionarLivro("Livro teste 1", "Autor teste", 2020);
	catalogo.adicionarLivro("Livro teste 2", "Autor teste 2", 2021);
	catalogo.adicionarLivro("Livro teste 3", "Autor teste", 2022);
	catalogo.adicionarLivro("Livro teste 4", "Autor teste 1", 2023);

	System.out.println(catalogo.pesquisarPorIntervaloDeAno(2021, 2022));
	System.out.println(catalogo.pesquisarPorAutor("Autor teste"));
	System.out.println(catalogo.pesquisarPorTitulo("Livro teste 1"));
    }

}

package collections.list.basic;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
	super();
	this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
	Tarefa tarefa = new Tarefa(descricao);
	tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao) {
	List<Tarefa> tarefasParaRemover = new ArrayList<>();
	for (Tarefa tarefa : tarefaList) {
	    if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
		tarefasParaRemover.add(tarefa);
	    }
	}
	tarefaList.removeAll(tarefasParaRemover);
    }

    public int contarTarefas() {
	return tarefaList.size();
    }

    public void obterDescricoes() {
	System.out.println(tarefaList);
    }

    public static void main(String[] args) {
	ListaTarefas listaTarefas = new ListaTarefas();
	System.out.println("Número de tarefas: " + listaTarefas.contarTarefas());

	listaTarefas.adicionarTarefa("Tarefa teste 1");
	listaTarefas.adicionarTarefa("Tarefa teste 2");
	listaTarefas.adicionarTarefa("Tarefa teste 3");
	System.out.println("Número de tarefas: " + listaTarefas.contarTarefas());

	listaTarefas.removerTarefa("Tarefa teste 2");
	System.out.println("Número de tarefas: " + listaTarefas.contarTarefas());

	listaTarefas.obterDescricoes();
    }

}

package collections.list;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
	super();
	this.descricao = descricao;
    }

    public String getDescricao() {
	return descricao;
    }

    @Override
    public String toString() {
	return "Tarefa [descricao=" + descricao + "]";
    }

}

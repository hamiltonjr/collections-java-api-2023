package list.operacoesbasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println("DESCRIÇÕES DE TAREFAS");
        int count = 0;
        for (Tarefa t : tarefaList) {
            System.out.printf("%d: %s%n", ++count, t.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        // número de tarefas aqui tem que ser 0 (zero)
        System.out.println("-----------------------------------------");
        System.out.println("Depois de criar a lista de tarefas...");
        System.out.printf("O número total de tarefas: %d%n",
                listaTarefa.obterNumeroTotalDeTarefas());

        // adicionando tarefas
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("-----------------------------------------");
        System.out.println("Depois de incluir tarefas na lista de tarefas...");
        System.out.printf("O número total de tarefas: %d%n",
                listaTarefa.obterNumeroTotalDeTarefas());

        // obter descrições
        System.out.println("-----------------------------------------");
        listaTarefa.obterDescricoesTarefas();

        // removendo tarefas
        System.out.println("-----------------------------------------");
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("Depois de excluir tarefas na lista de tarefas...");
        System.out.printf("O número total de tarefas: %d%n",
                listaTarefa.obterNumeroTotalDeTarefas());
        System.out.println("-----------------------------------------");

    }
}

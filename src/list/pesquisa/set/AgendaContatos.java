package list.pesquisa.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> contatoSet;


    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }


    public void adicionarContato(Contato contato) {
        contatoSet.add(contato);
    }


    public void exibirContatos() {
        int counter = 0;

        System.out.println("CONTATOS");
        if (contatoSet.isEmpty()) {
            System.out.println("<vazia>");
        } else {
            for (Contato c : contatoSet) {
                System.out.printf("%02d: %s %d%n",
                        ++counter, c.getNome(), c.getNumero());
            }
        }
    }


    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(Contato contato) {
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(contato.getNome())) {
                c.setNumero(contato.getNumero());
                contatoAtualizado = c;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        // nova agenda
        AgendaContatos agendaContatos = new AgendaContatos();

        // exibir agenda vazia
        System.out.println("---------------------------------------------------------");
        agendaContatos.exibirContatos();

        // adicionando novos contatos
        agendaContatos.adicionarContato(new Contato("Camila", 123456));
        agendaContatos.adicionarContato(new Contato("Camila", 123567));
        agendaContatos.adicionarContato(new Contato("Camila Cavalcante", 123678));
        agendaContatos.adicionarContato(new Contato("Camila DIO", 123789));
        agendaContatos.adicionarContato(new Contato("Maria Silva", 123678));

        // exibir agenda com alguns contatos
        System.out.println("---------------------------------------------------------");
        agendaContatos.exibirContatos();

        // pesquisa contatos
        System.out.println("---------------------------------------------------------");
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));;

        // fim
        System.out.println("---------------------------------------------------------");

    }
}

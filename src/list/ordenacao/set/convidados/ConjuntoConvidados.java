package list.ordenacao.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(Convidado convidado) {
        convidadosSet.add(convidado);
    }

    public void removerConvidado(int codigoConvite) {
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadosSet.remove(c);
                return;
            }
        }
        throw new IllegalArgumentException("Código de convidado inválido");
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        int counter = 0;

        System.out.printf("%nCONVIDADOS%n");
        for (Convidado c : convidadosSet) {
            System.out.printf("%02d: %s%n", ++counter, c);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // novo conjunto de convidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // conjunto está vazio
        System.out.printf("Existem %d convidados no conjunto%n",
                conjuntoConvidados.contarConvidados());

        // adicionando convidados
        conjuntoConvidados.adicionarConvidado(new Convidado("convidado 1", 1234));
        conjuntoConvidados.adicionarConvidado(new Convidado("convidado 2", 1235));
        conjuntoConvidados.adicionarConvidado(new Convidado("convidado 3", 1236));
        conjuntoConvidados.adicionarConvidado(new Convidado("convidado 4", 1234));

        // conjunto com alguns convidados
        System.out.printf("Existem %d convidados no conjunto%n",
                conjuntoConvidados.contarConvidados());

        // exibindo convidados
        conjuntoConvidados.exibirConvidados();;

    }

}

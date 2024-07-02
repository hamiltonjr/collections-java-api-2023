package list.ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoaList.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura);
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa(new Pessoa("nome 1", 20, 1.56));
        ordenacaoPessoa.adicionarPessoa(new Pessoa("nome 3", 38, 1.80));
        ordenacaoPessoa.adicionarPessoa(new Pessoa("nome 4", 25, 1.78));
        ordenacaoPessoa.adicionarPessoa(new Pessoa("nome 5", 17, 1.56));

        // ordenação po idade
        System.out.println("-----------------------------------------------------------");
        System.out.println("ORDENANDO POR IDADE");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

//      ordenação po altura
        System.out.println("-----------------------------------------------------------");
        System.out.println("ORDENANDO POR ALTURA");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

        System.out.println("-----------------------------------------------------------");

    }
}

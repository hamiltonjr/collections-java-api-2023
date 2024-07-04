package list.ordenacao.set.produtos;
import java.util.Set;
import java.util.HashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;


    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }


    public void adicionarproduto(Produto produto) {
        produtoSet.add(produto);
    }


    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }


    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosporPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosporPreco.addAll(produtoSet);
        return produtosporPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarproduto(new Produto("produto 5", 1L, 15.00, 5));
        cadastroProdutos.adicionarproduto(new Produto("produto 8", 2L, 20.00, 10));
        cadastroProdutos.adicionarproduto(new Produto("produto 3", 1L, 10.00, 2));
        cadastroProdutos.adicionarproduto(new Produto("produto 9", 9L, 2.00, 2));

        System.out.println(cadastroProdutos.produtoSet);
//        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());



    }

}

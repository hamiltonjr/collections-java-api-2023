package list.pesquisa.map;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos
{
    private final Map<Long, Produto> estoqueProdutosMap;


    public EstoqueProdutos()
    {
        this.estoqueProdutosMap = new HashMap<>();
    }


    public void adicionaProduto(Long codigo, Produto produto)
    {
        estoqueProdutosMap.put(codigo, produto);
    }


    public void exibirProduto()
    {
        System.out.println(estoqueProdutosMap);
    }


    public double calculaValorTotalDoEstoque()
    {
        double valorTotalEstoque = 0.0;

        if (!estoqueProdutosMap.isEmpty())
        {
            for (Produto p : estoqueProdutosMap.values())
            {
                valorTotalEstoque = valorTotalEstoque + p.getQuantidade()*p.getPreco();
            }
        }

        return valorTotalEstoque;
    }


    public Produto obterProdutoMaisCaro()
    {
        Produto produtoMaisCaro = null;
        double maiorPreco = 0.0;

        if (!estoqueProdutosMap.isEmpty())
        {
            for (Produto p : estoqueProdutosMap.values())
            {
                if (p.getPreco() > maiorPreco)
                {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }


    public static void main(String[] args)
    {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();

        estoque.adicionaProduto(1L, new Produto("Produto A", 10, 5.00));
        estoque.adicionaProduto(2L, new Produto("Produto B", 1, 13.00));
        estoque.adicionaProduto(3L, new Produto("Produto C", 2, 15.00));
        estoque.exibirProduto();

        System.out.printf("Valor total do estoque: R$%1.2f%n", estoque.calculaValorTotalDoEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }

}

package list.pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalodeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalodeAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalodeAnos.add(l);
                }
            }
        }
        return livrosPorIntervalodeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro(new Livro("titulo 1", "autor 1", 2020));
        catalogo.adicionarLivro(new Livro("titulo 1", "autor 2", 2021));
        catalogo.adicionarLivro(new Livro("titulo 2", "autor 2", 2022));
        catalogo.adicionarLivro(new Livro("titulo 3", "autor 3", 2023));
        catalogo.adicionarLivro(new Livro("titulo 4", "autor 4", 1994));

        // pesquisa por autor
        System.out.println("------------------------------------------------------------------");
        System.out.println("PESQUISA POR AUTOR");
        System.out.println(catalogo.pesquisarPorAutor("autor 4"));

        // pesquisar por intervalo de ano
        System.out.println("------------------------------------------------------------------");
        System.out.println("PESQUISA POR INTERVALO DE ANOS");
        System.out.println(catalogo.pesquisarPorIntervalodeAnos(2020, 2022));

        // pesquisa por título
        System.out.println("------------------------------------------------------------------");
        System.out.println("PESQUISA POR TÍTULO");
        System.out.println(catalogo.pesquisarPorTitulo("titulo 1"));;

        System.out.println("------------------------------------------------------------------");
    }
}

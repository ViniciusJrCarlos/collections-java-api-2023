package setProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoset;


    public CadastroProdutos() {

        this.produtoset = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade ) {

        produtoset.add(new Produto(codigo, nome, preco, quantidade));

    }

    //exibir produtos

    public Set<Produto> pesquisarProdutoPorNome() {

        Set<Produto> pesquisarProduto = new TreeSet<>(produtoset);

        /*
        for (Produto p: produtoset) {

            if (p.getNome().startsWith(nome)) {

                pesquisarProduto.add(p);
            }
        }

         */

        return pesquisarProduto;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

     produtosPorPreco.addAll(produtoset);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastrarProdutos = new CadastroProdutos();

        System.out.println(cadastrarProdutos.produtoset);

        cadastrarProdutos.adicionarProduto(1000, "computador", 2000.00, 1000);
        cadastrarProdutos.adicionarProduto(2000, "notebook", 4500.00, 400);
        cadastrarProdutos.adicionarProduto(3000, "cadeira gamer", 300.00, 500);
        cadastrarProdutos.adicionarProduto(4000, "mouse", 50.00, 1200);

        System.out.println("Exibindo produtos");
        System.out.println(cadastrarProdutos.produtoset);
        System.out.println("--------------------------");
        System.out.println("Exibindo produtos por nome");
        System.out.println(cadastrarProdutos.pesquisarProdutoPorNome());
        System.out.println("--------------------------");
        System.out.println("Exibindo produtos por preço");
        System.out.println(cadastrarProdutos.exibirProdutoPorPreco());
        System.out.println("--------------------------");



    }


}

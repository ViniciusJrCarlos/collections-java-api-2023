package mapProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Integer, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Integer cod, String nome,  double preco, int quantidade) {


        estoqueProdutosMap.put(cod, new Produto(nome, preco,  quantidade));

    }

    public void exibirProdutos() {

        System.out.println(estoqueProdutosMap);

    }

    public double calcularValorTotalEstoque() {

        double valorTotalEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {

            for (Produto p : estoqueProdutosMap.values()) {

                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }

        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {

            for (Produto p: estoqueProdutosMap.values()) {

                if(p.getPreco() > maiorPreco) {

                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;


    }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1, "Computador", 10.00, 100);
        estoque.adicionarProduto(2, "notebook", 500.00, 200);
        estoque.adicionarProduto(3, "Cadeira", 300.00, 5000);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque é R$: " +  estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro é R$: " + estoque.obterProdutoMaisCaro());

    }

}

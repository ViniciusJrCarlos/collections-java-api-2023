package mapProduto;

public class Produto {

    private String nome;

    private double preco;

    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = this.nome;
        this.preco = this.preco;
        this.quantidade = this.quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{ " + nome + preco + quantidade + " }";
    }
}

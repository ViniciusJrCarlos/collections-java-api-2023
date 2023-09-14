package Ecommerce;

public class Item {

    private String nome;
    private Double preco;
    private Integer quantidade;

    //criado o construtor
    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //criado o getters
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    //criado o to string


    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

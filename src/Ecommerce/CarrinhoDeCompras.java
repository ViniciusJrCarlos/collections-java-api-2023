package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;


    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {

        itemList.add(new Item(nome, preco, quantidade));

    }

    public void obterDescricoesItens() {

        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhodecompras = new CarrinhoDeCompras();

        carrinhodecompras.adicionarItem("Computador", 1.500, 50);
        carrinhodecompras.adicionarItem("notebook", 5.500, 30);
        carrinhodecompras.obterDescricoesItens();

    }


}

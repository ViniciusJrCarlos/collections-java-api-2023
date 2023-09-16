package Ordenacao;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    //atributos pessoas

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {

        this.pessoaList = new ArrayList<>();

    }

    public void adicionarPessoa(String nome, int idade, double altura) {

        pessoaList.add(new Pessoa (nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade() {

        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){

        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }


    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Vinicius", 39, 1.79);
        ordenacaoPessoa.adicionarPessoa("Maria", 69, 1.56);
        ordenacaoPessoa.adicionarPessoa("Tiago", 42, 1.80);
        ordenacaoPessoa.adicionarPessoa("Tiago", 22, 1.60);

        
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }

}

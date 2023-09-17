package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    ///atributos

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {

        convidadoSet.add(new Convidado(nome, codigoConvite));



    }

    public void removerConvidadoPorCodigoConvite (int codigoConvite) {

        Convidado convidadoParaRemover = null;

        for (Convidado c: convidadoSet) {

            if (c.getCodigoConvite() == codigoConvite) {

                convidadoParaRemover = c;

                break;
            }

        }
        convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidados(){

        return convidadoSet.size();
    }

    public void exibirConvidados(){

        System.out.println(convidadoSet);

    }

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Vinicius", 01);
        convidados.adicionarConvidado("Tiago", 03);
        convidados.adicionarConvidado("Maria", 03);
        convidados.adicionarConvidado("Lucas", 04);
        convidados.adicionarConvidado("felipe", 04);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados");
        System.out.println("----------------");
        convidados.exibirConvidados();
        System.out.println("----------------");

        System.out.println("Removendo alguns convidados pelo codigo");
        convidados.removerConvidadoPorCodigoConvite(03);
        System.out.println("Agora temos " + convidados.contarConvidados() + " convidados");
        convidados.exibirConvidados();

    }


}



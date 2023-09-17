package setAgenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //atributos

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {

        contatoSet.add(new Contato(nome, numero));

    }

    //pesquisa por contato

    public Set<Contato> pesquisarPorNome(String nome) {

        Set<Contato> contatosPorNome = new HashSet<>();

        //if (!contatoSet.isEmpty()) {

            for (Contato c: contatoSet) {

                if (c.getNome().startsWith(nome)) {

                    contatosPorNome.add(c);
                }

            }

        //}

        return contatosPorNome;
    }

    public int contarContatos() {

        return contatoSet.size();

    }
    public void exibirContatos() {

        System.out.println(contatoSet);

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {

        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {

            if(c.getNome().equalsIgnoreCase(nome)){

                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;

            }

        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos mostracontato = new AgendaContatos();

        mostracontato.adicionarContato("Tiago", 11998);
        mostracontato.adicionarContato("Marcia", 11998);
        mostracontato.adicionarContato("Maria", 11997);

        System.out.println("Existem " + mostracontato.contarContatos() + " contatos");
        System.out.println("----------------");
        mostracontato.exibirContatos();
        System.out.println("----------------");
        System.out.println("Pesquisando o contato");
        System.out.println(mostracontato.pesquisarPorNome("Maria"));
        System.out.println("----------------");
        System.out.println("Atualizando nome do contato");
        System.out.println("Contato atualizado " + mostracontato.atualizarNumeroContato("Tiago", 20000));
        mostracontato.exibirContatos();

    }
}

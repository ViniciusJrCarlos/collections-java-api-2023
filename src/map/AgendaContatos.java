package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;


    public AgendaContatos() {

        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone) {

        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {

        if (!agendaContatoMap.isEmpty()){

            agendaContatoMap.remove(nome);

        }

    }

    public void exibirContatos() {

        System.out.println(agendaContatoMap);

    }

    public Integer pesquisarPorNome(String nome) {

        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()) {

            numeroPorNome = agendaContatoMap.get(nome);

        }

        return numeroPorNome;

    }



    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        System.out.println("----------------");
        System.out.println("Mostra os contatos");
        agendaContatos.adicionarContato("Vinicius", 999999);
        agendaContatos.adicionarContato("Maria", 999999);
        agendaContatos.adicionarContato("Luiza", 999999);
        agendaContatos.exibirContatos();

        System.out.println("----------------");
        System.out.println("Remova um contato");
        agendaContatos.removerContato( "Maria");
        System.out.println("----------------");
        System.out.println("Exibindo contatos atualizados");
        agendaContatos.exibirContatos();
        System.out.println("-------------------------");
        System.out.println("Pesquisando contato por numero do codigo");
        System.out.println("O numero do contato é:" + agendaContatos.pesquisarPorNome("Vinicius"));


    }

}

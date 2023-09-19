package mapEvento;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {

        this.eventoMap = new HashMap<>();

    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {

        Evento evento = new Evento(nome, atracao);

        eventoMap.put(data, evento);

        //outra forma

        //eventoMap.put(data, new Evento(nome, atracao));

    }

    public void exibirAgenda() {

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {

            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {

                proximaData =  entry.getKey();
                proximoEvento =  entry.getValue();

                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento X "," Show da Virada");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 6, 15), "Evento XI "," Evento das Flores");
        agendaEventos.adicionarEvento(LocalDate.of(2020, 3, 10), "Evento IX "," Festa da Uva");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 18), "Evento XII "," Evento Programação");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 20), "Evento XIII "," Evento de HACK");

        System.out.println("Exibindo agenda de eventos");
        agendaEventos.exibirAgenda();
        System.out.println("---------------------------");
        System.out.println("Exibindo proximo evento");
        agendaEventos.obterProximoEvento();
        System.out.println("---------------------------");


    }



}

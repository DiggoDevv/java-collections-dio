package Map.Ordenacao;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    //LocalDate : classe no java para manipulação de data
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        //LocalDate.now = dataAtual da minha maquina
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry <LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            //entrySet = retorna um set, que dentro dele vai ter um objeto Map.Entry,
            // onde esse Map.Entry aponta a chave e valor correspondente

            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " Acontecera na data " + proximaData);
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.JULY, 20), "Evento 1", "Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 9, 21), "Evento 2", "Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 8, 30), "Evento 3", "Atração 3");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 6, 28), "Evento 4", "Atração 4");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();
    }
}

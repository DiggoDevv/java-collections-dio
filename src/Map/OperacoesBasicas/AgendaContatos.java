package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Camila", 13212);
        agendaContatos.adicionarContatos("Camila", 5656);
        agendaContatos.adicionarContatos("Camila Calvacante", 1111111);
        agendaContatos.adicionarContatos("Maria", 23211);
        agendaContatos.adicionarContatos("Maria Silva", 1111111);
        agendaContatos.adicionarContatos("Camila", 43123);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();
        System.out.println("O número é: " + agendaContatos.pesquisaPorNome("Camila Calvacante"));
    }
}

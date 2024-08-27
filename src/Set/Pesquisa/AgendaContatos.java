package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
           if(c.getNome().startsWith(nome)){
               contatosPorNome.add(c);
           }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
            break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();
    agendaContatos.adicionarContato("Contato1", 9999999);
        agendaContatos.adicionarContato("Contato2", 7777777);
        agendaContatos.adicionarContato("Contato3", 6666666);
        agendaContatos.adicionarContato("Contato4", 8888888);
        agendaContatos.adicionarContato("Contato5", 5555555);
        agendaContatos.atualizarNumeroContato("Contato1", 989898);
        agendaContatos.exibirContato();
        agendaContatos.pesquisarPorNome("Contato2");
    }
}

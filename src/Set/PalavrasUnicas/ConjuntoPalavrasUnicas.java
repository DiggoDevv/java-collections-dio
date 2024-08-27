package Set.PalavrasUnicas;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(new Palavras(palavra));       
    }
    public void removerPalavra(String palavra){
        Palavras palavrasParaRemover = null;
        for(Palavras p : palavrasSet){
            if(p.getPalavra() == palavra){
                palavrasParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavrasParaRemover);
    }
    public void verificarPalavra(String palavra){
        boolean palavraParaVerificar = false;
        for(Palavras p : palavrasSet){
            if(p.getPalavra() == palavra){
                palavraParaVerificar = true;
                break;
            }
        }
        if(palavraParaVerificar == true){
            System.out.println("A palavra: " + palavra + " Existe na lista");
        }else {
            System.out.println("Palavra não existe na lista");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("porta");
        conjuntoPalavrasUnicas.adicionarPalavra("livro");
        conjuntoPalavrasUnicas.adicionarPalavra("teclado");
        conjuntoPalavrasUnicas.adicionarPalavra("estante");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("rato");
        conjuntoPalavrasUnicas.verificarPalavra("porta");

        conjuntoPalavrasUnicas.removerPalavra("porta");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}

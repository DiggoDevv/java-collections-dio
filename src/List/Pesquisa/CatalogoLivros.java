package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalos.add(l);
                }
            }
        }
        return livrosPorIntervalos;
    }
    public Livro pesquisaPorTitulo(String titulo){
       Livro livroPorTitulo = null;
       if(!livroList.isEmpty()){
          for(Livro l : livroList) {
              if(l.getTitulos().equalsIgnoreCase(titulo)){
                  livroPorTitulo = l;
                  break;
              }
          }
       }
       return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("menino da lua", "Dantas", 2024);
        catalogoLivros.adicionarLivro("menino do sol", "Dantas", 2022);
        catalogoLivros.adicionarLivro("pequeno principe", "ferraz", 2000);
        catalogoLivros.adicionarLivro("menina do deserto", "Pirez", 2012);
        System.out.println(catalogoLivros.pesquisarPorAutor("Dantas"));

    }
}

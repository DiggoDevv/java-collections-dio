package Map.Pesquisa;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProduto() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProduto);
    }
    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProduto.isEmpty()){
            for(Produto p : estoqueProduto.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProdutos();
        estoque.adicionarProduto(1L, "produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "produto B", 40, 7.0);
        estoque.adicionarProduto(3L, "produto C", 20, 20.0);
        estoque.adicionarProduto(4L, "produto D", 6, 15.0);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque R$" + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais barato caro " + estoque.obterProdutoMaisCaro());
    }
}

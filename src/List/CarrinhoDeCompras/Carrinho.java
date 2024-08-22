package List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> carrinhoList;

    public Carrinho(){
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }
    public void removerItemCarrinho(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinhoList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
    }
    public void exibirItens(){
        System.out.println(carrinhoList);
    }
    public void calculaTotalValor(){
        double valorTotal = 0;
        List<Item> valorTotalCarrinho = new ArrayList<>();
        for(Item i : carrinhoList){
            double valor = i.preco;
            int quantidade = i.quantidade;
            valorTotal = valorTotal + (valor * quantidade);
        }
        System.out.println("o valor total é de: " + valorTotal);

    }

    public static void main(String[] args) {
        Carrinho c = new Carrinho();
        c.adicionarItem("a", 1222.00, 1);
        c.adicionarItem("b", 1500.00, 2);
        c.adicionarItem("a", 1222.00, 1);
        c.adicionarItem("c", 1222.00, 1);
        c.calculaTotalValor();
        c.removerItemCarrinho("a");
        c.exibirItens();
    }
}

package List.Ordenacao;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa  {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    //Collections entende que eu vou querer ordernar por altura atráves do Comparator
    //Comparator nao altera a classe original, por isso deve-se criar uma outra classe para usa-lo
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    //Quando eu n passo o Comparator(que é esse caso) ele vai ordenar pelo Comparable
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 34, 1.75);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 22, 1.59);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 16, 1.76);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 28, 1.90);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

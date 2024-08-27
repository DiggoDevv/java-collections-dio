package Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvidade;

    public Convidado(String nome, int codigoConvidade) {
        this.nome = nome;
        this.codigoConvidade = codigoConvidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvidado() == convidado.getCodigoConvidado();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvidade);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidade=" + codigoConvidade +
                '}';
    }
}

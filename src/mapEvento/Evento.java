package mapEvento;

import java.util.Objects;

public class Evento {

    private String nome;

    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento evento)) return false;
        return getNome().equals(evento.getNome()) && getAtracao().equals(evento.getAtracao());
    }


    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "{" + nome + atracao + "}";
    }


    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getAtracao());
    }
}

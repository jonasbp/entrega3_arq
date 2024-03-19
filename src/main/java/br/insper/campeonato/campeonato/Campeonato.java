package br.insper.campeonato.campeonato;

import static java.util.UUID.randomUUID;

public class Campeonato {
    private String identificador;
    private String nome;

    public Campeonato(String identificador, String nome) {
        this.identificador = randomUUID().toString();
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

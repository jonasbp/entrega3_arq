package br.insper.campeonato.partida;

import br.insper.campeonato.campeonato.Campeonato;
import br.insper.campeonato.time.Time;

import static java.util.UUID.randomUUID;

public class Partida {
    private Time time_mandante;
    private Time time_visitante;

    private Integer placar_mandante;
    private Integer placar_visitante;

    private Campeonato campeonato;

    public Partida(Time time_mandante, Time time_visitante, Integer placar_mandante,Integer placar_visitante, Campeonato campeonato) {
        this.time_mandante = time_mandante;
        this.time_visitante = time_visitante;
        this.placar_mandante = placar_mandante;
        this.placar_visitante = placar_visitante;
        this.campeonato = campeonato;
    }

    public Time getTime_mandante() {
        return time_mandante;
    }

    public void setTime_mandante(Time time_mandante) {
        this.time_mandante = time_mandante;
    }

    public Time getTime_visitante() {
        return time_visitante;
    }

    public void setTime_visitante(Time time_visitante) {
        this.time_visitante = time_visitante;
    }

    public Integer getPlacar_mandante() {
        return placar_mandante;
    }

    public void setPlacar_mandante(Integer placar_mandante) {
        this.placar_mandante = placar_mandante;
    }

    public Integer getPlacar_visitante() {
        return placar_visitante;
    }

    public void setPlacar_visitante(Integer placar_visitante) {
        this.placar_visitante = placar_visitante;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}

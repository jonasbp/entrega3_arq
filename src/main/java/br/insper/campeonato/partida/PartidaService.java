package br.insper.campeonato.partida;

import br.insper.campeonato.campeonato.Campeonato;
import br.insper.campeonato.time.Time;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PartidaService {
    private ArrayList<Partida> partidas = new ArrayList<>();

    public Time cadastrarPartida(Partida partida) {
        partidas.add(partida);
        return partida.getTime_mandante();
    }

    public ArrayList<Partida> listarPartidas(String time_mandante) {
        if (time_mandante != null) {
            ArrayList<Partida> lista = new ArrayList<>();
            for (Partida partida : partidas) {
                if (partida.getTime_mandante().equals(time_mandante)) {
                    lista.add(partida);
                }
            }
            return lista;
        }
        return partidas;
    }

    public ArrayList<Time> listarTodasPartidas() {
        ArrayList<Time> lista = new ArrayList<>();
        for (Partida partida : partidas) {
            lista.add(partida.getTime_mandante());
            lista.add(partida.getTime_visitante());
        }
        return lista;
    }

    // Numero de vitorias de time
    public Integer numeroVitorias(Time time) {
        Integer vitorias = 0;
        for (Partida partida : partidas) {
            if (partida.getTime_mandante().equals(time)) {
                if (partida.getPlacar_mandante() > partida.getPlacar_visitante()) {
                    vitorias++;
                }
            } else if (partida.getTime_visitante().equals(time)) {
                if (partida.getPlacar_visitante() > partida.getPlacar_mandante()) {
                    vitorias++;
                }
            }
        }
        return vitorias;
    }
}

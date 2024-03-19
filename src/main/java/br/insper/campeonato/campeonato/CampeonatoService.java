package br.insper.campeonato.campeonato;

import br.insper.campeonato.time.Time;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CampeonatoService {
    private ArrayList<Campeonato> campeonatos = new ArrayList<>();

    public ArrayList<Campeonato> cadastrarCampeonatos(Campeonato campeonato) {
        if (campeonato.getNome().isEmpty()
                || campeonato.getIdentificador().equals("")
                || campeonato.getNome().equals("")) {
            return null;
        } else {
            campeonatos.add(campeonato);
            return campeonatos;
        }
    }

    public ArrayList<Time> listarCampeonatos() {
        ArrayList<Time> lista = new ArrayList<>();
        for (Campeonato campeonato : campeonatos) {
            campeonatos.add(campeonato);
        }
        return lista;

    }

}

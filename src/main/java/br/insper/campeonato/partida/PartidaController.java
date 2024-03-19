package br.insper.campeonato.partida;

import br.insper.campeonato.campeonato.Campeonato;
import br.insper.campeonato.time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {
    @Autowired
    private PartidaService partidaService;

    @GetMapping("/partida")
    public ArrayList<Partida> listarPartidas(@RequestParam(required = false) String Time_mandante) {
        if (Time_mandante == null) {
            return partidaService.listarPartidas(null);
        } else {
            return partidaService.listarPartidas(Time_mandante);
        }


    }

    @PostMapping("/partida")
    public Time cadastrarPartida(@RequestBody Partida partida) {
        return partidaService.cadastrarPartida(partida);
    }

}

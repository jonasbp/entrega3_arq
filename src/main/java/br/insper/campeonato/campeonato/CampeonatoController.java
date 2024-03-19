package br.insper.campeonato.campeonato;

import br.insper.campeonato.time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CampeonatoController {
    @Autowired
    private CampeonatoService campeonatoService;

    @GetMapping("/campeonatos")
    public ArrayList<Time> listarCampeonatos() {
        return campeonatoService.listarCampeonatos();
    }

    @PostMapping("/campeonatos")
    public ArrayList<Campeonato> cadastrarCampeonatos(@RequestBody Campeonato campeonato) {
        return campeonatoService.cadastrarCampeonatos(campeonato);
    }

}

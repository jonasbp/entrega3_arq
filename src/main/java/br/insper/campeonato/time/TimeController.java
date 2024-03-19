// AQUI VÃO AS ROTAS DA API
package br.insper.campeonato.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TimeController {
    @Autowired
    private TimeService timeService;

    @GetMapping("/times")
    public ArrayList<Time> listarTimes(@RequestParam(required = false) String estado){
        return timeService.listarTimes(estado);
    }
    @GetMapping("/time/{identificador}")
    public Time getTime(@PathVariable String identificador) {
        return timeService.getTime(identificador);
    }

    @PostMapping("/times")
    public Time cadastrarTime(@RequestBody Time time) {
        return timeService.cadastrarTime(time);
    }
}

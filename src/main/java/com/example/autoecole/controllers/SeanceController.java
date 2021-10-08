package com.example.autoecole.controllers;

import com.example.autoecole.models.Seance;
import com.example.autoecole.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("seance")
@CrossOrigin
public class SeanceController {


    /*Attribut*/
    private SeanceService seanceService;

    /*Controller*/

    @Autowired
    public SeanceController(SeanceService seanceService){
        this.seanceService = seanceService;
    }

    @GetMapping
    public List<Seance> findAll() {
        return seanceService.findAll();
    }

    @PostMapping
    public Seance save(@RequestBody Seance seance) {
        return seanceService.save(seance);
    }

    @PostMapping("{/id}")
    public Optional<Seance> findById(@PathVariable Long id) {
        return seanceService.findById(id);
    }

    @PostMapping("{/lieu}")
    public Seance findByLieu(@PathVariable String lieu){
        return seanceService.findByLieu(lieu);
    }

    @PutMapping
    public Seance updateById(@RequestBody Seance seance) {
        return seanceService.updateById(seance);
    }

    @DeleteMapping("{/id}")
    public Seance deleteById(@PathVariable Long id) {
        return seanceService.deleteById(id);
    }
}

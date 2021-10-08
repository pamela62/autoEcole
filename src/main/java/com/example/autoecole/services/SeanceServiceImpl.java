package com.example.autoecole.services;

import com.example.autoecole.models.Seance;
import com.example.autoecole.repositories.SeanceRepository;

import java.util.List;
import java.util.Optional;

public class SeanceServiceImpl implements SeanceService {
/*J'implement mon service*/

    /*Attribut*/
    private SeanceRepository seanceRepo;

    /*Controlleur*/

    public SeanceServiceImpl(SeanceRepository seanceRepository)
    {
        this.seanceRepo = seanceRepository;
    }

    /*Function*/

    @Override
    public List<Seance> findAll() {
        return this.seanceRepo.findAll();
    }

    @Override
    public Seance save(Seance seance) {
        return this.seanceRepo.save(seance);
    }

    @Override
    public Optional<Seance> findById(Long id) {
        if(this.seanceRepo.findById(id) == null)
        {
            return null;
        }
        else
        {
            return this.seanceRepo.findById(id);
        }
    }

    @Override
    public Seance updateById(Seance seance) {
        return this.seanceRepo.save(seance);
    }

    @Override
    public Seance deleteById(Long id) {
        Seance seance = this.seanceRepo.getById(id);
        this.seanceRepo.deleteById(id);
        return seance;
    }

    @Override
    public Seance findByLieu(String lieu) {
        return this.seanceRepo.findByLieu(lieu);
    }
}

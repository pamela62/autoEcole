package com.example.autoecole.services;

import com.example.autoecole.models.Seance;

import java.util.List;
import java.util.Optional;

public interface SeanceService {
    /*Liste de signature des méthodes*/

    List<Seance> findAll();

    Seance save(Seance seance);

    Optional<Seance> findById (Long id);

    Seance updateById(Seance seance);

    Seance deleteById(Long id);

    Seance findByLieu(String lieu);
}

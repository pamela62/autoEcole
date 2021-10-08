package com.example.autoecole.repositories;

import com.example.autoecole.models.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
    /*Ajout d'une function*/
    Seance findByLieu(String lieu);
}

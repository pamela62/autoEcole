package com.example.autoecole;

import com.example.autoecole.repositories.SeanceRepository;
import com.example.autoecole.services.SeanceService;
import com.example.autoecole.services.SeanceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SeanceService seanceService (SeanceRepository seanceRepository){
        return new SeanceServiceImpl(seanceRepository);
    }

}

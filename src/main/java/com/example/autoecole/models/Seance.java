package com.example.autoecole.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/*J'utilise Lombok*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "SEANCE_CODE")
public class Seance {

    /*Clé primaire*/
    @Id
    private Long seanceId;

    @Column(name = "date")
    private Date dateSeance;

    private Time heure;

    private int nombreFautes;

    private String lieu;

    private Boolean estExamen;

    /*Relation oneToOne avec la table serie*/
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "serie_id", referencedColumnName = "serieId")
    private Serie serie;

}

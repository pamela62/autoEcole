package com.example.autoecole.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "SERIE", schema = "auto")
public class Serie {
    /*Je garde que l'id de la série
     * Je supprime l'id du cd room*/

    @Id
    private Integer serieId;

}

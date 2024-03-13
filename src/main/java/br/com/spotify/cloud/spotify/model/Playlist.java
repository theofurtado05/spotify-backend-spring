package br.com.spotify.cloud.spotify.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;


@Data
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String nome;

}

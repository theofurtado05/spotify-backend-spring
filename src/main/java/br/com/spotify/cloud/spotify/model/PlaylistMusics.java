package br.com.spotify.cloud.spotify.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class PlaylistMusics {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private Playlist playlist;

    @OneToMany
    private List<Music> musics;
}

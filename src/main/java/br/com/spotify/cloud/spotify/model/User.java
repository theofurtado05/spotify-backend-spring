package br.com.spotify.cloud.spotify.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @OneToMany
    @JoinColumn(name ="user_id", referencedColumnName = "id")
    private List<Playlist> playlists;


}

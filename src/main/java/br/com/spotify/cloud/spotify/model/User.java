package br.com.spotify.cloud.spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email is invalid")
    private String email;

    @Column
    @NotBlank(message = "Password is mandatory")
    private String password;

    @OneToMany
    @JoinColumn(name ="user_id", referencedColumnName = "id")
    private List<Playlist> playlists;


}

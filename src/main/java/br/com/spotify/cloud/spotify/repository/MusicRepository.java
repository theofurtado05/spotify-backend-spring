package br.com.spotify.cloud.spotify.repository;

import br.com.spotify.cloud.spotify.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MusicRepository extends JpaRepository<Music, UUID>{
}

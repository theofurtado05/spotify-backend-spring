package br.com.spotify.cloud.spotify.repository;

import br.com.spotify.cloud.spotify.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, UUID>{

}

package br.com.spotify.cloud.spotify.repository;

import br.com.spotify.cloud.spotify.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BandRepository extends JpaRepository<Band, UUID> {
}

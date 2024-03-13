package br.com.spotify.cloud.spotify.controller;

import br.com.spotify.cloud.spotify.model.User;
import br.com.spotify.cloud.spotify.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity<User> create(@Valid @RequestBody User user) {
        //TODO: VALIDAR EMAIL
        return ResponseEntity.ok(repository.save(user));
    }
}

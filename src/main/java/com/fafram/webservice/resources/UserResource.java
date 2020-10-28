package com.fafram.webservice.resources;

import com.fafram.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users") // caminho do recurso
public class UserResource {

    // endpoint
    @GetMapping // indica que o método responde a uma requisição GET HTTP
    public ResponseEntity<User> findAll() {
        User user = new User(1L,"Ana","ana@gmail.com","99999-9999","12345");
        return ResponseEntity.ok().body(user);
    }
}

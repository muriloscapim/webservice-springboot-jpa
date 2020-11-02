package com.fafram.webservice.resources;

import com.fafram.webservice.entities.User;
import com.fafram.webservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users") // caminho do recurso
public class UserResource {

    @Autowired
    private UserService service;

    // endpoint
    @GetMapping // indica que o método responde a uma requisição GET HTTP
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping // indica que o método responde a uma requisição POST HTTP
    /* A requisição envia um json, que deve ser desserializado para um obj User
    usamos a annotation @RequestBody
     */
    public ResponseEntity<User> insert(@RequestBody User user) {
        user = service.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user); // Retorna status code 201
    }

    @DeleteMapping(value = "/{id}") // indica que o método responde a uma requisição DELETE HTTP
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}") // inidica que o método responde a uma requisição PUT HTTP
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
        user = service.update(id, user);
        return ResponseEntity.ok().body(user);
    }
}

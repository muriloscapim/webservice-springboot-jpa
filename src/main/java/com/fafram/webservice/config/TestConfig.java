package com.fafram.webservice.config;

import com.fafram.webservice.entities.User;
import com.fafram.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration // indica ao spring que é uma classe de configuração
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // injeção de dependência
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null,"Joker","joker@gmail.com","91234-5678","123456");
        User user2 = new User(null,"Batman","batman@gmail.com","91111-2222","123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}

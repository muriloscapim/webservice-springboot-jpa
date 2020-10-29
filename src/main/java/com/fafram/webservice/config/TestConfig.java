package com.fafram.webservice.config;

import com.fafram.webservice.entities.Category;
import com.fafram.webservice.entities.Product;
import com.fafram.webservice.entities.User;
import com.fafram.webservice.repositories.CategoryRepository;
import com.fafram.webservice.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    // database seeding
    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null,"The Lord of The Rings","Lorem ipsum dolor sit amet, consectetur.",90.5,"");
        Product p2 = new Product(null,"Smart TV", "Lorem ipsum dolor sit amet, consectetur.",2190.0,"");
        Product p3 = new Product(null, "PC Gamer", "Lorem ipsum dolor sit amet, consectetur.",4500.0,"");
        Product p4 = new Product(null, "Notebook","Lorem ipsum dolor sit amet, consectetur.",2500.0,"");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        // add categories to products
        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p3.getCategories().add(cat1);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat1);
        p4.getCategories().add(cat3);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        User user1 = new User(null,"Joker","joker@gmail.com","91234-5678","123456");
        User user2 = new User(null,"Batman","batman@gmail.com","91111-2222","123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}

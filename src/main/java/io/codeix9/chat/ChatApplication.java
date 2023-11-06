package io.codeix9.chat;

import io.codeix9.chat.models.User;
import io.codeix9.chat.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;

@SpringBootApplication
public class ChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("admin", "admin", "admin@gmail.com", "admin", "token", ZonedDateTime.now(), ZonedDateTime.now(), null));
            userRepository.save(new User("user", "user", "user@gmail.com", "user", "token", ZonedDateTime.now(), ZonedDateTime.now(), null));
        };
    }
}

package asd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.telegram.telegrambots.ApiContextInitializer;

import java.util.Arrays;
import java.util.List;

@EnableConfigurationProperties
@SpringBootApplication
@EnableJpaRepositories("asd")
@EntityScan("asd")
public class ApplicationStarter {


    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication app = new SpringApplication(ApplicationStarter.class);
        app.run(args);
    }

}

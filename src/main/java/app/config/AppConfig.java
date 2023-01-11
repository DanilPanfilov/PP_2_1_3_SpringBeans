package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "dog")
    public Dog dog() {
        Dog dog = new Dog();
        return dog;
    }
    @Bean(name = "timer")
    public Timer timer () {
        Timer timer = new Timer();
        return timer;
    }
}


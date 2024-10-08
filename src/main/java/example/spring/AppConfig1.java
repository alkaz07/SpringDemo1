package example.spring;

import example.spring.components.Park;
import example.spring.components.Watchman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean(name ="watchman1")
    public Watchman watchman(){
        return new Watchman("Пупкин");
    }

    @Bean(name = "park1")
    public Park park(){
        return new Park(111);
    }
}

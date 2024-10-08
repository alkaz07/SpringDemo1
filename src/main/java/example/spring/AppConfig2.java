package example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean(name ="watchmanA")
    public Watchman watchmanA(){
        return new Watchman("Пупкин");
    }

    @Bean(name = "parkX")
    public Park parkX(){
        return new Park(111);
    }

    @Bean(name ="watchmanB")
    public Watchman watchmanB(){
        return new Watchman("Глупкин");
    }
}

package example.spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("centralPark")
public class Park {

    int id;
    //ссылка на сторожа
    @Autowired
   // @Qualifier("watchmanA")
    Watchman watchman;

    public void doNoise(){
        System.out.println(this+" шумит");
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                '}';
    }

    public void walkOnTheGrass(){
        System.out.println("шаг на газон");
        if (watchman != null)
            watchman.whistle();
        else
            System.out.println("продолжается вытаптывание");
    }
    @Autowired
    public Park( @Value("321") int id) {
        this.id = id;
        System.out.println("работает конструктор Парка");
    }

    public void setWatchman(Watchman watchman) {
        this.watchman = watchman;
    }
}

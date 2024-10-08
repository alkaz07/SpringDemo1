package example.spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mainWatchman")
public class Watchman {
    String name;
    @Autowired
    private Park park;

    @Autowired
    public Watchman(@Value("Шашкин") String name) {
        this.name = name;
        System.out.println("работает конструктор Сторожа");
    }

    public void whistle(){
        System.out.println(name + " свистит");
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        System.out.println(name + " назначен в "+park);
        this.park = park;
    }

    @Override
    public String toString() {
        return "Watchman{" +
                "name='" + name + '\'' +
                ", park=" + park +
                '}';
    }
}

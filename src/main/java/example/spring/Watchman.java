package example.spring;

import org.springframework.stereotype.Component;

@Component("mainWatchman")
public class Watchman {
    String name;
    private Park park;

    public Watchman(String name) {
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

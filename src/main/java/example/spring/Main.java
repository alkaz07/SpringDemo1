package example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig1.class);
        //класс AppConfig1 содержит несявязанные между собой объекты "park1", "watchman1"
        Park p = context.getBean("park1", Park.class);
        System.out.println("p = " + p);
        Watchman w = context.getBean("watchman1", Watchman.class);
        System.out.println("w = " + w);

        p.doNoise();
        p.walkOnTheGrass();
    }
}
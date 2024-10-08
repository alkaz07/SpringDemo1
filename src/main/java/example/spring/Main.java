package example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        example1();
      //  example2();

    }

    private static void example2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        Park p = context.getBean("parkX", Park.class);
        Watchman a = context.getBean("watchmanA", Watchman.class);
        Watchman b = context.getBean("watchmanB", Watchman.class);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("p = " + p);
        p.walkOnTheGrass();
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
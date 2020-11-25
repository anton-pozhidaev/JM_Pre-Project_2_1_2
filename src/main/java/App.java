import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);

        System.out.println("Does beans HelloWorld equals? " + (bean == bean2));
        System.out.println("Does beans Cat equals? " + (cat1 == cat2)
                + "\n cat1 ref: " + cat1.toString()
                + "\n cat2 ref: " + cat2.toString());
    }
}
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Cat;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW_1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW_2 =
                applicationContext.getBean(HelloWorld.class);
        HelloWorld beanHW_3 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat_1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat_2 = applicationContext.getBean(Cat.class);
        Cat beanCat_3 = (Cat) applicationContext.getBean("cat");


        System.out.println(beanHW_1 == beanHW_2);
        System.out.println(beanHW_1 == beanHW_3);
        System.out.println("1 - "+beanHW_1);
        System.out.println("2 - "+beanHW_2);

        System.out.println("1)."+beanCat_1);
        System.out.println("2)."+beanCat_2);
        System.out.println("3)."+beanCat_3);

        System.out.println(beanCat_1 ==beanCat_3);
        System.out.println(beanCat_1 ==beanCat_2);

    }
}
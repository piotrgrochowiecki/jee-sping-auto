package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.PersonService;

public class SpringDiApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepository().getClass().getName());

        context.close();
    }
}

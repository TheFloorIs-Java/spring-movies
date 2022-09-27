package App;

import App.Service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
        /*
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        MovieService mv = applicationContext.getBean(MovieService.class);
        System.out.println(mv.getAllMovies());
        */
    }
}
/*
in spring, we have something called a bean.
a bean is an object that's managed entirely by spring.
that means that we do not need to instantiate new objects.
spring handles that for us automatically.

dependency injection / inversion of control
here, we're able to inject a moviecontroller automatically and run it

IOC container : contains all the beans.

beans can be modified in a few ways:
    * scope - by default, beans are singletons. so whenever a bean is requested, your entire app uses the same object.
            we can change it to prototype (works like a typical java object, every time it's requested a new one is made)
            and some web-specific ones (scoped to a http request, session)
    * stereotypes - by default, beans can be marked with @component. but, they can also be marked by more specific
            annotations that either do something to the class (like @RestController, which auto parses all returns to JSON)
            or, it does nothing and is purely informative like @Service, @Repository
 */
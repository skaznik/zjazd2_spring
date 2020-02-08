package pl.studia.zjazd2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ViewResolverConfiguration {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // dodajemy prefix, żeby ścieżka była root
        viewResolver.setPrefix("/");
        //dodajemy suffix (w tym wypadku rozszerzenie obrazka);
        viewResolver.setSuffix(".jpg");
        //zwracamy widok
        return viewResolver;
    }

}

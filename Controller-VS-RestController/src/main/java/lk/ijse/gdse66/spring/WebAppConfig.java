package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.api.MyController1;
import lk.ijse.gdse66.spring.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : Kavithma Thushal
 * @project : Controller-VS-RestController
 * @since : 3:25 PM - 3/1/2024
 **/
@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

    public WebAppConfig() {
        System.out.println("WebAppConfig() - constructor");
    }

    @Bean
    public MyController1 myController1() {
        return new MyController1();
    }

    @Bean
    public MyController2 myController2() {
        return new MyController2();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("WEB-INF/page/**").addResourceLocations("/WEB-INF/page/");
    }

    /*Location of HTML*/
    /*/WEB-INF/page/something.html*/
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/page/");
        resolver.setSuffix(".html");
        return resolver;
    }
}
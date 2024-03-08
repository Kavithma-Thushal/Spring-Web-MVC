package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 9:30 AM - 3/8/2024
 **/
@Configuration
@ComponentScan
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig() - Constructor");
    }
}
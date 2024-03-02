package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.api.MyController1;
import lk.ijse.gdse66.spring.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Kavithma Thushal
 * @project : Controller-VS-RestController
 * @since : 3:25 PM - 3/1/2024
 **/
@Configuration
@EnableWebMvc
public class WebAppConfig {

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
}
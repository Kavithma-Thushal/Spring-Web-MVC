package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 10:34 AM - 3/8/2024
 **/
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/search")
    public String getName() {
        System.out.println("Thushal");
        return "Thushal";
    }
}
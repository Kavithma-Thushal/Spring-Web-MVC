package lk.ijse.gdse66.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Kavithma Thushal
 * @project : Controller-VS-RestController
 * @since : 3:33 PM - 3/1/2024
 **/
@Controller
@RequestMapping("/two")
public class MyController2 {

    public MyController2() {
        System.out.println("MyController2() - constructor");
    }

    @GetMapping
    public String getMethod() {
        return "MyController2";
    }
}
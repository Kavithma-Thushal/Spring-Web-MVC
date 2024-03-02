package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kavithma Thushal
 * @project : Controller-VS-RestController
 * @since : 3:33 PM - 3/1/2024
 **/
@RestController
@RequestMapping("/one")
public class MyController1 {

    public MyController1() {
        System.out.println("MyController1() - constructor");
    }

    @GetMapping
    public String getMethod() {
        return "MyController1";
    }
}
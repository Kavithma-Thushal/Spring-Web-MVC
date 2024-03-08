package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 3:43 PM - 3/8/2024
 **/
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/allCustomers")
    public String getAllCustomers() {
        System.out.println("getAllCustomers");
        return "getAllCustomers";
    }

    @GetMapping("/abc/{citty}")
    public String getCustomerByCity(@PathVariable("citty") String city) {
        System.out.println(String.format("getCustomerByCity : %s", city));
        return String.format("getCustomerByCity : %s", city);
    }

    @GetMapping("/{city}/{name}")
    public String getCustomerByCityAndName(@PathVariable("city") String city, @PathVariable("name") String name) {
        System.out.println(String.format("getCustomerByCityAndName : %s, %s", city, name));
        return String.format("getCustomerByCityAndName : %s, %s", city, name);
    }

    @GetMapping("/{id:C\\d{3}}")
    public String getCustomerById(@PathVariable("id") String id) {
        System.out.println(String.format("getCustomerById : %s", id));
        return String.format("getCustomerById : %s", id);
    }
}
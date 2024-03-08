package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 4:27 PM - 3/8/2024
 **/
@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @GetMapping
    public String getMethodWithParam1(@RequestParam(value = "supId", required = false) String id) {
        System.out.println(String.format("getMethodWithParam1 : %s", id));
        return String.format("getMethodWithParam1 : %s", id);
    }

    @GetMapping(params = "age")
    public String getMethodWithParam2(int age) {
        System.out.println(String.format("getMethodWithParam2 : %s", age));
        return String.format("getMethodWithParam2 : %s", age);
    }

    @GetMapping(params = {"id", "name", "age"})
    public String getMethodWithParam3(@RequestParam("id") String cusId, String name, int age) {
        System.out.println(String.format("getMethodWithParam3 : %s, %s, %s", cusId, name, age));
        return String.format("getMethodWithParam3 : %s, %s, %s", cusId, name, age);
    }
}
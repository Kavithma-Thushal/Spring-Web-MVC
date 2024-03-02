package lk.ijse.gdse66.bean;

import org.springframework.web.bind.annotation.*;

/**
 * @author : Kavithma Thushal
 * @project : Hello-Spring-Web-MVC
 * @since : 12:00 PM - 3/1/2024
 **/
@RestController
@RequestMapping("/hello")
public class HelloWebMVC {

    @PostMapping
    public String postMethod() {
        System.out.println("Customer Saved Successfully!");
        return "Customer Saved Successfully!";
    }

    @GetMapping
    public String getMethod() {
        System.out.println("Customer Searched Successfully!");
        return "Customer Searched Successfully!";
    }

    @PutMapping
    public String updateMethod() {
        System.out.println("Customer Updated Successfully!");
        return "Customer Updated Successfully!";
    }

    @PatchMapping
    public String patchMethod() {
        System.out.println("Customer Patched Successfully!");
        return "Customer Patched Successfully!";
    }

    @DeleteMapping
    public String deleteMethod() {
        System.out.println("Customer Deleted Successfully!");
        return "Customer Deleted Successfully!";
    }
}
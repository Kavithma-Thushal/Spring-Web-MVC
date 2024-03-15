package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.AdminDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 1:47 PM - 3/9/2024
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    /*Accept application/x-www-form-urlencoded or query parameters*/
    @PostMapping
    public void saveAdmin(@ModelAttribute AdminDTO adminDTO) {
        System.out.println(adminDTO.toString());
    }

    @GetMapping
    public String getOrders(@RequestHeader(value = "token", required = false) String token) {
        return String.format("getOrders : %s", token);
    }
}
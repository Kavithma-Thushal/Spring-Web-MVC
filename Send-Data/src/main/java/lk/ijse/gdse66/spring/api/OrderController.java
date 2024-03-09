package lk.ijse.gdse66.spring.api;

import lk.ijse.gdse66.spring.dto.OrderDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 2:19 PM - 3/9/2024
 **/
@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping()
    public void saveOrder(OrderDTO orderDTO) {
        System.out.println(orderDTO.getId());
        System.out.println(orderDTO.getName());
        System.out.println(orderDTO.getAge());
    }

    /*@PostMapping
    public void saveOrder() {
        System.out.println(new OrderDTO("C001", "Thushal", 23));
    }*/

    @GetMapping
    public ArrayList<OrderDTO> getAllOrders() {
        ArrayList<OrderDTO> supplierList = new ArrayList<>();
        supplierList.add(new OrderDTO("C001", "Kamal", 12));
        supplierList.add(new OrderDTO("C002", "Nimal", 23));
        supplierList.add(new OrderDTO("C003", "Amal", 34));
        return supplierList;
    }
}
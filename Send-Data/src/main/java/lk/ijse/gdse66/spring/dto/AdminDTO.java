package lk.ijse.gdse66.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 1:47 PM - 3/9/2024
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDTO {
    private String id;
    private String name;
    private int age;
}
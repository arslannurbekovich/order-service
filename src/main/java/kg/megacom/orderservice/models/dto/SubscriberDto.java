package kg.megacom.orderservice.models.dto;

import kg.megacom.orderservice.models.OrderStatus;
import lombok.Data;

import java.util.Date;

@Data
public class SubscriberDto {

    private Long id;
    private String name;
    private Date dateOfBirth;
    private String phone;
    private int age;

}

package kg.megacom.orderservice.models.dto;

import kg.megacom.orderservice.models.OrderStatus;
import kg.megacom.orderservice.models.entity.Subscriber;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {

    private Long id;
    private String schoolName;
    private String address;
    private Date addDate;
    private Date endDate;
    private Date naviDate;
    private String comment;
    private Subscriber subscriber;
    private OrderStatus orderStatus;

}

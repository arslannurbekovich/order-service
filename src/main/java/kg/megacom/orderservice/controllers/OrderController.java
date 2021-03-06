package kg.megacom.orderservice.controllers;

import kg.megacom.orderservice.models.dto.OrderDto;
import kg.megacom.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public OrderDto create(@RequestBody OrderDto orderDto){
        return orderService.create(orderDto);
    }
}

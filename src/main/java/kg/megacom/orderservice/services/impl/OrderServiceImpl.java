package kg.megacom.orderservice.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.orderservice.mappers.OrderMapper;
import kg.megacom.orderservice.models.dto.OrderDto;
import kg.megacom.orderservice.services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDto create(OrderDto orderDto) {

        OrderMapper.INSTANCE.toEntity(orderDto);
        return null;
    }
}

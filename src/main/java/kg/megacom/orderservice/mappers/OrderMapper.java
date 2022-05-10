package kg.megacom.orderservice.mappers;

import kg.megacom.orderservice.models.dto.OrderDto;
import kg.megacom.orderservice.models.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);

    Order toEntity(OrderDto orderDto);

}

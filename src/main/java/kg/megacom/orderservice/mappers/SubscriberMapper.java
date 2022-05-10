package kg.megacom.orderservice.mappers;

import kg.megacom.orderservice.models.dto.SubscriberDto;
import kg.megacom.orderservice.models.entity.Subscriber;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubscriberMapper {
    SubscriberMapper INSTANCE= Mappers.getMapper(SubscriberMapper.class);

    Subscriber toEntity(SubscriberDto subscriberDto);
}

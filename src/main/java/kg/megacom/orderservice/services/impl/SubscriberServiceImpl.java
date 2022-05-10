package kg.megacom.orderservice.services.impl;

import kg.megacom.orderservice.dao.SubscriberRepo;
import kg.megacom.orderservice.mappers.OrderMapper;
import kg.megacom.orderservice.mappers.SubscriberMapper;
import kg.megacom.orderservice.models.dto.SubscriberDto;
import kg.megacom.orderservice.models.entity.Subscriber;
import kg.megacom.orderservice.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private SubscriberRepo subscriberRepo;

    private Subscriber subscriber;

    @Override
    public SubscriberDto save(SubscriberDto subscriberDto) {

        SubscriberMapper.INSTANCE.toEntity(subscriberDto);
        subscriber = subscriberRepo.save(subscriber);

        return subscriberDto;


    }
}

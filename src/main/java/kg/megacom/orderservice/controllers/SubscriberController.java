package kg.megacom.orderservice.controllers;

import kg.megacom.orderservice.models.dto.SubscriberDto;
import kg.megacom.orderservice.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subscriber")
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/save")
    public SubscriberDto save(@RequestBody SubscriberDto subscriberDto){
        return subscriberService.save(subscriberDto);
    }

}

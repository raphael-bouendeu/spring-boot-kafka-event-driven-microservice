package com.itbcafrica.email.kafka;

import com.itbcafrica.basedomains.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event) {
        log.info(String.format("Email event recieved in stock service => %s", event.toString()));

        // save the order event into the  database
    }
}

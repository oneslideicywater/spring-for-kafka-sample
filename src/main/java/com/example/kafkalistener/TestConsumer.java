package com.example.kafkalistener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {
    public static Logger logger = LoggerFactory.getLogger(TestConsumer.class);

    @KafkaListener(topics="oneslidebeat")
    public void listenBeat(ConsumerRecord<?, ?> cr){
        logger.info(cr.toString());
        logger.info(cr.offset()+"");
    }

}

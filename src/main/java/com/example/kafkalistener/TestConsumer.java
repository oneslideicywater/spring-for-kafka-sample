package com.example.kafkalistener;

import com.example.kafkalistener.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.StreamWriteFeature;

import java.io.IOException;

@Component
public class TestConsumer {
    public static Logger logger = LoggerFactory.getLogger(TestConsumer.class);

    @Autowired
    @Qualifier("a")
    ObjectMapper mapper;

    @KafkaListener(topics="shoppinga")
    public void listenBeat(ConsumerRecord cr) throws IOException {
        logger.info(cr.toString());
        byte[] msg=((String) cr.value()).getBytes();

        Item item=mapper.readValue(msg,Item.class);
        logger.info(item.toString());

    }


}

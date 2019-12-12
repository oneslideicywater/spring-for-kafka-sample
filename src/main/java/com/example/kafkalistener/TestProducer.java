package com.example.kafkalistener;

import com.example.kafkalistener.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

@Component
public class TestProducer {

    public static Logger logger = LoggerFactory.getLogger(TestProducer.class);


    ObjectMapper mapper=new ObjectMapper();

    @Autowired
    @Qualifier("/shopping-template")
    private KafkaTemplate<String,Object> template;

    public void sendMessage() throws JsonProcessingException {
        Item item=new Item("shoes",false);
        String str=mapper.writeValueAsString(item);
        //simple string
        ListenableFuture future=template.send("shoppinga", "1", str);


    }

}

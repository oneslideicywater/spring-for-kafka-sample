package com.example.kafkalistener.config;

import com.example.kafkalistener.model.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConsumerConfig {

//
//    @Autowired
//    private KafkaProperties kafkaProperties;
//
//    @Bean
//    public Map<String, Object> consumerConfigs() {
//        System.out.println(kafkaProperties.buildConsumerProperties());
//        Map<String, Object> props = new HashMap<>(
//                kafkaProperties.buildConsumerProperties()
//        );
////        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
////                StringDeserializer.class);
////        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
////                JsonDeserializer.class);
////        props.put(ConsumerConfig.GROUP_ID_CONFIG,
////                "tpd-loggers");
//
//        return props;
//    }
//    @Bean
//    public ConsumerFactory<String, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
//    }
//    @Bean("testfa")
//    @Qualifier("hhah")
//    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
//
//        ConcurrentKafkaListenerContainerFactory<String, String> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }

    @Qualifier("a")
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    @Qualifier("b")
    @Bean
    public ObjectMapper objectMapper2(){
        return new ObjectMapper();
    }
}

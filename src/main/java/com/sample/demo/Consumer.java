package com.sample.demo;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;
import org.springframework.kafka.support.KafkaHeaders;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

//    @KafkaListener(topics = "dataFiles", groupId = "group_id")
//    public void consume(String data) throws IOException {
//        System.out.println("Received response = " + data);
//    }
    
//    @KafkaListener(topics = "multipart", groupId = "sample_consumer_group")
//    public void consume2(String data, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
//            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) throws IOException {
//    	
//    	System.out.println("consumer2 topic = " + topic);
//    	System.out.println("consumer2 partition = " + partition);
//    	System.out.println("consumer2 response = " + data);
//    }
//    
//    @KafkaListener(topics = "multipart", groupId = "sample_consumer_group")
//    public void consume3(String data, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
//            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) throws IOException {
//        
//    	System.out.println("consumer3 topic = " + topic);
//    	System.out.println("consumer3 partition = " + partition);
//    	System.out.println("consumer3 response = " + data);
//    }
    
    @KafkaListener(topics = "test", groupId = "foo")
    public void consume4(String data) throws IOException {
    	System.out.println("consumer4 response = " + data);
    }
}

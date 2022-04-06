package kafkatuorial.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    //this will consume the message
    //groupid should be unique
    @KafkaListener(topics = "cosmin", groupId = "groupid")
    public void listener(String data) {
        System.out.println("Listener recieved data :D " + data + " yey");
    }
}

package KafkaListenerV2.KafkaListenerV2;

import KafkaListenerV2.KafkaListenerV2.entity.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MessageListeners {
    //this topic was created in sender
    ObjectMapper objectMapper= new ObjectMapper();

    @KafkaListener(topics = "cosmin2", groupId = "unic")
    public void list(String data) throws JsonProcessingException {
        Person ady= new Person();
        ady.setName("doru");
        ady.setAge(2);
        System.out.println("ady inainte de update "+ady.toString());
        System.out.println("recieved " + data);
        Person person = objectMapper.readValue(data, Person.class);
        ady.setName(person.getName());
        System.out.println("v2 adi dupa update "+ ady);


    }
}

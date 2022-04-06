package KafkaSenderExempleV2.KafkaSenderV2;

import KafkaSenderExempleV2.KafkaSenderV2.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MessageSendingController {

    @Autowired
    KafkaTemplate<String, Person> kafkaTemplate;

    @GetMapping
    public void publish() {
        Person person = new Person();
        person.setAge(11);
        person.setName("Adrian");
        person.setMail("mail@mail.com");

        kafkaTemplate.send("cosmin2", person);
    }
}

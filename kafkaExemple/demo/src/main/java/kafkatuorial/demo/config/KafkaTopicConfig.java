package kafkatuorial.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

//clasa aceasta este responsabila pt a creea topice
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic cosminTopic() {
        return TopicBuilder.name("cosmin")
                .build();
    }
}

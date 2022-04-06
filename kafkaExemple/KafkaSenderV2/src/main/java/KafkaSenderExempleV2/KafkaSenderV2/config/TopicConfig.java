package KafkaSenderExempleV2.KafkaSenderV2.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

//pt a crea topic
@Configuration
public class TopicConfig {

    @Bean
    public NewTopic cosminTopic() {
        return TopicBuilder.name("cosmin2")
                .build();
    }

}

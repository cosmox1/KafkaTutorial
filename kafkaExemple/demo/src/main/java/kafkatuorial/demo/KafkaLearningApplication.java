package kafkatuorial.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaLearningApplication.class, args);
	}

	//dependency injection
	//metoda pentru a trimite automat la pornirea applicatiei un mesaj
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("cosmin","hello kafka :D");
		};
	}

}

package com.talking.hand.talkinghand;

//import com.talking.hand.talkinghand.model.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackageClasses = UserRepository.class)

@SpringBootApplication
public class TalkingHandApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalkingHandApplication.class, args);
	}

}

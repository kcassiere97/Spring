package com.kcassiere.room_clr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;

@SpringBootApplication
public class RoomClrApplication {

	private static final Logger LOG = LoggerFactory.getLogger(RoomClrApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RoomClrApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			LOG.info("Starting CLR application");
			ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
					});
			rooms.getBody().forEach(room -> {
				LOG.info(room.toString());
			});
		};
	}

	//FizzBuzz Commandline Runner
	@Bean
	public CommandLineRunner run(){
		return args -> {
			for(int i=1; i < 101;i++){
				String result = "";
				result += (i % 3) == 0? "Fizz" : "";
				result += (i % 5) == 0? "Buzz" : "";
				System.out.println(!result.isEmpty() ? result : i);

			}
		};
	}

}
